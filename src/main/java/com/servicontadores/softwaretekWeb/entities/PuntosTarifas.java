/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.servicontadores.softwaretekWeb.entities;

import java.io.Serializable;
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
import javax.persistence.Table;

/**
 *
 * @author yesidherrera
 */
@Entity
@Table(name = "puntos_tarifas")
@NamedQueries({
    @NamedQuery(name = "PuntosTarifas.findAll", query = "SELECT p FROM PuntosTarifas p")})
public class PuntosTarifas implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(nullable = false)
    private Integer indice;
    @Basic(optional = false)
    @Column(nullable = false)
    private int tarifa;
    @Column(name = "ODBC_FIX")
    private Integer odbcFix;
    @JoinColumn(name = "CodigoConcepto", referencedColumnName = "Codigo", nullable = false)
    @ManyToOne(optional = false)
    private Conceptosproductos codigoConcepto;
    @JoinColumn(name = "CodigoFormaPago", referencedColumnName = "Codigo", nullable = false)
    @ManyToOne(optional = false)
    private Formaspago codigoFormaPago;

    public PuntosTarifas() {
    }

    public PuntosTarifas(Integer indice) {
        this.indice = indice;
    }

    public PuntosTarifas(Integer indice, int tarifa) {
        this.indice = indice;
        this.tarifa = tarifa;
    }

    public Integer getIndice() {
        return indice;
    }

    public void setIndice(Integer indice) {
        this.indice = indice;
    }

    public int getTarifa() {
        return tarifa;
    }

    public void setTarifa(int tarifa) {
        this.tarifa = tarifa;
    }

    public Integer getOdbcFix() {
        return odbcFix;
    }

    public void setOdbcFix(Integer odbcFix) {
        this.odbcFix = odbcFix;
    }

    public Conceptosproductos getCodigoConcepto() {
        return codigoConcepto;
    }

    public void setCodigoConcepto(Conceptosproductos codigoConcepto) {
        this.codigoConcepto = codigoConcepto;
    }

    public Formaspago getCodigoFormaPago() {
        return codigoFormaPago;
    }

    public void setCodigoFormaPago(Formaspago codigoFormaPago) {
        this.codigoFormaPago = codigoFormaPago;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (indice != null ? indice.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PuntosTarifas)) {
            return false;
        }
        PuntosTarifas other = (PuntosTarifas) object;
        if ((this.indice == null && other.indice != null) || (this.indice != null && !this.indice.equals(other.indice))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.PuntosTarifas[ indice=" + indice + " ]";
    }
    
}
