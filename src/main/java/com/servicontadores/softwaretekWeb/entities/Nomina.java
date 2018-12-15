/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.servicontadores.softwaretekWeb.entities;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author yesidherrera
 */
@Entity
@NamedQueries({
    @NamedQuery(name = "Nomina.findAll", query = "SELECT n FROM Nomina n")})
public class Nomina implements Serializable {

    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @Column(nullable = false)
    private int cody;
    @Id
    @Basic(optional = false)
    @Column(nullable = false)
    private Integer imp;
    private Integer numero;
    @Column(length = 50)
    private String mes;
    @Temporal(TemporalType.TIMESTAMP)
    private Date fecha;
    private Integer formaPago;
    private Integer sueldoBasico;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(precision = 7, scale = 2)
    private Double diasLaborados;
    private Integer basico;
    private Integer auxilioDeTransporte;
    private Integer totalHorasExtras;
    private Integer comisiones;
    private Integer bonificacion;
    private Integer otros;
    private Integer totalDevengado;
    private Integer deduccionSalud;
    private Integer deduccionPension;
    private Integer parFisARP;
    private Integer deduccionFSP;
    private Integer deduccionPrestamos;
    private Integer deducionOtras;
    private Integer deduccionRfte;
    private Integer totalDeducciones;
    private Integer netoPagado;
    private Integer parFCesantias;
    private Integer parFIntCesantias;
    private Integer parFPrimas;
    private Integer parFVacaciones;
    @Column(length = 100)
    private String detal;
    private Integer guardado;
    private Integer vrPrestamo;
    private Integer pSaldoAnterior;
    private Integer pPrestamosMes;
    private Integer pNuevoSaldo;
    private Integer pAbonoDirecto;
    private Integer pAbonoXNomina;
    private Integer saludEmpresa;
    private Integer pensionEmpresa;
    private Integer aporteCCF;
    private Integer aporteICBF;
    private Integer aporteSENA;
    private Integer pSaldoActual;
    @Column(length = 50)
    private String conceptoP;
    @Temporal(TemporalType.TIMESTAMP)
    private Date incioPeriodo;
    @Temporal(TemporalType.TIMESTAMP)
    private Date finPeriodo;
    private Integer bin;
    private Integer codigoSucursal;
    @Column(length = 45)
    private String cdc;
    @Column(length = 45)
    private String codigoUsuario;
    private Integer codigoConcepto;
    @Column(name = "ODBCFIX_FLDAUTO")
    private Integer odbcfixFldauto;
    @Basic(optional = false)
    @Column(name = "NoDoc_Auto", nullable = false)
    private boolean noDocAuto;
    @OneToOne(cascade = CascadeType.ALL, mappedBy = "nomina")
    private Horasextranomina horasextranomina;
    @JoinColumn(name = "Nit", referencedColumnName = "Codigo")
    @ManyToOne
    private Nit nit;

    public Nomina() {
    }

    public Nomina(Integer imp) {
        this.imp = imp;
    }

    public Nomina(Integer imp, int cody, boolean noDocAuto) {
        this.imp = imp;
        this.cody = cody;
        this.noDocAuto = noDocAuto;
    }

    public int getCody() {
        return cody;
    }

    public void setCody(int cody) {
        this.cody = cody;
    }

    public Integer getImp() {
        return imp;
    }

    public void setImp(Integer imp) {
        this.imp = imp;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public String getMes() {
        return mes;
    }

    public void setMes(String mes) {
        this.mes = mes;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Integer getFormaPago() {
        return formaPago;
    }

    public void setFormaPago(Integer formaPago) {
        this.formaPago = formaPago;
    }

    public Integer getSueldoBasico() {
        return sueldoBasico;
    }

    public void setSueldoBasico(Integer sueldoBasico) {
        this.sueldoBasico = sueldoBasico;
    }

    public Double getDiasLaborados() {
        return diasLaborados;
    }

    public void setDiasLaborados(Double diasLaborados) {
        this.diasLaborados = diasLaborados;
    }

    public Integer getBasico() {
        return basico;
    }

    public void setBasico(Integer basico) {
        this.basico = basico;
    }

    public Integer getAuxilioDeTransporte() {
        return auxilioDeTransporte;
    }

    public void setAuxilioDeTransporte(Integer auxilioDeTransporte) {
        this.auxilioDeTransporte = auxilioDeTransporte;
    }

    public Integer getTotalHorasExtras() {
        return totalHorasExtras;
    }

    public void setTotalHorasExtras(Integer totalHorasExtras) {
        this.totalHorasExtras = totalHorasExtras;
    }

    public Integer getComisiones() {
        return comisiones;
    }

    public void setComisiones(Integer comisiones) {
        this.comisiones = comisiones;
    }

    public Integer getBonificacion() {
        return bonificacion;
    }

    public void setBonificacion(Integer bonificacion) {
        this.bonificacion = bonificacion;
    }

    public Integer getOtros() {
        return otros;
    }

    public void setOtros(Integer otros) {
        this.otros = otros;
    }

    public Integer getTotalDevengado() {
        return totalDevengado;
    }

    public void setTotalDevengado(Integer totalDevengado) {
        this.totalDevengado = totalDevengado;
    }

    public Integer getDeduccionSalud() {
        return deduccionSalud;
    }

    public void setDeduccionSalud(Integer deduccionSalud) {
        this.deduccionSalud = deduccionSalud;
    }

    public Integer getDeduccionPension() {
        return deduccionPension;
    }

    public void setDeduccionPension(Integer deduccionPension) {
        this.deduccionPension = deduccionPension;
    }

    public Integer getParFisARP() {
        return parFisARP;
    }

    public void setParFisARP(Integer parFisARP) {
        this.parFisARP = parFisARP;
    }

    public Integer getDeduccionFSP() {
        return deduccionFSP;
    }

    public void setDeduccionFSP(Integer deduccionFSP) {
        this.deduccionFSP = deduccionFSP;
    }

    public Integer getDeduccionPrestamos() {
        return deduccionPrestamos;
    }

    public void setDeduccionPrestamos(Integer deduccionPrestamos) {
        this.deduccionPrestamos = deduccionPrestamos;
    }

    public Integer getDeducionOtras() {
        return deducionOtras;
    }

    public void setDeducionOtras(Integer deducionOtras) {
        this.deducionOtras = deducionOtras;
    }

    public Integer getDeduccionRfte() {
        return deduccionRfte;
    }

    public void setDeduccionRfte(Integer deduccionRfte) {
        this.deduccionRfte = deduccionRfte;
    }

    public Integer getTotalDeducciones() {
        return totalDeducciones;
    }

    public void setTotalDeducciones(Integer totalDeducciones) {
        this.totalDeducciones = totalDeducciones;
    }

    public Integer getNetoPagado() {
        return netoPagado;
    }

    public void setNetoPagado(Integer netoPagado) {
        this.netoPagado = netoPagado;
    }

    public Integer getParFCesantias() {
        return parFCesantias;
    }

    public void setParFCesantias(Integer parFCesantias) {
        this.parFCesantias = parFCesantias;
    }

    public Integer getParFIntCesantias() {
        return parFIntCesantias;
    }

    public void setParFIntCesantias(Integer parFIntCesantias) {
        this.parFIntCesantias = parFIntCesantias;
    }

    public Integer getParFPrimas() {
        return parFPrimas;
    }

    public void setParFPrimas(Integer parFPrimas) {
        this.parFPrimas = parFPrimas;
    }

    public Integer getParFVacaciones() {
        return parFVacaciones;
    }

    public void setParFVacaciones(Integer parFVacaciones) {
        this.parFVacaciones = parFVacaciones;
    }

    public String getDetal() {
        return detal;
    }

    public void setDetal(String detal) {
        this.detal = detal;
    }

    public Integer getGuardado() {
        return guardado;
    }

    public void setGuardado(Integer guardado) {
        this.guardado = guardado;
    }

    public Integer getVrPrestamo() {
        return vrPrestamo;
    }

    public void setVrPrestamo(Integer vrPrestamo) {
        this.vrPrestamo = vrPrestamo;
    }

    public Integer getPSaldoAnterior() {
        return pSaldoAnterior;
    }

    public void setPSaldoAnterior(Integer pSaldoAnterior) {
        this.pSaldoAnterior = pSaldoAnterior;
    }

    public Integer getPPrestamosMes() {
        return pPrestamosMes;
    }

    public void setPPrestamosMes(Integer pPrestamosMes) {
        this.pPrestamosMes = pPrestamosMes;
    }

    public Integer getPNuevoSaldo() {
        return pNuevoSaldo;
    }

    public void setPNuevoSaldo(Integer pNuevoSaldo) {
        this.pNuevoSaldo = pNuevoSaldo;
    }

    public Integer getPAbonoDirecto() {
        return pAbonoDirecto;
    }

    public void setPAbonoDirecto(Integer pAbonoDirecto) {
        this.pAbonoDirecto = pAbonoDirecto;
    }

    public Integer getPAbonoXNomina() {
        return pAbonoXNomina;
    }

    public void setPAbonoXNomina(Integer pAbonoXNomina) {
        this.pAbonoXNomina = pAbonoXNomina;
    }

    public Integer getSaludEmpresa() {
        return saludEmpresa;
    }

    public void setSaludEmpresa(Integer saludEmpresa) {
        this.saludEmpresa = saludEmpresa;
    }

    public Integer getPensionEmpresa() {
        return pensionEmpresa;
    }

    public void setPensionEmpresa(Integer pensionEmpresa) {
        this.pensionEmpresa = pensionEmpresa;
    }

    public Integer getAporteCCF() {
        return aporteCCF;
    }

    public void setAporteCCF(Integer aporteCCF) {
        this.aporteCCF = aporteCCF;
    }

    public Integer getAporteICBF() {
        return aporteICBF;
    }

    public void setAporteICBF(Integer aporteICBF) {
        this.aporteICBF = aporteICBF;
    }

    public Integer getAporteSENA() {
        return aporteSENA;
    }

    public void setAporteSENA(Integer aporteSENA) {
        this.aporteSENA = aporteSENA;
    }

    public Integer getPSaldoActual() {
        return pSaldoActual;
    }

    public void setPSaldoActual(Integer pSaldoActual) {
        this.pSaldoActual = pSaldoActual;
    }

    public String getConceptoP() {
        return conceptoP;
    }

    public void setConceptoP(String conceptoP) {
        this.conceptoP = conceptoP;
    }

    public Date getIncioPeriodo() {
        return incioPeriodo;
    }

    public void setIncioPeriodo(Date incioPeriodo) {
        this.incioPeriodo = incioPeriodo;
    }

    public Date getFinPeriodo() {
        return finPeriodo;
    }

    public void setFinPeriodo(Date finPeriodo) {
        this.finPeriodo = finPeriodo;
    }

    public Integer getBin() {
        return bin;
    }

    public void setBin(Integer bin) {
        this.bin = bin;
    }

    public Integer getCodigoSucursal() {
        return codigoSucursal;
    }

    public void setCodigoSucursal(Integer codigoSucursal) {
        this.codigoSucursal = codigoSucursal;
    }

    public String getCdc() {
        return cdc;
    }

    public void setCdc(String cdc) {
        this.cdc = cdc;
    }

    public String getCodigoUsuario() {
        return codigoUsuario;
    }

    public void setCodigoUsuario(String codigoUsuario) {
        this.codigoUsuario = codigoUsuario;
    }

    public Integer getCodigoConcepto() {
        return codigoConcepto;
    }

    public void setCodigoConcepto(Integer codigoConcepto) {
        this.codigoConcepto = codigoConcepto;
    }

    public Integer getOdbcfixFldauto() {
        return odbcfixFldauto;
    }

    public void setOdbcfixFldauto(Integer odbcfixFldauto) {
        this.odbcfixFldauto = odbcfixFldauto;
    }

    public boolean getNoDocAuto() {
        return noDocAuto;
    }

    public void setNoDocAuto(boolean noDocAuto) {
        this.noDocAuto = noDocAuto;
    }

    public Horasextranomina getHorasextranomina() {
        return horasextranomina;
    }

    public void setHorasextranomina(Horasextranomina horasextranomina) {
        this.horasextranomina = horasextranomina;
    }

    public Nit getNit() {
        return nit;
    }

    public void setNit(Nit nit) {
        this.nit = nit;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (imp != null ? imp.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Nomina)) {
            return false;
        }
        Nomina other = (Nomina) object;
        if ((this.imp == null && other.imp != null) || (this.imp != null && !this.imp.equals(other.imp))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.Nomina[ imp=" + imp + " ]";
    }
    
}
