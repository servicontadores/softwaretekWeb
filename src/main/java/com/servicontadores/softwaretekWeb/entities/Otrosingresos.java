/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.servicontadores.softwaretekWeb.entities;

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

/**
 *
 * @author yesidherrera
 */
@Entity
@NamedQueries({
    @NamedQuery(name = "Otrosingresos.findAll", query = "SELECT o FROM Otrosingresos o")})
public class Otrosingresos implements Serializable {

    private static final long serialVersionUID = 1L;
    private Integer cody;
    @Basic(optional = false)
    @Column(nullable = false)
    private double base;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(precision = 22)
    private Double vrreteiva;
    @Column(precision = 22)
    private Double porcentajereteiva;
    @Column(precision = 22)
    private Double porcentajeretefuente;
    @Column(precision = 22)
    private Double vrretefuente;
    @Basic(optional = false)
    @Column(nullable = false)
    private double valoringreso;
    @Column(length = 45)
    private String observacion;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(nullable = false)
    private Integer regedit;
    @Column(precision = 22)
    private Double porcentajeiva;
    @Column(precision = 22)
    private Double vriva;
    @Basic(optional = false)
    @Column(name = "ODBCFIX_FLDAUTO", nullable = false)
    private int odbcfixFldauto;
    private Integer noSeparado;
    @JoinColumn(name = "CodigoIngreso", referencedColumnName = "Codigo")
    @ManyToOne
    private Codigoingresos codigoIngreso;
    @JoinColumn(name = "Imp", referencedColumnName = "Regedit", nullable = false)
    @ManyToOne(optional = false)
    private Encabezadootrosingresos imp;

    public Otrosingresos() {
    }

    public Otrosingresos(Integer regedit) {
        this.regedit = regedit;
    }

    public Otrosingresos(Integer regedit, double base, double valoringreso, int odbcfixFldauto) {
        this.regedit = regedit;
        this.base = base;
        this.valoringreso = valoringreso;
        this.odbcfixFldauto = odbcfixFldauto;
    }

    public Integer getCody() {
        return cody;
    }

    public void setCody(Integer cody) {
        this.cody = cody;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public Double getVrreteiva() {
        return vrreteiva;
    }

    public void setVrreteiva(Double vrreteiva) {
        this.vrreteiva = vrreteiva;
    }

    public Double getPorcentajereteiva() {
        return porcentajereteiva;
    }

    public void setPorcentajereteiva(Double porcentajereteiva) {
        this.porcentajereteiva = porcentajereteiva;
    }

    public Double getPorcentajeretefuente() {
        return porcentajeretefuente;
    }

    public void setPorcentajeretefuente(Double porcentajeretefuente) {
        this.porcentajeretefuente = porcentajeretefuente;
    }

    public Double getVrretefuente() {
        return vrretefuente;
    }

    public void setVrretefuente(Double vrretefuente) {
        this.vrretefuente = vrretefuente;
    }

    public double getValoringreso() {
        return valoringreso;
    }

    public void setValoringreso(double valoringreso) {
        this.valoringreso = valoringreso;
    }

    public String getObservacion() {
        return observacion;
    }

    public void setObservacion(String observacion) {
        this.observacion = observacion;
    }

    public Integer getRegedit() {
        return regedit;
    }

    public void setRegedit(Integer regedit) {
        this.regedit = regedit;
    }

    public Double getPorcentajeiva() {
        return porcentajeiva;
    }

    public void setPorcentajeiva(Double porcentajeiva) {
        this.porcentajeiva = porcentajeiva;
    }

    public Double getVriva() {
        return vriva;
    }

    public void setVriva(Double vriva) {
        this.vriva = vriva;
    }

    public int getOdbcfixFldauto() {
        return odbcfixFldauto;
    }

    public void setOdbcfixFldauto(int odbcfixFldauto) {
        this.odbcfixFldauto = odbcfixFldauto;
    }

    public Integer getNoSeparado() {
        return noSeparado;
    }

    public void setNoSeparado(Integer noSeparado) {
        this.noSeparado = noSeparado;
    }

    public Codigoingresos getCodigoIngreso() {
        return codigoIngreso;
    }

    public void setCodigoIngreso(Codigoingresos codigoIngreso) {
        this.codigoIngreso = codigoIngreso;
    }

    public Encabezadootrosingresos getImp() {
        return imp;
    }

    public void setImp(Encabezadootrosingresos imp) {
        this.imp = imp;
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
        if (!(object instanceof Otrosingresos)) {
            return false;
        }
        Otrosingresos other = (Otrosingresos) object;
        if ((this.regedit == null && other.regedit != null) || (this.regedit != null && !this.regedit.equals(other.regedit))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.Otrosingresos[ regedit=" + regedit + " ]";
    }
    
}
