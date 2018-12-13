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
    @NamedQuery(name = "Vendedor.findAll", query = "SELECT v FROM Vendedor v")})
public class Vendedor implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(nullable = false, length = 45)
    private String codigoVendedor;
    @Basic(optional = false)
    @Column(nullable = false)
    private double comision;
    @Column(length = 45)
    private String detalle;
    @Basic(optional = false)
    @Column(nullable = false, length = 45)
    private String codigo;
    @Basic(optional = false)
    @Column(name = "ODBCFIX_FLDAUTO", nullable = false)
    private int odbcfixFldauto;

    public Vendedor() {
    }

    public Vendedor(String codigoVendedor) {
        this.codigoVendedor = codigoVendedor;
    }

    public Vendedor(String codigoVendedor, double comision, String codigo, int odbcfixFldauto) {
        this.codigoVendedor = codigoVendedor;
        this.comision = comision;
        this.codigo = codigo;
        this.odbcfixFldauto = odbcfixFldauto;
    }

    public String getCodigoVendedor() {
        return codigoVendedor;
    }

    public void setCodigoVendedor(String codigoVendedor) {
        this.codigoVendedor = codigoVendedor;
    }

    public double getComision() {
        return comision;
    }

    public void setComision(double comision) {
        this.comision = comision;
    }

    public String getDetalle() {
        return detalle;
    }

    public void setDetalle(String detalle) {
        this.detalle = detalle;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public int getOdbcfixFldauto() {
        return odbcfixFldauto;
    }

    public void setOdbcfixFldauto(int odbcfixFldauto) {
        this.odbcfixFldauto = odbcfixFldauto;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codigoVendedor != null ? codigoVendedor.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Vendedor)) {
            return false;
        }
        Vendedor other = (Vendedor) object;
        if ((this.codigoVendedor == null && other.codigoVendedor != null) || (this.codigoVendedor != null && !this.codigoVendedor.equals(other.codigoVendedor))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.Vendedor[ codigoVendedor=" + codigoVendedor + " ]";
    }
    
}
