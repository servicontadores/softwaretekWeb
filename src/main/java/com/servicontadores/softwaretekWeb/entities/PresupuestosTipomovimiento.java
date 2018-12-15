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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author yesidherrera
 */
@Entity
@Table(name = "presupuestos_tipomovimiento")
@NamedQueries({
    @NamedQuery(name = "PresupuestosTipomovimiento.findAll", query = "SELECT p FROM PresupuestosTipomovimiento p")})
public class PresupuestosTipomovimiento implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(nullable = false)
    private Integer keyTipoMovimiento;
    @Basic(optional = false)
    @Column(nullable = false)
    private int codigoTipoMovimiento;
    @Basic(optional = false)
    @Column(nullable = false, length = 100)
    private String tipoMovimiento;
    @Basic(optional = false)
    @Column(nullable = false, length = 5)
    private String prefijo;
    @Basic(optional = false)
    @Column(nullable = false)
    private short indiceEjecucion;
    @Basic(optional = false)
    @Column(nullable = false)
    private boolean restringirValor;
    @Basic(optional = false)
    @Column(nullable = false)
    private boolean manejaDebito;
    @Basic(optional = false)
    @Column(nullable = false)
    private boolean manejaCredito;
    @Basic(optional = false)
    @Column(nullable = false)
    private boolean bloquearEncabezado;
    @Basic(optional = false)
    @Column(nullable = false, length = 100)
    private String etiquetaParaMostrar;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "keyTipoMovimiento")
    private List<PresupuestosPermisosmovimientoporcargo> presupuestosPermisosmovimientoporcargoList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "keyTipoMovimiento")
    private List<PresupuestosEncabezadomovimiento> presupuestosEncabezadomovimientoList;
    @JoinColumn(name = "KeyGrupoMovimiento", referencedColumnName = "KeyGrupoMovimiento", nullable = false)
    @ManyToOne(optional = false)
    private PresupuestosGrupomovimientos keyGrupoMovimiento;

    public PresupuestosTipomovimiento() {
    }

    public PresupuestosTipomovimiento(Integer keyTipoMovimiento) {
        this.keyTipoMovimiento = keyTipoMovimiento;
    }

    public PresupuestosTipomovimiento(Integer keyTipoMovimiento, int codigoTipoMovimiento, String tipoMovimiento, String prefijo, short indiceEjecucion, boolean restringirValor, boolean manejaDebito, boolean manejaCredito, boolean bloquearEncabezado, String etiquetaParaMostrar) {
        this.keyTipoMovimiento = keyTipoMovimiento;
        this.codigoTipoMovimiento = codigoTipoMovimiento;
        this.tipoMovimiento = tipoMovimiento;
        this.prefijo = prefijo;
        this.indiceEjecucion = indiceEjecucion;
        this.restringirValor = restringirValor;
        this.manejaDebito = manejaDebito;
        this.manejaCredito = manejaCredito;
        this.bloquearEncabezado = bloquearEncabezado;
        this.etiquetaParaMostrar = etiquetaParaMostrar;
    }

    public Integer getKeyTipoMovimiento() {
        return keyTipoMovimiento;
    }

    public void setKeyTipoMovimiento(Integer keyTipoMovimiento) {
        this.keyTipoMovimiento = keyTipoMovimiento;
    }

    public int getCodigoTipoMovimiento() {
        return codigoTipoMovimiento;
    }

    public void setCodigoTipoMovimiento(int codigoTipoMovimiento) {
        this.codigoTipoMovimiento = codigoTipoMovimiento;
    }

    public String getTipoMovimiento() {
        return tipoMovimiento;
    }

    public void setTipoMovimiento(String tipoMovimiento) {
        this.tipoMovimiento = tipoMovimiento;
    }

    public String getPrefijo() {
        return prefijo;
    }

    public void setPrefijo(String prefijo) {
        this.prefijo = prefijo;
    }

    public short getIndiceEjecucion() {
        return indiceEjecucion;
    }

    public void setIndiceEjecucion(short indiceEjecucion) {
        this.indiceEjecucion = indiceEjecucion;
    }

    public boolean getRestringirValor() {
        return restringirValor;
    }

    public void setRestringirValor(boolean restringirValor) {
        this.restringirValor = restringirValor;
    }

    public boolean getManejaDebito() {
        return manejaDebito;
    }

    public void setManejaDebito(boolean manejaDebito) {
        this.manejaDebito = manejaDebito;
    }

    public boolean getManejaCredito() {
        return manejaCredito;
    }

    public void setManejaCredito(boolean manejaCredito) {
        this.manejaCredito = manejaCredito;
    }

    public boolean getBloquearEncabezado() {
        return bloquearEncabezado;
    }

    public void setBloquearEncabezado(boolean bloquearEncabezado) {
        this.bloquearEncabezado = bloquearEncabezado;
    }

    public String getEtiquetaParaMostrar() {
        return etiquetaParaMostrar;
    }

    public void setEtiquetaParaMostrar(String etiquetaParaMostrar) {
        this.etiquetaParaMostrar = etiquetaParaMostrar;
    }

    public List<PresupuestosPermisosmovimientoporcargo> getPresupuestosPermisosmovimientoporcargoList() {
        return presupuestosPermisosmovimientoporcargoList;
    }

    public void setPresupuestosPermisosmovimientoporcargoList(List<PresupuestosPermisosmovimientoporcargo> presupuestosPermisosmovimientoporcargoList) {
        this.presupuestosPermisosmovimientoporcargoList = presupuestosPermisosmovimientoporcargoList;
    }

    public List<PresupuestosEncabezadomovimiento> getPresupuestosEncabezadomovimientoList() {
        return presupuestosEncabezadomovimientoList;
    }

    public void setPresupuestosEncabezadomovimientoList(List<PresupuestosEncabezadomovimiento> presupuestosEncabezadomovimientoList) {
        this.presupuestosEncabezadomovimientoList = presupuestosEncabezadomovimientoList;
    }

    public PresupuestosGrupomovimientos getKeyGrupoMovimiento() {
        return keyGrupoMovimiento;
    }

    public void setKeyGrupoMovimiento(PresupuestosGrupomovimientos keyGrupoMovimiento) {
        this.keyGrupoMovimiento = keyGrupoMovimiento;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (keyTipoMovimiento != null ? keyTipoMovimiento.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PresupuestosTipomovimiento)) {
            return false;
        }
        PresupuestosTipomovimiento other = (PresupuestosTipomovimiento) object;
        if ((this.keyTipoMovimiento == null && other.keyTipoMovimiento != null) || (this.keyTipoMovimiento != null && !this.keyTipoMovimiento.equals(other.keyTipoMovimiento))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.PresupuestosTipomovimiento[ keyTipoMovimiento=" + keyTipoMovimiento + " ]";
    }
    
}
