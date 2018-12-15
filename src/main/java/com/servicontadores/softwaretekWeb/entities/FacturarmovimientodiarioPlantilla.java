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
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author yesidherrera
 */
@Entity
@Table(name = "facturarmovimientodiario_plantilla")
@NamedQueries({
    @NamedQuery(name = "FacturarmovimientodiarioPlantilla.findAll", query = "SELECT f FROM FacturarmovimientodiarioPlantilla f")})
public class FacturarmovimientodiarioPlantilla implements Serializable {

    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @Column(nullable = false)
    private int cody;
    @Id
    @Basic(optional = false)
    @Column(nullable = false)
    private Integer regedit;
    private Integer noDocumento;
    @Temporal(TemporalType.TIMESTAMP)
    private Date fecha;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(precision = 7, scale = 2)
    private Double reteF;
    @Column(precision = 22)
    private Double retei;
    @Column(length = 50)
    private String codigoVendedor;
    private Integer noPedido;
    @Column(length = 50)
    private String cuentaMovimiento;
    @Column(length = 50)
    private String cuentaMovimiento2;
    private Integer plazo;
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaPago;
    private Integer cancelado;
    private Integer guardado;
    @Column(length = 100)
    private String detal;
    @Column(length = 50)
    private String formaPago1;
    @Column(length = 50)
    private String noCuentaOCheque1;
    private Integer valor1;
    @Column(length = 50)
    private String formaPago2;
    @Column(length = 50)
    private String noCuentaOCheque2;
    private Integer valor2;
    @Column(precision = 22)
    private Double porcentajeFinanciacion;
    private Integer vrFinanciacion;
    private Integer noCuotas;
    private Integer vrCuotas;
    private Integer noFacturaDevolucion;
    private Integer noFacturaDevolucion2;
    private Integer efectivo;
    private Integer cambio;
    private Integer base;
    private Integer iva;
    private Integer reteFuente;
    private Integer reteiva;
    private Integer total;
    private Integer totalCredito;
    private Integer costoBruto;
    private Integer vrBruto;
    private Integer vrDescuento;
    @Column(precision = 22)
    private Double reteICA;
    @Column(precision = 22)
    private Double reteIK;
    private Integer codigoFormaPago;
    private Integer pc;
    @Basic(optional = false)
    @Column(name = "ODBCFIX_FLDAUTO", nullable = false)
    private int odbcfixFldauto;
    @Basic(optional = false)
    @Column(nullable = false)
    private double pcree;
    @Basic(optional = false)
    @Column(nullable = false)
    private double cree;
    @Basic(optional = false)
    @Column(nullable = false)
    private int indiceCostos;
    @Column(length = 50)
    private String nit2;
    @Column(precision = 22)
    private Double impoConsumo;
    @Column(precision = 22)
    private Double vrImpoConsumo;
    @Basic(optional = false)
    @Column(name = "NoDoc_Auto", nullable = false)
    private short noDocAuto;
    @Basic(optional = false)
    @Column(nullable = false)
    private short mercanciaEntregada;
    @Basic(optional = false)
    @Column(nullable = false)
    private int regeditDocRef;
    @JoinColumn(name = "CDC", referencedColumnName = "Codigo", nullable = false)
    @ManyToOne(optional = false)
    private Cdc cdc;
    @JoinColumn(name = "CodigoConcepto", referencedColumnName = "Codigo", nullable = false)
    @ManyToOne(optional = false)
    private Conceptosproductos codigoConcepto;
    @JoinColumn(name = "NIT", referencedColumnName = "Codigo", nullable = false)
    @ManyToOne(optional = false)
    private Nit nit;
    @JoinColumn(name = "CodigoSucursal", referencedColumnName = "Codigo", nullable = false)
    @ManyToOne(optional = false)
    private Sucursales codigoSucursal;
    @JoinColumn(name = "CodigoUsuario", referencedColumnName = "Codigo", nullable = false)
    @ManyToOne(optional = false)
    private User codigoUsuario;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "impP")
    private List<InventariodiarioPlantilla> inventariodiarioPlantillaList;

    public FacturarmovimientodiarioPlantilla() {
    }

    public FacturarmovimientodiarioPlantilla(Integer regedit) {
        this.regedit = regedit;
    }

    public FacturarmovimientodiarioPlantilla(Integer regedit, int cody, int odbcfixFldauto, double pcree, double cree, int indiceCostos, short noDocAuto, short mercanciaEntregada, int regeditDocRef) {
        this.regedit = regedit;
        this.cody = cody;
        this.odbcfixFldauto = odbcfixFldauto;
        this.pcree = pcree;
        this.cree = cree;
        this.indiceCostos = indiceCostos;
        this.noDocAuto = noDocAuto;
        this.mercanciaEntregada = mercanciaEntregada;
        this.regeditDocRef = regeditDocRef;
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

    public Integer getNoDocumento() {
        return noDocumento;
    }

    public void setNoDocumento(Integer noDocumento) {
        this.noDocumento = noDocumento;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Double getReteF() {
        return reteF;
    }

    public void setReteF(Double reteF) {
        this.reteF = reteF;
    }

    public Double getRetei() {
        return retei;
    }

    public void setRetei(Double retei) {
        this.retei = retei;
    }

    public String getCodigoVendedor() {
        return codigoVendedor;
    }

    public void setCodigoVendedor(String codigoVendedor) {
        this.codigoVendedor = codigoVendedor;
    }

    public Integer getNoPedido() {
        return noPedido;
    }

    public void setNoPedido(Integer noPedido) {
        this.noPedido = noPedido;
    }

    public String getCuentaMovimiento() {
        return cuentaMovimiento;
    }

    public void setCuentaMovimiento(String cuentaMovimiento) {
        this.cuentaMovimiento = cuentaMovimiento;
    }

    public String getCuentaMovimiento2() {
        return cuentaMovimiento2;
    }

    public void setCuentaMovimiento2(String cuentaMovimiento2) {
        this.cuentaMovimiento2 = cuentaMovimiento2;
    }

    public Integer getPlazo() {
        return plazo;
    }

    public void setPlazo(Integer plazo) {
        this.plazo = plazo;
    }

    public Date getFechaPago() {
        return fechaPago;
    }

    public void setFechaPago(Date fechaPago) {
        this.fechaPago = fechaPago;
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

    public String getDetal() {
        return detal;
    }

    public void setDetal(String detal) {
        this.detal = detal;
    }

    public String getFormaPago1() {
        return formaPago1;
    }

    public void setFormaPago1(String formaPago1) {
        this.formaPago1 = formaPago1;
    }

    public String getNoCuentaOCheque1() {
        return noCuentaOCheque1;
    }

    public void setNoCuentaOCheque1(String noCuentaOCheque1) {
        this.noCuentaOCheque1 = noCuentaOCheque1;
    }

    public Integer getValor1() {
        return valor1;
    }

    public void setValor1(Integer valor1) {
        this.valor1 = valor1;
    }

    public String getFormaPago2() {
        return formaPago2;
    }

    public void setFormaPago2(String formaPago2) {
        this.formaPago2 = formaPago2;
    }

    public String getNoCuentaOCheque2() {
        return noCuentaOCheque2;
    }

    public void setNoCuentaOCheque2(String noCuentaOCheque2) {
        this.noCuentaOCheque2 = noCuentaOCheque2;
    }

    public Integer getValor2() {
        return valor2;
    }

    public void setValor2(Integer valor2) {
        this.valor2 = valor2;
    }

    public Double getPorcentajeFinanciacion() {
        return porcentajeFinanciacion;
    }

    public void setPorcentajeFinanciacion(Double porcentajeFinanciacion) {
        this.porcentajeFinanciacion = porcentajeFinanciacion;
    }

    public Integer getVrFinanciacion() {
        return vrFinanciacion;
    }

    public void setVrFinanciacion(Integer vrFinanciacion) {
        this.vrFinanciacion = vrFinanciacion;
    }

    public Integer getNoCuotas() {
        return noCuotas;
    }

    public void setNoCuotas(Integer noCuotas) {
        this.noCuotas = noCuotas;
    }

    public Integer getVrCuotas() {
        return vrCuotas;
    }

    public void setVrCuotas(Integer vrCuotas) {
        this.vrCuotas = vrCuotas;
    }

    public Integer getNoFacturaDevolucion() {
        return noFacturaDevolucion;
    }

    public void setNoFacturaDevolucion(Integer noFacturaDevolucion) {
        this.noFacturaDevolucion = noFacturaDevolucion;
    }

    public Integer getNoFacturaDevolucion2() {
        return noFacturaDevolucion2;
    }

    public void setNoFacturaDevolucion2(Integer noFacturaDevolucion2) {
        this.noFacturaDevolucion2 = noFacturaDevolucion2;
    }

    public Integer getEfectivo() {
        return efectivo;
    }

    public void setEfectivo(Integer efectivo) {
        this.efectivo = efectivo;
    }

    public Integer getCambio() {
        return cambio;
    }

    public void setCambio(Integer cambio) {
        this.cambio = cambio;
    }

    public Integer getBase() {
        return base;
    }

    public void setBase(Integer base) {
        this.base = base;
    }

    public Integer getIva() {
        return iva;
    }

    public void setIva(Integer iva) {
        this.iva = iva;
    }

    public Integer getReteFuente() {
        return reteFuente;
    }

    public void setReteFuente(Integer reteFuente) {
        this.reteFuente = reteFuente;
    }

    public Integer getReteiva() {
        return reteiva;
    }

    public void setReteiva(Integer reteiva) {
        this.reteiva = reteiva;
    }

    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    public Integer getTotalCredito() {
        return totalCredito;
    }

    public void setTotalCredito(Integer totalCredito) {
        this.totalCredito = totalCredito;
    }

    public Integer getCostoBruto() {
        return costoBruto;
    }

    public void setCostoBruto(Integer costoBruto) {
        this.costoBruto = costoBruto;
    }

    public Integer getVrBruto() {
        return vrBruto;
    }

    public void setVrBruto(Integer vrBruto) {
        this.vrBruto = vrBruto;
    }

    public Integer getVrDescuento() {
        return vrDescuento;
    }

    public void setVrDescuento(Integer vrDescuento) {
        this.vrDescuento = vrDescuento;
    }

    public Double getReteICA() {
        return reteICA;
    }

    public void setReteICA(Double reteICA) {
        this.reteICA = reteICA;
    }

    public Double getReteIK() {
        return reteIK;
    }

    public void setReteIK(Double reteIK) {
        this.reteIK = reteIK;
    }

    public Integer getCodigoFormaPago() {
        return codigoFormaPago;
    }

    public void setCodigoFormaPago(Integer codigoFormaPago) {
        this.codigoFormaPago = codigoFormaPago;
    }

    public Integer getPc() {
        return pc;
    }

    public void setPc(Integer pc) {
        this.pc = pc;
    }

    public int getOdbcfixFldauto() {
        return odbcfixFldauto;
    }

    public void setOdbcfixFldauto(int odbcfixFldauto) {
        this.odbcfixFldauto = odbcfixFldauto;
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

    public int getIndiceCostos() {
        return indiceCostos;
    }

    public void setIndiceCostos(int indiceCostos) {
        this.indiceCostos = indiceCostos;
    }

    public String getNit2() {
        return nit2;
    }

    public void setNit2(String nit2) {
        this.nit2 = nit2;
    }

    public Double getImpoConsumo() {
        return impoConsumo;
    }

    public void setImpoConsumo(Double impoConsumo) {
        this.impoConsumo = impoConsumo;
    }

    public Double getVrImpoConsumo() {
        return vrImpoConsumo;
    }

    public void setVrImpoConsumo(Double vrImpoConsumo) {
        this.vrImpoConsumo = vrImpoConsumo;
    }

    public short getNoDocAuto() {
        return noDocAuto;
    }

    public void setNoDocAuto(short noDocAuto) {
        this.noDocAuto = noDocAuto;
    }

    public short getMercanciaEntregada() {
        return mercanciaEntregada;
    }

    public void setMercanciaEntregada(short mercanciaEntregada) {
        this.mercanciaEntregada = mercanciaEntregada;
    }

    public int getRegeditDocRef() {
        return regeditDocRef;
    }

    public void setRegeditDocRef(int regeditDocRef) {
        this.regeditDocRef = regeditDocRef;
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

    public Nit getNit() {
        return nit;
    }

    public void setNit(Nit nit) {
        this.nit = nit;
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

    public List<InventariodiarioPlantilla> getInventariodiarioPlantillaList() {
        return inventariodiarioPlantillaList;
    }

    public void setInventariodiarioPlantillaList(List<InventariodiarioPlantilla> inventariodiarioPlantillaList) {
        this.inventariodiarioPlantillaList = inventariodiarioPlantillaList;
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
        if (!(object instanceof FacturarmovimientodiarioPlantilla)) {
            return false;
        }
        FacturarmovimientodiarioPlantilla other = (FacturarmovimientodiarioPlantilla) object;
        if ((this.regedit == null && other.regedit != null) || (this.regedit != null && !this.regedit.equals(other.regedit))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.FacturarmovimientodiarioPlantilla[ regedit=" + regedit + " ]";
    }
    
}
