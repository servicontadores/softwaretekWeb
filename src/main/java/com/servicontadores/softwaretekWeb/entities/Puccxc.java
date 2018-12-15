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
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;

/**
 *
 * @author yesidherrera
 */
@Entity
@NamedQueries({
    @NamedQuery(name = "Puccxc.findAll", query = "SELECT p FROM Puccxc p")})
public class Puccxc implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(nullable = false)
    private Integer cody;
    @Column(length = 50)
    private String fuenteCXC;
    @Column(length = 50)
    private String fuentePagosCXC;
    @Column(length = 50)
    private String cuentaCXCDEBITO;
    @Column(length = 50)
    private String pagosCXCCREDITO;
    @Column(length = 50)
    private String retencionDEBITO;
    @Column(length = 50)
    private String descuentoDEBITO;
    @Column(length = 50)
    private String descuentoCREDITO;
    @Column(length = 50)
    private String financiacionCredito;
    @Column(length = 50)
    private String regedit;
    @Column(length = 45)
    private String reteIVADebito;
    @Column(length = 45)
    private String reteICADebito;
    @Column(name = "ODBCFIX_FLDAUTO")
    private Integer odbcfixFldauto;
    @Column(length = 50)
    private String reteCREE;
    @Column(length = 45)
    private String intereses;

    public Puccxc() {
    }

    public Puccxc(Integer cody) {
        this.cody = cody;
    }

    public Integer getCody() {
        return cody;
    }

    public void setCody(Integer cody) {
        this.cody = cody;
    }

    public String getFuenteCXC() {
        return fuenteCXC;
    }

    public void setFuenteCXC(String fuenteCXC) {
        this.fuenteCXC = fuenteCXC;
    }

    public String getFuentePagosCXC() {
        return fuentePagosCXC;
    }

    public void setFuentePagosCXC(String fuentePagosCXC) {
        this.fuentePagosCXC = fuentePagosCXC;
    }

    public String getCuentaCXCDEBITO() {
        return cuentaCXCDEBITO;
    }

    public void setCuentaCXCDEBITO(String cuentaCXCDEBITO) {
        this.cuentaCXCDEBITO = cuentaCXCDEBITO;
    }

    public String getPagosCXCCREDITO() {
        return pagosCXCCREDITO;
    }

    public void setPagosCXCCREDITO(String pagosCXCCREDITO) {
        this.pagosCXCCREDITO = pagosCXCCREDITO;
    }

    public String getRetencionDEBITO() {
        return retencionDEBITO;
    }

    public void setRetencionDEBITO(String retencionDEBITO) {
        this.retencionDEBITO = retencionDEBITO;
    }

    public String getDescuentoDEBITO() {
        return descuentoDEBITO;
    }

    public void setDescuentoDEBITO(String descuentoDEBITO) {
        this.descuentoDEBITO = descuentoDEBITO;
    }

    public String getDescuentoCREDITO() {
        return descuentoCREDITO;
    }

    public void setDescuentoCREDITO(String descuentoCREDITO) {
        this.descuentoCREDITO = descuentoCREDITO;
    }

    public String getFinanciacionCredito() {
        return financiacionCredito;
    }

    public void setFinanciacionCredito(String financiacionCredito) {
        this.financiacionCredito = financiacionCredito;
    }

    public String getRegedit() {
        return regedit;
    }

    public void setRegedit(String regedit) {
        this.regedit = regedit;
    }

    public String getReteIVADebito() {
        return reteIVADebito;
    }

    public void setReteIVADebito(String reteIVADebito) {
        this.reteIVADebito = reteIVADebito;
    }

    public String getReteICADebito() {
        return reteICADebito;
    }

    public void setReteICADebito(String reteICADebito) {
        this.reteICADebito = reteICADebito;
    }

    public Integer getOdbcfixFldauto() {
        return odbcfixFldauto;
    }

    public void setOdbcfixFldauto(Integer odbcfixFldauto) {
        this.odbcfixFldauto = odbcfixFldauto;
    }

    public String getReteCREE() {
        return reteCREE;
    }

    public void setReteCREE(String reteCREE) {
        this.reteCREE = reteCREE;
    }

    public String getIntereses() {
        return intereses;
    }

    public void setIntereses(String intereses) {
        this.intereses = intereses;
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
        if (!(object instanceof Puccxc)) {
            return false;
        }
        Puccxc other = (Puccxc) object;
        if ((this.cody == null && other.cody != null) || (this.cody != null && !this.cody.equals(other.cody))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.Puccxc[ cody=" + cody + " ]";
    }
    
}
