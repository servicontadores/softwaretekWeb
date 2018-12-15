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
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 *
 * @author yesidherrera
 */
@Entity
@Table(name = "nuevanomina_movsalario")
@NamedQueries({
    @NamedQuery(name = "NuevanominaMovsalario.findAll", query = "SELECT n FROM NuevanominaMovsalario n")})
public class NuevanominaMovsalario implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(nullable = false)
    private Integer indice;
    private Integer regedit;
    @Basic(optional = false)
    @Column(name = "Id_Empleado", nullable = false)
    private int idEmpleado;
    private Integer codigoSucursal;
    private Integer cdc;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(precision = 22)
    private Double salario;
    @Column(precision = 22)
    private Double diasLaborados;
    @Column(precision = 22)
    private Double basico;
    private Integer auxilioTransporteBase;
    private Integer auxilioTransporte;
    @Column(precision = 22)
    private Double horasExtras;
    private Integer comisiones;
    private Integer bonificaciones;
    private Integer otros;
    private Integer otrasDeducciones;
    @Column(precision = 22)
    private Double salud;
    @Column(precision = 22)
    private Double pension;
    @Column(precision = 22)
    private Double vrPrestamos;
    @Column(name = "Id_FormaPago")
    private Integer idFormaPago;
    @Column(precision = 22)
    private Double totalDevengado;
    @Column(length = 250)
    private String observacion;
    private Integer nITSalud;
    @Column(precision = 22)
    private Double iBCSalud;
    @Column(precision = 22)
    private Double tarifaSalud;
    @Column(precision = 22)
    private Double vrSalud;
    private Integer nITSaludEmpresa;
    @Column(precision = 22)
    private Double iBCSaludEmpresa;
    @Column(precision = 22)
    private Double tarifaSaludEmpresa;
    @Column(precision = 22)
    private Double vrSaludEmpresa;
    private Integer nITPension;
    @Column(precision = 22)
    private Double iBCPension;
    @Column(precision = 22)
    private Double tarifaPension;
    @Column(precision = 22)
    private Double vrPension;
    private Integer nITPensionEmpresa;
    @Column(precision = 22)
    private Double iBCPensionEmpresa;
    @Column(precision = 22)
    private Double tarifaPensionEmpresa;
    @Column(precision = 22)
    private Double vrPensionEmpresa;
    private Integer nitccf;
    @Column(precision = 22)
    private Double ibcccf;
    @Column(precision = 22)
    private Double tarifaCCF;
    @Column(precision = 22)
    private Double vrCCF;
    private Integer nitarl;
    @Column(precision = 22)
    private Double ibcarl;
    @Column(precision = 22)
    private Double tarifaARL;
    @Column(precision = 22)
    private Double vrARL;
    private Integer nITEntidad1;
    @Column(precision = 22)
    private Double iBCEntidad1;
    @Column(precision = 22)
    private Double tarifaEntidad1;
    @Column(precision = 22)
    private Double vrEntidad1;
    private Integer nITEntidad2;
    @Column(precision = 22)
    private Double iBCEntidad2;
    @Column(precision = 22)
    private Double tarifaEntidad2;
    @Column(precision = 22)
    private Double vrEntidad2;
    @Column(precision = 22)
    private Double iBCCesantias;
    @Column(precision = 22)
    private Double tarifaCesantias;
    @Column(precision = 22)
    private Double vrCesantias;
    @Column(precision = 22)
    private Double iBCIntCesantias;
    @Column(precision = 22)
    private Double tarifaIntCesantias;
    @Column(precision = 22)
    private Double vrIntCesantias;
    @Column(precision = 22)
    private Double iBCPrimas;
    @Column(precision = 22)
    private Double tarifaPrimas;
    @Column(precision = 22)
    private Double vrPrimas;
    @Column(precision = 22)
    private Double iBCVacaciones;
    @Column(precision = 22)
    private Double tarifaVacaciones;
    @Column(precision = 22)
    private Double vrVacaciones;
    private Integer vrHora;
    @Column(precision = 22)
    private Double tarifaExtraDiurnaSemanal;
    @Column(precision = 22)
    private Double cantExtraDiurnaSemanal;
    @Column(precision = 22)
    private Double vrExtraDiurnaSemanal;
    @Column(precision = 22)
    private Double tarifaNocturnaSemanal;
    @Column(precision = 22)
    private Double cantNocturnaSemanal;
    @Column(precision = 22)
    private Double vrNocturnaSemanal;
    @Column(precision = 22)
    private Double tarifaExtraNocturnaSemanal;
    @Column(precision = 22)
    private Double cantExtraNocturnaSemanal;
    @Column(precision = 22)
    private Double vrExtraNocturnaSemanal;
    @Column(precision = 22)
    private Double tarifaDiurnaDominical;
    @Column(precision = 22)
    private Double cantDiurnaDominical;
    @Column(precision = 22)
    private Double vrDiurnaDominical;
    @Column(precision = 22)
    private Double tarifaExtraDiurnaDominical;
    @Column(precision = 22)
    private Double cantExtraDiurnaDominical;
    @Column(precision = 22)
    private Double vrExtraDiurnaDominical;
    @Column(precision = 22)
    private Double tarifaNocturnaDominical;
    @Column(precision = 22)
    private Double cantNocturnaDominical;
    @Column(precision = 22)
    private Double vrNocturnaDominical;
    @Column(precision = 22)
    private Double tarifaExtraNocturnaDominical;
    @Column(precision = 22)
    private Double cantExtraNocturnaDominical;
    @Column(precision = 22)
    private Double vrExtraNocturnaDominical;
    @Column(precision = 22)
    private Double vrTotalExtras;
    private Integer cancelado;
    private Integer guardado;
    @Column(precision = 22)
    private Double totalDevengado2;
    @Column(precision = 22)
    private Double netoPagado;

    public NuevanominaMovsalario() {
    }

    public NuevanominaMovsalario(Integer indice) {
        this.indice = indice;
    }

    public NuevanominaMovsalario(Integer indice, int idEmpleado) {
        this.indice = indice;
        this.idEmpleado = idEmpleado;
    }

    public Integer getIndice() {
        return indice;
    }

    public void setIndice(Integer indice) {
        this.indice = indice;
    }

    public Integer getRegedit() {
        return regedit;
    }

    public void setRegedit(Integer regedit) {
        this.regedit = regedit;
    }

    public int getIdEmpleado() {
        return idEmpleado;
    }

    public void setIdEmpleado(int idEmpleado) {
        this.idEmpleado = idEmpleado;
    }

    public Integer getCodigoSucursal() {
        return codigoSucursal;
    }

    public void setCodigoSucursal(Integer codigoSucursal) {
        this.codigoSucursal = codigoSucursal;
    }

    public Integer getCdc() {
        return cdc;
    }

    public void setCdc(Integer cdc) {
        this.cdc = cdc;
    }

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }

    public Double getDiasLaborados() {
        return diasLaborados;
    }

    public void setDiasLaborados(Double diasLaborados) {
        this.diasLaborados = diasLaborados;
    }

    public Double getBasico() {
        return basico;
    }

    public void setBasico(Double basico) {
        this.basico = basico;
    }

    public Integer getAuxilioTransporteBase() {
        return auxilioTransporteBase;
    }

    public void setAuxilioTransporteBase(Integer auxilioTransporteBase) {
        this.auxilioTransporteBase = auxilioTransporteBase;
    }

    public Integer getAuxilioTransporte() {
        return auxilioTransporte;
    }

    public void setAuxilioTransporte(Integer auxilioTransporte) {
        this.auxilioTransporte = auxilioTransporte;
    }

    public Double getHorasExtras() {
        return horasExtras;
    }

    public void setHorasExtras(Double horasExtras) {
        this.horasExtras = horasExtras;
    }

    public Integer getComisiones() {
        return comisiones;
    }

    public void setComisiones(Integer comisiones) {
        this.comisiones = comisiones;
    }

    public Integer getBonificaciones() {
        return bonificaciones;
    }

    public void setBonificaciones(Integer bonificaciones) {
        this.bonificaciones = bonificaciones;
    }

    public Integer getOtros() {
        return otros;
    }

    public void setOtros(Integer otros) {
        this.otros = otros;
    }

    public Integer getOtrasDeducciones() {
        return otrasDeducciones;
    }

    public void setOtrasDeducciones(Integer otrasDeducciones) {
        this.otrasDeducciones = otrasDeducciones;
    }

    public Double getSalud() {
        return salud;
    }

    public void setSalud(Double salud) {
        this.salud = salud;
    }

    public Double getPension() {
        return pension;
    }

    public void setPension(Double pension) {
        this.pension = pension;
    }

    public Double getVrPrestamos() {
        return vrPrestamos;
    }

    public void setVrPrestamos(Double vrPrestamos) {
        this.vrPrestamos = vrPrestamos;
    }

    public Integer getIdFormaPago() {
        return idFormaPago;
    }

    public void setIdFormaPago(Integer idFormaPago) {
        this.idFormaPago = idFormaPago;
    }

    public Double getTotalDevengado() {
        return totalDevengado;
    }

    public void setTotalDevengado(Double totalDevengado) {
        this.totalDevengado = totalDevengado;
    }

    public String getObservacion() {
        return observacion;
    }

    public void setObservacion(String observacion) {
        this.observacion = observacion;
    }

    public Integer getNITSalud() {
        return nITSalud;
    }

    public void setNITSalud(Integer nITSalud) {
        this.nITSalud = nITSalud;
    }

    public Double getIBCSalud() {
        return iBCSalud;
    }

    public void setIBCSalud(Double iBCSalud) {
        this.iBCSalud = iBCSalud;
    }

    public Double getTarifaSalud() {
        return tarifaSalud;
    }

    public void setTarifaSalud(Double tarifaSalud) {
        this.tarifaSalud = tarifaSalud;
    }

    public Double getVrSalud() {
        return vrSalud;
    }

    public void setVrSalud(Double vrSalud) {
        this.vrSalud = vrSalud;
    }

    public Integer getNITSaludEmpresa() {
        return nITSaludEmpresa;
    }

    public void setNITSaludEmpresa(Integer nITSaludEmpresa) {
        this.nITSaludEmpresa = nITSaludEmpresa;
    }

    public Double getIBCSaludEmpresa() {
        return iBCSaludEmpresa;
    }

    public void setIBCSaludEmpresa(Double iBCSaludEmpresa) {
        this.iBCSaludEmpresa = iBCSaludEmpresa;
    }

    public Double getTarifaSaludEmpresa() {
        return tarifaSaludEmpresa;
    }

    public void setTarifaSaludEmpresa(Double tarifaSaludEmpresa) {
        this.tarifaSaludEmpresa = tarifaSaludEmpresa;
    }

    public Double getVrSaludEmpresa() {
        return vrSaludEmpresa;
    }

    public void setVrSaludEmpresa(Double vrSaludEmpresa) {
        this.vrSaludEmpresa = vrSaludEmpresa;
    }

    public Integer getNITPension() {
        return nITPension;
    }

    public void setNITPension(Integer nITPension) {
        this.nITPension = nITPension;
    }

    public Double getIBCPension() {
        return iBCPension;
    }

    public void setIBCPension(Double iBCPension) {
        this.iBCPension = iBCPension;
    }

    public Double getTarifaPension() {
        return tarifaPension;
    }

    public void setTarifaPension(Double tarifaPension) {
        this.tarifaPension = tarifaPension;
    }

    public Double getVrPension() {
        return vrPension;
    }

    public void setVrPension(Double vrPension) {
        this.vrPension = vrPension;
    }

    public Integer getNITPensionEmpresa() {
        return nITPensionEmpresa;
    }

    public void setNITPensionEmpresa(Integer nITPensionEmpresa) {
        this.nITPensionEmpresa = nITPensionEmpresa;
    }

    public Double getIBCPensionEmpresa() {
        return iBCPensionEmpresa;
    }

    public void setIBCPensionEmpresa(Double iBCPensionEmpresa) {
        this.iBCPensionEmpresa = iBCPensionEmpresa;
    }

    public Double getTarifaPensionEmpresa() {
        return tarifaPensionEmpresa;
    }

    public void setTarifaPensionEmpresa(Double tarifaPensionEmpresa) {
        this.tarifaPensionEmpresa = tarifaPensionEmpresa;
    }

    public Double getVrPensionEmpresa() {
        return vrPensionEmpresa;
    }

    public void setVrPensionEmpresa(Double vrPensionEmpresa) {
        this.vrPensionEmpresa = vrPensionEmpresa;
    }

    public Integer getNitccf() {
        return nitccf;
    }

    public void setNitccf(Integer nitccf) {
        this.nitccf = nitccf;
    }

    public Double getIbcccf() {
        return ibcccf;
    }

    public void setIbcccf(Double ibcccf) {
        this.ibcccf = ibcccf;
    }

    public Double getTarifaCCF() {
        return tarifaCCF;
    }

    public void setTarifaCCF(Double tarifaCCF) {
        this.tarifaCCF = tarifaCCF;
    }

    public Double getVrCCF() {
        return vrCCF;
    }

    public void setVrCCF(Double vrCCF) {
        this.vrCCF = vrCCF;
    }

    public Integer getNitarl() {
        return nitarl;
    }

    public void setNitarl(Integer nitarl) {
        this.nitarl = nitarl;
    }

    public Double getIbcarl() {
        return ibcarl;
    }

    public void setIbcarl(Double ibcarl) {
        this.ibcarl = ibcarl;
    }

    public Double getTarifaARL() {
        return tarifaARL;
    }

    public void setTarifaARL(Double tarifaARL) {
        this.tarifaARL = tarifaARL;
    }

    public Double getVrARL() {
        return vrARL;
    }

    public void setVrARL(Double vrARL) {
        this.vrARL = vrARL;
    }

    public Integer getNITEntidad1() {
        return nITEntidad1;
    }

    public void setNITEntidad1(Integer nITEntidad1) {
        this.nITEntidad1 = nITEntidad1;
    }

    public Double getIBCEntidad1() {
        return iBCEntidad1;
    }

    public void setIBCEntidad1(Double iBCEntidad1) {
        this.iBCEntidad1 = iBCEntidad1;
    }

    public Double getTarifaEntidad1() {
        return tarifaEntidad1;
    }

    public void setTarifaEntidad1(Double tarifaEntidad1) {
        this.tarifaEntidad1 = tarifaEntidad1;
    }

    public Double getVrEntidad1() {
        return vrEntidad1;
    }

    public void setVrEntidad1(Double vrEntidad1) {
        this.vrEntidad1 = vrEntidad1;
    }

    public Integer getNITEntidad2() {
        return nITEntidad2;
    }

    public void setNITEntidad2(Integer nITEntidad2) {
        this.nITEntidad2 = nITEntidad2;
    }

    public Double getIBCEntidad2() {
        return iBCEntidad2;
    }

    public void setIBCEntidad2(Double iBCEntidad2) {
        this.iBCEntidad2 = iBCEntidad2;
    }

    public Double getTarifaEntidad2() {
        return tarifaEntidad2;
    }

    public void setTarifaEntidad2(Double tarifaEntidad2) {
        this.tarifaEntidad2 = tarifaEntidad2;
    }

    public Double getVrEntidad2() {
        return vrEntidad2;
    }

    public void setVrEntidad2(Double vrEntidad2) {
        this.vrEntidad2 = vrEntidad2;
    }

    public Double getIBCCesantias() {
        return iBCCesantias;
    }

    public void setIBCCesantias(Double iBCCesantias) {
        this.iBCCesantias = iBCCesantias;
    }

    public Double getTarifaCesantias() {
        return tarifaCesantias;
    }

    public void setTarifaCesantias(Double tarifaCesantias) {
        this.tarifaCesantias = tarifaCesantias;
    }

    public Double getVrCesantias() {
        return vrCesantias;
    }

    public void setVrCesantias(Double vrCesantias) {
        this.vrCesantias = vrCesantias;
    }

    public Double getIBCIntCesantias() {
        return iBCIntCesantias;
    }

    public void setIBCIntCesantias(Double iBCIntCesantias) {
        this.iBCIntCesantias = iBCIntCesantias;
    }

    public Double getTarifaIntCesantias() {
        return tarifaIntCesantias;
    }

    public void setTarifaIntCesantias(Double tarifaIntCesantias) {
        this.tarifaIntCesantias = tarifaIntCesantias;
    }

    public Double getVrIntCesantias() {
        return vrIntCesantias;
    }

    public void setVrIntCesantias(Double vrIntCesantias) {
        this.vrIntCesantias = vrIntCesantias;
    }

    public Double getIBCPrimas() {
        return iBCPrimas;
    }

    public void setIBCPrimas(Double iBCPrimas) {
        this.iBCPrimas = iBCPrimas;
    }

    public Double getTarifaPrimas() {
        return tarifaPrimas;
    }

    public void setTarifaPrimas(Double tarifaPrimas) {
        this.tarifaPrimas = tarifaPrimas;
    }

    public Double getVrPrimas() {
        return vrPrimas;
    }

    public void setVrPrimas(Double vrPrimas) {
        this.vrPrimas = vrPrimas;
    }

    public Double getIBCVacaciones() {
        return iBCVacaciones;
    }

    public void setIBCVacaciones(Double iBCVacaciones) {
        this.iBCVacaciones = iBCVacaciones;
    }

    public Double getTarifaVacaciones() {
        return tarifaVacaciones;
    }

    public void setTarifaVacaciones(Double tarifaVacaciones) {
        this.tarifaVacaciones = tarifaVacaciones;
    }

    public Double getVrVacaciones() {
        return vrVacaciones;
    }

    public void setVrVacaciones(Double vrVacaciones) {
        this.vrVacaciones = vrVacaciones;
    }

    public Integer getVrHora() {
        return vrHora;
    }

    public void setVrHora(Integer vrHora) {
        this.vrHora = vrHora;
    }

    public Double getTarifaExtraDiurnaSemanal() {
        return tarifaExtraDiurnaSemanal;
    }

    public void setTarifaExtraDiurnaSemanal(Double tarifaExtraDiurnaSemanal) {
        this.tarifaExtraDiurnaSemanal = tarifaExtraDiurnaSemanal;
    }

    public Double getCantExtraDiurnaSemanal() {
        return cantExtraDiurnaSemanal;
    }

    public void setCantExtraDiurnaSemanal(Double cantExtraDiurnaSemanal) {
        this.cantExtraDiurnaSemanal = cantExtraDiurnaSemanal;
    }

    public Double getVrExtraDiurnaSemanal() {
        return vrExtraDiurnaSemanal;
    }

    public void setVrExtraDiurnaSemanal(Double vrExtraDiurnaSemanal) {
        this.vrExtraDiurnaSemanal = vrExtraDiurnaSemanal;
    }

    public Double getTarifaNocturnaSemanal() {
        return tarifaNocturnaSemanal;
    }

    public void setTarifaNocturnaSemanal(Double tarifaNocturnaSemanal) {
        this.tarifaNocturnaSemanal = tarifaNocturnaSemanal;
    }

    public Double getCantNocturnaSemanal() {
        return cantNocturnaSemanal;
    }

    public void setCantNocturnaSemanal(Double cantNocturnaSemanal) {
        this.cantNocturnaSemanal = cantNocturnaSemanal;
    }

    public Double getVrNocturnaSemanal() {
        return vrNocturnaSemanal;
    }

    public void setVrNocturnaSemanal(Double vrNocturnaSemanal) {
        this.vrNocturnaSemanal = vrNocturnaSemanal;
    }

    public Double getTarifaExtraNocturnaSemanal() {
        return tarifaExtraNocturnaSemanal;
    }

    public void setTarifaExtraNocturnaSemanal(Double tarifaExtraNocturnaSemanal) {
        this.tarifaExtraNocturnaSemanal = tarifaExtraNocturnaSemanal;
    }

    public Double getCantExtraNocturnaSemanal() {
        return cantExtraNocturnaSemanal;
    }

    public void setCantExtraNocturnaSemanal(Double cantExtraNocturnaSemanal) {
        this.cantExtraNocturnaSemanal = cantExtraNocturnaSemanal;
    }

    public Double getVrExtraNocturnaSemanal() {
        return vrExtraNocturnaSemanal;
    }

    public void setVrExtraNocturnaSemanal(Double vrExtraNocturnaSemanal) {
        this.vrExtraNocturnaSemanal = vrExtraNocturnaSemanal;
    }

    public Double getTarifaDiurnaDominical() {
        return tarifaDiurnaDominical;
    }

    public void setTarifaDiurnaDominical(Double tarifaDiurnaDominical) {
        this.tarifaDiurnaDominical = tarifaDiurnaDominical;
    }

    public Double getCantDiurnaDominical() {
        return cantDiurnaDominical;
    }

    public void setCantDiurnaDominical(Double cantDiurnaDominical) {
        this.cantDiurnaDominical = cantDiurnaDominical;
    }

    public Double getVrDiurnaDominical() {
        return vrDiurnaDominical;
    }

    public void setVrDiurnaDominical(Double vrDiurnaDominical) {
        this.vrDiurnaDominical = vrDiurnaDominical;
    }

    public Double getTarifaExtraDiurnaDominical() {
        return tarifaExtraDiurnaDominical;
    }

    public void setTarifaExtraDiurnaDominical(Double tarifaExtraDiurnaDominical) {
        this.tarifaExtraDiurnaDominical = tarifaExtraDiurnaDominical;
    }

    public Double getCantExtraDiurnaDominical() {
        return cantExtraDiurnaDominical;
    }

    public void setCantExtraDiurnaDominical(Double cantExtraDiurnaDominical) {
        this.cantExtraDiurnaDominical = cantExtraDiurnaDominical;
    }

    public Double getVrExtraDiurnaDominical() {
        return vrExtraDiurnaDominical;
    }

    public void setVrExtraDiurnaDominical(Double vrExtraDiurnaDominical) {
        this.vrExtraDiurnaDominical = vrExtraDiurnaDominical;
    }

    public Double getTarifaNocturnaDominical() {
        return tarifaNocturnaDominical;
    }

    public void setTarifaNocturnaDominical(Double tarifaNocturnaDominical) {
        this.tarifaNocturnaDominical = tarifaNocturnaDominical;
    }

    public Double getCantNocturnaDominical() {
        return cantNocturnaDominical;
    }

    public void setCantNocturnaDominical(Double cantNocturnaDominical) {
        this.cantNocturnaDominical = cantNocturnaDominical;
    }

    public Double getVrNocturnaDominical() {
        return vrNocturnaDominical;
    }

    public void setVrNocturnaDominical(Double vrNocturnaDominical) {
        this.vrNocturnaDominical = vrNocturnaDominical;
    }

    public Double getTarifaExtraNocturnaDominical() {
        return tarifaExtraNocturnaDominical;
    }

    public void setTarifaExtraNocturnaDominical(Double tarifaExtraNocturnaDominical) {
        this.tarifaExtraNocturnaDominical = tarifaExtraNocturnaDominical;
    }

    public Double getCantExtraNocturnaDominical() {
        return cantExtraNocturnaDominical;
    }

    public void setCantExtraNocturnaDominical(Double cantExtraNocturnaDominical) {
        this.cantExtraNocturnaDominical = cantExtraNocturnaDominical;
    }

    public Double getVrExtraNocturnaDominical() {
        return vrExtraNocturnaDominical;
    }

    public void setVrExtraNocturnaDominical(Double vrExtraNocturnaDominical) {
        this.vrExtraNocturnaDominical = vrExtraNocturnaDominical;
    }

    public Double getVrTotalExtras() {
        return vrTotalExtras;
    }

    public void setVrTotalExtras(Double vrTotalExtras) {
        this.vrTotalExtras = vrTotalExtras;
    }

    public Integer getCancelado() {
        return cancelado;
    }

    public void setCancelado(Integer cancelado) {
        this.cancelado = cancelado;
    }

    public Integer getGuardado() {
        return guardado;
    }

    public void setGuardado(Integer guardado) {
        this.guardado = guardado;
    }

    public Double getTotalDevengado2() {
        return totalDevengado2;
    }

    public void setTotalDevengado2(Double totalDevengado2) {
        this.totalDevengado2 = totalDevengado2;
    }

    public Double getNetoPagado() {
        return netoPagado;
    }

    public void setNetoPagado(Double netoPagado) {
        this.netoPagado = netoPagado;
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
        if (!(object instanceof NuevanominaMovsalario)) {
            return false;
        }
        NuevanominaMovsalario other = (NuevanominaMovsalario) object;
        if ((this.indice == null && other.indice != null) || (this.indice != null && !this.indice.equals(other.indice))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.NuevanominaMovsalario[ indice=" + indice + " ]";
    }
    
}
