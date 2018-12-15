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
    @NamedQuery(name = "Regedit.findAll", query = "SELECT r FROM Regedit r")})
public class Regedit implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(nullable = false)
    private Integer codigo;
    @Basic(optional = false)
    @Column(nullable = false)
    private long regedit;
    @Column(length = 50)
    private String definicion;
    @Column(name = "ODBCFIX_FLDAUTO")
    private Integer odbcfixFldauto;

    public Regedit() {
    }

    public Regedit(Integer codigo) {
        this.codigo = codigo;
    }

    public Regedit(Integer codigo, long regedit) {
        this.codigo = codigo;
        this.regedit = regedit;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public long getRegedit() {
        return regedit;
    }

    public void setRegedit(long regedit) {
        this.regedit = regedit;
    }

    public String getDefinicion() {
        return definicion;
    }

    public void setDefinicion(String definicion) {
        this.definicion = definicion;
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
        hash += (codigo != null ? codigo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Regedit)) {
            return false;
        }
        Regedit other = (Regedit) object;
        if ((this.codigo == null && other.codigo != null) || (this.codigo != null && !this.codigo.equals(other.codigo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.Regedit[ codigo=" + codigo + " ]";
    }
    
}
