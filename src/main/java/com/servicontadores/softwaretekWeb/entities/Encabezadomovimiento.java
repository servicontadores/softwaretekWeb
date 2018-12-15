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
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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
    @NamedQuery(name = "Encabezadomovimiento.findAll", query = "SELECT e FROM Encabezadomovimiento e")})
public class Encabezadomovimiento implements Serializable {

    private static final long serialVersionUID = 1L;
    private Integer cody;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(nullable = false)
    private Integer regedit;
    @Temporal(TemporalType.TIMESTAMP)
    private Date fecha;
    private Integer nroDocumento;
    @Basic(optional = false)
    @Column(nullable = false)
    private int cdc;
    @Basic(optional = false)
    @Column(nullable = false)
    private int codigoMovimiento;
    @Basic(optional = false)
    @Column(nullable = false)
    private int imp;
    @Basic(optional = false)
    @Column(name = "ODBCFIX_FLDAUTO", nullable = false)
    private int odbcfixFldauto;
    @Basic(optional = false)
    @Column(nullable = false)
    private boolean cerrado;
    private Short eliminar;
    @JoinColumn(name = "CodigoFuente", referencedColumnName = "CodFuente")
    @ManyToOne
    private Comprobantefuente codigoFuente;
    @JoinColumn(name = "CodigoSucursal", referencedColumnName = "Codigo", nullable = false)
    @ManyToOne(optional = false)
    private Sucursales codigoSucursal;

    public Encabezadomovimiento() {
    }

    public Encabezadomovimiento(Integer regedit) {
        this.regedit = regedit;
    }

    public Encabezadomovimiento(Integer regedit, int cdc, int codigoMovimiento, int imp, int odbcfixFldauto, boolean cerrado) {
        this.regedit = regedit;
        this.cdc = cdc;
        this.codigoMovimiento = codigoMovimiento;
        this.imp = imp;
        this.odbcfixFldauto = odbcfixFldauto;
        this.cerrado = cerrado;
    }

    public Integer getCody() {
        return cody;
    }

    public void setCody(Integer cody) {
        this.cody = cody;
    }

    public Integer getRegedit() {
        return regedit;
    }

    public void setRegedit(Integer regedit) {
        this.regedit = regedit;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Integer getNroDocumento() {
        return nroDocumento;
    }

    public void setNroDocumento(Integer nroDocumento) {
        this.nroDocumento = nroDocumento;
    }

    public int getCdc() {
        return cdc;
    }

    public void setCdc(int cdc) {
        this.cdc = cdc;
    }

    public int getCodigoMovimiento() {
        return codigoMovimiento;
    }

    public void setCodigoMovimiento(int codigoMovimiento) {
        this.codigoMovimiento = codigoMovimiento;
    }

    public int getImp() {
        return imp;
    }

    public void setImp(int imp) {
        this.imp = imp;
    }

    public int getOdbcfixFldauto() {
        return odbcfixFldauto;
    }

    public void setOdbcfixFldauto(int odbcfixFldauto) {
        this.odbcfixFldauto = odbcfixFldauto;
    }

    public boolean getCerrado() {
        return cerrado;
    }

    public void setCerrado(boolean cerrado) {
        this.cerrado = cerrado;
    }

    public Short getEliminar() {
        return eliminar;
    }

    public void setEliminar(Short eliminar) {
        this.eliminar = eliminar;
    }

    public Comprobantefuente getCodigoFuente() {
        return codigoFuente;
    }

    public void setCodigoFuente(Comprobantefuente codigoFuente) {
        this.codigoFuente = codigoFuente;
    }

    public Sucursales getCodigoSucursal() {
        return codigoSucursal;
    }

    public void setCodigoSucursal(Sucursales codigoSucursal) {
        this.codigoSucursal = codigoSucursal;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (regedit != null ? regedit.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Encabezadomovimiento)) {
            return false;
        }
        Encabezadomovimiento other = (Encabezadomovimiento) object;
        if ((this.regedit == null && other.regedit != null) || (this.regedit != null && !this.regedit.equals(other.regedit))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.Encabezadomovimiento[ regedit=" + regedit + " ]";
    }
    
}
