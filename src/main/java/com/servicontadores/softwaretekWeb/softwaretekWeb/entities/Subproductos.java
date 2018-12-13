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

/**
 *
 * @author yesidherrera
 */
@Entity
@NamedQueries({
    @NamedQuery(name = "Subproductos.findAll", query = "SELECT s FROM Subproductos s")})
public class Subproductos implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(nullable = false)
    private Integer cody;
    @Basic(optional = false)
    @Column(nullable = false, length = 50)
    private String codigoProducto;
    @Basic(optional = false)
    @Column(nullable = false)
    private double cantidad;
    @Basic(optional = false)
    @Column(name = "ODBCFIX_FLDAUTO", nullable = false)
    private int odbcfixFldauto;
    @JoinColumn(name = "CodigoSubProducto", referencedColumnName = "CODIGO", nullable = false)
    @ManyToOne(optional = false)
    private Productos codigoSubProducto;

    public Subproductos() {
    }

    public Subproductos(Integer cody) {
        this.cody = cody;
    }

    public Subproductos(Integer cody, String codigoProducto, double cantidad, int odbcfixFldauto) {
        this.cody = cody;
        this.codigoProducto = codigoProducto;
        this.cantidad = cantidad;
        this.odbcfixFldauto = odbcfixFldauto;
    }

    public Integer getCody() {
        return cody;
    }

    public void setCody(Integer cody) {
        this.cody = cody;
    }

    public String getCodigoProducto() {
        return codigoProducto;
    }

    public void setCodigoProducto(String codigoProducto) {
        this.codigoProducto = codigoProducto;
    }

    public double getCantidad() {
        return cantidad;
    }

    public void setCantidad(double cantidad) {
        this.cantidad = cantidad;
    }

    public int getOdbcfixFldauto() {
        return odbcfixFldauto;
    }

    public void setOdbcfixFldauto(int odbcfixFldauto) {
        this.odbcfixFldauto = odbcfixFldauto;
    }

    public Productos getCodigoSubProducto() {
        return codigoSubProducto;
    }

    public void setCodigoSubProducto(Productos codigoSubProducto) {
        this.codigoSubProducto = codigoSubProducto;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (cody != null ? cody.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Subproductos)) {
            return false;
        }
        Subproductos other = (Subproductos) object;
        if ((this.cody == null && other.cody != null) || (this.cody != null && !this.cody.equals(other.cody))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.Subproductos[ cody=" + cody + " ]";
    }
    
}
