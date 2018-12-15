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
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 *
 * @author yesidherrera
 */
@Entity
@Table(name = "impuestos_tarifas")
@NamedQueries({
    @NamedQuery(name = "ImpuestosTarifas.findAll", query = "SELECT i FROM ImpuestosTarifas i")})
public class ImpuestosTarifas implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(nullable = false)
    private Integer keyTarifa;
    @Basic(optional = false)
    @Column(nullable = false)
    private int keyImpuestos;
    @Basic(optional = false)
    @Column(nullable = false)
    private double tarifa;

    public ImpuestosTarifas() {
    }

    public ImpuestosTarifas(Integer keyTarifa) {
        this.keyTarifa = keyTarifa;
    }

    public ImpuestosTarifas(Integer keyTarifa, int keyImpuestos, double tarifa) {
        this.keyTarifa = keyTarifa;
        this.keyImpuestos = keyImpuestos;
        this.tarifa = tarifa;
    }

    public Integer getKeyTarifa() {
        return keyTarifa;
    }

    public void setKeyTarifa(Integer keyTarifa) {
        this.keyTarifa = keyTarifa;
    }

    public int getKeyImpuestos() {
        return keyImpuestos;
    }

    public void setKeyImpuestos(int keyImpuestos) {
        this.keyImpuestos = keyImpuestos;
    }

    public double getTarifa() {
        return tarifa;
    }

    public void setTarifa(double tarifa) {
        this.tarifa = tarifa;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (keyTarifa != null ? keyTarifa.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ImpuestosTarifas)) {
            return false;
        }
        ImpuestosTarifas other = (ImpuestosTarifas) object;
        if ((this.keyTarifa == null && other.keyTarifa != null) || (this.keyTarifa != null && !this.keyTarifa.equals(other.keyTarifa))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.ImpuestosTarifas[ keyTarifa=" + keyTarifa + " ]";
    }
    
}
