/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.servicontadores.softwaretekWeb.entities;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author yesidherrera
 */
@Entity
@Table(name = "presupuestos_encabezadomovimiento")
@NamedQueries({
    @NamedQuery(name = "PresupuestosEncabezadomovimiento.findAll", query = "SELECT p FROM PresupuestosEncabezadomovimiento p")})
public class PresupuestosEncabezadomovimiento implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(nullable = false)
    private Integer keyEncabezadoMovimiento;
    @Basic(optional = false)
    @Column(nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date fecha;
    @Basic(optional = false)
    @Column(nullable = false)
    private int noDocumento;
    private Integer noDocRef;
    @Column(length = 200)
    private String observacion;
    @Basic(optional = false)
    @Column(nullable = false)
    private int keyEmpresa;
    @Basic(optional = false)
    @Column(nullable = false)
    private boolean guardado;
    @Basic(optional = false)
    @Column(nullable = false)
    private boolean anulado;
    @Basic(optional = false)
    @Column(nullable = false)
    private boolean cerrado;
    @Basic(optional = false)
    @Column(nullable = false)
    private int keyEncabezadoMovimientoReferencia;
    @Basic(optional = false)
    @Column(nullable = false, length = 50)
    private String codigoUsuario;
    @Column(name = "ODBCFIX_AUTO")
    private Integer odbcfixAuto;
    @JoinColumn(name = "NIT", referencedColumnName = "Codigo", nullable = false)
    @ManyToOne(optional = false)
    private Nit nit;
    @JoinColumn(name = "KeyTipoMovimiento", referencedColumnName = "KeyTipoMovimiento", nullable = false)
    @ManyToOne(optional = false)
    private PresupuestosTipomovimiento keyTipoMovimiento;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "keyEncabezadoMovimiento")
    private List<PresupuestosMovimiento> presupuestosMovimientoList;

    public PresupuestosEncabezadomovimiento() {
    }

    public PresupuestosEncabezadomovimiento(Integer keyEncabezadoMovimiento) {
        this.keyEncabezadoMovimiento = keyEncabezadoMovimiento;
    }

    public PresupuestosEncabezadomovimiento(Integer keyEncabezadoMovimiento, Date fecha, int noDocumento, int keyEmpresa, boolean guardado, boolean anulado, boolean cerrado, int keyEncabezadoMovimientoReferencia, String codigoUsuario) {
        this.keyEncabezadoMovimiento = keyEncabezadoMovimiento;
        this.fecha = fecha;
        this.noDocumento = noDocumento;
        this.keyEmpresa = keyEmpresa;
        this.guardado = guardado;
        this.anulado = anulado;
        this.cerrado = cerrado;
        this.keyEncabezadoMovimientoReferencia = keyEncabezadoMovimientoReferencia;
        this.codigoUsuario = codigoUsuario;
    }

    public Integer getKeyEncabezadoMovimiento() {
        return keyEncabezadoMovimiento;
    }

    public void setKeyEncabezadoMovimiento(Integer keyEncabezadoMovimiento) {
        this.keyEncabezadoMovimiento = keyEncabezadoMovimiento;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public int getNoDocumento() {
        return noDocumento;
    }

    public void setNoDocumento(int noDocumento) {
        this.noDocumento = noDocumento;
    }

    public Integer getNoDocRef() {
        return noDocRef;
    }

    public void setNoDocRef(Integer noDocRef) {
        this.noDocRef = noDocRef;
    }

    public String getObservacion() {
        return observacion;
    }

    public void setObservacion(String observacion) {
        this.observacion = observacion;
    }

    public int getKeyEmpresa() {
        return keyEmpresa;
    }

    public void setKeyEmpresa(int keyEmpresa) {
        this.keyEmpresa = keyEmpresa;
    }

    public boolean getGuardado() {
        return guardado;
    }

    public void setGuardado(boolean guardado) {
        this.guardado = guardado;
    }

    public boolean getAnulado() {
        return anulado;
    }

    public void setAnulado(boolean anulado) {
        this.anulado = anulado;
    }

    public boolean getCerrado() {
        return cerrado;
    }

    public void setCerrado(boolean cerrado) {
        this.cerrado = cerrado;
    }

    public int getKeyEncabezadoMovimientoReferencia() {
        return keyEncabezadoMovimientoReferencia;
    }

    public void setKeyEncabezadoMovimientoReferencia(int keyEncabezadoMovimientoReferencia) {
        this.keyEncabezadoMovimientoReferencia = keyEncabezadoMovimientoReferencia;
    }

    public String getCodigoUsuario() {
        return codigoUsuario;
    }

    public void setCodigoUsuario(String codigoUsuario) {
        this.codigoUsuario = codigoUsuario;
    }

    public Integer getOdbcfixAuto() {
        return odbcfixAuto;
    }

    public void setOdbcfixAuto(Integer odbcfixAuto) {
        this.odbcfixAuto = odbcfixAuto;
    }

    public Nit getNit() {
        return nit;
    }

    public void setNit(Nit nit) {
        this.nit = nit;
    }

    public PresupuestosTipomovimiento getKeyTipoMovimiento() {
        return keyTipoMovimiento;
    }

    public void setKeyTipoMovimiento(PresupuestosTipomovimiento keyTipoMovimiento) {
        this.keyTipoMovimiento = keyTipoMovimiento;
    }

    public List<PresupuestosMovimiento> getPresupuestosMovimientoList() {
        return presupuestosMovimientoList;
    }

    public void setPresupuestosMovimientoList(List<PresupuestosMovimiento> presupuestosMovimientoList) {
        this.presupuestosMovimientoList = presupuestosMovimientoList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (keyEncabezadoMovimiento != null ? keyEncabezadoMovimiento.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PresupuestosEncabezadomovimiento)) {
            return false;
        }
        PresupuestosEncabezadomovimiento other = (PresupuestosEncabezadomovimiento) object;
        if ((this.keyEncabezadoMovimiento == null && other.keyEncabezadoMovimiento != null) || (this.keyEncabezadoMovimiento != null && !this.keyEncabezadoMovimiento.equals(other.keyEncabezadoMovimiento))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.PresupuestosEncabezadomovimiento[ keyEncabezadoMovimiento=" + keyEncabezadoMovimiento + " ]";
    }
    
}
