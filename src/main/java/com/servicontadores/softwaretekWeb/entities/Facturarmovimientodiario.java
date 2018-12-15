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
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.UniqueConstraint;

/**
 *
 * @author yesidherrera
 */
@Entity
@Table(uniqueConstraints = {
    @UniqueConstraint(columnNames = {"id"})})
@NamedQueries({
    @NamedQuery(name = "Facturarmovimientodiario.findAll", query = "SELECT f FROM Facturarmovimientodiario f")})
public class Facturarmovimientodiario implements Serializable {

    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @Column(nullable = false)
    private int cody;
    @Basic(optional = false)
    @Column(nullable = false)
    private int regedit;
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
    private Short cancelado;
    private Short guardado;
    @Column(length = 500)
    private String detal;
    @Column(length = 50)
    private String formaPago1;
    @Column(length = 50)
    private String noCuentaOCheque1;
    @Column(precision = 22)
    private Double valor1;
    @Column(length = 50)
    private String formaPago2;
    @Column(length = 50)
    private String noCuentaOCheque2;
    @Column(precision = 22)
    private Double valor2;
    @Column(precision = 22)
    private Double porcentajeFinanciacion;
    @Column(precision = 22)
    private Double vrFinanciacion;
    private Integer noCuotas;
    @Column(precision = 22)
    private Double vrCuotas;
    private Integer noFacturaDevolucion;
    private Integer noFacturaDevolucion2;
    @Column(precision = 22)
    private Double efectivo;
    @Column(precision = 22)
    private Double cambio;
    @Column(precision = 22)
    private Double base;
    @Column(precision = 22)
    private Double iva;
    @Column(precision = 22)
    private Double reteFuente;
    @Column(precision = 22)
    private Double reteiva;
    @Column(precision = 22)
    private Double total;
    @Column(precision = 22)
    private Double totalCredito;
    @Column(precision = 22)
    private Double costoBruto;
    @Column(precision = 22)
    private Double vrBruto;
    @Column(precision = 22)
    private Double vrDescuento;
    @Column(precision = 22)
    private Double reteICA;
    @Column(precision = 22)
    private Double reteIK;
    @Basic(optional = false)
    @Column(nullable = false)
    private int codigoFormaPago;
    @Basic(optional = false)
    @Column(name = "ODBCFIX_FLDAUTO", nullable = false)
    private int odbcfixFldauto;
    @Basic(optional = false)
    @Column(nullable = false)
    private double pcree;
    @Column(precision = 22)
    private Double cree;
    @Column(precision = 22)
    private Double impoConsumo;
    @Column(precision = 22)
    private Double vrImpoConsumo;
    @Basic(optional = false)
    @Column(nullable = false)
    private int indiceCostos;
    @Column(length = 50)
    private String nit2;
    @Basic(optional = false)
    @Column(name = "NoDoc_Auto", nullable = false)
    private boolean noDocAuto;
    @Basic(optional = false)
    @Column(nullable = false)
    private short mercanciaEntregada;
    @Basic(optional = false)
    @Column(nullable = false)
    private int regeditDocRef;
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaingreso;
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechasalida;
    private Integer codigohabitacion;
    private Short aire;
    @Column(length = 255)
    private String estado;
    private Integer regeditAnterior;
    @Column(length = 50)
    private String noDocumentoAnterior;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(nullable = false)
    private Integer id;
    @Column(precision = 22)
    private Double costoTotal;
    @JoinColumn(name = "PC", referencedColumnName = "Codigo", nullable = false)
    @ManyToOne(optional = false)
    private Pcs pc;
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
    @OneToOne(cascade = CascadeType.ALL, mappedBy = "regedit")
    private PuntosMovimientos puntosMovimientos;

    public Facturarmovimientodiario() {
    }

    public Facturarmovimientodiario(Integer id) {
        this.id = id;
    }

    public Facturarmovimientodiario(Integer id, int cody, int regedit, int codigoFormaPago, int odbcfixFldauto, double pcree, int indiceCostos, boolean noDocAuto, short mercanciaEntregada, int regeditDocRef) {
        this.id = id;
        this.cody = cody;
        this.regedit = regedit;
        this.codigoFormaPago = codigoFormaPago;
        this.odbcfixFldauto = odbcfixFldauto;
        this.pcree = pcree;
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

    public int getRegedit() {
        return regedit;
    }

    public void setRegedit(int regedit) {
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

    public Short getCancelado() {
        return cancelado;
    }

    public void setCancelado(Short cancelado) {
        this.cancelado = cancelado;
    }

    public Short getGuardado() {
        return guardado;
    }

    public void setGuardado(Short guardado) {
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

    public Double getValor1() {
        return valor1;
    }

    public void setValor1(Double valor1) {
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

    public Double getValor2() {
        return valor2;
    }

    public void setValor2(Double valor2) {
        this.valor2 = valor2;
    }

    public Double getPorcentajeFinanciacion() {
        return porcentajeFinanciacion;
    }

    public void setPorcentajeFinanciacion(Double porcentajeFinanciacion) {
        this.porcentajeFinanciacion = porcentajeFinanciacion;
    }

    public Double getVrFinanciacion() {
        return vrFinanciacion;
    }

    public void setVrFinanciacion(Double vrFinanciacion) {
        this.vrFinanciacion = vrFinanciacion;
    }

    public Integer getNoCuotas() {
        return noCuotas;
    }

    public void setNoCuotas(Integer noCuotas) {
        this.noCuotas = noCuotas;
    }

    public Double getVrCuotas() {
        return vrCuotas;
    }

    public void setVrCuotas(Double vrCuotas) {
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

    public Double getEfectivo() {
        return efectivo;
    }

    public void setEfectivo(Double efectivo) {
        this.efectivo = efectivo;
    }

    public Double getCambio() {
        return cambio;
    }

    public void setCambio(Double cambio) {
        this.cambio = cambio;
    }

    public Double getBase() {
        return base;
    }

    public void setBase(Double base) {
        this.base = base;
    }

    public Double getIva() {
        return iva;
    }

    public void setIva(Double iva) {
        this.iva = iva;
    }

    public Double getReteFuente() {
        return reteFuente;
    }

    public void setReteFuente(Double reteFuente) {
        this.reteFuente = reteFuente;
    }

    public Double getReteiva() {
        return reteiva;
    }

    public void setReteiva(Double reteiva) {
        this.reteiva = reteiva;
    }

    public Double getTotal() {
        return total;
    }

    public void setTotal(Double total) {
        this.total = total;
    }

    public Double getTotalCredito() {
        return totalCredito;
    }

    public void setTotalCredito(Double totalCredito) {
        this.totalCredito = totalCredito;
    }

    public Double getCostoBruto() {
        return costoBruto;
    }

    public void setCostoBruto(Double costoBruto) {
        this.costoBruto = costoBruto;
    }

    public Double getVrBruto() {
        return vrBruto;
    }

    public void setVrBruto(Double vrBruto) {
        this.vrBruto = vrBruto;
    }

    public Double getVrDescuento() {
        return vrDescuento;
    }

    public void setVrDescuento(Double vrDescuento) {
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

    public int getCodigoFormaPago() {
        return codigoFormaPago;
    }

    public void setCodigoFormaPago(int codigoFormaPago) {
        this.codigoFormaPago = codigoFormaPago;
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

    public Double getCree() {
        return cree;
    }

    public void setCree(Double cree) {
        this.cree = cree;
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

    public boolean getNoDocAuto() {
        return noDocAuto;
    }

    public void setNoDocAuto(boolean noDocAuto) {
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

    public Date getFechaingreso() {
        return fechaingreso;
    }

    public void setFechaingreso(Date fechaingreso) {
        this.fechaingreso = fechaingreso;
    }

    public Date getFechasalida() {
        return fechasalida;
    }

    public void setFechasalida(Date fechasalida) {
        this.fechasalida = fechasalida;
    }

    public Integer getCodigohabitacion() {
        return codigohabitacion;
    }

    public void setCodigohabitacion(Integer codigohabitacion) {
        this.codigohabitacion = codigohabitacion;
    }

    public Short getAire() {
        return aire;
    }

    public void setAire(Short aire) {
        this.aire = aire;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public Integer getRegeditAnterior() {
        return regeditAnterior;
    }

    public void setRegeditAnterior(Integer regeditAnterior) {
        this.regeditAnterior = regeditAnterior;
    }

    public String getNoDocumentoAnterior() {
        return noDocumentoAnterior;
    }

    public void setNoDocumentoAnterior(String noDocumentoAnterior) {
        this.noDocumentoAnterior = noDocumentoAnterior;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Double getCostoTotal() {
        return costoTotal;
    }

    public void setCostoTotal(Double costoTotal) {
        this.costoTotal = costoTotal;
    }

    public Pcs getPc() {
        return pc;
    }

    public void setPc(Pcs pc) {
        this.pc = pc;
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

    public PuntosMovimientos getPuntosMovimientos() {
        return puntosMovimientos;
    }

    public void setPuntosMovimientos(PuntosMovimientos puntosMovimientos) {
        this.puntosMovimientos = puntosMovimientos;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Facturarmovimientodiario)) {
            return false;
        }
        Facturarmovimientodiario other = (Facturarmovimientodiario) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.Facturarmovimientodiario[ id=" + id + " ]";
    }
    
}
