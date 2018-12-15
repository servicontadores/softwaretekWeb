/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.servicontadores.softwaretekWeb.entities;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
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
    @NamedQuery(name = "Codigoingresos.findAll", query = "SELECT c FROM Codigoingresos c")})
public class Codigoingresos implements Serializable {

    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @Column(nullable = false)
    private int cody;
    @Id
    @Basic(optional = false)
    @Column(nullable = false, length = 50)
    private String codigo;
    @Column(length = 100)
    private String nombreIngreso;
    @Basic(optional = false)
    @Column(nullable = false)
    private boolean esUtilidad;
    @Column(length = 50)
    private String cuentaCredito;
    @Column(length = 45)
    private String cuentaIVA;
    @Column(length = 50)
    private String retecionCuentaDebito;
    private Short bin;
    private Short esAnticipo;
    private Integer grupo;
    @Basic(optional = false)
    @Column(name = "ODBCFIX_FLDAUTO", nullable = false)
    private int odbcfixFldauto;
    @OneToMany(mappedBy = "codigoIngreso")
    private List<Otrosingresos> otrosingresosList;

    public Codigoingresos() {
    }

    public Codigoingresos(String codigo) {
        this.codigo = codigo;
    }

    public Codigoingresos(String codigo, int cody, boolean esUtilidad, int odbcfixFldauto) {
        this.codigo = codigo;
        this.cody = cody;
        this.esUtilidad = esUtilidad;
        this.odbcfixFldauto = odbcfixFldauto;
    }

    public int getCody() {
        return cody;
    }

    public void setCody(int cody) {
        this.cody = cody;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombreIngreso() {
        return nombreIngreso;
    }

    public void setNombreIngreso(String nombreIngreso) {
        this.nombreIngreso = nombreIngreso;
    }

    public boolean getEsUtilidad() {
        return esUtilidad;
    }

    public void setEsUtilidad(boolean esUtilidad) {
        this.esUtilidad = esUtilidad;
    }

    public String getCuentaCredito() {
        return cuentaCredito;
    }

    public void setCuentaCredito(String cuentaCredito) {
        this.cuentaCredito = cuentaCredito;
    }

    public String getCuentaIVA() {
        return cuentaIVA;
    }

    public void setCuentaIVA(String cuentaIVA) {
        this.cuentaIVA = cuentaIVA;
    }

    public String getRetecionCuentaDebito() {
        return retecionCuentaDebito;
    }

    public void setRetecionCuentaDebito(String retecionCuentaDebito) {
        this.retecionCuentaDebito = retecionCuentaDebito;
    }

    public Short getBin() {
        return bin;
    }

    public void setBin(Short bin) {
        this.bin = bin;
    }

    public Short getEsAnticipo() {
        return esAnticipo;
    }

    public void setEsAnticipo(Short esAnticipo) {
        this.esAnticipo = esAnticipo;
    }

    public Integer getGrupo() {
        return grupo;
    }

    public void setGrupo(Integer grupo) {
        this.grupo = grupo;
    }

    public int getOdbcfixFldauto() {
        return odbcfixFldauto;
    }

    public void setOdbcfixFldauto(int odbcfixFldauto) {
        this.odbcfixFldauto = odbcfixFldauto;
    }

    public List<Otrosingresos> getOtrosingresosList() {
        return otrosingresosList;
    }

    public void setOtrosingresosList(List<Otrosingresos> otrosingresosList) {
        this.otrosingresosList = otrosingresosList;
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
        if (!(object instanceof Codigoingresos)) {
            return false;
        }
        Codigoingresos other = (Codigoingresos) object;
        if ((this.codigo == null && other.codigo != null) || (this.codigo != null && !this.codigo.equals(other.codigo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.Codigoingresos[ codigo=" + codigo + " ]";
    }
    
}
