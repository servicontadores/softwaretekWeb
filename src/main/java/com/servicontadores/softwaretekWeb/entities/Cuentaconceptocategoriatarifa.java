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
import javax.persistence.UniqueConstraint;

/**
 *
 * @author yesidherrera
 */
@Entity
@Table(uniqueConstraints = {
    @UniqueConstraint(columnNames = {"Categoria", "CodigoConcepto", "Tarifa"})})
@NamedQueries({
    @NamedQuery(name = "Cuentaconceptocategoriatarifa.findAll", query = "SELECT c FROM Cuentaconceptocategoriatarifa c")})
public class Cuentaconceptocategoriatarifa implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(nullable = false)
    private Integer indice;
    @Basic(optional = false)
    @Column(nullable = false)
    private int codigoConcepto;
    @Basic(optional = false)
    @Column(nullable = false)
    private int tarifa;
    @Column(length = 45)
    private String cuentaPUC;
    @Column(length = 45)
    private String iva;
    @JoinColumn(name = "Categoria", referencedColumnName = "cody", nullable = false)
    @ManyToOne(optional = false)
    private Categorias categoria;

    public Cuentaconceptocategoriatarifa() {
    }

    public Cuentaconceptocategoriatarifa(Integer indice) {
        this.indice = indice;
    }

    public Cuentaconceptocategoriatarifa(Integer indice, int codigoConcepto, int tarifa) {
        this.indice = indice;
        this.codigoConcepto = codigoConcepto;
        this.tarifa = tarifa;
    }

    public Integer getIndice() {
        return indice;
    }

    public void setIndice(Integer indice) {
        this.indice = indice;
    }

    public int getCodigoConcepto() {
        return codigoConcepto;
    }

    public void setCodigoConcepto(int codigoConcepto) {
        this.codigoConcepto = codigoConcepto;
    }

    public int getTarifa() {
        return tarifa;
    }

    public void setTarifa(int tarifa) {
        this.tarifa = tarifa;
    }

    public String getCuentaPUC() {
        return cuentaPUC;
    }

    public void setCuentaPUC(String cuentaPUC) {
        this.cuentaPUC = cuentaPUC;
    }

    public String getIva() {
        return iva;
    }

    public void setIva(String iva) {
        this.iva = iva;
    }

    public Categorias getCategoria() {
        return categoria;
    }

    public void setCategoria(Categorias categoria) {
        this.categoria = categoria;
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
        if (!(object instanceof Cuentaconceptocategoriatarifa)) {
            return false;
        }
        Cuentaconceptocategoriatarifa other = (Cuentaconceptocategoriatarifa) object;
        if ((this.indice == null && other.indice != null) || (this.indice != null && !this.indice.equals(other.indice))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.Cuentaconceptocategoriatarifa[ indice=" + indice + " ]";
    }
    
}
