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
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 *
 * @author yesidherrera
 */
@Entity
@Table(name = "produccion_configuracionconceptos")
@NamedQueries({
    @NamedQuery(name = "ProduccionConfiguracionconceptos.findAll", query = "SELECT p FROM ProduccionConfiguracionconceptos p")})
public class ProduccionConfiguracionconceptos implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(nullable = false)
    private Integer codigoConcepto;
    @Basic(optional = false)
    @Column(nullable = false)
    private int codigoConceptoGenerado;

    public ProduccionConfiguracionconceptos() {
    }

    public ProduccionConfiguracionconceptos(Integer codigoConcepto) {
        this.codigoConcepto = codigoConcepto;
    }

    public ProduccionConfiguracionconceptos(Integer codigoConcepto, int codigoConceptoGenerado) {
        this.codigoConcepto = codigoConcepto;
        this.codigoConceptoGenerado = codigoConceptoGenerado;
    }

    public Integer getCodigoConcepto() {
        return codigoConcepto;
    }

    public void setCodigoConcepto(Integer codigoConcepto) {
        this.codigoConcepto = codigoConcepto;
    }

    public int getCodigoConceptoGenerado() {
        return codigoConceptoGenerado;
    }

    public void setCodigoConceptoGenerado(int codigoConceptoGenerado) {
        this.codigoConceptoGenerado = codigoConceptoGenerado;
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
        if (!(object instanceof ProduccionConfiguracionconceptos)) {
            return false;
        }
        ProduccionConfiguracionconceptos other = (ProduccionConfiguracionconceptos) object;
        if ((this.codigoConcepto == null && other.codigoConcepto != null) || (this.codigoConcepto != null && !this.codigoConcepto.equals(other.codigoConcepto))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.ProduccionConfiguracionconceptos[ codigoConcepto=" + codigoConcepto + " ]";
    }
    
}
