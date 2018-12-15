/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.servicontadores.softwaretekWeb.entities;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
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
@Table(name = "nuevanomina_empleados")
@NamedQueries({
    @NamedQuery(name = "NuevanominaEmpleados.findAll", query = "SELECT n FROM NuevanominaEmpleados n")})
public class NuevanominaEmpleados implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected NuevanominaEmpleadosPK nuevanominaEmpleadosPK;
    @Column(name = "Id_TipoEmpleado")
    private Integer idTipoEmpleado;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(precision = 22)
    private Double auxilioTransporte;
    @Column(precision = 22)
    private Double sueldoBasicoActual;
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaIngreso;
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaNacimiento;
    @Column(length = 45)
    private String estadoCivil;
    @Column(length = 45)
    private String estado;
    private Boolean habilitado;
    @Column(precision = 22)
    private Double nITSalud;
    @Column(precision = 22)
    private Double iBCSalud;
    @Column(precision = 22)
    private Double tarifaSalud;
    @Column(precision = 22)
    private Double nITSaludEmpresa;
    @Column(precision = 22)
    private Double iBCSaludEmpresa;
    @Column(precision = 22)
    private Double tarifaSaludEmpresa;
    @Column(precision = 22)
    private Double nITPension;
    @Column(precision = 22)
    private Double iBCPension;
    @Column(precision = 22)
    private Double tarifaPension;
    @Column(precision = 22)
    private Double nITPensionEmpresa;
    @Column(precision = 22)
    private Double iBCPensionEmpresa;
    @Column(precision = 22)
    private Double tarifaPensionEmpresa;
    @Column(precision = 22)
    private Double nitccf;
    @Column(precision = 22)
    private Double ibcccf;
    @Column(precision = 22)
    private Double tarifaCCF;
    @Column(precision = 22)
    private Double nitarl;
    @Column(precision = 22)
    private Double ibcarl;
    @Column(precision = 22)
    private Double tarifaARL;
    @Column(precision = 22)
    private Double nITEntidad1;
    @Column(precision = 22)
    private Double iBCEntidad1;
    @Column(precision = 22)
    private Double tarifaEntidad1;
    @Column(precision = 22)
    private Double nITEntidad2;
    @Column(precision = 22)
    private Double iBCEntidad2;
    @Column(precision = 22)
    private Double tarifaEntidad2;
    @Column(precision = 22)
    private Double iBCCesantias;
    @Column(precision = 22)
    private Double tarifaCesantias;
    @Column(precision = 22)
    private Double iBCIntCesantias;
    @Column(precision = 22)
    private Double tarifaIntCesantias;
    @Column(precision = 22)
    private Double iBCPrima;
    @Column(precision = 22)
    private Double tarifaPrima;
    @Column(precision = 22)
    private Double iBCVacaciones;
    @Column(precision = 22)
    private Double tarifaVacaciones;

    public NuevanominaEmpleados() {
    }

    public NuevanominaEmpleados(NuevanominaEmpleadosPK nuevanominaEmpleadosPK) {
        this.nuevanominaEmpleadosPK = nuevanominaEmpleadosPK;
    }

    public NuevanominaEmpleados(int idEmpleado, String nit) {
        this.nuevanominaEmpleadosPK = new NuevanominaEmpleadosPK(idEmpleado, nit);
    }

    public NuevanominaEmpleadosPK getNuevanominaEmpleadosPK() {
        return nuevanominaEmpleadosPK;
    }

    public void setNuevanominaEmpleadosPK(NuevanominaEmpleadosPK nuevanominaEmpleadosPK) {
        this.nuevanominaEmpleadosPK = nuevanominaEmpleadosPK;
    }

    public Integer getIdTipoEmpleado() {
        return idTipoEmpleado;
    }

    public void setIdTipoEmpleado(Integer idTipoEmpleado) {
        this.idTipoEmpleado = idTipoEmpleado;
    }

    public Double getAuxilioTransporte() {
        return auxilioTransporte;
    }

    public void setAuxilioTransporte(Double auxilioTransporte) {
        this.auxilioTransporte = auxilioTransporte;
    }

    public Double getSueldoBasicoActual() {
        return sueldoBasicoActual;
    }

    public void setSueldoBasicoActual(Double sueldoBasicoActual) {
        this.sueldoBasicoActual = sueldoBasicoActual;
    }

    public Date getFechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaIngreso(Date fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getEstadoCivil() {
        return estadoCivil;
    }

    public void setEstadoCivil(String estadoCivil) {
        this.estadoCivil = estadoCivil;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public Boolean getHabilitado() {
        return habilitado;
    }

    public void setHabilitado(Boolean habilitado) {
        this.habilitado = habilitado;
    }

    public Double getNITSalud() {
        return nITSalud;
    }

    public void setNITSalud(Double nITSalud) {
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

    public Double getNITSaludEmpresa() {
        return nITSaludEmpresa;
    }

    public void setNITSaludEmpresa(Double nITSaludEmpresa) {
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

    public Double getNITPension() {
        return nITPension;
    }

    public void setNITPension(Double nITPension) {
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

    public Double getNITPensionEmpresa() {
        return nITPensionEmpresa;
    }

    public void setNITPensionEmpresa(Double nITPensionEmpresa) {
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

    public Double getNitccf() {
        return nitccf;
    }

    public void setNitccf(Double nitccf) {
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

    public Double getNitarl() {
        return nitarl;
    }

    public void setNitarl(Double nitarl) {
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

    public Double getNITEntidad1() {
        return nITEntidad1;
    }

    public void setNITEntidad1(Double nITEntidad1) {
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

    public Double getNITEntidad2() {
        return nITEntidad2;
    }

    public void setNITEntidad2(Double nITEntidad2) {
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

    public Double getIBCPrima() {
        return iBCPrima;
    }

    public void setIBCPrima(Double iBCPrima) {
        this.iBCPrima = iBCPrima;
    }

    public Double getTarifaPrima() {
        return tarifaPrima;
    }

    public void setTarifaPrima(Double tarifaPrima) {
        this.tarifaPrima = tarifaPrima;
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

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (nuevanominaEmpleadosPK != null ? nuevanominaEmpleadosPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof NuevanominaEmpleados)) {
            return false;
        }
        NuevanominaEmpleados other = (NuevanominaEmpleados) object;
        if ((this.nuevanominaEmpleadosPK == null && other.nuevanominaEmpleadosPK != null) || (this.nuevanominaEmpleadosPK != null && !this.nuevanominaEmpleadosPK.equals(other.nuevanominaEmpleadosPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.NuevanominaEmpleados[ nuevanominaEmpleadosPK=" + nuevanominaEmpleadosPK + " ]";
    }
    
}
