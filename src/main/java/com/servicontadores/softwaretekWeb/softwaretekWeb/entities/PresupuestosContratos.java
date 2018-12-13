/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author yesidherrera
 */
@Entity
@Table(name = "presupuestos_contratos")
@NamedQueries({
    @NamedQuery(name = "PresupuestosContratos.findAll", query = "SELECT p FROM PresupuestosContratos p")})
public class PresupuestosContratos implements Serializable {

    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(nullable = false, precision = 22)
    private Double indiceContrato;
    @Temporal(TemporalType.TIMESTAMP)
    private Date fecha;
    @Basic(optional = false)
    @Column(nullable = false)
    private int noContrato;
    @Basic(optional = false)
    @Column(nullable = false, length = 50)
    private String contratista;
    @Basic(optional = false)
    @Column(nullable = false, length = 250)
    private String objeto;
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaInicio;
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaFin;
    @Basic(optional = false)
    @Column(nullable = false)
    private int valorMensual;
    @Column(length = 250)
    private String observación;
    @Basic(optional = false)
    @Column(nullable = false)
    private int cdp;
    @Basic(optional = false)
    @Column(nullable = false)
    private int rp;
    @Basic(optional = false)
    @Column(nullable = false)
    private int keyEmpresa;
    @Basic(optional = false)
    @Column(nullable = false)
    private int keyEncabezadoMovimientoReferencia;

    public PresupuestosContratos() {
    }

    public PresupuestosContratos(Double indiceContrato) {
        this.indiceContrato = indiceContrato;
    }

    public PresupuestosContratos(Double indiceContrato, int noContrato, String contratista, String objeto, int valorMensual, int cdp, int rp, int keyEmpresa, int keyEncabezadoMovimientoReferencia) {
        this.indiceContrato = indiceContrato;
        this.noContrato = noContrato;
        this.contratista = contratista;
        this.objeto = objeto;
        this.valorMensual = valorMensual;
        this.cdp = cdp;
        this.rp = rp;
        this.keyEmpresa = keyEmpresa;
        this.keyEncabezadoMovimientoReferencia = keyEncabezadoMovimientoReferencia;
    }

    public Double getIndiceContrato() {
        return indiceContrato;
    }

    public void setIndiceContrato(Double indiceContrato) {
        this.indiceContrato = indiceContrato;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public int getNoContrato() {
        return noContrato;
    }

    public void setNoContrato(int noContrato) {
        this.noContrato = noContrato;
    }

    public String getContratista() {
        return contratista;
    }

    public void setContratista(String contratista) {
        this.contratista = contratista;
    }

    public String getObjeto() {
        return objeto;
    }

    public void setObjeto(String objeto) {
        this.objeto = objeto;
    }

    public Date getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(Date fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public Date getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(Date fechaFin) {
        this.fechaFin = fechaFin;
    }

    public int getValorMensual() {
        return valorMensual;
    }

    public void setValorMensual(int valorMensual) {
        this.valorMensual = valorMensual;
    }

    public String getObservación() {
        return observación;
    }

    public void setObservación(String observación) {
        this.observación = observación;
    }

    public int getCdp() {
        return cdp;
    }

    public void setCdp(int cdp) {
        this.cdp = cdp;
    }

    public int getRp() {
        return rp;
    }

    public void setRp(int rp) {
        this.rp = rp;
    }

    public int getKeyEmpresa() {
        return keyEmpresa;
    }

    public void setKeyEmpresa(int keyEmpresa) {
        this.keyEmpresa = keyEmpresa;
    }

    public int getKeyEncabezadoMovimientoReferencia() {
        return keyEncabezadoMovimientoReferencia;
    }

    public void setKeyEncabezadoMovimientoReferencia(int keyEncabezadoMovimientoReferencia) {
        this.keyEncabezadoMovimientoReferencia = keyEncabezadoMovimientoReferencia;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (indiceContrato != null ? indiceContrato.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PresupuestosContratos)) {
            return false;
        }
        PresupuestosContratos other = (PresupuestosContratos) object;
        if ((this.indiceContrato == null && other.indiceContrato != null) || (this.indiceContrato != null && !this.indiceContrato.equals(other.indiceContrato))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.PresupuestosContratos[ indiceContrato=" + indiceContrato + " ]";
    }
    
}
