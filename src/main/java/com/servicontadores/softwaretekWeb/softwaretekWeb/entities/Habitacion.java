/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;

/**
 *
 * @author yesidherrera
 */
@Entity
@NamedQueries({
    @NamedQuery(name = "Habitacion.findAll", query = "SELECT h FROM Habitacion h")})
public class Habitacion implements Serializable {

    private static final long serialVersionUID = 1L;
    private Integer numero;
    @Id
    @Basic(optional = false)
    @Column(nullable = false)
    private Integer codigoHabitacion;
    @Column(length = 255)
    private String categoria;
    @Column(length = 255)
    private String estado;
    @Column(length = 255)
    private String tipoCama;
    private Short aire;
    private Short baño;
    private Short television;
    @Column(length = 255)
    private String detalles;
    private Integer tarifa;
    private Integer capacidad;
    private Integer regedit;
    private Integer saldo;
    @Column(length = 255)
    private String mostrar;
    @Column(length = 255)
    private String nota;
    private Integer tarifa2;
    @Column(length = 255)
    private String notelefono;
    @Column(name = "ODBCFIX_FLDAUTO")
    private Integer odbcfixFldauto;
    private Short ocupar;

    public Habitacion() {
    }

    public Habitacion(Integer codigoHabitacion) {
        this.codigoHabitacion = codigoHabitacion;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public Integer getCodigoHabitacion() {
        return codigoHabitacion;
    }

    public void setCodigoHabitacion(Integer codigoHabitacion) {
        this.codigoHabitacion = codigoHabitacion;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getTipoCama() {
        return tipoCama;
    }

    public void setTipoCama(String tipoCama) {
        this.tipoCama = tipoCama;
    }

    public Short getAire() {
        return aire;
    }

    public void setAire(Short aire) {
        this.aire = aire;
    }

    public Short getBaño() {
        return baño;
    }

    public void setBaño(Short baño) {
        this.baño = baño;
    }

    public Short getTelevision() {
        return television;
    }

    public void setTelevision(Short television) {
        this.television = television;
    }

    public String getDetalles() {
        return detalles;
    }

    public void setDetalles(String detalles) {
        this.detalles = detalles;
    }

    public Integer getTarifa() {
        return tarifa;
    }

    public void setTarifa(Integer tarifa) {
        this.tarifa = tarifa;
    }

    public Integer getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(Integer capacidad) {
        this.capacidad = capacidad;
    }

    public Integer getRegedit() {
        return regedit;
    }

    public void setRegedit(Integer regedit) {
        this.regedit = regedit;
    }

    public Integer getSaldo() {
        return saldo;
    }

    public void setSaldo(Integer saldo) {
        this.saldo = saldo;
    }

    public String getMostrar() {
        return mostrar;
    }

    public void setMostrar(String mostrar) {
        this.mostrar = mostrar;
    }

    public String getNota() {
        return nota;
    }

    public void setNota(String nota) {
        this.nota = nota;
    }

    public Integer getTarifa2() {
        return tarifa2;
    }

    public void setTarifa2(Integer tarifa2) {
        this.tarifa2 = tarifa2;
    }

    public String getNotelefono() {
        return notelefono;
    }

    public void setNotelefono(String notelefono) {
        this.notelefono = notelefono;
    }

    public Integer getOdbcfixFldauto() {
        return odbcfixFldauto;
    }

    public void setOdbcfixFldauto(Integer odbcfixFldauto) {
        this.odbcfixFldauto = odbcfixFldauto;
    }

    public Short getOcupar() {
        return ocupar;
    }

    public void setOcupar(Short ocupar) {
        this.ocupar = ocupar;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codigoHabitacion != null ? codigoHabitacion.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Habitacion)) {
            return false;
        }
        Habitacion other = (Habitacion) object;
        if ((this.codigoHabitacion == null && other.codigoHabitacion != null) || (this.codigoHabitacion != null && !this.codigoHabitacion.equals(other.codigoHabitacion))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.Habitacion[ codigoHabitacion=" + codigoHabitacion + " ]";
    }
    
}
