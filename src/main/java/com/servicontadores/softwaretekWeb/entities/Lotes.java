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
    @NamedQuery(name = "Lotes.findAll", query = "SELECT l FROM Lotes l")})
public class Lotes implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(nullable = false, length = 20)
    private String codigoLote;
    @Temporal(TemporalType.TIMESTAMP)
    private Date fecha;
    @Column(length = 100)
    private String detalle;
    @Basic(optional = false)
    @Column(name = "ODBCFIX_FLDAUTO", nullable = false)
    private int odbcfixFldauto;

    public Lotes() {
    }

    public Lotes(String codigoLote) {
        this.codigoLote = codigoLote;
    }

    public Lotes(String codigoLote, int odbcfixFldauto) {
        this.codigoLote = codigoLote;
        this.odbcfixFldauto = odbcfixFldauto;
    }

    public String getCodigoLote() {
        return codigoLote;
    }

    public void setCodigoLote(String codigoLote) {
        this.codigoLote = codigoLote;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
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

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codigoLote != null ? codigoLote.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Lotes)) {
            return false;
        }
        Lotes other = (Lotes) object;
        if ((this.codigoLote == null && other.codigoLote != null) || (this.codigoLote != null && !this.codigoLote.equals(other.codigoLote))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.Lotes[ codigoLote=" + codigoLote + " ]";
    }
    
}
