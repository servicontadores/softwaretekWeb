/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.servicontadores.softwaretekWeb.entities;

import java.io.Serializable;
import java.util.List;
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
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author yesidherrera
 */
@Entity
@Table(name = "presupuestos_fondos")
@NamedQueries({
    @NamedQuery(name = "PresupuestosFondos.findAll", query = "SELECT p FROM PresupuestosFondos p")})
public class PresupuestosFondos implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(nullable = false)
    private Integer keyFondo;
    @Basic(optional = false)
    @Column(nullable = false, length = 50)
    private String codigoFondo;
    @Basic(optional = false)
    @Column(nullable = false, length = 250)
    private String nombreFondo;
    @OneToMany(mappedBy = "keyFondo")
    private List<PresupuestosRubro> presupuestosRubroList;
    @JoinColumn(name = "KeyProyecto", referencedColumnName = "KeyProyecto", nullable = false)
    @ManyToOne(optional = false)
    private PresupuestosProyecto keyProyecto;

    public PresupuestosFondos() {
    }

    public PresupuestosFondos(Integer keyFondo) {
        this.keyFondo = keyFondo;
    }

    public PresupuestosFondos(Integer keyFondo, String codigoFondo, String nombreFondo) {
        this.keyFondo = keyFondo;
        this.codigoFondo = codigoFondo;
        this.nombreFondo = nombreFondo;
    }

    public Integer getKeyFondo() {
        return keyFondo;
    }

    public void setKeyFondo(Integer keyFondo) {
        this.keyFondo = keyFondo;
    }

    public String getCodigoFondo() {
        return codigoFondo;
    }

    public void setCodigoFondo(String codigoFondo) {
        this.codigoFondo = codigoFondo;
    }

    public String getNombreFondo() {
        return nombreFondo;
    }

    public void setNombreFondo(String nombreFondo) {
        this.nombreFondo = nombreFondo;
    }

    public List<PresupuestosRubro> getPresupuestosRubroList() {
        return presupuestosRubroList;
    }

    public void setPresupuestosRubroList(List<PresupuestosRubro> presupuestosRubroList) {
        this.presupuestosRubroList = presupuestosRubroList;
    }

    public PresupuestosProyecto getKeyProyecto() {
        return keyProyecto;
    }

    public void setKeyProyecto(PresupuestosProyecto keyProyecto) {
        this.keyProyecto = keyProyecto;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (keyFondo != null ? keyFondo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PresupuestosFondos)) {
            return false;
        }
        PresupuestosFondos other = (PresupuestosFondos) object;
        if ((this.keyFondo == null && other.keyFondo != null) || (this.keyFondo != null && !this.keyFondo.equals(other.keyFondo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.PresupuestosFondos[ keyFondo=" + keyFondo + " ]";
    }
    
}
