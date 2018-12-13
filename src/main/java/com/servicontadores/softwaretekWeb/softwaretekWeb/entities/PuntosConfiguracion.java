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
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 *
 * @author yesidherrera
 */
@Entity
@Table(name = "puntos_configuracion")
@NamedQueries({
    @NamedQuery(name = "PuntosConfiguracion.findAll", query = "SELECT p FROM PuntosConfiguracion p")})
public class PuntosConfiguracion implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(nullable = false)
    private Integer codigoConcepto;
    @JoinColumn(name = "CodigoEgreso", referencedColumnName = "Codigo", nullable = false)
    @ManyToOne(optional = false)
    private Codigoegresos codigoEgreso;
    @JoinColumn(name = "CodigoConcepto", referencedColumnName = "Codigo", nullable = false, insertable = false, updatable = false)
    @OneToOne(optional = false)
    private Conceptosproductos conceptosproductos;

    public PuntosConfiguracion() {
    }

    public PuntosConfiguracion(Integer codigoConcepto) {
        this.codigoConcepto = codigoConcepto;
    }

    public Integer getCodigoConcepto() {
        return codigoConcepto;
    }

    public void setCodigoConcepto(Integer codigoConcepto) {
        this.codigoConcepto = codigoConcepto;
    }

    public Codigoegresos getCodigoEgreso() {
        return codigoEgreso;
    }

    public void setCodigoEgreso(Codigoegresos codigoEgreso) {
        this.codigoEgreso = codigoEgreso;
    }

    public Conceptosproductos getConceptosproductos() {
        return conceptosproductos;
    }

    public void setConceptosproductos(Conceptosproductos conceptosproductos) {
        this.conceptosproductos = conceptosproductos;
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
        if (!(object instanceof PuntosConfiguracion)) {
            return false;
        }
        PuntosConfiguracion other = (PuntosConfiguracion) object;
        if ((this.codigoConcepto == null && other.codigoConcepto != null) || (this.codigoConcepto != null && !this.codigoConcepto.equals(other.codigoConcepto))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.PuntosConfiguracion[ codigoConcepto=" + codigoConcepto + " ]";
    }
    
}
