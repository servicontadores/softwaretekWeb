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
    @NamedQuery(name = "Impuestos.findAll", query = "SELECT i FROM Impuestos i")})
public class Impuestos implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(nullable = false)
    private Integer keyImpuesto;
    @Basic(optional = false)
    @Column(nullable = false, length = 45)
    private String tipoImpuesto;
    @Basic(optional = false)
    @Column(nullable = false, length = 50)
    private String nombreImpuesto;
    @Basic(optional = false)
    @Column(nullable = false)
    private int vrBase;
    @Basic(optional = false)
    @Column(nullable = false)
    private boolean esCompuesto;
    @Basic(optional = false)
    @Column(nullable = false)
    private int codigoImpuestoBase;

    public Impuestos() {
    }

    public Impuestos(Integer keyImpuesto) {
        this.keyImpuesto = keyImpuesto;
    }

    public Impuestos(Integer keyImpuesto, String tipoImpuesto, String nombreImpuesto, int vrBase, boolean esCompuesto, int codigoImpuestoBase) {
        this.keyImpuesto = keyImpuesto;
        this.tipoImpuesto = tipoImpuesto;
        this.nombreImpuesto = nombreImpuesto;
        this.vrBase = vrBase;
        this.esCompuesto = esCompuesto;
        this.codigoImpuestoBase = codigoImpuestoBase;
    }

    public Integer getKeyImpuesto() {
        return keyImpuesto;
    }

    public void setKeyImpuesto(Integer keyImpuesto) {
        this.keyImpuesto = keyImpuesto;
    }

    public String getTipoImpuesto() {
        return tipoImpuesto;
    }

    public void setTipoImpuesto(String tipoImpuesto) {
        this.tipoImpuesto = tipoImpuesto;
    }

    public String getNombreImpuesto() {
        return nombreImpuesto;
    }

    public void setNombreImpuesto(String nombreImpuesto) {
        this.nombreImpuesto = nombreImpuesto;
    }

    public int getVrBase() {
        return vrBase;
    }

    public void setVrBase(int vrBase) {
        this.vrBase = vrBase;
    }

    public boolean getEsCompuesto() {
        return esCompuesto;
    }

    public void setEsCompuesto(boolean esCompuesto) {
        this.esCompuesto = esCompuesto;
    }

    public int getCodigoImpuestoBase() {
        return codigoImpuestoBase;
    }

    public void setCodigoImpuestoBase(int codigoImpuestoBase) {
        this.codigoImpuestoBase = codigoImpuestoBase;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (keyImpuesto != null ? keyImpuesto.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Impuestos)) {
            return false;
        }
        Impuestos other = (Impuestos) object;
        if ((this.keyImpuesto == null && other.keyImpuesto != null) || (this.keyImpuesto != null && !this.keyImpuesto.equals(other.keyImpuesto))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.Impuestos[ keyImpuesto=" + keyImpuesto + " ]";
    }
    
}
