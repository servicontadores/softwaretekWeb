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
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author yesidherrera
 */
@Entity
@Table(name = "parqueadero_registroingresos")
@NamedQueries({
    @NamedQuery(name = "ParqueaderoRegistroingresos.findAll", query = "SELECT p FROM ParqueaderoRegistroingresos p")})
public class ParqueaderoRegistroingresos implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(nullable = false)
    private Integer codigoIngreso;
    @Basic(optional = false)
    @Column(nullable = false, length = 10)
    private String placa;
    @Basic(optional = false)
    @Column(nullable = false)
    private int codigoTipoVehiculo;
    @Column(length = 100)
    private String detalleVehiculo;
    @Basic(optional = false)
    @Column(nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaIngreso;
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaSalida;
    @Basic(optional = false)
    @Column(nullable = false)
    private int tarifa;
    @Basic(optional = false)
    @Column(nullable = false)
    private int codigoPuesto;
    @Basic(optional = false)
    @Column(nullable = false)
    private boolean finalizado;
    private Integer codigoFormaPago;
    private Integer valor;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(precision = 22)
    private Double piva;
    private Integer codigoconcepto;
    private Integer regedit;
    @JoinColumn(name = "Tercero", referencedColumnName = "Codigo")
    @ManyToOne
    private Nit tercero;
    @JoinColumn(name = "CodigoSucursal", referencedColumnName = "Codigo", nullable = false)
    @ManyToOne(optional = false)
    private Sucursales codigoSucursal;
    @JoinColumn(name = "CodigoUsuario", referencedColumnName = "Codigo", nullable = false)
    @ManyToOne(optional = false)
    private User codigoUsuario;

    public ParqueaderoRegistroingresos() {
    }

    public ParqueaderoRegistroingresos(Integer codigoIngreso) {
        this.codigoIngreso = codigoIngreso;
    }

    public ParqueaderoRegistroingresos(Integer codigoIngreso, String placa, int codigoTipoVehiculo, Date fechaIngreso, int tarifa, int codigoPuesto, boolean finalizado) {
        this.codigoIngreso = codigoIngreso;
        this.placa = placa;
        this.codigoTipoVehiculo = codigoTipoVehiculo;
        this.fechaIngreso = fechaIngreso;
        this.tarifa = tarifa;
        this.codigoPuesto = codigoPuesto;
        this.finalizado = finalizado;
    }

    public Integer getCodigoIngreso() {
        return codigoIngreso;
    }

    public void setCodigoIngreso(Integer codigoIngreso) {
        this.codigoIngreso = codigoIngreso;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public int getCodigoTipoVehiculo() {
        return codigoTipoVehiculo;
    }

    public void setCodigoTipoVehiculo(int codigoTipoVehiculo) {
        this.codigoTipoVehiculo = codigoTipoVehiculo;
    }

    public String getDetalleVehiculo() {
        return detalleVehiculo;
    }

    public void setDetalleVehiculo(String detalleVehiculo) {
        this.detalleVehiculo = detalleVehiculo;
    }

    public Date getFechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaIngreso(Date fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

    public Date getFechaSalida() {
        return fechaSalida;
    }

    public void setFechaSalida(Date fechaSalida) {
        this.fechaSalida = fechaSalida;
    }

    public int getTarifa() {
        return tarifa;
    }

    public void setTarifa(int tarifa) {
        this.tarifa = tarifa;
    }

    public int getCodigoPuesto() {
        return codigoPuesto;
    }

    public void setCodigoPuesto(int codigoPuesto) {
        this.codigoPuesto = codigoPuesto;
    }

    public boolean getFinalizado() {
        return finalizado;
    }

    public void setFinalizado(boolean finalizado) {
        this.finalizado = finalizado;
    }

    public Integer getCodigoFormaPago() {
        return codigoFormaPago;
    }

    public void setCodigoFormaPago(Integer codigoFormaPago) {
        this.codigoFormaPago = codigoFormaPago;
    }

    public Integer getValor() {
        return valor;
    }

    public void setValor(Integer valor) {
        this.valor = valor;
    }

    public Double getPiva() {
        return piva;
    }

    public void setPiva(Double piva) {
        this.piva = piva;
    }

    public Integer getCodigoconcepto() {
        return codigoconcepto;
    }

    public void setCodigoconcepto(Integer codigoconcepto) {
        this.codigoconcepto = codigoconcepto;
    }

    public Integer getRegedit() {
        return regedit;
    }

    public void setRegedit(Integer regedit) {
        this.regedit = regedit;
    }

    public Nit getTercero() {
        return tercero;
    }

    public void setTercero(Nit tercero) {
        this.tercero = tercero;
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
        hash += (codigoIngreso != null ? codigoIngreso.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ParqueaderoRegistroingresos)) {
            return false;
        }
        ParqueaderoRegistroingresos other = (ParqueaderoRegistroingresos) object;
        if ((this.codigoIngreso == null && other.codigoIngreso != null) || (this.codigoIngreso != null && !this.codigoIngreso.equals(other.codigoIngreso))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.ParqueaderoRegistroingresos[ codigoIngreso=" + codigoIngreso + " ]";
    }
    
}
