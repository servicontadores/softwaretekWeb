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
@Table(name = "presupuestos_cargos")
@NamedQueries({
    @NamedQuery(name = "PresupuestosCargos.findAll", query = "SELECT p FROM PresupuestosCargos p")})
public class PresupuestosCargos implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(nullable = false)
    private Integer keyCargo;
    @Basic(optional = false)
    @Column(nullable = false)
    private int codigoCargo;
    @Basic(optional = false)
    @Column(nullable = false, length = 50)
    private String cargo;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "keyCargo")
    private List<PresupuestosCargousuarios> presupuestosCargousuariosList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "keyCargo")
    private List<PresupuestosPermisosmovimientoporcargo> presupuestosPermisosmovimientoporcargoList;

    public PresupuestosCargos() {
    }

    public PresupuestosCargos(Integer keyCargo) {
        this.keyCargo = keyCargo;
    }

    public PresupuestosCargos(Integer keyCargo, int codigoCargo, String cargo) {
        this.keyCargo = keyCargo;
        this.codigoCargo = codigoCargo;
        this.cargo = cargo;
    }

    public Integer getKeyCargo() {
        return keyCargo;
    }

    public void setKeyCargo(Integer keyCargo) {
        this.keyCargo = keyCargo;
    }

    public int getCodigoCargo() {
        return codigoCargo;
    }

    public void setCodigoCargo(int codigoCargo) {
        this.codigoCargo = codigoCargo;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public List<PresupuestosCargousuarios> getPresupuestosCargousuariosList() {
        return presupuestosCargousuariosList;
    }

    public void setPresupuestosCargousuariosList(List<PresupuestosCargousuarios> presupuestosCargousuariosList) {
        this.presupuestosCargousuariosList = presupuestosCargousuariosList;
    }

    public List<PresupuestosPermisosmovimientoporcargo> getPresupuestosPermisosmovimientoporcargoList() {
        return presupuestosPermisosmovimientoporcargoList;
    }

    public void setPresupuestosPermisosmovimientoporcargoList(List<PresupuestosPermisosmovimientoporcargo> presupuestosPermisosmovimientoporcargoList) {
        this.presupuestosPermisosmovimientoporcargoList = presupuestosPermisosmovimientoporcargoList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (keyCargo != null ? keyCargo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PresupuestosCargos)) {
            return false;
        }
        PresupuestosCargos other = (PresupuestosCargos) object;
        if ((this.keyCargo == null && other.keyCargo != null) || (this.keyCargo != null && !this.keyCargo.equals(other.keyCargo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.PresupuestosCargos[ keyCargo=" + keyCargo + " ]";
    }
    
}
