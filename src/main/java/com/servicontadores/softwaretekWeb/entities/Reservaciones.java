/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.servicontadores.softwaretekWeb.entities;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author yesidherrera
 */
@Entity
@NamedQueries({
    @NamedQuery(name = "Reservaciones.findAll", query = "SELECT r FROM Reservaciones r")})
public class Reservaciones implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(nullable = false)
    private Integer cody;
    private Integer noHabitacion;
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechareservacion;
    @Column(length = 255)
    private String detalle;
    @Column(length = 255)
    private String nit;
    @Column(length = 255)
    private String nombrecompleto;
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechavencimiento;
    private Integer dias;
    private Short guardado;
    @Column(name = "ODBCFIX_FLDAUTO")
    private Integer odbcfixFldauto;

    public Reservaciones() {
    }

    public Reservaciones(Integer cody) {
        this.cody = cody;
    }

    public Integer getCody() {
        return cody;
    }

    public void setCody(Integer cody) {
        this.cody = cody;
    }

    public Integer getNoHabitacion() {
        return noHabitacion;
    }

    public void setNoHabitacion(Integer noHabitacion) {
        this.noHabitacion = noHabitacion;
    }

    public Date getFechareservacion() {
        return fechareservacion;
    }

    public void setFechareservacion(Date fechareservacion) {
        this.fechareservacion = fechareservacion;
    }

    public String getDetalle() {
        return detalle;
    }

    public void setDetalle(String detalle) {
        this.detalle = detalle;
    }

    public String getNit() {
        return nit;
    }

    public void setNit(String nit) {
        this.nit = nit;
    }

    public String getNombrecompleto() {
        return nombrecompleto;
    }

    public void setNombrecompleto(String nombrecompleto) {
        this.nombrecompleto = nombrecompleto;
    }

    public Date getFechavencimiento() {
        return fechavencimiento;
    }

    public void setFechavencimiento(Date fechavencimiento) {
        this.fechavencimiento = fechavencimiento;
    }

    public Integer getDias() {
        return dias;
    }

    public void setDias(Integer dias) {
        this.dias = dias;
    }

    public Short getGuardado() {
        return guardado;
    }

    public void setGuardado(Short guardado) {
        this.guardado = guardado;
    }

    public Integer getOdbcfixFldauto() {
        return odbcfixFldauto;
    }

    public void setOdbcfixFldauto(Integer odbcfixFldauto) {
        this.odbcfixFldauto = odbcfixFldauto;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (cody != null ? cody.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Reservaciones)) {
            return false;
        }
        Reservaciones other = (Reservaciones) object;
        if ((this.cody == null && other.cody != null) || (this.cody != null && !this.cody.equals(other.cody))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.Reservaciones[ cody=" + cody + " ]";
    }
    
}
