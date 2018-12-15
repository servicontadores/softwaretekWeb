/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.servicontadores.softwaretekWeb.entities;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;

/**
 *
 * @author yesidherrera
 */
@Entity
@NamedQueries({
    @NamedQuery(name = "Pcs.findAll", query = "SELECT p FROM Pcs p")})
public class Pcs implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(nullable = false)
    private Integer codigo;
    @Basic(optional = false)
    @Column(nullable = false, length = 45)
    private String descripcion;
    @Basic(optional = false)
    @Column(nullable = false)
    private int baseEfectivo;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "pc")
    private List<Facturarmovimientodiario> facturarmovimientodiarioList;

    public Pcs() {
    }

    public Pcs(Integer codigo) {
        this.codigo = codigo;
    }

    public Pcs(Integer codigo, String descripcion, int baseEfectivo) {
        this.codigo = codigo;
        this.descripcion = descripcion;
        this.baseEfectivo = baseEfectivo;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getBaseEfectivo() {
        return baseEfectivo;
    }

    public void setBaseEfectivo(int baseEfectivo) {
        this.baseEfectivo = baseEfectivo;
    }

    public List<Facturarmovimientodiario> getFacturarmovimientodiarioList() {
        return facturarmovimientodiarioList;
    }

    public void setFacturarmovimientodiarioList(List<Facturarmovimientodiario> facturarmovimientodiarioList) {
        this.facturarmovimientodiarioList = facturarmovimientodiarioList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codigo != null ? codigo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Pcs)) {
            return false;
        }
        Pcs other = (Pcs) object;
        if ((this.codigo == null && other.codigo != null) || (this.codigo != null && !this.codigo.equals(other.codigo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.Pcs[ codigo=" + codigo + " ]";
    }
    
}
