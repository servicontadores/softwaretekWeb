/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

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
import javax.persistence.UniqueConstraint;

/**
 *
 * @author yesidherrera
 */
@Entity
@Table(name = "ppto_rubro", uniqueConstraints = {
    @UniqueConstraint(columnNames = {"Codigo", "CodigoGrupoPpto"})})
@NamedQueries({
    @NamedQuery(name = "PptoRubro.findAll", query = "SELECT p FROM PptoRubro p")})
public class PptoRubro implements Serializable {

    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @Column(nullable = false, length = 10)
    private String codigo;
    @Column(length = 200)
    private String rubro;
    @Basic(optional = false)
    @Column(nullable = false)
    private int codigoGrupoPpto;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(nullable = false)
    private Integer indice;
    @Basic(optional = false)
    @Column(nullable = false)
    private double valor;
    @Column(length = 45)
    private String unidad;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(precision = 22)
    private Double cantidad;
    @Column(precision = 22)
    private Double contratar;
    @Column(precision = 22)
    private Double modificacion;

    public PptoRubro() {
    }

    public PptoRubro(Integer indice) {
        this.indice = indice;
    }

    public PptoRubro(Integer indice, String codigo, int codigoGrupoPpto, double valor) {
        this.indice = indice;
        this.codigo = codigo;
        this.codigoGrupoPpto = codigoGrupoPpto;
        this.valor = valor;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getRubro() {
        return rubro;
    }

    public void setRubro(String rubro) {
        this.rubro = rubro;
    }

    public int getCodigoGrupoPpto() {
        return codigoGrupoPpto;
    }

    public void setCodigoGrupoPpto(int codigoGrupoPpto) {
        this.codigoGrupoPpto = codigoGrupoPpto;
    }

    public Integer getIndice() {
        return indice;
    }

    public void setIndice(Integer indice) {
        this.indice = indice;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getUnidad() {
        return unidad;
    }

    public void setUnidad(String unidad) {
        this.unidad = unidad;
    }

    public Double getCantidad() {
        return cantidad;
    }

    public void setCantidad(Double cantidad) {
        this.cantidad = cantidad;
    }

    public Double getContratar() {
        return contratar;
    }

    public void setContratar(Double contratar) {
        this.contratar = contratar;
    }

    public Double getModificacion() {
        return modificacion;
    }

    public void setModificacion(Double modificacion) {
        this.modificacion = modificacion;
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
        if (!(object instanceof PptoRubro)) {
            return false;
        }
        PptoRubro other = (PptoRubro) object;
        if ((this.indice == null && other.indice != null) || (this.indice != null && !this.indice.equals(other.indice))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.PptoRubro[ indice=" + indice + " ]";
    }
    
}
