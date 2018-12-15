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
    @NamedQuery(name = "Movimientocaja.findAll", query = "SELECT m FROM Movimientocaja m")})
public class Movimientocaja implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(nullable = false)
    private Integer cody;
    @Temporal(TemporalType.TIMESTAMP)
    private Date fecha;
    private Integer saldoBanco;
    private Integer saldoEfectivo;
    private Integer bin;
    @Basic(optional = false)
    @Column(name = "ODBCFIX_FLDAUTO", nullable = false)
    private int odbcfixFldauto;
    private Integer codigoFormaPago;
    @JoinColumn(name = "CodigoSucursal", referencedColumnName = "Codigo")
    @ManyToOne
    private Sucursales codigoSucursal;

    public Movimientocaja() {
    }

    public Movimientocaja(Integer cody) {
        this.cody = cody;
    }

    public Movimientocaja(Integer cody, int odbcfixFldauto) {
        this.cody = cody;
        this.odbcfixFldauto = odbcfixFldauto;
    }

    public Integer getCody() {
        return cody;
    }

    public void setCody(Integer cody) {
        this.cody = cody;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Integer getSaldoBanco() {
        return saldoBanco;
    }

    public void setSaldoBanco(Integer saldoBanco) {
        this.saldoBanco = saldoBanco;
    }

    public Integer getSaldoEfectivo() {
        return saldoEfectivo;
    }

    public void setSaldoEfectivo(Integer saldoEfectivo) {
        this.saldoEfectivo = saldoEfectivo;
    }

    public Integer getBin() {
        return bin;
    }

    public void setBin(Integer bin) {
        this.bin = bin;
    }

    public int getOdbcfixFldauto() {
        return odbcfixFldauto;
    }

    public void setOdbcfixFldauto(int odbcfixFldauto) {
        this.odbcfixFldauto = odbcfixFldauto;
    }

    public Integer getCodigoFormaPago() {
        return codigoFormaPago;
    }

    public void setCodigoFormaPago(Integer codigoFormaPago) {
        this.codigoFormaPago = codigoFormaPago;
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
        hash += (cody != null ? cody.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Movimientocaja)) {
            return false;
        }
        Movimientocaja other = (Movimientocaja) object;
        if ((this.cody == null && other.cody != null) || (this.cody != null && !this.cody.equals(other.cody))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.Movimientocaja[ cody=" + cody + " ]";
    }
    
}
