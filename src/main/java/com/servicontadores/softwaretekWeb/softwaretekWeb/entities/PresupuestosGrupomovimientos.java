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
@Table(name = "presupuestos_grupomovimientos")
@NamedQueries({
    @NamedQuery(name = "PresupuestosGrupomovimientos.findAll", query = "SELECT p FROM PresupuestosGrupomovimientos p")})
public class PresupuestosGrupomovimientos implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(nullable = false)
    private Integer keyGrupoMovimiento;
    @Basic(optional = false)
    @Column(nullable = false)
    private int codigoGrupoMovimiento;
    @Basic(optional = false)
    @Column(nullable = false, length = 100)
    private String grupoMovimiento;
    @Basic(optional = false)
    @Column(nullable = false)
    private boolean saldoPresupuestal;
    @Basic(optional = false)
    @Column(nullable = false)
    private boolean saldoDisponibilidad;
    @Basic(optional = false)
    @Column(nullable = false)
    private boolean saldoCompromiso;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "keyGrupoMovimiento")
    private List<PresupuestosTipomovimiento> presupuestosTipomovimientoList;

    public PresupuestosGrupomovimientos() {
    }

    public PresupuestosGrupomovimientos(Integer keyGrupoMovimiento) {
        this.keyGrupoMovimiento = keyGrupoMovimiento;
    }

    public PresupuestosGrupomovimientos(Integer keyGrupoMovimiento, int codigoGrupoMovimiento, String grupoMovimiento, boolean saldoPresupuestal, boolean saldoDisponibilidad, boolean saldoCompromiso) {
        this.keyGrupoMovimiento = keyGrupoMovimiento;
        this.codigoGrupoMovimiento = codigoGrupoMovimiento;
        this.grupoMovimiento = grupoMovimiento;
        this.saldoPresupuestal = saldoPresupuestal;
        this.saldoDisponibilidad = saldoDisponibilidad;
        this.saldoCompromiso = saldoCompromiso;
    }

    public Integer getKeyGrupoMovimiento() {
        return keyGrupoMovimiento;
    }

    public void setKeyGrupoMovimiento(Integer keyGrupoMovimiento) {
        this.keyGrupoMovimiento = keyGrupoMovimiento;
    }

    public int getCodigoGrupoMovimiento() {
        return codigoGrupoMovimiento;
    }

    public void setCodigoGrupoMovimiento(int codigoGrupoMovimiento) {
        this.codigoGrupoMovimiento = codigoGrupoMovimiento;
    }

    public String getGrupoMovimiento() {
        return grupoMovimiento;
    }

    public void setGrupoMovimiento(String grupoMovimiento) {
        this.grupoMovimiento = grupoMovimiento;
    }

    public boolean getSaldoPresupuestal() {
        return saldoPresupuestal;
    }

    public void setSaldoPresupuestal(boolean saldoPresupuestal) {
        this.saldoPresupuestal = saldoPresupuestal;
    }

    public boolean getSaldoDisponibilidad() {
        return saldoDisponibilidad;
    }

    public void setSaldoDisponibilidad(boolean saldoDisponibilidad) {
        this.saldoDisponibilidad = saldoDisponibilidad;
    }

    public boolean getSaldoCompromiso() {
        return saldoCompromiso;
    }

    public void setSaldoCompromiso(boolean saldoCompromiso) {
        this.saldoCompromiso = saldoCompromiso;
    }

    public List<PresupuestosTipomovimiento> getPresupuestosTipomovimientoList() {
        return presupuestosTipomovimientoList;
    }

    public void setPresupuestosTipomovimientoList(List<PresupuestosTipomovimiento> presupuestosTipomovimientoList) {
        this.presupuestosTipomovimientoList = presupuestosTipomovimientoList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (keyGrupoMovimiento != null ? keyGrupoMovimiento.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PresupuestosGrupomovimientos)) {
            return false;
        }
        PresupuestosGrupomovimientos other = (PresupuestosGrupomovimientos) object;
        if ((this.keyGrupoMovimiento == null && other.keyGrupoMovimiento != null) || (this.keyGrupoMovimiento != null && !this.keyGrupoMovimiento.equals(other.keyGrupoMovimiento))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.PresupuestosGrupomovimientos[ keyGrupoMovimiento=" + keyGrupoMovimiento + " ]";
    }
    
}
