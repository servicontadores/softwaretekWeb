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
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author yesidherrera
 */
@Entity
@NamedQueries({
    @NamedQuery(name = "Parametros.findAll", query = "SELECT p FROM Parametros p")})
public class Parametros implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(nullable = false)
    private Integer indice;
    @Basic(optional = false)
    @Column(nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date fecha1;
    @Basic(optional = false)
    @Column(nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date fecha2;
    @Basic(optional = false)
    @Column(nullable = false)
    private int codigoSucursal;
    @Basic(optional = false)
    @Column(nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaCExistencias;
    @Basic(optional = false)
    @Column(nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaCExistencias2;
    @Basic(optional = false)
    @Column(nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaCKardex;
    @Basic(optional = false)
    @Column(nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaCKardex2;
    @Basic(optional = false)
    @Column(nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaAnexoIVA1;
    @Basic(optional = false)
    @Column(nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaAnexoIVA2;
    @Column(length = 50)
    private String nitAnexoIVA;
    @Basic(optional = false)
    @Column(name = "ODBCFIX_FLDAUTO", nullable = false)
    private int odbcfixFldauto;
    @Basic(optional = false)
    @Column(nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaCMaestro;
    @Basic(optional = false)
    @Column(nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaCMaestro2;
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaContable;
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaContable2;

    public Parametros() {
    }

    public Parametros(Integer indice) {
        this.indice = indice;
    }

    public Parametros(Integer indice, Date fecha1, Date fecha2, int codigoSucursal, Date fechaCExistencias, Date fechaCExistencias2, Date fechaCKardex, Date fechaCKardex2, Date fechaAnexoIVA1, Date fechaAnexoIVA2, int odbcfixFldauto, Date fechaCMaestro, Date fechaCMaestro2) {
        this.indice = indice;
        this.fecha1 = fecha1;
        this.fecha2 = fecha2;
        this.codigoSucursal = codigoSucursal;
        this.fechaCExistencias = fechaCExistencias;
        this.fechaCExistencias2 = fechaCExistencias2;
        this.fechaCKardex = fechaCKardex;
        this.fechaCKardex2 = fechaCKardex2;
        this.fechaAnexoIVA1 = fechaAnexoIVA1;
        this.fechaAnexoIVA2 = fechaAnexoIVA2;
        this.odbcfixFldauto = odbcfixFldauto;
        this.fechaCMaestro = fechaCMaestro;
        this.fechaCMaestro2 = fechaCMaestro2;
    }

    public Integer getIndice() {
        return indice;
    }

    public void setIndice(Integer indice) {
        this.indice = indice;
    }

    public Date getFecha1() {
        return fecha1;
    }

    public void setFecha1(Date fecha1) {
        this.fecha1 = fecha1;
    }

    public Date getFecha2() {
        return fecha2;
    }

    public void setFecha2(Date fecha2) {
        this.fecha2 = fecha2;
    }

    public int getCodigoSucursal() {
        return codigoSucursal;
    }

    public void setCodigoSucursal(int codigoSucursal) {
        this.codigoSucursal = codigoSucursal;
    }

    public Date getFechaCExistencias() {
        return fechaCExistencias;
    }

    public void setFechaCExistencias(Date fechaCExistencias) {
        this.fechaCExistencias = fechaCExistencias;
    }

    public Date getFechaCExistencias2() {
        return fechaCExistencias2;
    }

    public void setFechaCExistencias2(Date fechaCExistencias2) {
        this.fechaCExistencias2 = fechaCExistencias2;
    }

    public Date getFechaCKardex() {
        return fechaCKardex;
    }

    public void setFechaCKardex(Date fechaCKardex) {
        this.fechaCKardex = fechaCKardex;
    }

    public Date getFechaCKardex2() {
        return fechaCKardex2;
    }

    public void setFechaCKardex2(Date fechaCKardex2) {
        this.fechaCKardex2 = fechaCKardex2;
    }

    public Date getFechaAnexoIVA1() {
        return fechaAnexoIVA1;
    }

    public void setFechaAnexoIVA1(Date fechaAnexoIVA1) {
        this.fechaAnexoIVA1 = fechaAnexoIVA1;
    }

    public Date getFechaAnexoIVA2() {
        return fechaAnexoIVA2;
    }

    public void setFechaAnexoIVA2(Date fechaAnexoIVA2) {
        this.fechaAnexoIVA2 = fechaAnexoIVA2;
    }

    public String getNitAnexoIVA() {
        return nitAnexoIVA;
    }

    public void setNitAnexoIVA(String nitAnexoIVA) {
        this.nitAnexoIVA = nitAnexoIVA;
    }

    public int getOdbcfixFldauto() {
        return odbcfixFldauto;
    }

    public void setOdbcfixFldauto(int odbcfixFldauto) {
        this.odbcfixFldauto = odbcfixFldauto;
    }

    public Date getFechaCMaestro() {
        return fechaCMaestro;
    }

    public void setFechaCMaestro(Date fechaCMaestro) {
        this.fechaCMaestro = fechaCMaestro;
    }

    public Date getFechaCMaestro2() {
        return fechaCMaestro2;
    }

    public void setFechaCMaestro2(Date fechaCMaestro2) {
        this.fechaCMaestro2 = fechaCMaestro2;
    }

    public Date getFechaContable() {
        return fechaContable;
    }

    public void setFechaContable(Date fechaContable) {
        this.fechaContable = fechaContable;
    }

    public Date getFechaContable2() {
        return fechaContable2;
    }

    public void setFechaContable2(Date fechaContable2) {
        this.fechaContable2 = fechaContable2;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (indice != null ? indice.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Parametros)) {
            return false;
        }
        Parametros other = (Parametros) object;
        if ((this.indice == null && other.indice != null) || (this.indice != null && !this.indice.equals(other.indice))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.Parametros[ indice=" + indice + " ]";
    }
    
}
