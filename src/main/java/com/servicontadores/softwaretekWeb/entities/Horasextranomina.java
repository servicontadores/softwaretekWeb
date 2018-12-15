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
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToOne;

/**
 *
 * @author yesidherrera
 */
@Entity
@NamedQueries({
    @NamedQuery(name = "Horasextranomina.findAll", query = "SELECT h FROM Horasextranomina h")})
public class Horasextranomina implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(nullable = false)
    private Integer regedit;
    private Integer horasNocturnas;
    private Integer horasExtrasDiurnas;
    private Integer horasExtrasNocturas;
    private Integer horasDominicales;
    private Integer horasExtrasDiurnasDominicales;
    private Integer horasExtrasNocturnasDominicales;
    private Integer horasFestivasNocturnas;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(precision = 22)
    private Double recargoNocturno;
    @Column(precision = 22)
    private Double recargoExtraDiurno;
    @Column(precision = 22)
    private Double recargoExtraNocturno;
    @Column(precision = 22)
    private Double recargoDominical;
    @Column(precision = 22)
    private Double recargoExtraDiurnoDominical;
    @Column(precision = 22)
    private Double recargoExtraNocturnoDominical;
    @Column(precision = 22)
    private Double recargoFestivoNocturno;
    @Column(precision = 22)
    private Double valorhora;
    @JoinColumn(name = "Regedit", referencedColumnName = "Imp", nullable = false, insertable = false, updatable = false)
    @OneToOne(optional = false)
    private Nomina nomina;

    public Horasextranomina() {
    }

    public Horasextranomina(Integer regedit) {
        this.regedit = regedit;
    }

    public Integer getRegedit() {
        return regedit;
    }

    public void setRegedit(Integer regedit) {
        this.regedit = regedit;
    }

    public Integer getHorasNocturnas() {
        return horasNocturnas;
    }

    public void setHorasNocturnas(Integer horasNocturnas) {
        this.horasNocturnas = horasNocturnas;
    }

    public Integer getHorasExtrasDiurnas() {
        return horasExtrasDiurnas;
    }

    public void setHorasExtrasDiurnas(Integer horasExtrasDiurnas) {
        this.horasExtrasDiurnas = horasExtrasDiurnas;
    }

    public Integer getHorasExtrasNocturas() {
        return horasExtrasNocturas;
    }

    public void setHorasExtrasNocturas(Integer horasExtrasNocturas) {
        this.horasExtrasNocturas = horasExtrasNocturas;
    }

    public Integer getHorasDominicales() {
        return horasDominicales;
    }

    public void setHorasDominicales(Integer horasDominicales) {
        this.horasDominicales = horasDominicales;
    }

    public Integer getHorasExtrasDiurnasDominicales() {
        return horasExtrasDiurnasDominicales;
    }

    public void setHorasExtrasDiurnasDominicales(Integer horasExtrasDiurnasDominicales) {
        this.horasExtrasDiurnasDominicales = horasExtrasDiurnasDominicales;
    }

    public Integer getHorasExtrasNocturnasDominicales() {
        return horasExtrasNocturnasDominicales;
    }

    public void setHorasExtrasNocturnasDominicales(Integer horasExtrasNocturnasDominicales) {
        this.horasExtrasNocturnasDominicales = horasExtrasNocturnasDominicales;
    }

    public Integer getHorasFestivasNocturnas() {
        return horasFestivasNocturnas;
    }

    public void setHorasFestivasNocturnas(Integer horasFestivasNocturnas) {
        this.horasFestivasNocturnas = horasFestivasNocturnas;
    }

    public Double getRecargoNocturno() {
        return recargoNocturno;
    }

    public void setRecargoNocturno(Double recargoNocturno) {
        this.recargoNocturno = recargoNocturno;
    }

    public Double getRecargoExtraDiurno() {
        return recargoExtraDiurno;
    }

    public void setRecargoExtraDiurno(Double recargoExtraDiurno) {
        this.recargoExtraDiurno = recargoExtraDiurno;
    }

    public Double getRecargoExtraNocturno() {
        return recargoExtraNocturno;
    }

    public void setRecargoExtraNocturno(Double recargoExtraNocturno) {
        this.recargoExtraNocturno = recargoExtraNocturno;
    }

    public Double getRecargoDominical() {
        return recargoDominical;
    }

    public void setRecargoDominical(Double recargoDominical) {
        this.recargoDominical = recargoDominical;
    }

    public Double getRecargoExtraDiurnoDominical() {
        return recargoExtraDiurnoDominical;
    }

    public void setRecargoExtraDiurnoDominical(Double recargoExtraDiurnoDominical) {
        this.recargoExtraDiurnoDominical = recargoExtraDiurnoDominical;
    }

    public Double getRecargoExtraNocturnoDominical() {
        return recargoExtraNocturnoDominical;
    }

    public void setRecargoExtraNocturnoDominical(Double recargoExtraNocturnoDominical) {
        this.recargoExtraNocturnoDominical = recargoExtraNocturnoDominical;
    }

    public Double getRecargoFestivoNocturno() {
        return recargoFestivoNocturno;
    }

    public void setRecargoFestivoNocturno(Double recargoFestivoNocturno) {
        this.recargoFestivoNocturno = recargoFestivoNocturno;
    }

    public Double getValorhora() {
        return valorhora;
    }

    public void setValorhora(Double valorhora) {
        this.valorhora = valorhora;
    }

    public Nomina getNomina() {
        return nomina;
    }

    public void setNomina(Nomina nomina) {
        this.nomina = nomina;
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
        if (!(object instanceof Horasextranomina)) {
            return false;
        }
        Horasextranomina other = (Horasextranomina) object;
        if ((this.regedit == null && other.regedit != null) || (this.regedit != null && !this.regedit.equals(other.regedit))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.Horasextranomina[ regedit=" + regedit + " ]";
    }
    
}
