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
    @NamedQuery(name = "Puccxp.findAll", query = "SELECT p FROM Puccxp p")})
public class Puccxp implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(nullable = false)
    private Integer cody;
    @Column(length = 50)
    private String fuenteCXP;
    @Column(length = 50)
    private String fuentePagosCXP;
    @Column(length = 50)
    private String cXPCredito;
    @Column(length = 50)
    private String pagosCXPDEBITO;
    @Column(length = 50)
    private String retencionCREDITO;
    @Column(length = 50)
    private String descuentoDEBITO;
    @Column(length = 50)
    private String descuentoCREDITO;
    @Column(length = 45)
    private String reteIVACREDITO;
    @Column(length = 45)
    private String reteICACREDITO;
    @Column(length = 45)
    private String retencionNomina;
    @Column(name = "ODBCFIX_FLDAUTO")
    private Integer odbcfixFldauto;
    @Column(length = 50)
    private String intereses;
    @Column(length = 50)
    private String reteCREE;

    public Puccxp() {
    }

    public Puccxp(Integer cody) {
        this.cody = cody;
    }

    public Integer getCody() {
        return cody;
    }

    public void setCody(Integer cody) {
        this.cody = cody;
    }

    public String getFuenteCXP() {
        return fuenteCXP;
    }

    public void setFuenteCXP(String fuenteCXP) {
        this.fuenteCXP = fuenteCXP;
    }

    public String getFuentePagosCXP() {
        return fuentePagosCXP;
    }

    public void setFuentePagosCXP(String fuentePagosCXP) {
        this.fuentePagosCXP = fuentePagosCXP;
    }

    public String getCXPCredito() {
        return cXPCredito;
    }

    public void setCXPCredito(String cXPCredito) {
        this.cXPCredito = cXPCredito;
    }

    public String getPagosCXPDEBITO() {
        return pagosCXPDEBITO;
    }

    public void setPagosCXPDEBITO(String pagosCXPDEBITO) {
        this.pagosCXPDEBITO = pagosCXPDEBITO;
    }

    public String getRetencionCREDITO() {
        return retencionCREDITO;
    }

    public void setRetencionCREDITO(String retencionCREDITO) {
        this.retencionCREDITO = retencionCREDITO;
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

    public String getReteIVACREDITO() {
        return reteIVACREDITO;
    }

    public void setReteIVACREDITO(String reteIVACREDITO) {
        this.reteIVACREDITO = reteIVACREDITO;
    }

    public String getReteICACREDITO() {
        return reteICACREDITO;
    }

    public void setReteICACREDITO(String reteICACREDITO) {
        this.reteICACREDITO = reteICACREDITO;
    }

    public String getRetencionNomina() {
        return retencionNomina;
    }

    public void setRetencionNomina(String retencionNomina) {
        this.retencionNomina = retencionNomina;
    }

    public Integer getOdbcfixFldauto() {
        return odbcfixFldauto;
    }

    public void setOdbcfixFldauto(Integer odbcfixFldauto) {
        this.odbcfixFldauto = odbcfixFldauto;
    }

    public String getIntereses() {
        return intereses;
    }

    public void setIntereses(String intereses) {
        this.intereses = intereses;
    }

    public String getReteCREE() {
        return reteCREE;
    }

    public void setReteCREE(String reteCREE) {
        this.reteCREE = reteCREE;
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
        if (!(object instanceof Puccxp)) {
            return false;
        }
        Puccxp other = (Puccxp) object;
        if ((this.cody == null && other.cody != null) || (this.cody != null && !this.cody.equals(other.cody))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.Puccxp[ cody=" + cody + " ]";
    }
    
}
