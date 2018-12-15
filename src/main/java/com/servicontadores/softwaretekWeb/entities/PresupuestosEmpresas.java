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
@Table(name = "presupuestos_empresas")
@NamedQueries({
    @NamedQuery(name = "PresupuestosEmpresas.findAll", query = "SELECT p FROM PresupuestosEmpresas p")})
public class PresupuestosEmpresas implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(nullable = false)
    private Integer keyEmpresa;
    @Column(length = 100)
    private String nombreEmpresa;
    @Column(length = 20)
    private String nit;
    @Column(length = 50)
    private String departamento;
    @Column(length = 50)
    private String municipio;
    @Column(length = 100)
    private String direccion;
    @Column(length = 50)
    private String telefono;
    @Column(length = 45)
    private String regimen;

    public PresupuestosEmpresas() {
    }

    public PresupuestosEmpresas(Integer keyEmpresa) {
        this.keyEmpresa = keyEmpresa;
    }

    public Integer getKeyEmpresa() {
        return keyEmpresa;
    }

    public void setKeyEmpresa(Integer keyEmpresa) {
        this.keyEmpresa = keyEmpresa;
    }

    public String getNombreEmpresa() {
        return nombreEmpresa;
    }

    public void setNombreEmpresa(String nombreEmpresa) {
        this.nombreEmpresa = nombreEmpresa;
    }

    public String getNit() {
        return nit;
    }

    public void setNit(String nit) {
        this.nit = nit;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public String getMunicipio() {
        return municipio;
    }

    public void setMunicipio(String municipio) {
        this.municipio = municipio;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getRegimen() {
        return regimen;
    }

    public void setRegimen(String regimen) {
        this.regimen = regimen;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (keyEmpresa != null ? keyEmpresa.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PresupuestosEmpresas)) {
            return false;
        }
        PresupuestosEmpresas other = (PresupuestosEmpresas) object;
        if ((this.keyEmpresa == null && other.keyEmpresa != null) || (this.keyEmpresa != null && !this.keyEmpresa.equals(other.keyEmpresa))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.PresupuestosEmpresas[ keyEmpresa=" + keyEmpresa + " ]";
    }
    
}
