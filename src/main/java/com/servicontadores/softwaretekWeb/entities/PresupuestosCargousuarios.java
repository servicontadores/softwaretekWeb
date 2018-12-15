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
import javax.persistence.Table;

/**
 *
 * @author yesidherrera
 */
@Entity
@Table(name = "presupuestos_cargousuarios")
@NamedQueries({
    @NamedQuery(name = "PresupuestosCargousuarios.findAll", query = "SELECT p FROM PresupuestosCargousuarios p")})
public class PresupuestosCargousuarios implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(nullable = false)
    private Integer indice;
    @JoinColumn(name = "KeyCargo", referencedColumnName = "KeyCargo", nullable = false)
    @ManyToOne(optional = false)
    private PresupuestosCargos keyCargo;
    @JoinColumn(name = "CodigoUsuario", referencedColumnName = "Codigo", nullable = false)
    @ManyToOne(optional = false)
    private User codigoUsuario;

    public PresupuestosCargousuarios() {
    }

    public PresupuestosCargousuarios(Integer indice) {
        this.indice = indice;
    }

    public Integer getIndice() {
        return indice;
    }

    public void setIndice(Integer indice) {
        this.indice = indice;
    }

    public PresupuestosCargos getKeyCargo() {
        return keyCargo;
    }

    public void setKeyCargo(PresupuestosCargos keyCargo) {
        this.keyCargo = keyCargo;
    }

    public User getCodigoUsuario() {
        return codigoUsuario;
    }

    public void setCodigoUsuario(User codigoUsuario) {
        this.codigoUsuario = codigoUsuario;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (indice != null ? indice.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PresupuestosCargousuarios)) {
            return false;
        }
        PresupuestosCargousuarios other = (PresupuestosCargousuarios) object;
        if ((this.indice == null && other.indice != null) || (this.indice != null && !this.indice.equals(other.indice))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.PresupuestosCargousuarios[ indice=" + indice + " ]";
    }
    
}
