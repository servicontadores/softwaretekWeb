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
@Table(name = "productos_presentaciones")
@NamedQueries({
    @NamedQuery(name = "ProductosPresentaciones.findAll", query = "SELECT p FROM ProductosPresentaciones p")})
public class ProductosPresentaciones implements Serializable {

    private static final long serialVersionUID = 1L;
    private Integer indice;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(nullable = false)
    private Integer id;
    @Column(name = "Id_Presentacion")
    private Integer idPresentacion;
    @Basic(optional = false)
    @Column(nullable = false, length = 45)
    private String codigoProducto;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(precision = 11, scale = 0)
    private Double tarifaConversion;
    @Column(precision = 11, scale = 0)
    private Double p1Porcentaje;
    @Column(precision = 11, scale = 0)
    private Double p1VrBruto;
    private Integer p1piva;
    private Integer p1VrTotal;
    @Column(precision = 11, scale = 0)
    private Double p2Porcentaje;
    @Column(precision = 11, scale = 0)
    private Double p2VrBruto;
    private Integer p2piva;
    private Integer p2VrTotal;
    @Column(precision = 11, scale = 0)
    private Double p3Porcentaje;
    @Column(precision = 11, scale = 0)
    private Double p3VrBruto;
    private Integer p3piva;
    private Integer p3VrTotal;
    @Column(precision = 11, scale = 0)
    private Double p4Porcentaje;
    @Column(precision = 11, scale = 0)
    private Double p4VrBruto;
    private Integer p4piva;
    private Integer p4VrTotal;
    @Column(name = "ODBCFIX_FLDAUTO")
    private Integer odbcfixFldauto;
    @Column(precision = 22)
    private Double p1Impoconsumo;
    @Column(precision = 22)
    private Double p2Impoconsumo;
    @Column(precision = 22)
    private Double p3Impoconsumo;
    @Column(precision = 22)
    private Double p4Impoconsumo;

    public ProductosPresentaciones() {
    }

    public ProductosPresentaciones(Integer id) {
        this.id = id;
    }

    public ProductosPresentaciones(Integer id, String codigoProducto) {
        this.id = id;
        this.codigoProducto = codigoProducto;
    }

    public Integer getIndice() {
        return indice;
    }

    public void setIndice(Integer indice) {
        this.indice = indice;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getIdPresentacion() {
        return idPresentacion;
    }

    public void setIdPresentacion(Integer idPresentacion) {
        this.idPresentacion = idPresentacion;
    }

    public String getCodigoProducto() {
        return codigoProducto;
    }

    public void setCodigoProducto(String codigoProducto) {
        this.codigoProducto = codigoProducto;
    }

    public Double getTarifaConversion() {
        return tarifaConversion;
    }

    public void setTarifaConversion(Double tarifaConversion) {
        this.tarifaConversion = tarifaConversion;
    }

    public Double getP1Porcentaje() {
        return p1Porcentaje;
    }

    public void setP1Porcentaje(Double p1Porcentaje) {
        this.p1Porcentaje = p1Porcentaje;
    }

    public Double getP1VrBruto() {
        return p1VrBruto;
    }

    public void setP1VrBruto(Double p1VrBruto) {
        this.p1VrBruto = p1VrBruto;
    }

    public Integer getP1piva() {
        return p1piva;
    }

    public void setP1piva(Integer p1piva) {
        this.p1piva = p1piva;
    }

    public Integer getP1VrTotal() {
        return p1VrTotal;
    }

    public void setP1VrTotal(Integer p1VrTotal) {
        this.p1VrTotal = p1VrTotal;
    }

    public Double getP2Porcentaje() {
        return p2Porcentaje;
    }

    public void setP2Porcentaje(Double p2Porcentaje) {
        this.p2Porcentaje = p2Porcentaje;
    }

    public Double getP2VrBruto() {
        return p2VrBruto;
    }

    public void setP2VrBruto(Double p2VrBruto) {
        this.p2VrBruto = p2VrBruto;
    }

    public Integer getP2piva() {
        return p2piva;
    }

    public void setP2piva(Integer p2piva) {
        this.p2piva = p2piva;
    }

    public Integer getP2VrTotal() {
        return p2VrTotal;
    }

    public void setP2VrTotal(Integer p2VrTotal) {
        this.p2VrTotal = p2VrTotal;
    }

    public Double getP3Porcentaje() {
        return p3Porcentaje;
    }

    public void setP3Porcentaje(Double p3Porcentaje) {
        this.p3Porcentaje = p3Porcentaje;
    }

    public Double getP3VrBruto() {
        return p3VrBruto;
    }

    public void setP3VrBruto(Double p3VrBruto) {
        this.p3VrBruto = p3VrBruto;
    }

    public Integer getP3piva() {
        return p3piva;
    }

    public void setP3piva(Integer p3piva) {
        this.p3piva = p3piva;
    }

    public Integer getP3VrTotal() {
        return p3VrTotal;
    }

    public void setP3VrTotal(Integer p3VrTotal) {
        this.p3VrTotal = p3VrTotal;
    }

    public Double getP4Porcentaje() {
        return p4Porcentaje;
    }

    public void setP4Porcentaje(Double p4Porcentaje) {
        this.p4Porcentaje = p4Porcentaje;
    }

    public Double getP4VrBruto() {
        return p4VrBruto;
    }

    public void setP4VrBruto(Double p4VrBruto) {
        this.p4VrBruto = p4VrBruto;
    }

    public Integer getP4piva() {
        return p4piva;
    }

    public void setP4piva(Integer p4piva) {
        this.p4piva = p4piva;
    }

    public Integer getP4VrTotal() {
        return p4VrTotal;
    }

    public void setP4VrTotal(Integer p4VrTotal) {
        this.p4VrTotal = p4VrTotal;
    }

    public Integer getOdbcfixFldauto() {
        return odbcfixFldauto;
    }

    public void setOdbcfixFldauto(Integer odbcfixFldauto) {
        this.odbcfixFldauto = odbcfixFldauto;
    }

    public Double getP1Impoconsumo() {
        return p1Impoconsumo;
    }

    public void setP1Impoconsumo(Double p1Impoconsumo) {
        this.p1Impoconsumo = p1Impoconsumo;
    }

    public Double getP2Impoconsumo() {
        return p2Impoconsumo;
    }

    public void setP2Impoconsumo(Double p2Impoconsumo) {
        this.p2Impoconsumo = p2Impoconsumo;
    }

    public Double getP3Impoconsumo() {
        return p3Impoconsumo;
    }

    public void setP3Impoconsumo(Double p3Impoconsumo) {
        this.p3Impoconsumo = p3Impoconsumo;
    }

    public Double getP4Impoconsumo() {
        return p4Impoconsumo;
    }

    public void setP4Impoconsumo(Double p4Impoconsumo) {
        this.p4Impoconsumo = p4Impoconsumo;
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
        if (!(object instanceof ProductosPresentaciones)) {
            return false;
        }
        ProductosPresentaciones other = (ProductosPresentaciones) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.ProductosPresentaciones[ id=" + id + " ]";
    }
    
}
