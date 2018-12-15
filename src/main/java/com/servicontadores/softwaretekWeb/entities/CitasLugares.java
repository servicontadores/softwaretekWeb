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
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author yesidherrera
 */
@Entity
@Table(name = "citas_lugares")
@NamedQueries({
    @NamedQuery(name = "CitasLugares.findAll", query = "SELECT c FROM CitasLugares c")})
public class CitasLugares implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(nullable = false)
    private Integer codigoLugar;
    @Basic(optional = false)
    @Column(nullable = false, length = 100)
    private String lugar;
    @Basic(optional = false)
    @Column(nullable = false)
    private boolean disponible;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "codigoLugar")
    private List<CitasRegistrocitas> citasRegistrocitasList;

    public CitasLugares() {
    }

    public CitasLugares(Integer codigoLugar) {
        this.codigoLugar = codigoLugar;
    }

    public CitasLugares(Integer codigoLugar, String lugar, boolean disponible) {
        this.codigoLugar = codigoLugar;
        this.lugar = lugar;
        this.disponible = disponible;
    }

    public Integer getCodigoLugar() {
        return codigoLugar;
    }

    public void setCodigoLugar(Integer codigoLugar) {
        this.codigoLugar = codigoLugar;
    }

    public String getLugar() {
        return lugar;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }

    public boolean getDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }

    public List<CitasRegistrocitas> getCitasRegistrocitasList() {
        return citasRegistrocitasList;
    }

    public void setCitasRegistrocitasList(List<CitasRegistrocitas> citasRegistrocitasList) {
        this.citasRegistrocitasList = citasRegistrocitasList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codigoLugar != null ? codigoLugar.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof CitasLugares)) {
            return false;
        }
        CitasLugares other = (CitasLugares) object;
        if ((this.codigoLugar == null && other.codigoLugar != null) || (this.codigoLugar != null && !this.codigoLugar.equals(other.codigoLugar))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.CitasLugares[ codigoLugar=" + codigoLugar + " ]";
    }
    
}
