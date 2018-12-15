/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.servicontadores.softwaretekWeb.entities;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author yesidherrera
 */
@Entity
@NamedQueries({
    @NamedQuery(name = "User.findAll", query = "SELECT u FROM User u")})
public class User implements Serializable {

    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @Column(nullable = false)
    private int codyU;
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaU;
    @Id
    @Basic(optional = false)
    @Column(nullable = false, length = 50)
    private String codigo;
    @Column(length = 50)
    private String passw;
    @Column(length = 50)
    private String passwConfirm;
    @Column(length = 50)
    private String nombreUsuario;
    @Column(length = 50)
    private String observacion;
    @Basic(optional = false)
    @Column(nullable = false)
    private short bin;
    @Basic(optional = false)
    @Column(name = "ODBCFIX_FLDAUTO", nullable = false)
    private int odbcfixFldauto;
    @Column(length = 50)
    private String cargo;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "codigoUsuario")
    private List<PresupuestosCargousuarios> presupuestosCargousuariosList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "codigoUsuario")
    private List<FacturarmovimientodiarioPlantilla> facturarmovimientodiarioPlantillaList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "codigoUsuario")
    private List<Facturarmovimientodiario> facturarmovimientodiarioList;
    @OneToMany(mappedBy = "codigoUsuario")
    private List<Encabezadootrosingresos> encabezadootrosingresosList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "codigoUsuario")
    private List<Retiro> retiroList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "codigoUsuario")
    private List<CitasRegistrocitas> citasRegistrocitasList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "codigoUsuario")
    private List<Facturarmovimientopendiente> facturarmovimientopendienteList;
    @OneToMany(mappedBy = "codigoUsuario")
    private List<Encabezadoegresos> encabezadoegresosList;
    @OneToMany(mappedBy = "codigoUsuario")
    private List<Cxp> cxpList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "codigoUsuario")
    private List<Consignacion> consignacionList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "codigoUsuario")
    private List<ParqueaderoRegistroingresos> parqueaderoRegistroingresosList;
    @OneToOne(cascade = CascadeType.ALL, mappedBy = "user")
    private Sistemab sistemab;

    public User() {
    }

    public User(String codigo) {
        this.codigo = codigo;
    }

    public User(String codigo, int codyU, short bin, int odbcfixFldauto) {
        this.codigo = codigo;
        this.codyU = codyU;
        this.bin = bin;
        this.odbcfixFldauto = odbcfixFldauto;
    }

    public int getCodyU() {
        return codyU;
    }

    public void setCodyU(int codyU) {
        this.codyU = codyU;
    }

    public Date getFechaU() {
        return fechaU;
    }

    public void setFechaU(Date fechaU) {
        this.fechaU = fechaU;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getPassw() {
        return passw;
    }

    public void setPassw(String passw) {
        this.passw = passw;
    }

    public String getPasswConfirm() {
        return passwConfirm;
    }

    public void setPasswConfirm(String passwConfirm) {
        this.passwConfirm = passwConfirm;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public String getObservacion() {
        return observacion;
    }

    public void setObservacion(String observacion) {
        this.observacion = observacion;
    }

    public short getBin() {
        return bin;
    }

    public void setBin(short bin) {
        this.bin = bin;
    }

    public int getOdbcfixFldauto() {
        return odbcfixFldauto;
    }

    public void setOdbcfixFldauto(int odbcfixFldauto) {
        this.odbcfixFldauto = odbcfixFldauto;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public List<PresupuestosCargousuarios> getPresupuestosCargousuariosList() {
        return presupuestosCargousuariosList;
    }

    public void setPresupuestosCargousuariosList(List<PresupuestosCargousuarios> presupuestosCargousuariosList) {
        this.presupuestosCargousuariosList = presupuestosCargousuariosList;
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

    public List<Retiro> getRetiroList() {
        return retiroList;
    }

    public void setRetiroList(List<Retiro> retiroList) {
        this.retiroList = retiroList;
    }

    public List<CitasRegistrocitas> getCitasRegistrocitasList() {
        return citasRegistrocitasList;
    }

    public void setCitasRegistrocitasList(List<CitasRegistrocitas> citasRegistrocitasList) {
        this.citasRegistrocitasList = citasRegistrocitasList;
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

    public List<Cxp> getCxpList() {
        return cxpList;
    }

    public void setCxpList(List<Cxp> cxpList) {
        this.cxpList = cxpList;
    }

    public List<Consignacion> getConsignacionList() {
        return consignacionList;
    }

    public void setConsignacionList(List<Consignacion> consignacionList) {
        this.consignacionList = consignacionList;
    }

    public List<ParqueaderoRegistroingresos> getParqueaderoRegistroingresosList() {
        return parqueaderoRegistroingresosList;
    }

    public void setParqueaderoRegistroingresosList(List<ParqueaderoRegistroingresos> parqueaderoRegistroingresosList) {
        this.parqueaderoRegistroingresosList = parqueaderoRegistroingresosList;
    }

    public Sistemab getSistemab() {
        return sistemab;
    }

    public void setSistemab(Sistemab sistemab) {
        this.sistemab = sistemab;
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
        if (!(object instanceof User)) {
            return false;
        }
        User other = (User) object;
        if ((this.codigo == null && other.codigo != null) || (this.codigo != null && !this.codigo.equals(other.codigo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.User[ codigo=" + codigo + " ]";
    }
    
}
