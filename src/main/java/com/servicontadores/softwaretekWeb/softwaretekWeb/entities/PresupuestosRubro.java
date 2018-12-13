/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import java.io.Serializable;
import java.util.List;
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
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author yesidherrera
 */
@Entity
@Table(name = "presupuestos_rubro")
@NamedQueries({
    @NamedQuery(name = "PresupuestosRubro.findAll", query = "SELECT p FROM PresupuestosRubro p")})
public class PresupuestosRubro implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(nullable = false)
    private Integer keyRubro;
    @Basic(optional = false)
    @Column(nullable = false, length = 50)
    private String codigoRubro;
    @Basic(optional = false)
    @Column(nullable = false, length = 300)
    private String nombreRubro;
    @Basic(optional = false)
    @Column(nullable = false)
    private double saldo;
    @Column(name = "ODBC_FIX")
    private Integer odbcFix;
    @JoinColumn(name = "KeyFondo", referencedColumnName = "KeyFondo")
    @ManyToOne
    private PresupuestosFondos keyFondo;
    @JoinColumn(name = "KeyProyecto", referencedColumnName = "KeyProyecto", nullable = false)
    @ManyToOne(optional = false)
    private PresupuestosProyecto keyProyecto;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "keyRubro")
    private List<PresupuestosMovimiento> presupuestosMovimientoList;

    public PresupuestosRubro() {
    }

    public PresupuestosRubro(Integer keyRubro) {
        this.keyRubro = keyRubro;
    }

    public PresupuestosRubro(Integer keyRubro, String codigoRubro, String nombreRubro, double saldo) {
        this.keyRubro = keyRubro;
        this.codigoRubro = codigoRubro;
        this.nombreRubro = nombreRubro;
        this.saldo = saldo;
    }

    public Integer getKeyRubro() {
        return keyRubro;
    }

    public void setKeyRubro(Integer keyRubro) {
        this.keyRubro = keyRubro;
    }

    public String getCodigoRubro() {
        return codigoRubro;
    }

    public void setCodigoRubro(String codigoRubro) {
        this.codigoRubro = codigoRubro;
    }

    public String getNombreRubro() {
        return nombreRubro;
    }

    public void setNombreRubro(String nombreRubro) {
        this.nombreRubro = nombreRubro;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public Integer getOdbcFix() {
        return odbcFix;
    }

    public void setOdbcFix(Integer odbcFix) {
        this.odbcFix = odbcFix;
    }

    public PresupuestosFondos getKeyFondo() {
        return keyFondo;
    }

    public void setKeyFondo(PresupuestosFondos keyFondo) {
        this.keyFondo = keyFondo;
    }

    public PresupuestosProyecto getKeyProyecto() {
        return keyProyecto;
    }

    public void setKeyProyecto(PresupuestosProyecto keyProyecto) {
        this.keyProyecto = keyProyecto;
    }

    public List<PresupuestosMovimiento> getPresupuestosMovimientoList() {
        return presupuestosMovimientoList;
    }

    public void setPresupuestosMovimientoList(List<PresupuestosMovimiento> presupuestosMovimientoList) {
        this.presupuestosMovimientoList = presupuestosMovimientoList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (keyRubro != null ? keyRubro.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PresupuestosRubro)) {
            return false;
        }
        PresupuestosRubro other = (PresupuestosRubro) object;
        if ((this.keyRubro == null && other.keyRubro != null) || (this.keyRubro != null && !this.keyRubro.equals(other.keyRubro))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.PresupuestosRubro[ keyRubro=" + keyRubro + " ]";
    }
    
}
