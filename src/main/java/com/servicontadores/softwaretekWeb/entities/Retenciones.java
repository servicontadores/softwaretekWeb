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

/**
 *
 * @author yesidherrera
 */
@Entity
@NamedQueries({
    @NamedQuery(name = "Retenciones.findAll", query = "SELECT r FROM Retenciones r")})
public class Retenciones implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "Id_Retenciones", nullable = false)
    private Integer idRetenciones;
    @Basic(optional = false)
    @Column(nullable = false, length = 50)
    private String nombreRetencion;
    @Basic(optional = false)
    @Column(nullable = false)
    private double tarifaPredeterminada;
    @Column(length = 45)
    private String movimiento;

    public Retenciones() {
    }

    public Retenciones(Integer idRetenciones) {
        this.idRetenciones = idRetenciones;
    }

    public Retenciones(Integer idRetenciones, String nombreRetencion, double tarifaPredeterminada) {
        this.idRetenciones = idRetenciones;
        this.nombreRetencion = nombreRetencion;
        this.tarifaPredeterminada = tarifaPredeterminada;
    }

    public Integer getIdRetenciones() {
        return idRetenciones;
    }

    public void setIdRetenciones(Integer idRetenciones) {
        this.idRetenciones = idRetenciones;
    }

    public String getNombreRetencion() {
        return nombreRetencion;
    }

    public void setNombreRetencion(String nombreRetencion) {
        this.nombreRetencion = nombreRetencion;
    }

    public double getTarifaPredeterminada() {
        return tarifaPredeterminada;
    }

    public void setTarifaPredeterminada(double tarifaPredeterminada) {
        this.tarifaPredeterminada = tarifaPredeterminada;
    }

    public String getMovimiento() {
        return movimiento;
    }

    public void setMovimiento(String movimiento) {
        this.movimiento = movimiento;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idRetenciones != null ? idRetenciones.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Retenciones)) {
            return false;
        }
        Retenciones other = (Retenciones) object;
        if ((this.idRetenciones == null && other.idRetenciones != null) || (this.idRetenciones != null && !this.idRetenciones.equals(other.idRetenciones))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.Retenciones[ idRetenciones=" + idRetenciones + " ]";
    }
    
}
