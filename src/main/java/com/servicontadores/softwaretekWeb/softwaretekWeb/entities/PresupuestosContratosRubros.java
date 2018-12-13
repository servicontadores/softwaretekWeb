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
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 *
 * @author yesidherrera
 */
@Entity
@Table(name = "presupuestos_contratos_rubros")
@NamedQueries({
    @NamedQuery(name = "PresupuestosContratosRubros.findAll", query = "SELECT p FROM PresupuestosContratosRubros p")})
public class PresupuestosContratosRubros implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(nullable = false)
    private Integer indice;
    @Basic(optional = false)
    @Column(nullable = false)
    private int indiceContrato;
    @Basic(optional = false)
    @Column(nullable = false)
    private int keyRubro;
    @Basic(optional = false)
    @Column(nullable = false)
    private double valor;
    @Basic(optional = false)
    @Column(nullable = false)
    private int keyEncabezadoMovimientoReferencia;
    @Basic(optional = false)
    @Column(nullable = false)
    private double saldoReferencia;

    public PresupuestosContratosRubros() {
    }

    public PresupuestosContratosRubros(Integer indice) {
        this.indice = indice;
    }

    public PresupuestosContratosRubros(Integer indice, int indiceContrato, int keyRubro, double valor, int keyEncabezadoMovimientoReferencia, double saldoReferencia) {
        this.indice = indice;
        this.indiceContrato = indiceContrato;
        this.keyRubro = keyRubro;
        this.valor = valor;
        this.keyEncabezadoMovimientoReferencia = keyEncabezadoMovimientoReferencia;
        this.saldoReferencia = saldoReferencia;
    }

    public Integer getIndice() {
        return indice;
    }

    public void setIndice(Integer indice) {
        this.indice = indice;
    }

    public int getIndiceContrato() {
        return indiceContrato;
    }

    public void setIndiceContrato(int indiceContrato) {
        this.indiceContrato = indiceContrato;
    }

    public int getKeyRubro() {
        return keyRubro;
    }

    public void setKeyRubro(int keyRubro) {
        this.keyRubro = keyRubro;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public int getKeyEncabezadoMovimientoReferencia() {
        return keyEncabezadoMovimientoReferencia;
    }

    public void setKeyEncabezadoMovimientoReferencia(int keyEncabezadoMovimientoReferencia) {
        this.keyEncabezadoMovimientoReferencia = keyEncabezadoMovimientoReferencia;
    }

    public double getSaldoReferencia() {
        return saldoReferencia;
    }

    public void setSaldoReferencia(double saldoReferencia) {
        this.saldoReferencia = saldoReferencia;
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
        if (!(object instanceof PresupuestosContratosRubros)) {
            return false;
        }
        PresupuestosContratosRubros other = (PresupuestosContratosRubros) object;
        if ((this.indice == null && other.indice != null) || (this.indice != null && !this.indice.equals(other.indice))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.PresupuestosContratosRubros[ indice=" + indice + " ]";
    }
    
}
