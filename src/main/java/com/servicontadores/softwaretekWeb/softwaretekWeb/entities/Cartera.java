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
    @NamedQuery(name = "Cartera.findAll", query = "SELECT c FROM Cartera c")})
public class Cartera implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(nullable = false)
    private Integer cody;
    private Integer noEgreso;
    @Column(length = 45)
    private String formaEgreso;
    @Column(length = 45)
    private String formaIngreso;
    @Column(length = 45)
    private String noCuentaBancaria;
    @Column(length = 45)
    private String cuentaMovimiento;
    private Integer regedit;
    @Temporal(TemporalType.TIMESTAMP)
    private Date fecha;
    @Column(length = 45)
    private String noFactura;
    @Column(name = "Id_CodigoMovimientoCartera")
    private Integer idCodigoMovimientoCartera;
    @Column(length = 45)
    private String fuente;
    @Column(length = 45)
    private String conceptoCartera;
    private Integer codigoSucursal;
    @Column(length = 45)
    private String nit;
    @Column(length = 45)
    private String formaPago;
    private Integer plazo;
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaPago;
    private Integer vrTotal;
    private Integer vrIntereses;
    private Integer vrFinanciacion;
    private Integer vrAbono;
    private Integer intereses;
    private Integer vrDescuento;
    private Integer vrRetenciones;
    private Integer vrDevolucion;
    @Column(length = 45)
    private String detal;
    @Column(length = 45)
    private String carteracol;
    private Integer dBSaldo;
    private Integer interfaz;
    private Integer imp;
    private Integer keynomina;
    @Column(length = 45)
    private String codigoVendedor;
    private Integer codigoConceptoCartera;
    private Integer total;
    private Integer codigoConcepto;
    private Integer codigoFormaPago;
    private Integer codigoNotaCredito;
    private Integer cdc;
    private Integer pcree;
    private Integer cree;
    private Integer cancelado;
    @Column(name = "ODBCFIX_FLDAUTO")
    private Integer odbcfixFldauto;
    @Column(length = 45)
    private String prefijo;
    @Column(length = 45)
    private String regeditDocIntereses;
    private Integer cuota;
    @Column(length = 45)
    private String tipoMovimiento;
    private Boolean cajaMenor;
    @Column(length = 45)
    private String noCheque;
    @Column(name = "Id_CuentaPUC")
    private Integer idCuentaPUC;

    public Cartera() {
    }

    public Cartera(Integer cody) {
        this.cody = cody;
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

    public String getNoFactura() {
        return noFactura;
    }

    public void setNoFactura(String noFactura) {
        this.noFactura = noFactura;
    }

    public Integer getIdCodigoMovimientoCartera() {
        return idCodigoMovimientoCartera;
    }

    public void setIdCodigoMovimientoCartera(Integer idCodigoMovimientoCartera) {
        this.idCodigoMovimientoCartera = idCodigoMovimientoCartera;
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

    public Integer getCodigoSucursal() {
        return codigoSucursal;
    }

    public void setCodigoSucursal(Integer codigoSucursal) {
        this.codigoSucursal = codigoSucursal;
    }

    public String getNit() {
        return nit;
    }

    public void setNit(String nit) {
        this.nit = nit;
    }

    public String getFormaPago() {
        return formaPago;
    }

    public void setFormaPago(String formaPago) {
        this.formaPago = formaPago;
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

    public Integer getVrTotal() {
        return vrTotal;
    }

    public void setVrTotal(Integer vrTotal) {
        this.vrTotal = vrTotal;
    }

    public Integer getVrIntereses() {
        return vrIntereses;
    }

    public void setVrIntereses(Integer vrIntereses) {
        this.vrIntereses = vrIntereses;
    }

    public Integer getVrFinanciacion() {
        return vrFinanciacion;
    }

    public void setVrFinanciacion(Integer vrFinanciacion) {
        this.vrFinanciacion = vrFinanciacion;
    }

    public Integer getVrAbono() {
        return vrAbono;
    }

    public void setVrAbono(Integer vrAbono) {
        this.vrAbono = vrAbono;
    }

    public Integer getIntereses() {
        return intereses;
    }

    public void setIntereses(Integer intereses) {
        this.intereses = intereses;
    }

    public Integer getVrDescuento() {
        return vrDescuento;
    }

    public void setVrDescuento(Integer vrDescuento) {
        this.vrDescuento = vrDescuento;
    }

    public Integer getVrRetenciones() {
        return vrRetenciones;
    }

    public void setVrRetenciones(Integer vrRetenciones) {
        this.vrRetenciones = vrRetenciones;
    }

    public Integer getVrDevolucion() {
        return vrDevolucion;
    }

    public void setVrDevolucion(Integer vrDevolucion) {
        this.vrDevolucion = vrDevolucion;
    }

    public String getDetal() {
        return detal;
    }

    public void setDetal(String detal) {
        this.detal = detal;
    }

    public String getCarteracol() {
        return carteracol;
    }

    public void setCarteracol(String carteracol) {
        this.carteracol = carteracol;
    }

    public Integer getDBSaldo() {
        return dBSaldo;
    }

    public void setDBSaldo(Integer dBSaldo) {
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

    public Integer getCodigoConceptoCartera() {
        return codigoConceptoCartera;
    }

    public void setCodigoConceptoCartera(Integer codigoConceptoCartera) {
        this.codigoConceptoCartera = codigoConceptoCartera;
    }

    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
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

    public Integer getCodigoNotaCredito() {
        return codigoNotaCredito;
    }

    public void setCodigoNotaCredito(Integer codigoNotaCredito) {
        this.codigoNotaCredito = codigoNotaCredito;
    }

    public Integer getCdc() {
        return cdc;
    }

    public void setCdc(Integer cdc) {
        this.cdc = cdc;
    }

    public Integer getPcree() {
        return pcree;
    }

    public void setPcree(Integer pcree) {
        this.pcree = pcree;
    }

    public Integer getCree() {
        return cree;
    }

    public void setCree(Integer cree) {
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

    public String getRegeditDocIntereses() {
        return regeditDocIntereses;
    }

    public void setRegeditDocIntereses(String regeditDocIntereses) {
        this.regeditDocIntereses = regeditDocIntereses;
    }

    public Integer getCuota() {
        return cuota;
    }

    public void setCuota(Integer cuota) {
        this.cuota = cuota;
    }

    public String getTipoMovimiento() {
        return tipoMovimiento;
    }

    public void setTipoMovimiento(String tipoMovimiento) {
        this.tipoMovimiento = tipoMovimiento;
    }

    public Boolean getCajaMenor() {
        return cajaMenor;
    }

    public void setCajaMenor(Boolean cajaMenor) {
        this.cajaMenor = cajaMenor;
    }

    public String getNoCheque() {
        return noCheque;
    }

    public void setNoCheque(String noCheque) {
        this.noCheque = noCheque;
    }

    public Integer getIdCuentaPUC() {
        return idCuentaPUC;
    }

    public void setIdCuentaPUC(Integer idCuentaPUC) {
        this.idCuentaPUC = idCuentaPUC;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (cody != null ? cody.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Cartera)) {
            return false;
        }
        Cartera other = (Cartera) object;
        if ((this.cody == null && other.cody != null) || (this.cody != null && !this.cody.equals(other.cody))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.Cartera[ cody=" + cody + " ]";
    }
    
}
