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
@Table(name = "citas_encargados")
@NamedQueries({
    @NamedQuery(name = "CitasEncargados.findAll", query = "SELECT c FROM CitasEncargados c")})
public class CitasEncargados implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(nullable = false, length = 50)
    private String nit;
    @Column(length = 100)
    private String detalle;
    @Basic(optional = false)
    @Column(nullable = false)
    private boolean disponible;
    @JoinColumn(name = "NIT", referencedColumnName = "Codigo", nullable = false, insertable = false, updatable = false)
    @OneToOne(optional = false)
    private Nit nit1;

    public CitasEncargados() {
    }

    public CitasEncargados(String nit) {
        this.nit = nit;
    }

    public CitasEncargados(String nit, boolean disponible) {
        this.nit = nit;
        this.disponible = disponible;
    }

    public String getNit() {
        return nit;
    }

    public void setNit(String nit) {
        this.nit = nit;
    }

    public String getDetalle() {
        return detalle;
    }

    public void setDetalle(String detalle) {
        this.detalle = detalle;
    }

    public boolean getDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
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
        if (!(object instanceof CitasEncargados)) {
            return false;
        }
        CitasEncargados other = (CitasEncargados) object;
        if ((this.nit == null && other.nit != null) || (this.nit != null && !this.nit.equals(other.nit))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.CitasEncargados[ nit=" + nit + " ]";
    }
    
}
