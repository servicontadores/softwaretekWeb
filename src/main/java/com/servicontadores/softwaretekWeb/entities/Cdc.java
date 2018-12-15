/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.servicontadores.softwaretekWeb.entities;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;

/**
 *
 * @author yesidherrera
 */
@Entity
@NamedQueries({
    @NamedQuery(name = "Cdc.findAll", query = "SELECT c FROM Cdc c")})
public class Cdc implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(nullable = false)
    private Short codigo;
    @Column(length = 45)
    private String cdc;
    @Column(length = 45)
    private String detalle;
    @Basic(optional = false)
    @Column(name = "ODBCFIX_FLDAUTO", nullable = false)
    private int odbcfixFldauto;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "cdc")
    private List<FacturarmovimientodiarioPlantilla> facturarmovimientodiarioPlantillaList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "cdc")
    private List<Facturarmovimientodiario> facturarmovimientodiarioList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "cdc")
    private List<Encabezadootrosingresos> encabezadootrosingresosList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "cdc")
    private List<Facturarmovimientopendiente> facturarmovimientopendienteList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "cdc")
    private List<Encabezadoegresos> encabezadoegresosList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "cdc")
    private List<Cxc> cxcList;
    @OneToMany(mappedBy = "cdc")
    private List<Cxp> cxpList;
    @OneToMany(mappedBy = "codigoCDC")
    private List<Movimiento> movimientoList;

    public Cdc() {
    }

    public Cdc(Short codigo) {
        this.codigo = codigo;
    }

    public Cdc(Short codigo, int odbcfixFldauto) {
        this.codigo = codigo;
        this.odbcfixFldauto = odbcfixFldauto;
    }

    public Short getCodigo() {
        return codigo;
    }

    public void setCodigo(Short codigo) {
        this.codigo = codigo;
    }

    public String getCdc() {
        return cdc;
    }

    public void setCdc(String cdc) {
        this.cdc = cdc;
    }

    public String getDetalle() {
        return detalle;
    }

    public void setDetalle(String detalle) {
        this.detalle = detalle;
    }

    public int getOdbcfixFldauto() {
        return odbcfixFldauto;
    }

    public void setOdbcfixFldauto(int odbcfixFldauto) {
        this.odbcfixFldauto = odbcfixFldauto;
    }

    public List<FacturarmovimientodiarioPlantilla> getFacturarmovimientodiarioPlantillaList() {
        return facturarmovimientodiarioPlantillaList;
    }

    public void setFacturarmovimientodiarioPlantillaList(List<FacturarmovimientodiarioPlantilla> facturarmovimientodiarioPlantillaList) {
        this.facturarmovimientodiarioPlantillaList = facturarmovimientodiarioPlantillaList;
    }

    public List<Facturarmovimientodiario> getFacturarmovimientodiarioList() {
        return facturarmovimientodiarioList;
    }

    public void setFacturarmovimientodiarioList(List<Facturarmovimientodiario> facturarmovimientodiarioList) {
        this.facturarmovimientodiarioList = facturarmovimientodiarioList;
    }

    public List<Encabezadootrosingresos> getEncabezadootrosingresosList() {
        return encabezadootrosingresosList;
    }

    public void setEncabezadootrosingresosList(List<Encabezadootrosingresos> encabezadootrosingresosList) {
        this.encabezadootrosingresosList = encabezadootrosingresosList;
    }

    public List<Facturarmovimientopendiente> getFacturarmovimientopendienteList() {
        return facturarmovimientopendienteList;
    }

    public void setFacturarmovimientopendienteList(List<Facturarmovimientopendiente> facturarmovimientopendienteList) {
        this.facturarmovimientopendienteList = facturarmovimientopendienteList;
    }

    public List<Encabezadoegresos> getEncabezadoegresosList() {
        return encabezadoegresosList;
    }

    public void setEncabezadoegresosList(List<Encabezadoegresos> encabezadoegresosList) {
        this.encabezadoegresosList = encabezadoegresosList;
    }

    public List<Cxc> getCxcList() {
        return cxcList;
    }

    public void setCxcList(List<Cxc> cxcList) {
        this.cxcList = cxcList;
    }

    public List<Cxp> getCxpList() {
        return cxpList;
    }

    public void setCxpList(List<Cxp> cxpList) {
        this.cxpList = cxpList;
    }

    public List<Movimiento> getMovimientoList() {
        return movimientoList;
    }

    public void setMovimientoList(List<Movimiento> movimientoList) {
        this.movimientoList = movimientoList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codigo != null ? codigo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Cdc)) {
            return false;
        }
        Cdc other = (Cdc) object;
        if ((this.codigo == null && other.codigo != null) || (this.codigo != null && !this.codigo.equals(other.codigo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.Cdc[ codigo=" + codigo + " ]";
    }
    
}
