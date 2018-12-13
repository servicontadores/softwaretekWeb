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
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author yesidherrera
 */
@Entity
@Table(name = "citas_registrocitas")
@NamedQueries({
    @NamedQuery(name = "CitasRegistrocitas.findAll", query = "SELECT c FROM CitasRegistrocitas c")})
public class CitasRegistrocitas implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(nullable = false)
    private Integer indice;
    @Basic(optional = false)
    @Column(nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date fecha;
    @Basic(optional = false)
    @Column(nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date horaInicio;
    @Basic(optional = false)
    @Column(nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date horaFin;
    @Column(length = 100)
    private String detalle;
    @Basic(optional = false)
    @Column(nullable = false)
    private int codigoSucursal;
    @Basic(optional = false)
    @Column(nullable = false)
    private boolean cancelado;
    @JoinColumn(name = "CodigoTipoCita", referencedColumnName = "CodigoTipoCita", nullable = false)
    @ManyToOne(optional = false)
    private CitasTipocita codigoTipoCita;
    @JoinColumn(name = "CodigoLugar", referencedColumnName = "CodigoLugar", nullable = false)
    @ManyToOne(optional = false)
    private CitasLugares codigoLugar;
    @JoinColumn(name = "NITEncargado", referencedColumnName = "Codigo")
    @ManyToOne
    private Nit nITEncargado;
    @JoinColumn(name = "NIT", referencedColumnName = "Codigo", nullable = false)
    @ManyToOne(optional = false)
    private Nit nit;
    @JoinColumn(name = "CodigoUsuario", referencedColumnName = "Codigo", nullable = false)
    @ManyToOne(optional = false)
    private User codigoUsuario;

    public CitasRegistrocitas() {
    }

    public CitasRegistrocitas(Integer indice) {
        this.indice = indice;
    }

    public CitasRegistrocitas(Integer indice, Date fecha, Date horaInicio, Date horaFin, int codigoSucursal, boolean cancelado) {
        this.indice = indice;
        this.fecha = fecha;
        this.horaInicio = horaInicio;
        this.horaFin = horaFin;
        this.codigoSucursal = codigoSucursal;
        this.cancelado = cancelado;
    }

    public Integer getIndice() {
        return indice;
    }

    public void setIndice(Integer indice) {
        this.indice = indice;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Date getHoraInicio() {
        return horaInicio;
    }

    public void setHoraInicio(Date horaInicio) {
        this.horaInicio = horaInicio;
    }

    public Date getHoraFin() {
        return horaFin;
    }

    public void setHoraFin(Date horaFin) {
        this.horaFin = horaFin;
    }

    public String getDetalle() {
        return detalle;
    }

    public void setDetalle(String detalle) {
        this.detalle = detalle;
    }

    public int getCodigoSucursal() {
        return codigoSucursal;
    }

    public void setCodigoSucursal(int codigoSucursal) {
        this.codigoSucursal = codigoSucursal;
    }

    public boolean getCancelado() {
        return cancelado;
    }

    public void setCancelado(boolean cancelado) {
        this.cancelado = cancelado;
    }

    public CitasTipocita getCodigoTipoCita() {
        return codigoTipoCita;
    }

    public void setCodigoTipoCita(CitasTipocita codigoTipoCita) {
        this.codigoTipoCita = codigoTipoCita;
    }

    public CitasLugares getCodigoLugar() {
        return codigoLugar;
    }

    public void setCodigoLugar(CitasLugares codigoLugar) {
        this.codigoLugar = codigoLugar;
    }

    public Nit getNITEncargado() {
        return nITEncargado;
    }

    public void setNITEncargado(Nit nITEncargado) {
        this.nITEncargado = nITEncargado;
    }

    public Nit getNit() {
        return nit;
    }

    public void setNit(Nit nit) {
        this.nit = nit;
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
        hash += (indice != null ? indice.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof CitasRegistrocitas)) {
            return false;
        }
        CitasRegistrocitas other = (CitasRegistrocitas) object;
        if ((this.indice == null && other.indice != null) || (this.indice != null && !this.indice.equals(other.indice))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.CitasRegistrocitas[ indice=" + indice + " ]";
    }
    
}
