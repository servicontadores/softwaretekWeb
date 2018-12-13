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
import javax.persistence.Table;

/**
 *
 * @author yesidherrera
 */
@Entity
@Table(name = "egresos_impuestos")
@NamedQueries({
    @NamedQuery(name = "EgresosImpuestos.findAll", query = "SELECT e FROM EgresosImpuestos e")})
public class EgresosImpuestos implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(nullable = false)
    private Integer indice;
    @Basic(optional = false)
    @Column(nullable = false)
    private int cody;
    @Basic(optional = false)
    @Column(nullable = false)
    private int base;
    @Basic(optional = false)
    @Column(nullable = false)
    private int keyImpuesto;
    @Basic(optional = false)
    @Column(nullable = false)
    private int keyRetencion;
    @Basic(optional = false)
    @Column(nullable = false)
    private double tarifa;
    @JoinColumn(name = "Regedit", referencedColumnName = "Regedit", nullable = false)
    @ManyToOne(optional = false)
    private Encabezadoegresos regedit;

    public EgresosImpuestos() {
    }

    public EgresosImpuestos(Integer indice) {
        this.indice = indice;
    }

    public EgresosImpuestos(Integer indice, int cody, int base, int keyImpuesto, int keyRetencion, double tarifa) {
        this.indice = indice;
        this.cody = cody;
        this.base = base;
        this.keyImpuesto = keyImpuesto;
        this.keyRetencion = keyRetencion;
        this.tarifa = tarifa;
    }

    public Integer getIndice() {
        return indice;
    }

    public void setIndice(Integer indice) {
        this.indice = indice;
    }

    public int getCody() {
        return cody;
    }

    public void setCody(int cody) {
        this.cody = cody;
    }

    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public int getKeyImpuesto() {
        return keyImpuesto;
    }

    public void setKeyImpuesto(int keyImpuesto) {
        this.keyImpuesto = keyImpuesto;
    }

    public int getKeyRetencion() {
        return keyRetencion;
    }

    public void setKeyRetencion(int keyRetencion) {
        this.keyRetencion = keyRetencion;
    }

    public double getTarifa() {
        return tarifa;
    }

    public void setTarifa(double tarifa) {
        this.tarifa = tarifa;
    }

    public Encabezadoegresos getRegedit() {
        return regedit;
    }

    public void setRegedit(Encabezadoegresos regedit) {
        this.regedit = regedit;
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
        if (!(object instanceof EgresosImpuestos)) {
            return false;
        }
        EgresosImpuestos other = (EgresosImpuestos) object;
        if ((this.indice == null && other.indice != null) || (this.indice != null && !this.indice.equals(other.indice))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.EgresosImpuestos[ indice=" + indice + " ]";
    }
    
}
