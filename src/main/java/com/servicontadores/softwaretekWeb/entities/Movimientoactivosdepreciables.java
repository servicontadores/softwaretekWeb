/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.servicontadores.softwaretekWeb.entities;

import java.io.Serializable;
import java.util.Date;
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
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author yesidherrera
 */
@Entity
@NamedQueries({
    @NamedQuery(name = "Movimientoactivosdepreciables.findAll", query = "SELECT m FROM Movimientoactivosdepreciables m")})
public class Movimientoactivosdepreciables implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(nullable = false)
    private Integer regedit;
    @Basic(optional = false)
    @Column(nullable = false, length = 45)
    private String tipoMovimiento;
    @Basic(optional = false)
    @Column(nullable = false)
    private double valor;
    private Integer no;
    private Integer docRef;
    @Column(length = 100)
    private String observacion;
    @Basic(optional = false)
    @Column(nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date fecha;
    @Basic(optional = false)
    @Column(nullable = false)
    private int codigoCDC;
    @Column(name = "ODBCFIX_FLDAUTO")
    private Integer odbcfixFldauto;
    private Integer codigoConcepto;
    @Basic(optional = false)
    @Column(nullable = false)
    private int mesDepreciacion;
    @Basic(optional = false)
    @Column(nullable = false)
    private int masVidaUtil;
    @Basic(optional = false)
    @Column(nullable = false)
    private int cancelado;
    @Basic(optional = false)
    @Column(name = "NoDoc_Auto", nullable = false)
    private int noDocAuto;
    @JoinColumn(name = "CodigoActivo", referencedColumnName = "Indice", nullable = false)
    @ManyToOne(optional = false)
    private Activosdepreciables codigoActivo;

    public Movimientoactivosdepreciables() {
    }

    public Movimientoactivosdepreciables(Integer regedit) {
        this.regedit = regedit;
    }

    public Movimientoactivosdepreciables(Integer regedit, String tipoMovimiento, double valor, Date fecha, int codigoCDC, int mesDepreciacion, int masVidaUtil, int cancelado, int noDocAuto) {
        this.regedit = regedit;
        this.tipoMovimiento = tipoMovimiento;
        this.valor = valor;
        this.fecha = fecha;
        this.codigoCDC = codigoCDC;
        this.mesDepreciacion = mesDepreciacion;
        this.masVidaUtil = masVidaUtil;
        this.cancelado = cancelado;
        this.noDocAuto = noDocAuto;
    }

    public Integer getRegedit() {
        return regedit;
    }

    public void setRegedit(Integer regedit) {
        this.regedit = regedit;
    }

    public String getTipoMovimiento() {
        return tipoMovimiento;
    }

    public void setTipoMovimiento(String tipoMovimiento) {
        this.tipoMovimiento = tipoMovimiento;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public Integer getNo() {
        return no;
    }

    public void setNo(Integer no) {
        this.no = no;
    }

    public Integer getDocRef() {
        return docRef;
    }

    public void setDocRef(Integer docRef) {
        this.docRef = docRef;
    }

    public String getObservacion() {
        return observacion;
    }

    public void setObservacion(String observacion) {
        this.observacion = observacion;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public int getCodigoCDC() {
        return codigoCDC;
    }

    public void setCodigoCDC(int codigoCDC) {
        this.codigoCDC = codigoCDC;
    }

    public Integer getOdbcfixFldauto() {
        return odbcfixFldauto;
    }

    public void setOdbcfixFldauto(Integer odbcfixFldauto) {
        this.odbcfixFldauto = odbcfixFldauto;
    }

    public Integer getCodigoConcepto() {
        return codigoConcepto;
    }

    public void setCodigoConcepto(Integer codigoConcepto) {
        this.codigoConcepto = codigoConcepto;
    }

    public int getMesDepreciacion() {
        return mesDepreciacion;
    }

    public void setMesDepreciacion(int mesDepreciacion) {
        this.mesDepreciacion = mesDepreciacion;
    }

    public int getMasVidaUtil() {
        return masVidaUtil;
    }

    public void setMasVidaUtil(int masVidaUtil) {
        this.masVidaUtil = masVidaUtil;
    }

    public int getCancelado() {
        return cancelado;
    }

    public void setCancelado(int cancelado) {
        this.cancelado = cancelado;
    }

    public int getNoDocAuto() {
        return noDocAuto;
    }

    public void setNoDocAuto(int noDocAuto) {
        this.noDocAuto = noDocAuto;
    }

    public Activosdepreciables getCodigoActivo() {
        return codigoActivo;
    }

    public void setCodigoActivo(Activosdepreciables codigoActivo) {
        this.codigoActivo = codigoActivo;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (regedit != null ? regedit.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Movimientoactivosdepreciables)) {
            return false;
        }
        Movimientoactivosdepreciables other = (Movimientoactivosdepreciables) object;
        if ((this.regedit == null && other.regedit != null) || (this.regedit != null && !this.regedit.equals(other.regedit))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.Movimientoactivosdepreciables[ regedit=" + regedit + " ]";
    }
    
}
