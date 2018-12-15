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
    @NamedQuery(name = "Movimientosnotacontable.findAll", query = "SELECT m FROM Movimientosnotacontable m")})
public class Movimientosnotacontable implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(nullable = false)
    private Integer cody;
    @Basic(optional = false)
    @Column(nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date fecha;
    @Basic(optional = false)
    @Column(nullable = false)
    private int codigoConceptoNotaContable;
    @Column(length = 50)
    private String nit;
    @Basic(optional = false)
    @Column(nullable = false)
    private int noDocumento;
    @Column(length = 100)
    private String detalle;
    @Basic(optional = false)
    @Column(nullable = false)
    private int regedit;
    @Basic(optional = false)
    @Column(nullable = false)
    private int debito;
    @Basic(optional = false)
    @Column(nullable = false)
    private int credito;
    private Integer cdc;
    @Basic(optional = false)
    @Column(name = "ODBCFIX_FLDAUTO", nullable = false)
    private int odbcfixFldauto;
    private Integer codigoConceptoCartera;

    public Movimientosnotacontable() {
    }

    public Movimientosnotacontable(Integer cody) {
        this.cody = cody;
    }

    public Movimientosnotacontable(Integer cody, Date fecha, int codigoConceptoNotaContable, int noDocumento, int regedit, int debito, int credito, int odbcfixFldauto) {
        this.cody = cody;
        this.fecha = fecha;
        this.codigoConceptoNotaContable = codigoConceptoNotaContable;
        this.noDocumento = noDocumento;
        this.regedit = regedit;
        this.debito = debito;
        this.credito = credito;
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

    public int getCodigoConceptoNotaContable() {
        return codigoConceptoNotaContable;
    }

    public void setCodigoConceptoNotaContable(int codigoConceptoNotaContable) {
        this.codigoConceptoNotaContable = codigoConceptoNotaContable;
    }

    public String getNit() {
        return nit;
    }

    public void setNit(String nit) {
        this.nit = nit;
    }

    public int getNoDocumento() {
        return noDocumento;
    }

    public void setNoDocumento(int noDocumento) {
        this.noDocumento = noDocumento;
    }

    public String getDetalle() {
        return detalle;
    }

    public void setDetalle(String detalle) {
        this.detalle = detalle;
    }

    public int getRegedit() {
        return regedit;
    }

    public void setRegedit(int regedit) {
        this.regedit = regedit;
    }

    public int getDebito() {
        return debito;
    }

    public void setDebito(int debito) {
        this.debito = debito;
    }

    public int getCredito() {
        return credito;
    }

    public void setCredito(int credito) {
        this.credito = credito;
    }

    public Integer getCdc() {
        return cdc;
    }

    public void setCdc(Integer cdc) {
        this.cdc = cdc;
    }

    public int getOdbcfixFldauto() {
        return odbcfixFldauto;
    }

    public void setOdbcfixFldauto(int odbcfixFldauto) {
        this.odbcfixFldauto = odbcfixFldauto;
    }

    public Integer getCodigoConceptoCartera() {
        return codigoConceptoCartera;
    }

    public void setCodigoConceptoCartera(Integer codigoConceptoCartera) {
        this.codigoConceptoCartera = codigoConceptoCartera;
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
        if (!(object instanceof Movimientosnotacontable)) {
            return false;
        }
        Movimientosnotacontable other = (Movimientosnotacontable) object;
        if ((this.cody == null && other.cody != null) || (this.cody != null && !this.cody.equals(other.cody))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.Movimientosnotacontable[ cody=" + cody + " ]";
    }
    
}
