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
import javax.persistence.Table;

/**
 *
 * @author yesidherrera
 */
@Entity
@Table(name = "parqueadero_puestos")
@NamedQueries({
    @NamedQuery(name = "ParqueaderoPuestos.findAll", query = "SELECT p FROM ParqueaderoPuestos p")})
public class ParqueaderoPuestos implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(nullable = false)
    private Integer codigoPuesto;
    @Basic(optional = false)
    @Column(nullable = false, length = 45)
    private String puesto;
    @Column(length = 100)
    private String detalle;
    @Basic(optional = false)
    @Column(nullable = false)
    private int codigoEstado;
    @Basic(optional = false)
    @Column(nullable = false)
    private boolean ocupado;

    public ParqueaderoPuestos() {
    }

    public ParqueaderoPuestos(Integer codigoPuesto) {
        this.codigoPuesto = codigoPuesto;
    }

    public ParqueaderoPuestos(Integer codigoPuesto, String puesto, int codigoEstado, boolean ocupado) {
        this.codigoPuesto = codigoPuesto;
        this.puesto = puesto;
        this.codigoEstado = codigoEstado;
        this.ocupado = ocupado;
    }

    public Integer getCodigoPuesto() {
        return codigoPuesto;
    }

    public void setCodigoPuesto(Integer codigoPuesto) {
        this.codigoPuesto = codigoPuesto;
    }

    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    public String getDetalle() {
        return detalle;
    }

    public void setDetalle(String detalle) {
        this.detalle = detalle;
    }

    public int getCodigoEstado() {
        return codigoEstado;
    }

    public void setCodigoEstado(int codigoEstado) {
        this.codigoEstado = codigoEstado;
    }

    public boolean getOcupado() {
        return ocupado;
    }

    public void setOcupado(boolean ocupado) {
        this.ocupado = ocupado;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codigoPuesto != null ? codigoPuesto.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ParqueaderoPuestos)) {
            return false;
        }
        ParqueaderoPuestos other = (ParqueaderoPuestos) object;
        if ((this.codigoPuesto == null && other.codigoPuesto != null) || (this.codigoPuesto != null && !this.codigoPuesto.equals(other.codigoPuesto))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.ParqueaderoPuestos[ codigoPuesto=" + codigoPuesto + " ]";
    }
    
}
