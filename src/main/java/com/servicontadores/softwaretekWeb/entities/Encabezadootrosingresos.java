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
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author yesidherrera
 */
@Entity
@NamedQueries({
    @NamedQuery(name = "Encabezadootrosingresos.findAll", query = "SELECT e FROM Encabezadootrosingresos e")})
public class Encabezadootrosingresos implements Serializable {

    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @Column(nullable = false)
    private int cody;
    @Id
    @Basic(optional = false)
    @Column(nullable = false)
    private Integer regedit;
    @Temporal(TemporalType.TIMESTAMP)
    private Date fecha;
    private Integer noIngreso;
    @Column(length = 50)
    private String formaIngreso;
    @Column(length = 50)
    private String cuentaMovimiento;
    @Column(length = 90)
    private String observacion;
    @Column(length = 50)
    private String conceptoIngreso;
    private Integer cancelado;
    @Basic(optional = false)
    @Column(name = "ODBCFIX_FLDAUTO", nullable = false)
    private int odbcfixFldauto;
    @Column(length = 15)
    private String noCheque;
    @Basic(optional = false)
    @Column(name = "NoDoc_Auto", nullable = false)
    private boolean noDocAuto;
    private Integer guardado;
    @JoinColumn(name = "CodigoUsuario", referencedColumnName = "Codigo")
    @ManyToOne
    private User codigoUsuario;
    @JoinColumn(name = "CDC", referencedColumnName = "Codigo", nullable = false)
    @ManyToOne(optional = false)
    private Cdc cdc;
    @JoinColumn(name = "CodigoConcepto", referencedColumnName = "Codigo")
    @ManyToOne
    private Conceptosproductos codigoConcepto;
    @JoinColumn(name = "CodigoFormaPago", referencedColumnName = "Codigo")
    @ManyToOne
    private Formaspago codigoFormaPago;
    @JoinColumn(name = "NoCuentaOCheque", referencedColumnName = "NoCuenta")
    @ManyToOne
    private Cuentasbancarias noCuentaOCheque;
    @JoinColumn(name = "CodigoSucursal", referencedColumnName = "Codigo")
    @ManyToOne
    private Sucursales codigoSucursal;
    @JoinColumn(name = "NIT", referencedColumnName = "Codigo")
    @ManyToOne
    private Nit nit;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "imp")
    private List<Otrosingresos> otrosingresosList;

    public Encabezadootrosingresos() {
    }

    public Encabezadootrosingresos(Integer regedit) {
        this.regedit = regedit;
    }

    public Encabezadootrosingresos(Integer regedit, int cody, int odbcfixFldauto, boolean noDocAuto) {
        this.regedit = regedit;
        this.cody = cody;
        this.odbcfixFldauto = odbcfixFldauto;
        this.noDocAuto = noDocAuto;
    }

    public int getCody() {
        return cody;
    }

    public void setCody(int cody) {
        this.cody = cody;
    }

    public Integer getRegedit() {
        return regedit;
    }

    public void setRegedit(Integer regedit) {
        this.regedit = regedit;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Integer getNoIngreso() {
        return noIngreso;
    }

    public void setNoIngreso(Integer noIngreso) {
        this.noIngreso = noIngreso;
    }

    public String getFormaIngreso() {
        return formaIngreso;
    }

    public void setFormaIngreso(String formaIngreso) {
        this.formaIngreso = formaIngreso;
    }

    public String getCuentaMovimiento() {
        return cuentaMovimiento;
    }

    public void setCuentaMovimiento(String cuentaMovimiento) {
        this.cuentaMovimiento = cuentaMovimiento;
    }

    public String getObservacion() {
        return observacion;
    }

    public void setObservacion(String observacion) {
        this.observacion = observacion;
    }

    public String getConceptoIngreso() {
        return conceptoIngreso;
    }

    public void setConceptoIngreso(String conceptoIngreso) {
        this.conceptoIngreso = conceptoIngreso;
    }

    public Integer getCancelado() {
        return cancelado;
    }

    public void setCancelado(Integer cancelado) {
        this.cancelado = cancelado;
    }

    public int getOdbcfixFldauto() {
        return odbcfixFldauto;
    }

    public void setOdbcfixFldauto(int odbcfixFldauto) {
        this.odbcfixFldauto = odbcfixFldauto;
    }

    public String getNoCheque() {
        return noCheque;
    }

    public void setNoCheque(String noCheque) {
        this.noCheque = noCheque;
    }

    public boolean getNoDocAuto() {
        return noDocAuto;
    }

    public void setNoDocAuto(boolean noDocAuto) {
        this.noDocAuto = noDocAuto;
    }

    public Integer getGuardado() {
        return guardado;
    }

    public void setGuardado(Integer guardado) {
        this.guardado = guardado;
    }

    public User getCodigoUsuario() {
        return codigoUsuario;
    }

    public void setCodigoUsuario(User codigoUsuario) {
        this.codigoUsuario = codigoUsuario;
    }

    public Cdc getCdc() {
        return cdc;
    }

    public void setCdc(Cdc cdc) {
        this.cdc = cdc;
    }

    public Conceptosproductos getCodigoConcepto() {
        return codigoConcepto;
    }

    public void setCodigoConcepto(Conceptosproductos codigoConcepto) {
        this.codigoConcepto = codigoConcepto;
    }

    public Formaspago getCodigoFormaPago() {
        return codigoFormaPago;
    }

    public void setCodigoFormaPago(Formaspago codigoFormaPago) {
        this.codigoFormaPago = codigoFormaPago;
    }

    public Cuentasbancarias getNoCuentaOCheque() {
        return noCuentaOCheque;
    }

    public void setNoCuentaOCheque(Cuentasbancarias noCuentaOCheque) {
        this.noCuentaOCheque = noCuentaOCheque;
    }

    public Sucursales getCodigoSucursal() {
        return codigoSucursal;
    }

    public void setCodigoSucursal(Sucursales codigoSucursal) {
        this.codigoSucursal = codigoSucursal;
    }

    public Nit getNit() {
        return nit;
    }

    public void setNit(Nit nit) {
        this.nit = nit;
    }

    public List<Otrosingresos> getOtrosingresosList() {
        return otrosingresosList;
    }

    public void setOtrosingresosList(List<Otrosingresos> otrosingresosList) {
        this.otrosingresosList = otrosingresosList;
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
        if (!(object instanceof Encabezadootrosingresos)) {
            return false;
        }
        Encabezadootrosingresos other = (Encabezadootrosingresos) object;
        if ((this.regedit == null && other.regedit != null) || (this.regedit != null && !this.regedit.equals(other.regedit))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.Encabezadootrosingresos[ regedit=" + regedit + " ]";
    }
    
}
