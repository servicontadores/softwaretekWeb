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
@Table(name = "productos_sinonimos")
@NamedQueries({
    @NamedQuery(name = "ProductosSinonimos.findAll", query = "SELECT p FROM ProductosSinonimos p")})
public class ProductosSinonimos implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(nullable = false)
    private Integer id;
    @Column(length = 255)
    private String codigoProducto;
    @Column(length = 255)
    private String codigoSinonimo;
    @Column(length = 255)
    private String detalle;
    @Column(name = "Odbc_Fix")
    private Integer odbcFix;

    public ProductosSinonimos() {
    }

    public ProductosSinonimos(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCodigoProducto() {
        return codigoProducto;
    }

    public void setCodigoProducto(String codigoProducto) {
        this.codigoProducto = codigoProducto;
    }

    public String getCodigoSinonimo() {
        return codigoSinonimo;
    }

    public void setCodigoSinonimo(String codigoSinonimo) {
        this.codigoSinonimo = codigoSinonimo;
    }

    public String getDetalle() {
        return detalle;
    }

    public void setDetalle(String detalle) {
        this.detalle = detalle;
    }

    public Integer getOdbcFix() {
        return odbcFix;
    }

    public void setOdbcFix(Integer odbcFix) {
        this.odbcFix = odbcFix;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ProductosSinonimos)) {
            return false;
        }
        ProductosSinonimos other = (ProductosSinonimos) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.ProductosSinonimos[ id=" + id + " ]";
    }
    
}
