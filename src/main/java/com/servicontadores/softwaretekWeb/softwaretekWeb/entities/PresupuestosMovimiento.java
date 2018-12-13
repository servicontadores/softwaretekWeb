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
@Table(name = "presupuestos_movimiento")
@NamedQueries({
    @NamedQuery(name = "PresupuestosMovimiento.findAll", query = "SELECT p FROM PresupuestosMovimiento p")})
public class PresupuestosMovimiento implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(nullable = false)
    private Integer keyMovimiento;
    @Basic(optional = false)
    @Column(nullable = false)
    private double saldoReferencia;
    @Basic(optional = false)
    @Column(nullable = false)
    private double valor;
    @Basic(optional = false)
    @Column(nullable = false)
    private double debito;
    @Basic(optional = false)
    @Column(nullable = false)
    private double credito;
    @Column(length = 250)
    private String detalle;
    @Column(name = "ODBCFIX_AUTO")
    private Integer odbcfixAuto;
    @JoinColumn(name = "KeyEncabezadoMovimiento", referencedColumnName = "KeyEncabezadoMovimiento", nullable = false)
    @ManyToOne(optional = false)
    private PresupuestosEncabezadomovimiento keyEncabezadoMovimiento;
    @JoinColumn(name = "KeyRubro", referencedColumnName = "KeyRubro", nullable = false)
    @ManyToOne(optional = false)
    private PresupuestosRubro keyRubro;

    public PresupuestosMovimiento() {
    }

    public PresupuestosMovimiento(Integer keyMovimiento) {
        this.keyMovimiento = keyMovimiento;
    }

    public PresupuestosMovimiento(Integer keyMovimiento, double saldoReferencia, double valor, double debito, double credito) {
        this.keyMovimiento = keyMovimiento;
        this.saldoReferencia = saldoReferencia;
        this.valor = valor;
        this.debito = debito;
        this.credito = credito;
    }

    public Integer getKeyMovimiento() {
        return keyMovimiento;
    }

    public void setKeyMovimiento(Integer keyMovimiento) {
        this.keyMovimiento = keyMovimiento;
    }

    public double getSaldoReferencia() {
        return saldoReferencia;
    }

    public void setSaldoReferencia(double saldoReferencia) {
        this.saldoReferencia = saldoReferencia;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public double getDebito() {
        return debito;
    }

    public void setDebito(double debito) {
        this.debito = debito;
    }

    public double getCredito() {
        return credito;
    }

    public void setCredito(double credito) {
        this.credito = credito;
    }

    public String getDetalle() {
        return detalle;
    }

    public void setDetalle(String detalle) {
        this.detalle = detalle;
    }

    public Integer getOdbcfixAuto() {
        return odbcfixAuto;
    }

    public void setOdbcfixAuto(Integer odbcfixAuto) {
        this.odbcfixAuto = odbcfixAuto;
    }

    public PresupuestosEncabezadomovimiento getKeyEncabezadoMovimiento() {
        return keyEncabezadoMovimiento;
    }

    public void setKeyEncabezadoMovimiento(PresupuestosEncabezadomovimiento keyEncabezadoMovimiento) {
        this.keyEncabezadoMovimiento = keyEncabezadoMovimiento;
    }

    public PresupuestosRubro getKeyRubro() {
        return keyRubro;
    }

    public void setKeyRubro(PresupuestosRubro keyRubro) {
        this.keyRubro = keyRubro;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (keyMovimiento != null ? keyMovimiento.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PresupuestosMovimiento)) {
            return false;
        }
        PresupuestosMovimiento other = (PresupuestosMovimiento) object;
        if ((this.keyMovimiento == null && other.keyMovimiento != null) || (this.keyMovimiento != null && !this.keyMovimiento.equals(other.keyMovimiento))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.PresupuestosMovimiento[ keyMovimiento=" + keyMovimiento + " ]";
    }
    
}
