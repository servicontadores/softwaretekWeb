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
@Table(name = "parqueadero_estadopuestos")
@NamedQueries({
    @NamedQuery(name = "ParqueaderoEstadopuestos.findAll", query = "SELECT p FROM ParqueaderoEstadopuestos p")})
public class ParqueaderoEstadopuestos implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(nullable = false)
    private Integer codigoEstado;
    @Basic(optional = false)
    @Column(nullable = false, length = 100)
    private String estado;
    @Column(length = 100)
    private String detalle;
    @Basic(optional = false)
    @Column(nullable = false)
    private boolean habilitado;

    public ParqueaderoEstadopuestos() {
    }

    public ParqueaderoEstadopuestos(Integer codigoEstado) {
        this.codigoEstado = codigoEstado;
    }

    public ParqueaderoEstadopuestos(Integer codigoEstado, String estado, boolean habilitado) {
        this.codigoEstado = codigoEstado;
        this.estado = estado;
        this.habilitado = habilitado;
    }

    public Integer getCodigoEstado() {
        return codigoEstado;
    }

    public void setCodigoEstado(Integer codigoEstado) {
        this.codigoEstado = codigoEstado;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getDetalle() {
        return detalle;
    }

    public void setDetalle(String detalle) {
        this.detalle = detalle;
    }

    public boolean getHabilitado() {
        return habilitado;
    }

    public void setHabilitado(boolean habilitado) {
        this.habilitado = habilitado;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codigoEstado != null ? codigoEstado.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ParqueaderoEstadopuestos)) {
            return false;
        }
        ParqueaderoEstadopuestos other = (ParqueaderoEstadopuestos) object;
        if ((this.codigoEstado == null && other.codigoEstado != null) || (this.codigoEstado != null && !this.codigoEstado.equals(other.codigoEstado))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.ParqueaderoEstadopuestos[ codigoEstado=" + codigoEstado + " ]";
    }
    
}
