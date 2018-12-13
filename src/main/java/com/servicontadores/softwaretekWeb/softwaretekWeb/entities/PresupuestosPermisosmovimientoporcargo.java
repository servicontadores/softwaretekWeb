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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 *
 * @author yesidherrera
 */
@Entity
@Table(name = "presupuestos_permisosmovimientoporcargo")
@NamedQueries({
    @NamedQuery(name = "PresupuestosPermisosmovimientoporcargo.findAll", query = "SELECT p FROM PresupuestosPermisosmovimientoporcargo p")})
public class PresupuestosPermisosmovimientoporcargo implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(nullable = false)
    private Integer keyPermiso;
    @Basic(optional = false)
    @Column(nullable = false)
    private short consultar;
    @Basic(optional = false)
    @Column(nullable = false)
    private short agregar;
    @Basic(optional = false)
    @Column(nullable = false)
    private short editar;
    @Basic(optional = false)
    @Column(nullable = false)
    private short eliminar;
    @JoinColumn(name = "KeyCargo", referencedColumnName = "KeyCargo", nullable = false)
    @ManyToOne(optional = false)
    private PresupuestosCargos keyCargo;
    @JoinColumn(name = "KeyTipoMovimiento", referencedColumnName = "KeyTipoMovimiento", nullable = false)
    @ManyToOne(optional = false)
    private PresupuestosTipomovimiento keyTipoMovimiento;

    public PresupuestosPermisosmovimientoporcargo() {
    }

    public PresupuestosPermisosmovimientoporcargo(Integer keyPermiso) {
        this.keyPermiso = keyPermiso;
    }

    public PresupuestosPermisosmovimientoporcargo(Integer keyPermiso, short consultar, short agregar, short editar, short eliminar) {
        this.keyPermiso = keyPermiso;
        this.consultar = consultar;
        this.agregar = agregar;
        this.editar = editar;
        this.eliminar = eliminar;
    }

    public Integer getKeyPermiso() {
        return keyPermiso;
    }

    public void setKeyPermiso(Integer keyPermiso) {
        this.keyPermiso = keyPermiso;
    }

    public short getConsultar() {
        return consultar;
    }

    public void setConsultar(short consultar) {
        this.consultar = consultar;
    }

    public short getAgregar() {
        return agregar;
    }

    public void setAgregar(short agregar) {
        this.agregar = agregar;
    }

    public short getEditar() {
        return editar;
    }

    public void setEditar(short editar) {
        this.editar = editar;
    }

    public short getEliminar() {
        return eliminar;
    }

    public void setEliminar(short eliminar) {
        this.eliminar = eliminar;
    }

    public PresupuestosCargos getKeyCargo() {
        return keyCargo;
    }

    public void setKeyCargo(PresupuestosCargos keyCargo) {
        this.keyCargo = keyCargo;
    }

    public PresupuestosTipomovimiento getKeyTipoMovimiento() {
        return keyTipoMovimiento;
    }

    public void setKeyTipoMovimiento(PresupuestosTipomovimiento keyTipoMovimiento) {
        this.keyTipoMovimiento = keyTipoMovimiento;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (keyPermiso != null ? keyPermiso.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PresupuestosPermisosmovimientoporcargo)) {
            return false;
        }
        PresupuestosPermisosmovimientoporcargo other = (PresupuestosPermisosmovimientoporcargo) object;
        if ((this.keyPermiso == null && other.keyPermiso != null) || (this.keyPermiso != null && !this.keyPermiso.equals(other.keyPermiso))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.PresupuestosPermisosmovimientoporcargo[ keyPermiso=" + keyPermiso + " ]";
    }
    
}
