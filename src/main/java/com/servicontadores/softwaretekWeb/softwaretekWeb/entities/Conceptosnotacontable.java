/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

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
    @NamedQuery(name = "Conceptosnotacontable.findAll", query = "SELECT c FROM Conceptosnotacontable c")})
public class Conceptosnotacontable implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(nullable = false)
    private Integer codigoConcepto;
    @Column(length = 45)
    private String concepto;
    @Column(length = 50)
    private String detalle;
    @Basic(optional = false)
    @Column(nullable = false, length = 45)
    private String cuentaPUC;
    @Column(length = 45)
    private String mueve;
    @Basic(optional = false)
    @Column(name = "ODBCFIX_FLDAUTO", nullable = false)
    private int odbcfixFldauto;

    public Conceptosnotacontable() {
    }

    public Conceptosnotacontable(Integer codigoConcepto) {
        this.codigoConcepto = codigoConcepto;
    }

    public Conceptosnotacontable(Integer codigoConcepto, String cuentaPUC, int odbcfixFldauto) {
        this.codigoConcepto = codigoConcepto;
        this.cuentaPUC = cuentaPUC;
        this.odbcfixFldauto = odbcfixFldauto;
    }

    public Integer getCodigoConcepto() {
        return codigoConcepto;
    }

    public void setCodigoConcepto(Integer codigoConcepto) {
        this.codigoConcepto = codigoConcepto;
    }

    public String getConcepto() {
        return concepto;
    }

    public void setConcepto(String concepto) {
        this.concepto = concepto;
    }

    public String getDetalle() {
        return detalle;
    }

    public void setDetalle(String detalle) {
        this.detalle = detalle;
    }

    public String getCuentaPUC() {
        return cuentaPUC;
    }

    public void setCuentaPUC(String cuentaPUC) {
        this.cuentaPUC = cuentaPUC;
    }

    public String getMueve() {
        return mueve;
    }

    public void setMueve(String mueve) {
        this.mueve = mueve;
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
        hash += (codigoConcepto != null ? codigoConcepto.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Conceptosnotacontable)) {
            return false;
        }
        Conceptosnotacontable other = (Conceptosnotacontable) object;
        if ((this.codigoConcepto == null && other.codigoConcepto != null) || (this.codigoConcepto != null && !this.codigoConcepto.equals(other.codigoConcepto))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.Conceptosnotacontable[ codigoConcepto=" + codigoConcepto + " ]";
    }
    
}
