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
    @NamedQuery(name = "Retiro.findAll", query = "SELECT r FROM Retiro r")})
public class Retiro implements Serializable {

    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @Column(nullable = false)
    private int cody;
    @Id
    @Basic(optional = false)
    @Column(nullable = false)
    private Integer keygen;
    @Temporal(TemporalType.TIMESTAMP)
    private Date fecha;
    @Column(length = 50)
    private String fuente;
    private Integer no;
    @Column(length = 50)
    private String cuentaMovimiento;
    @Column(length = 50)
    private String nit;
    @Column(length = 90)
    private String observacion;
    @Column(length = 50)
    private String concepto;
    private Integer valor;
    private Short cancelado;
    private Integer cdc;
    @Basic(optional = false)
    @Column(nullable = false)
    private int codigoConcepto;
    @Basic(optional = false)
    @Column(name = "ODBCFIX_FLDAUTO", nullable = false)
    private int odbcfixFldauto;
    @Basic(optional = false)
    @Column(name = "NoDoc_Auto", nullable = false)
    private boolean noDocAuto;
    @JoinColumn(name = "NoCuentaOCheque", referencedColumnName = "NoCuenta", nullable = false)
    @ManyToOne(optional = false)
    private Cuentasbancarias noCuentaOCheque;
    @JoinColumn(name = "CodigoSucursal", referencedColumnName = "Codigo", nullable = false)
    @ManyToOne(optional = false)
    private Sucursales codigoSucursal;
    @JoinColumn(name = "CodigoUsuario", referencedColumnName = "Codigo", nullable = false)
    @ManyToOne(optional = false)
    private User codigoUsuario;

    public Retiro() {
    }

    public Retiro(Integer keygen) {
        this.keygen = keygen;
    }

    public Retiro(Integer keygen, int cody, int codigoConcepto, int odbcfixFldauto, boolean noDocAuto) {
        this.keygen = keygen;
        this.cody = cody;
        this.codigoConcepto = codigoConcepto;
        this.odbcfixFldauto = odbcfixFldauto;
        this.noDocAuto = noDocAuto;
    }

    public int getCody() {
        return cody;
    }

    public void setCody(int cody) {
        this.cody = cody;
    }

    public Integer getKeygen() {
        return keygen;
    }

    public void setKeygen(Integer keygen) {
        this.keygen = keygen;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getFuente() {
        return fuente;
    }

    public void setFuente(String fuente) {
        this.fuente = fuente;
    }

    public Integer getNo() {
        return no;
    }

    public void setNo(Integer no) {
        this.no = no;
    }

    public String getCuentaMovimiento() {
        return cuentaMovimiento;
    }

    public void setCuentaMovimiento(String cuentaMovimiento) {
        this.cuentaMovimiento = cuentaMovimiento;
    }

    public String getNit() {
        return nit;
    }

    public void setNit(String nit) {
        this.nit = nit;
    }

    public String getObservacion() {
        return observacion;
    }

    public void setObservacion(String observacion) {
        this.observacion = observacion;
    }

    public String getConcepto() {
        return concepto;
    }

    public void setConcepto(String concepto) {
        this.concepto = concepto;
    }

    public Integer getValor() {
        return valor;
    }

    public void setValor(Integer valor) {
        this.valor = valor;
    }

    public Short getCancelado() {
        return cancelado;
    }

    public void setCancelado(Short cancelado) {
        this.cancelado = cancelado;
    }

    public Integer getCdc() {
        return cdc;
    }

    public void setCdc(Integer cdc) {
        this.cdc = cdc;
    }

    public int getCodigoConcepto() {
        return codigoConcepto;
    }

    public void setCodigoConcepto(int codigoConcepto) {
        this.codigoConcepto = codigoConcepto;
    }

    public int getOdbcfixFldauto() {
        return odbcfixFldauto;
    }

    public void setOdbcfixFldauto(int odbcfixFldauto) {
        this.odbcfixFldauto = odbcfixFldauto;
    }

    public boolean getNoDocAuto() {
        return noDocAuto;
    }

    public void setNoDocAuto(boolean noDocAuto) {
        this.noDocAuto = noDocAuto;
    }

    public Cuentasbancarias getNoCuentaOCheque() {
        return noCuentaOCheque;
    }

    public void setNoCuentaOCheque(Cuentasbancarias noCuentaOCheque) {
        this.noCuentaOCheque = noCuentaOCheque;
    }

    public Sucursales getCodigoSucursal() {
        return codigoSucursal;
    }

    public void setCodigoSucursal(Sucursales codigoSucursal) {
        this.codigoSucursal = codigoSucursal;
    }

    public User getCodigoUsuario() {
        return codigoUsuario;
    }

    public void setCodigoUsuario(User codigoUsuario) {
        this.codigoUsuario = codigoUsuario;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (keygen != null ? keygen.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Retiro)) {
            return false;
        }
        Retiro other = (Retiro) object;
        if ((this.keygen == null && other.keygen != null) || (this.keygen != null && !this.keygen.equals(other.keygen))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.Retiro[ keygen=" + keygen + " ]";
    }
    
}
