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
    @NamedQuery(name = "Cxp.findAll", query = "SELECT c FROM Cxp c")})
public class Cxp implements Serializable {

    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @Column(nullable = false)
    private int cody;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(nullable = false)
    private Integer imp;
    private Integer noIngreso;
    @Column(length = 50)
    private String formaIngreso;
    @Column(length = 50)
    private String formaEgreso;
    @Column(length = 50)
    private String noCuentaBancaria;
    @Basic(optional = false)
    @Column(nullable = false)
    private int regedit;
    @Temporal(TemporalType.TIMESTAMP)
    private Date fecha;
    @Column(length = 3)
    private String fuente;
    private Integer noFactura;
    @Column(length = 45)
    private String conceptoCartera;
    @Column(length = 50)
    private String formaPago;
    @Basic(optional = false)
    @Column(nullable = false)
    private int plazo;
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaPago;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(precision = 22)
    private Double vrTotal;
    @Basic(optional = false)
    @Column(nullable = false)
    private double vrIntereses;
    @Column(precision = 22)
    private Double vrAbono;
    @Column(precision = 22)
    private Double intereses;
    @Column(precision = 22)
    private Double vrDescuento;
    @Column(precision = 22)
    private Double vrReteFuente;
    @Column(precision = 22)
    private Double total;
    @Column(precision = 22)
    private Double vrDevolucion;
    @Basic(optional = false)
    @Column(nullable = false)
    private double vrReteiva;
    @Column(precision = 22)
    private Double vrReteica;
    @Column(precision = 22)
    private Double dBSaldo;
    private Integer interfaz;
    private Integer codigoConcepto;
    private Integer codigoFormaPago;
    @Column(length = 100)
    private String detal;
    private Integer tipoMovimiento;
    @Basic(optional = false)
    @Column(nullable = false)
    private double pcree;
    @Basic(optional = false)
    @Column(nullable = false)
    private double cree;
    private Integer rubro;
    private Integer cancelado;
    @Basic(optional = false)
    @Column(name = "ODBCFIX_FLDAUTO", nullable = false)
    private int odbcfixFldauto;
    @Column(length = 10)
    private String prefijo;
    @Column(precision = 22)
    private Double regeditDocIntereses;
    @Column(precision = 22)
    private Double vrAnticipo;
    @Column(precision = 22)
    private Double vrCruce;
    @JoinColumn(name = "CodigoConceptoCartera", referencedColumnName = "Codigo", nullable = false)
    @ManyToOne(optional = false)
    private Conceptoscarteracxp codigoConceptoCartera;
    @JoinColumn(name = "NIT", referencedColumnName = "Codigo", nullable = false)
    @ManyToOne(optional = false)
    private Nit nit;
    @JoinColumn(name = "CodigoNotaDebito", referencedColumnName = "Codigo")
    @ManyToOne
    private Codigonotadebproveedor codigoNotaDebito;
    @JoinColumn(name = "CDC", referencedColumnName = "Codigo")
    @ManyToOne
    private Cdc cdc;
    @JoinColumn(name = "CodigoSucursal", referencedColumnName = "Codigo")
    @ManyToOne
    private Sucursales codigoSucursal;
    @JoinColumn(name = "CodigoUsuario", referencedColumnName = "Codigo")
    @ManyToOne
    private User codigoUsuario;

    public Cxp() {
    }

    public Cxp(Integer imp) {
        this.imp = imp;
    }

    public Cxp(Integer imp, int cody, int regedit, int plazo, double vrIntereses, double vrReteiva, double pcree, double cree, int odbcfixFldauto) {
        this.imp = imp;
        this.cody = cody;
        this.regedit = regedit;
        this.plazo = plazo;
        this.vrIntereses = vrIntereses;
        this.vrReteiva = vrReteiva;
        this.pcree = pcree;
        this.cree = cree;
        this.odbcfixFldauto = odbcfixFldauto;
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

    public String getFormaEgreso() {
        return formaEgreso;
    }

    public void setFormaEgreso(String formaEgreso) {
        this.formaEgreso = formaEgreso;
    }

    public String getNoCuentaBancaria() {
        return noCuentaBancaria;
    }

    public void setNoCuentaBancaria(String noCuentaBancaria) {
        this.noCuentaBancaria = noCuentaBancaria;
    }

    public int getRegedit() {
        return regedit;
    }

    public void setRegedit(int regedit) {
        this.regedit = regedit;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getFuente() {
        return fuente;
    }

    public void setFuente(String fuente) {
        this.fuente = fuente;
    }

    public Integer getNoFactura() {
        return noFactura;
    }

    public void setNoFactura(Integer noFactura) {
        this.noFactura = noFactura;
    }

    public String getConceptoCartera() {
        return conceptoCartera;
    }

    public void setConceptoCartera(String conceptoCartera) {
        this.conceptoCartera = conceptoCartera;
    }

    public String getFormaPago() {
        return formaPago;
    }

    public void setFormaPago(String formaPago) {
        this.formaPago = formaPago;
    }

    public int getPlazo() {
        return plazo;
    }

    public void setPlazo(int plazo) {
        this.plazo = plazo;
    }

    public Date getFechaPago() {
        return fechaPago;
    }

    public void setFechaPago(Date fechaPago) {
        this.fechaPago = fechaPago;
    }

    public Double getVrTotal() {
        return vrTotal;
    }

    public void setVrTotal(Double vrTotal) {
        this.vrTotal = vrTotal;
    }

    public double getVrIntereses() {
        return vrIntereses;
    }

    public void setVrIntereses(double vrIntereses) {
        this.vrIntereses = vrIntereses;
    }

    public Double getVrAbono() {
        return vrAbono;
    }

    public void setVrAbono(Double vrAbono) {
        this.vrAbono = vrAbono;
    }

    public Double getIntereses() {
        return intereses;
    }

    public void setIntereses(Double intereses) {
        this.intereses = intereses;
    }

    public Double getVrDescuento() {
        return vrDescuento;
    }

    public void setVrDescuento(Double vrDescuento) {
        this.vrDescuento = vrDescuento;
    }

    public Double getVrReteFuente() {
        return vrReteFuente;
    }

    public void setVrReteFuente(Double vrReteFuente) {
        this.vrReteFuente = vrReteFuente;
    }

    public Double getTotal() {
        return total;
    }

    public void setTotal(Double total) {
        this.total = total;
    }

    public Double getVrDevolucion() {
        return vrDevolucion;
    }

    public void setVrDevolucion(Double vrDevolucion) {
        this.vrDevolucion = vrDevolucion;
    }

    public double getVrReteiva() {
        return vrReteiva;
    }

    public void setVrReteiva(double vrReteiva) {
        this.vrReteiva = vrReteiva;
    }

    public Double getVrReteica() {
        return vrReteica;
    }

    public void setVrReteica(Double vrReteica) {
        this.vrReteica = vrReteica;
    }

    public Double getDBSaldo() {
        return dBSaldo;
    }

    public void setDBSaldo(Double dBSaldo) {
        this.dBSaldo = dBSaldo;
    }

    public Integer getInterfaz() {
        return interfaz;
    }

    public void setInterfaz(Integer interfaz) {
        this.interfaz = interfaz;
    }

    public Integer getCodigoConcepto() {
        return codigoConcepto;
    }

    public void setCodigoConcepto(Integer codigoConcepto) {
        this.codigoConcepto = codigoConcepto;
    }

    public Integer getCodigoFormaPago() {
        return codigoFormaPago;
    }

    public void setCodigoFormaPago(Integer codigoFormaPago) {
        this.codigoFormaPago = codigoFormaPago;
    }

    public String getDetal() {
        return detal;
    }

    public void setDetal(String detal) {
        this.detal = detal;
    }

    public Integer getTipoMovimiento() {
        return tipoMovimiento;
    }

    public void setTipoMovimiento(Integer tipoMovimiento) {
        this.tipoMovimiento = tipoMovimiento;
    }

    public double getPcree() {
        return pcree;
    }

    public void setPcree(double pcree) {
        this.pcree = pcree;
    }

    public double getCree() {
        return cree;
    }

    public void setCree(double cree) {
        this.cree = cree;
    }

    public Integer getRubro() {
        return rubro;
    }

    public void setRubro(Integer rubro) {
        this.rubro = rubro;
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

    public String getPrefijo() {
        return prefijo;
    }

    public void setPrefijo(String prefijo) {
        this.prefijo = prefijo;
    }

    public Double getRegeditDocIntereses() {
        return regeditDocIntereses;
    }

    public void setRegeditDocIntereses(Double regeditDocIntereses) {
        this.regeditDocIntereses = regeditDocIntereses;
    }

    public Double getVrAnticipo() {
        return vrAnticipo;
    }

    public void setVrAnticipo(Double vrAnticipo) {
        this.vrAnticipo = vrAnticipo;
    }

    public Double getVrCruce() {
        return vrCruce;
    }

    public void setVrCruce(Double vrCruce) {
        this.vrCruce = vrCruce;
    }

    public Conceptoscarteracxp getCodigoConceptoCartera() {
        return codigoConceptoCartera;
    }

    public void setCodigoConceptoCartera(Conceptoscarteracxp codigoConceptoCartera) {
        this.codigoConceptoCartera = codigoConceptoCartera;
    }

    public Nit getNit() {
        return nit;
    }

    public void setNit(Nit nit) {
        this.nit = nit;
    }

    public Codigonotadebproveedor getCodigoNotaDebito() {
        return codigoNotaDebito;
    }

    public void setCodigoNotaDebito(Codigonotadebproveedor codigoNotaDebito) {
        this.codigoNotaDebito = codigoNotaDebito;
    }

    public Cdc getCdc() {
        return cdc;
    }

    public void setCdc(Cdc cdc) {
        this.cdc = cdc;
    }

    public Sucursales getCodigoSucursal() {
        return codigoSucursal;
    }

    public void setCodigoSucursal(Sucursales codigoSucursal) {
        this.codigoSucursal = codigoSucursal;
    }

    public User getCodigoUsuario() {
        return codigoUsuario;
    }

    public void setCodigoUsuario(User codigoUsuario) {
        this.codigoUsuario = codigoUsuario;
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
        if (!(object instanceof Cxp)) {
            return false;
        }
        Cxp other = (Cxp) object;
        if ((this.imp == null && other.imp != null) || (this.imp != null && !this.imp.equals(other.imp))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.Cxp[ imp=" + imp + " ]";
    }
    
}
