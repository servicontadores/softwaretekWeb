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
@Table(name = "nuevanomina_tipoempleado")
@NamedQueries({
    @NamedQuery(name = "NuevanominaTipoempleado.findAll", query = "SELECT n FROM NuevanominaTipoempleado n")})
public class NuevanominaTipoempleado implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "Id_TipoEmpleado", nullable = false)
    private Integer idTipoEmpleado;
    @Column(length = 45)
    private String tipoEmpleado;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(precision = 22)
    private Double pUCDBBasico;
    @Column(precision = 22)
    private Double pUCCDBasico;
    @Column(precision = 22)
    private Double pUCDBAuxilioTrans;
    @Column(precision = 22)
    private Double pUCCDAuxilioTrans;
    @Column(precision = 22)
    private Double pUCDBHorasExtras;
    @Column(precision = 22)
    private Double pUCCDHorasExtras;
    @Column(precision = 22)
    private Double pUCDBComisiones;
    @Column(precision = 22)
    private Double pUCCDComisiones;
    @Column(precision = 22)
    private Double pUCDBBonificaciones;
    @Column(precision = 22)
    private Double pUCCDBonificaciones;
    @Column(precision = 22)
    private Double pUCDBOtros;
    @Column(precision = 22)
    private Double pUCCDOtros;
    @Column(precision = 22)
    private Double pUCDBOtrasDeducciones;
    @Column(precision = 22)
    private Double pUCCDOtrasDeducciones;
    @Column(precision = 22)
    private Double pUCDBSalud;
    @Column(precision = 22)
    private Double pUCCDSalud;
    @Column(precision = 22)
    private Double pUCDBSaludEmpresa;
    @Column(precision = 22)
    private Double pUCCDSaludEmpresa;
    @Column(precision = 22)
    private Double pUCDBPension;
    @Column(precision = 22)
    private Double pUCCDPension;
    @Column(precision = 22)
    private Double pUCDBPensionEmpresa;
    @Column(precision = 22)
    private Double pUCCDPensionEmpresa;
    @Column(precision = 22)
    private Double pucdbccf;
    @Column(precision = 22)
    private Double puccdccf;
    @Column(precision = 22)
    private Double pucdbarl;
    @Column(precision = 22)
    private Double puccdarl;
    @Column(precision = 22)
    private Double pUCDBEntidad1;
    @Column(precision = 22)
    private Double pUCCDEntidad1;
    @Column(precision = 22)
    private Double pUCDBEntidad2;
    @Column(precision = 22)
    private Double pUCCDEntidad2;
    @Column(precision = 22)
    private Double pUCDBCesantias;
    @Column(precision = 22)
    private Double pUCCDCesantias;
    @Column(precision = 22)
    private Double pUCDBIntCesantias;
    @Column(precision = 22)
    private Double pUCCDIntCesantias;
    @Column(precision = 22)
    private Double pUCDBPrimas;
    @Column(precision = 22)
    private Double pUCCDPrimas;
    @Column(precision = 22)
    private Double pUCDBVacaciones;
    @Column(precision = 22)
    private Double pUCCDVacaciones;

    public NuevanominaTipoempleado() {
    }

    public NuevanominaTipoempleado(Integer idTipoEmpleado) {
        this.idTipoEmpleado = idTipoEmpleado;
    }

    public Integer getIdTipoEmpleado() {
        return idTipoEmpleado;
    }

    public void setIdTipoEmpleado(Integer idTipoEmpleado) {
        this.idTipoEmpleado = idTipoEmpleado;
    }

    public String getTipoEmpleado() {
        return tipoEmpleado;
    }

    public void setTipoEmpleado(String tipoEmpleado) {
        this.tipoEmpleado = tipoEmpleado;
    }

    public Double getPUCDBBasico() {
        return pUCDBBasico;
    }

    public void setPUCDBBasico(Double pUCDBBasico) {
        this.pUCDBBasico = pUCDBBasico;
    }

    public Double getPUCCDBasico() {
        return pUCCDBasico;
    }

    public void setPUCCDBasico(Double pUCCDBasico) {
        this.pUCCDBasico = pUCCDBasico;
    }

    public Double getPUCDBAuxilioTrans() {
        return pUCDBAuxilioTrans;
    }

    public void setPUCDBAuxilioTrans(Double pUCDBAuxilioTrans) {
        this.pUCDBAuxilioTrans = pUCDBAuxilioTrans;
    }

    public Double getPUCCDAuxilioTrans() {
        return pUCCDAuxilioTrans;
    }

    public void setPUCCDAuxilioTrans(Double pUCCDAuxilioTrans) {
        this.pUCCDAuxilioTrans = pUCCDAuxilioTrans;
    }

    public Double getPUCDBHorasExtras() {
        return pUCDBHorasExtras;
    }

    public void setPUCDBHorasExtras(Double pUCDBHorasExtras) {
        this.pUCDBHorasExtras = pUCDBHorasExtras;
    }

    public Double getPUCCDHorasExtras() {
        return pUCCDHorasExtras;
    }

    public void setPUCCDHorasExtras(Double pUCCDHorasExtras) {
        this.pUCCDHorasExtras = pUCCDHorasExtras;
    }

    public Double getPUCDBComisiones() {
        return pUCDBComisiones;
    }

    public void setPUCDBComisiones(Double pUCDBComisiones) {
        this.pUCDBComisiones = pUCDBComisiones;
    }

    public Double getPUCCDComisiones() {
        return pUCCDComisiones;
    }

    public void setPUCCDComisiones(Double pUCCDComisiones) {
        this.pUCCDComisiones = pUCCDComisiones;
    }

    public Double getPUCDBBonificaciones() {
        return pUCDBBonificaciones;
    }

    public void setPUCDBBonificaciones(Double pUCDBBonificaciones) {
        this.pUCDBBonificaciones = pUCDBBonificaciones;
    }

    public Double getPUCCDBonificaciones() {
        return pUCCDBonificaciones;
    }

    public void setPUCCDBonificaciones(Double pUCCDBonificaciones) {
        this.pUCCDBonificaciones = pUCCDBonificaciones;
    }

    public Double getPUCDBOtros() {
        return pUCDBOtros;
    }

    public void setPUCDBOtros(Double pUCDBOtros) {
        this.pUCDBOtros = pUCDBOtros;
    }

    public Double getPUCCDOtros() {
        return pUCCDOtros;
    }

    public void setPUCCDOtros(Double pUCCDOtros) {
        this.pUCCDOtros = pUCCDOtros;
    }

    public Double getPUCDBOtrasDeducciones() {
        return pUCDBOtrasDeducciones;
    }

    public void setPUCDBOtrasDeducciones(Double pUCDBOtrasDeducciones) {
        this.pUCDBOtrasDeducciones = pUCDBOtrasDeducciones;
    }

    public Double getPUCCDOtrasDeducciones() {
        return pUCCDOtrasDeducciones;
    }

    public void setPUCCDOtrasDeducciones(Double pUCCDOtrasDeducciones) {
        this.pUCCDOtrasDeducciones = pUCCDOtrasDeducciones;
    }

    public Double getPUCDBSalud() {
        return pUCDBSalud;
    }

    public void setPUCDBSalud(Double pUCDBSalud) {
        this.pUCDBSalud = pUCDBSalud;
    }

    public Double getPUCCDSalud() {
        return pUCCDSalud;
    }

    public void setPUCCDSalud(Double pUCCDSalud) {
        this.pUCCDSalud = pUCCDSalud;
    }

    public Double getPUCDBSaludEmpresa() {
        return pUCDBSaludEmpresa;
    }

    public void setPUCDBSaludEmpresa(Double pUCDBSaludEmpresa) {
        this.pUCDBSaludEmpresa = pUCDBSaludEmpresa;
    }

    public Double getPUCCDSaludEmpresa() {
        return pUCCDSaludEmpresa;
    }

    public void setPUCCDSaludEmpresa(Double pUCCDSaludEmpresa) {
        this.pUCCDSaludEmpresa = pUCCDSaludEmpresa;
    }

    public Double getPUCDBPension() {
        return pUCDBPension;
    }

    public void setPUCDBPension(Double pUCDBPension) {
        this.pUCDBPension = pUCDBPension;
    }

    public Double getPUCCDPension() {
        return pUCCDPension;
    }

    public void setPUCCDPension(Double pUCCDPension) {
        this.pUCCDPension = pUCCDPension;
    }

    public Double getPUCDBPensionEmpresa() {
        return pUCDBPensionEmpresa;
    }

    public void setPUCDBPensionEmpresa(Double pUCDBPensionEmpresa) {
        this.pUCDBPensionEmpresa = pUCDBPensionEmpresa;
    }

    public Double getPUCCDPensionEmpresa() {
        return pUCCDPensionEmpresa;
    }

    public void setPUCCDPensionEmpresa(Double pUCCDPensionEmpresa) {
        this.pUCCDPensionEmpresa = pUCCDPensionEmpresa;
    }

    public Double getPucdbccf() {
        return pucdbccf;
    }

    public void setPucdbccf(Double pucdbccf) {
        this.pucdbccf = pucdbccf;
    }

    public Double getPuccdccf() {
        return puccdccf;
    }

    public void setPuccdccf(Double puccdccf) {
        this.puccdccf = puccdccf;
    }

    public Double getPucdbarl() {
        return pucdbarl;
    }

    public void setPucdbarl(Double pucdbarl) {
        this.pucdbarl = pucdbarl;
    }

    public Double getPuccdarl() {
        return puccdarl;
    }

    public void setPuccdarl(Double puccdarl) {
        this.puccdarl = puccdarl;
    }

    public Double getPUCDBEntidad1() {
        return pUCDBEntidad1;
    }

    public void setPUCDBEntidad1(Double pUCDBEntidad1) {
        this.pUCDBEntidad1 = pUCDBEntidad1;
    }

    public Double getPUCCDEntidad1() {
        return pUCCDEntidad1;
    }

    public void setPUCCDEntidad1(Double pUCCDEntidad1) {
        this.pUCCDEntidad1 = pUCCDEntidad1;
    }

    public Double getPUCDBEntidad2() {
        return pUCDBEntidad2;
    }

    public void setPUCDBEntidad2(Double pUCDBEntidad2) {
        this.pUCDBEntidad2 = pUCDBEntidad2;
    }

    public Double getPUCCDEntidad2() {
        return pUCCDEntidad2;
    }

    public void setPUCCDEntidad2(Double pUCCDEntidad2) {
        this.pUCCDEntidad2 = pUCCDEntidad2;
    }

    public Double getPUCDBCesantias() {
        return pUCDBCesantias;
    }

    public void setPUCDBCesantias(Double pUCDBCesantias) {
        this.pUCDBCesantias = pUCDBCesantias;
    }

    public Double getPUCCDCesantias() {
        return pUCCDCesantias;
    }

    public void setPUCCDCesantias(Double pUCCDCesantias) {
        this.pUCCDCesantias = pUCCDCesantias;
    }

    public Double getPUCDBIntCesantias() {
        return pUCDBIntCesantias;
    }

    public void setPUCDBIntCesantias(Double pUCDBIntCesantias) {
        this.pUCDBIntCesantias = pUCDBIntCesantias;
    }

    public Double getPUCCDIntCesantias() {
        return pUCCDIntCesantias;
    }

    public void setPUCCDIntCesantias(Double pUCCDIntCesantias) {
        this.pUCCDIntCesantias = pUCCDIntCesantias;
    }

    public Double getPUCDBPrimas() {
        return pUCDBPrimas;
    }

    public void setPUCDBPrimas(Double pUCDBPrimas) {
        this.pUCDBPrimas = pUCDBPrimas;
    }

    public Double getPUCCDPrimas() {
        return pUCCDPrimas;
    }

    public void setPUCCDPrimas(Double pUCCDPrimas) {
        this.pUCCDPrimas = pUCCDPrimas;
    }

    public Double getPUCDBVacaciones() {
        return pUCDBVacaciones;
    }

    public void setPUCDBVacaciones(Double pUCDBVacaciones) {
        this.pUCDBVacaciones = pUCDBVacaciones;
    }

    public Double getPUCCDVacaciones() {
        return pUCCDVacaciones;
    }

    public void setPUCCDVacaciones(Double pUCCDVacaciones) {
        this.pUCCDVacaciones = pUCCDVacaciones;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idTipoEmpleado != null ? idTipoEmpleado.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof NuevanominaTipoempleado)) {
            return false;
        }
        NuevanominaTipoempleado other = (NuevanominaTipoempleado) object;
        if ((this.idTipoEmpleado == null && other.idTipoEmpleado != null) || (this.idTipoEmpleado != null && !this.idTipoEmpleado.equals(other.idTipoEmpleado))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.NuevanominaTipoempleado[ idTipoEmpleado=" + idTipoEmpleado + " ]";
    }
    
}
