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
    @NamedQuery(name = "Cxc.findAll", query = "SELECT c FROM Cxc c")})
public class Cxc implements Serializable {

    private static final long serialVersionUID = 1L;
    private Integer cody;
    private Integer noEgreso;
    @Column(length = 50)
    private String formaEgreso;
    @Column(length = 50)
    private String formaIngreso;
    @Column(length = 50)
    private String noCuentaBancaria;
    @Column(length = 50)
    private String cuentaMovimiento;
    @Basic(optional = false)
    @Column(nullable = false)
    private int regedit;
    @Temporal(TemporalType.TIMESTAMP)
    private Date fecha;
    @Basic(optional = false)
    @Column(nullable = false)
    private int noFactura;
    @Column(length = 3)
    private String fuente;
    @Column(length = 50)
    private String conceptoCartera;
    @Column(length = 50)
    private String formaPago;
    @Basic(optional = false)
    @Column(nullable = false)
    private int plazo;
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaPago;
    @Basic(optional = false)
    @Column(nullable = false)
    private double vrTotal;
    @Basic(optional = false)
    @Column(nullable = false)
    private double vrIntereses;
    @Basic(optional = false)
    @Column(nullable = false)
    private double vrFinanciacion;
    @Basic(optional = false)
    @Column(nullable = false)
    private double vrAbono;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(precision = 22)
    private Double intereses;
    @Basic(optional = false)
    @Column(nullable = false)
    private double vrDescuento;
    @Basic(optional = false)
    @Column(nullable = false)
    private double vrReteFuente;
    @Basic(optional = false)
    @Column(nullable = false)
    private double vrDevolucion;
    @Basic(optional = false)
    @Column(nullable = false)
    private double vrReteiva;
    @Column(length = 100)
    private String detal;
    @Column(precision = 22)
    private Double dBSaldo;
    private Integer interfaz;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(nullable = false)
    private Integer imp;
    private Integer keynomina;
    @Column(length = 20)
    private String codigoVendedor;
    @Basic(optional = false)
    @Column(nullable = false)
    private double vrReteica;
    @Basic(optional = false)
    @Column(nullable = false)
    private double total;
    private Integer codigoConcepto;
    private Integer codigoFormaPago;
    @Basic(optional = false)
    @Column(nullable = false)
    private double pcree;
    @Basic(optional = false)
    @Column(nullable = false)
    private double cree;
    private Integer cancelado;
    @Column(name = "ODBCFIX_FLDAUTO")
    private Integer odbcfixFldauto;
    @Column(length = 10)
    private String prefijo;
    @Column(precision = 22)
    private Double regeditDocIntereses;
    @Column(precision = 22)
    private Double vrOtrasRetenciones;
    @Column(precision = 22)
    private Double vrAnticipo;
    @Column(precision = 22)
    private Double vrCruce;
    private Integer separado;
    private Integer noSeparado;
    @JoinColumn(name = "CodigoConceptoCartera", referencedColumnName = "Codigo", nullable = false)
    @ManyToOne(optional = false)
    private Conceptoscarteracxc codigoConceptoCartera;
    @JoinColumn(name = "CodigoNotaCredito", referencedColumnName = "Codigo")
    @ManyToOne
    private Codigonotacredcliente codigoNotaCredito;
    @JoinColumn(name = "NIT", referencedColumnName = "Codigo", nullable = false)
    @ManyToOne(optional = false)
    private Nit nit;
    @JoinColumn(name = "CDC", referencedColumnName = "Codigo", nullable = false)
    @ManyToOne(optional = false)
    private Cdc cdc;
    @JoinColumn(name = "CodigoSucursal", referencedColumnName = "Codigo")
    @ManyToOne
    private Sucursales codigoSucursal;

    public Cxc() {
    }

    public Cxc(Integer imp) {
        this.imp = imp;
    }

    public Cxc(Integer imp, int regedit, int noFactura, int plazo, double vrTotal, double vrIntereses, double vrFinanciacion, double vrAbono, double vrDescuento, double vrReteFuente, double vrDevolucion, double vrReteiva, double vrReteica, double total, double pcree, double cree) {
        this.imp = imp;
        this.regedit = regedit;
        this.noFactura = noFactura;
        this.plazo = plazo;
        this.vrTotal = vrTotal;
        this.vrIntereses = vrIntereses;
        this.vrFinanciacion = vrFinanciacion;
        this.vrAbono = vrAbono;
        this.vrDescuento = vrDescuento;
        this.vrReteFuente = vrReteFuente;
        this.vrDevolucion = vrDevolucion;
        this.vrReteiva = vrReteiva;
        this.vrReteica = vrReteica;
        this.total = total;
        this.pcree = pcree;
        this.cree = cree;
    }

    public Integer getCody() {
        return cody;
    }

    public void setCody(Integer cody) {
        this.cody = cody;
    }

    public Integer getNoEgreso() {
        return noEgreso;
    }

    public void setNoEgreso(Integer noEgreso) {
        this.noEgreso = noEgreso;
    }

    public String getFormaEgreso() {
        return formaEgreso;
    }

    public void setFormaEgreso(String formaEgreso) {
        this.formaEgreso = formaEgreso;
    }

    public String getFormaIngreso() {
        return formaIngreso;
    }

    public void setFormaIngreso(String formaIngreso) {
        this.formaIngreso = formaIngreso;
    }

    public String getNoCuentaBancaria() {
        return noCuentaBancaria;
    }

    public void setNoCuentaBancaria(String noCuentaBancaria) {
        this.noCuentaBancaria = noCuentaBancaria;
    }

    public String getCuentaMovimiento() {
        return cuentaMovimiento;
    }

    public void setCuentaMovimiento(String cuentaMovimiento) {
        this.cuentaMovimiento = cuentaMovimiento;
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

    public int getNoFactura() {
        return noFactura;
    }

    public void setNoFactura(int noFactura) {
        this.noFactura = noFactura;
    }

    public String getFuente() {
        return fuente;
    }

    public void setFuente(String fuente) {
        this.fuente = fuente;
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

    public double getVrTotal() {
        return vrTotal;
    }

    public void setVrTotal(double vrTotal) {
        this.vrTotal = vrTotal;
    }

    public double getVrIntereses() {
        return vrIntereses;
    }

    public void setVrIntereses(double vrIntereses) {
        this.vrIntereses = vrIntereses;
    }

    public double getVrFinanciacion() {
        return vrFinanciacion;
    }

    public void setVrFinanciacion(double vrFinanciacion) {
        this.vrFinanciacion = vrFinanciacion;
    }

    public double getVrAbono() {
        return vrAbono;
    }

    public void setVrAbono(double vrAbono) {
        this.vrAbono = vrAbono;
    }

    public Double getIntereses() {
        return intereses;
    }

    public void setIntereses(Double intereses) {
        this.intereses = intereses;
    }

    public double getVrDescuento() {
        return vrDescuento;
    }

    public void setVrDescuento(double vrDescuento) {
        this.vrDescuento = vrDescuento;
    }

    public double getVrReteFuente() {
        return vrReteFuente;
    }

    public void setVrReteFuente(double vrReteFuente) {
        this.vrReteFuente = vrReteFuente;
    }

    public double getVrDevolucion() {
        return vrDevolucion;
    }

    public void setVrDevolucion(double vrDevolucion) {
        this.vrDevolucion = vrDevolucion;
    }

    public double getVrReteiva() {
        return vrReteiva;
    }

    public void setVrReteiva(double vrReteiva) {
        this.vrReteiva = vrReteiva;
    }

    public String getDetal() {
        return detal;
    }

    public void setDetal(String detal) {
        this.detal = detal;
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

    public Integer getImp() {
        return imp;
    }

    public void setImp(Integer imp) {
        this.imp = imp;
    }

    public Integer getKeynomina() {
        return keynomina;
    }

    public void setKeynomina(Integer keynomina) {
        this.keynomina = keynomina;
    }

    public String getCodigoVendedor() {
        return codigoVendedor;
    }

    public void setCodigoVendedor(String codigoVendedor) {
        this.codigoVendedor = codigoVendedor;
    }

    public double getVrReteica() {
        return vrReteica;
    }

    public void setVrReteica(double vrReteica) {
        this.vrReteica = vrReteica;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
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

    public Integer getCancelado() {
        return cancelado;
    }

    public void setCancelado(Integer cancelado) {
        this.cancelado = cancelado;
    }

    public Integer getOdbcfixFldauto() {
        return odbcfixFldauto;
    }

    public void setOdbcfixFldauto(Integer odbcfixFldauto) {
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

    public Double getVrOtrasRetenciones() {
        return vrOtrasRetenciones;
    }

    public void setVrOtrasRetenciones(Double vrOtrasRetenciones) {
        this.vrOtrasRetenciones = vrOtrasRetenciones;
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

    public Integer getSeparado() {
        return separado;
    }

    public void setSeparado(Integer separado) {
        this.separado = separado;
    }

    public Integer getNoSeparado() {
        return noSeparado;
    }

    public void setNoSeparado(Integer noSeparado) {
        this.noSeparado = noSeparado;
    }

    public Conceptoscarteracxc getCodigoConceptoCartera() {
        return codigoConceptoCartera;
    }

    public void setCodigoConceptoCartera(Conceptoscarteracxc codigoConceptoCartera) {
        this.codigoConceptoCartera = codigoConceptoCartera;
    }

    public Codigonotacredcliente getCodigoNotaCredito() {
        return codigoNotaCredito;
    }

    public void setCodigoNotaCredito(Codigonotacredcliente codigoNotaCredito) {
        this.codigoNotaCredito = codigoNotaCredito;
    }

    public Nit getNit() {
        return nit;
    }

    public void setNit(Nit nit) {
        this.nit = nit;
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

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (imp != null ? imp.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Cxc)) {
            return false;
        }
        Cxc other = (Cxc) object;
        if ((this.imp == null && other.imp != null) || (this.imp != null && !this.imp.equals(other.imp))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.Cxc[ imp=" + imp + " ]";
    }
    
}
