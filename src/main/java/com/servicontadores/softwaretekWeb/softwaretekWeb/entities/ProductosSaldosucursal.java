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
@Table(name = "productos_saldosucursal")
@NamedQueries({
    @NamedQuery(name = "ProductosSaldosucursal.findAll", query = "SELECT p FROM ProductosSaldosucursal p")})
public class ProductosSaldosucursal implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(nullable = false)
    private Integer id;
    @Column(length = 255)
    private String codigoProducto;
    private Integer dBSaldo;
    private Integer dBSaldoINV;
    private Integer codigoSucursal;
    @Column(name = "ODBCFIX_FLDAUTO")
    private Integer odbcfixFldauto;

    public ProductosSaldosucursal() {
    }

    public ProductosSaldosucursal(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCodigoProducto() {
        return codigoProducto;
    }

    public void setCodigoProducto(String codigoProducto) {
        this.codigoProducto = codigoProducto;
    }

    public Integer getDBSaldo() {
        return dBSaldo;
    }

    public void setDBSaldo(Integer dBSaldo) {
        this.dBSaldo = dBSaldo;
    }

    public Integer getDBSaldoINV() {
        return dBSaldoINV;
    }

    public void setDBSaldoINV(Integer dBSaldoINV) {
        this.dBSaldoINV = dBSaldoINV;
    }

    public Integer getCodigoSucursal() {
        return codigoSucursal;
    }

    public void setCodigoSucursal(Integer codigoSucursal) {
        this.codigoSucursal = codigoSucursal;
    }

    public Integer getOdbcfixFldauto() {
        return odbcfixFldauto;
    }

    public void setOdbcfixFldauto(Integer odbcfixFldauto) {
        this.odbcfixFldauto = odbcfixFldauto;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ProductosSaldosucursal)) {
            return false;
        }
        ProductosSaldosucursal other = (ProductosSaldosucursal) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.ProductosSaldosucursal[ id=" + id + " ]";
    }
    
}
