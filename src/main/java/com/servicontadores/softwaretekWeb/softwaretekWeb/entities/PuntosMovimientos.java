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
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

/**
 *
 * @author yesidherrera
 */
@Entity
@Table(name = "puntos_movimientos", uniqueConstraints = {
    @UniqueConstraint(columnNames = {"Regedit"})})
@NamedQueries({
    @NamedQuery(name = "PuntosMovimientos.findAll", query = "SELECT p FROM PuntosMovimientos p")})
public class PuntosMovimientos implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(nullable = false)
    private Integer indice;
    @Column(length = 20)
    private String tipoMov;
    @Basic(optional = false)
    @Column(nullable = false)
    private int tarifa;
    @Basic(optional = false)
    @Column(nullable = false, length = 255)
    private String naturaleza;
    @Basic(optional = false)
    @Column(nullable = false)
    private short cancelado;
    private Integer regeditEgreso;
    @JoinColumn(name = "Regedit", referencedColumnName = "Regedit", nullable = false)
    @OneToOne(optional = false)
    private Facturarmovimientodiario regedit;
    @JoinColumn(name = "NIT", referencedColumnName = "Codigo", nullable = false)
    @ManyToOne(optional = false)
    private Nit nit;

    public PuntosMovimientos() {
    }

    public PuntosMovimientos(Integer indice) {
        this.indice = indice;
    }

    public PuntosMovimientos(Integer indice, int tarifa, String naturaleza, short cancelado) {
        this.indice = indice;
        this.tarifa = tarifa;
        this.naturaleza = naturaleza;
        this.cancelado = cancelado;
    }

    public Integer getIndice() {
        return indice;
    }

    public void setIndice(Integer indice) {
        this.indice = indice;
    }

    public String getTipoMov() {
        return tipoMov;
    }

    public void setTipoMov(String tipoMov) {
        this.tipoMov = tipoMov;
    }

    public int getTarifa() {
        return tarifa;
    }

    public void setTarifa(int tarifa) {
        this.tarifa = tarifa;
    }

    public String getNaturaleza() {
        return naturaleza;
    }

    public void setNaturaleza(String naturaleza) {
        this.naturaleza = naturaleza;
    }

    public short getCancelado() {
        return cancelado;
    }

    public void setCancelado(short cancelado) {
        this.cancelado = cancelado;
    }

    public Integer getRegeditEgreso() {
        return regeditEgreso;
    }

    public void setRegeditEgreso(Integer regeditEgreso) {
        this.regeditEgreso = regeditEgreso;
    }

    public Facturarmovimientodiario getRegedit() {
        return regedit;
    }

    public void setRegedit(Facturarmovimientodiario regedit) {
        this.regedit = regedit;
    }

    public Nit getNit() {
        return nit;
    }

    public void setNit(Nit nit) {
        this.nit = nit;
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
        if (!(object instanceof PuntosMovimientos)) {
            return false;
        }
        PuntosMovimientos other = (PuntosMovimientos) object;
        if ((this.indice == null && other.indice != null) || (this.indice != null && !this.indice.equals(other.indice))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.PuntosMovimientos[ indice=" + indice + " ]";
    }
    
}
