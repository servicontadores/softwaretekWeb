/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

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
@Table(name = "presupuestos_proyecto")
@NamedQueries({
    @NamedQuery(name = "PresupuestosProyecto.findAll", query = "SELECT p FROM PresupuestosProyecto p")})
public class PresupuestosProyecto implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(nullable = false)
    private Integer keyProyecto;
    @Basic(optional = false)
    @Column(nullable = false)
    private int codigoProyecto;
    @Basic(optional = false)
    @Column(nullable = false, length = 200)
    private String nombreProyecto;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "keyProyecto")
    private List<PresupuestosRubro> presupuestosRubroList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "keyProyecto")
    private List<PresupuestosFondos> presupuestosFondosList;

    public PresupuestosProyecto() {
    }

    public PresupuestosProyecto(Integer keyProyecto) {
        this.keyProyecto = keyProyecto;
    }

    public PresupuestosProyecto(Integer keyProyecto, int codigoProyecto, String nombreProyecto) {
        this.keyProyecto = keyProyecto;
        this.codigoProyecto = codigoProyecto;
        this.nombreProyecto = nombreProyecto;
    }

    public Integer getKeyProyecto() {
        return keyProyecto;
    }

    public void setKeyProyecto(Integer keyProyecto) {
        this.keyProyecto = keyProyecto;
    }

    public int getCodigoProyecto() {
        return codigoProyecto;
    }

    public void setCodigoProyecto(int codigoProyecto) {
        this.codigoProyecto = codigoProyecto;
    }

    public String getNombreProyecto() {
        return nombreProyecto;
    }

    public void setNombreProyecto(String nombreProyecto) {
        this.nombreProyecto = nombreProyecto;
    }

    public List<PresupuestosRubro> getPresupuestosRubroList() {
        return presupuestosRubroList;
    }

    public void setPresupuestosRubroList(List<PresupuestosRubro> presupuestosRubroList) {
        this.presupuestosRubroList = presupuestosRubroList;
    }

    public List<PresupuestosFondos> getPresupuestosFondosList() {
        return presupuestosFondosList;
    }

    public void setPresupuestosFondosList(List<PresupuestosFondos> presupuestosFondosList) {
        this.presupuestosFondosList = presupuestosFondosList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (keyProyecto != null ? keyProyecto.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PresupuestosProyecto)) {
            return false;
        }
        PresupuestosProyecto other = (PresupuestosProyecto) object;
        if ((this.keyProyecto == null && other.keyProyecto != null) || (this.keyProyecto != null && !this.keyProyecto.equals(other.keyProyecto))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.PresupuestosProyecto[ keyProyecto=" + keyProyecto + " ]";
    }
    
}
