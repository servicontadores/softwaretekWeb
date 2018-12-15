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

/**
 *
 * @author yesidherrera
 */
@Entity
@NamedQueries({
    @NamedQuery(name = "Formapagoconcepto.findAll", query = "SELECT f FROM Formapagoconcepto f")})
public class Formapagoconcepto implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(nullable = false)
    private Integer cody;
    @Basic(optional = false)
    @Column(name = "ODBCFIX_FLDAUTO", nullable = false)
    private int odbcfixFldauto;
    @JoinColumn(name = "CodigoConcepto", referencedColumnName = "Codigo", nullable = false)
    @ManyToOne(optional = false)
    private Conceptosproductos codigoConcepto;
    @JoinColumn(name = "CodigoFormaPago", referencedColumnName = "Codigo", nullable = false)
    @ManyToOne(optional = false)
    private Formaspago codigoFormaPago;

    public Formapagoconcepto() {
    }

    public Formapagoconcepto(Integer cody) {
        this.cody = cody;
    }

    public Formapagoconcepto(Integer cody, int odbcfixFldauto) {
        this.cody = cody;
        this.odbcfixFldauto = odbcfixFldauto;
    }

    public Integer getCody() {
        return cody;
    }

    public void setCody(Integer cody) {
        this.cody = cody;
    }

    public int getOdbcfixFldauto() {
        return odbcfixFldauto;
    }

    public void setOdbcfixFldauto(int odbcfixFldauto) {
        this.odbcfixFldauto = odbcfixFldauto;
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
        hash += (cody != null ? cody.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Formapagoconcepto)) {
            return false;
        }
        Formapagoconcepto other = (Formapagoconcepto) object;
        if ((this.cody == null && other.cody != null) || (this.cody != null && !this.cody.equals(other.cody))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.Formapagoconcepto[ cody=" + cody + " ]";
    }
    
}
