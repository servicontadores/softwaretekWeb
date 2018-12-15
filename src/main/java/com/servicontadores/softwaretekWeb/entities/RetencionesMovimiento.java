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
@Table(name = "retenciones_movimiento")
@NamedQueries({
    @NamedQuery(name = "RetencionesMovimiento.findAll", query = "SELECT r FROM RetencionesMovimiento r")})
public class RetencionesMovimiento implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(nullable = false)
    private Integer indice;
    @Basic(optional = false)
    @Column(nullable = false)
    private int cody;
    @Basic(optional = false)
    @Column(nullable = false)
    private int regedit;
    @Basic(optional = false)
    @Column(name = "Id_Retencion", nullable = false)
    private int idRetencion;
    @Basic(optional = false)
    @Column(nullable = false)
    private double tarifa;
    @Basic(optional = false)
    @Column(nullable = false)
    private double valor;
    @Column(length = 45)
    private String movimiento;

    public RetencionesMovimiento() {
    }

    public RetencionesMovimiento(Integer indice) {
        this.indice = indice;
    }

    public RetencionesMovimiento(Integer indice, int cody, int regedit, int idRetencion, double tarifa, double valor) {
        this.indice = indice;
        this.cody = cody;
        this.regedit = regedit;
        this.idRetencion = idRetencion;
        this.tarifa = tarifa;
        this.valor = valor;
    }

    public Integer getIndice() {
        return indice;
    }

    public void setIndice(Integer indice) {
        this.indice = indice;
    }

    public int getCody() {
        return cody;
    }

    public void setCody(int cody) {
        this.cody = cody;
    }

    public int getRegedit() {
        return regedit;
    }

    public void setRegedit(int regedit) {
        this.regedit = regedit;
    }

    public int getIdRetencion() {
        return idRetencion;
    }

    public void setIdRetencion(int idRetencion) {
        this.idRetencion = idRetencion;
    }

    public double getTarifa() {
        return tarifa;
    }

    public void setTarifa(double tarifa) {
        this.tarifa = tarifa;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
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
        hash += (indice != null ? indice.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof RetencionesMovimiento)) {
            return false;
        }
        RetencionesMovimiento other = (RetencionesMovimiento) object;
        if ((this.indice == null && other.indice != null) || (this.indice != null && !this.indice.equals(other.indice))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.RetencionesMovimiento[ indice=" + indice + " ]";
    }
    
}
