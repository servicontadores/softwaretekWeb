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
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 *
 * @author yesidherrera
 */
@Entity
@Table(name = "puntos_nit")
@NamedQueries({
    @NamedQuery(name = "PuntosNit.findAll", query = "SELECT p FROM PuntosNit p")})
public class PuntosNit implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(nullable = false, length = 50)
    private String nit;
    @Basic(optional = false)
    @Column(nullable = false)
    private short habilitado;
    @JoinColumn(name = "NIT", referencedColumnName = "Codigo", nullable = false, insertable = false, updatable = false)
    @OneToOne(optional = false)
    private Nit nit1;

    public PuntosNit() {
    }

    public PuntosNit(String nit) {
        this.nit = nit;
    }

    public PuntosNit(String nit, short habilitado) {
        this.nit = nit;
        this.habilitado = habilitado;
    }

    public String getNit() {
        return nit;
    }

    public void setNit(String nit) {
        this.nit = nit;
    }

    public short getHabilitado() {
        return habilitado;
    }

    public void setHabilitado(short habilitado) {
        this.habilitado = habilitado;
    }

    public Nit getNit1() {
        return nit1;
    }

    public void setNit1(Nit nit1) {
        this.nit1 = nit1;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (nit != null ? nit.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PuntosNit)) {
            return false;
        }
        PuntosNit other = (PuntosNit) object;
        if ((this.nit == null && other.nit != null) || (this.nit != null && !this.nit.equals(other.nit))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.PuntosNit[ nit=" + nit + " ]";
    }
    
}
