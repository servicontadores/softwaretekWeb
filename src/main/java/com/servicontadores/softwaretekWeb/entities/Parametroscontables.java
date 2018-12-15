/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.servicontadores.softwaretekWeb.entities;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author yesidherrera
 */
@Entity
@NamedQueries({
    @NamedQuery(name = "Parametroscontables.findAll", query = "SELECT p FROM Parametroscontables p")})
public class Parametroscontables implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(nullable = false)
    private Integer codigoMovimiento;
    @Basic(optional = false)
    @Column(nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date fecha;
    @Basic(optional = false)
    @Column(nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date fecha2;
    @Column(length = 50)
    private String nit;
    @Basic(optional = false)
    @Column(nullable = false, length = 10)
    private String cuenta;
    @Basic(optional = false)
    @Column(nullable = false, length = 10)
    private String cuenta2;
    @Basic(optional = false)
    @Column(nullable = false, length = 45)
    private String detalle;
    @Basic(optional = false)
    @Column(nullable = false, length = 5)
    private String fuente;
    @Basic(optional = false)
    @Column(nullable = false, length = 50)
    private String nroDocumento;
    @Basic(optional = false)
    @Column(nullable = false, length = 45)
    private String nro;
    @Basic(optional = false)
    @Column(nullable = false, length = 45)
    private String codigoCDC;
    @Basic(optional = false)
    @Column(nullable = false, length = 45)
    private String codigoSucursal;

    public Parametroscontables() {
    }

    public Parametroscontables(Integer codigoMovimiento) {
        this.codigoMovimiento = codigoMovimiento;
    }

    public Parametroscontables(Integer codigoMovimiento, Date fecha, Date fecha2, String cuenta, String cuenta2, String detalle, String fuente, String nroDocumento, String nro, String codigoCDC, String codigoSucursal) {
        this.codigoMovimiento = codigoMovimiento;
        this.fecha = fecha;
        this.fecha2 = fecha2;
        this.cuenta = cuenta;
        this.cuenta2 = cuenta2;
        this.detalle = detalle;
        this.fuente = fuente;
        this.nroDocumento = nroDocumento;
        this.nro = nro;
        this.codigoCDC = codigoCDC;
        this.codigoSucursal = codigoSucursal;
    }

    public Integer getCodigoMovimiento() {
        return codigoMovimiento;
    }

    public void setCodigoMovimiento(Integer codigoMovimiento) {
        this.codigoMovimiento = codigoMovimiento;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Date getFecha2() {
        return fecha2;
    }

    public void setFecha2(Date fecha2) {
        this.fecha2 = fecha2;
    }

    public String getNit() {
        return nit;
    }

    public void setNit(String nit) {
        this.nit = nit;
    }

    public String getCuenta() {
        return cuenta;
    }

    public void setCuenta(String cuenta) {
        this.cuenta = cuenta;
    }

    public String getCuenta2() {
        return cuenta2;
    }

    public void setCuenta2(String cuenta2) {
        this.cuenta2 = cuenta2;
    }

    public String getDetalle() {
        return detalle;
    }

    public void setDetalle(String detalle) {
        this.detalle = detalle;
    }

    public String getFuente() {
        return fuente;
    }

    public void setFuente(String fuente) {
        this.fuente = fuente;
    }

    public String getNroDocumento() {
        return nroDocumento;
    }

    public void setNroDocumento(String nroDocumento) {
        this.nroDocumento = nroDocumento;
    }

    public String getNro() {
        return nro;
    }

    public void setNro(String nro) {
        this.nro = nro;
    }

    public String getCodigoCDC() {
        return codigoCDC;
    }

    public void setCodigoCDC(String codigoCDC) {
        this.codigoCDC = codigoCDC;
    }

    public String getCodigoSucursal() {
        return codigoSucursal;
    }

    public void setCodigoSucursal(String codigoSucursal) {
        this.codigoSucursal = codigoSucursal;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codigoMovimiento != null ? codigoMovimiento.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Parametroscontables)) {
            return false;
        }
        Parametroscontables other = (Parametroscontables) object;
        if ((this.codigoMovimiento == null && other.codigoMovimiento != null) || (this.codigoMovimiento != null && !this.codigoMovimiento.equals(other.codigoMovimiento))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.Parametroscontables[ codigoMovimiento=" + codigoMovimiento + " ]";
    }
    
}
