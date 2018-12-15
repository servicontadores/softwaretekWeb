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
@Table(name = "produccion_subproductos")
@NamedQueries({
    @NamedQuery(name = "ProduccionSubproductos.findAll", query = "SELECT p FROM ProduccionSubproductos p")})
public class ProduccionSubproductos implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(nullable = false)
    private Integer indice;
    @Basic(optional = false)
    @Column(nullable = false, length = 45)
    private String codigoProducto;
    @Basic(optional = false)
    @Column(nullable = false, length = 45)
    private String codigoSubProducto;
    @Basic(optional = false)
    @Column(nullable = false)
    private double cantidad;
    @Basic(optional = false)
    @Column(nullable = false)
    private double costoBruto;

    public ProduccionSubproductos() {
    }

    public ProduccionSubproductos(Integer indice) {
        this.indice = indice;
    }

    public ProduccionSubproductos(Integer indice, String codigoProducto, String codigoSubProducto, double cantidad, double costoBruto) {
        this.indice = indice;
        this.codigoProducto = codigoProducto;
        this.codigoSubProducto = codigoSubProducto;
        this.cantidad = cantidad;
        this.costoBruto = costoBruto;
    }

    public Integer getIndice() {
        return indice;
    }

    public void setIndice(Integer indice) {
        this.indice = indice;
    }

    public String getCodigoProducto() {
        return codigoProducto;
    }

    public void setCodigoProducto(String codigoProducto) {
        this.codigoProducto = codigoProducto;
    }

    public String getCodigoSubProducto() {
        return codigoSubProducto;
    }

    public void setCodigoSubProducto(String codigoSubProducto) {
        this.codigoSubProducto = codigoSubProducto;
    }

    public double getCantidad() {
        return cantidad;
    }

    public void setCantidad(double cantidad) {
        this.cantidad = cantidad;
    }

    public double getCostoBruto() {
        return costoBruto;
    }

    public void setCostoBruto(double costoBruto) {
        this.costoBruto = costoBruto;
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
        if (!(object instanceof ProduccionSubproductos)) {
            return false;
        }
        ProduccionSubproductos other = (ProduccionSubproductos) object;
        if ((this.indice == null && other.indice != null) || (this.indice != null && !this.indice.equals(other.indice))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.ProduccionSubproductos[ indice=" + indice + " ]";
    }
    
}
