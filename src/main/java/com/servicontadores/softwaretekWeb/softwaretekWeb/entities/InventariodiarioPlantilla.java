/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
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
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author yesidherrera
 */
@Entity
@Table(name = "inventariodiario_plantilla")
@NamedQueries({
    @NamedQuery(name = "InventariodiarioPlantilla.findAll", query = "SELECT i FROM InventariodiarioPlantilla i")})
public class InventariodiarioPlantilla implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(nullable = false)
    private Integer cody;
    @Temporal(TemporalType.TIMESTAMP)
    private Date fIng;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(precision = 19, scale = 4)
    private BigDecimal pVrBruto;
    @Column(precision = 7, scale = 2)
    private Double piva;
    @Column(precision = 19, scale = 4)
    private BigDecimal pVrIVA;
    @Column(precision = 19, scale = 4)
    private BigDecimal pVrTotal;
    @Column(precision = 19, scale = 4)
    private BigDecimal pVrTotalGen;
    @Column(precision = 22)
    private Double canje;
    @Column(precision = 22)
    private Double cantidad;
    @Column(precision = 22)
    private Double entradas;
    @Column(precision = 22)
    private Double salidas;
    private Integer gCostoBruto;
    @Column(precision = 7, scale = 2)
    private Double porcentajeDescuento;
    private Integer pVrDescuento;
    private Integer pTotalDescuento;
    @Column(precision = 19, scale = 4)
    private BigDecimal pBase;
    private Integer regedit;
    @Column(length = 45)
    private String lote;
    @Column(length = 50)
    private String detalle;
    @Basic(optional = false)
    @Column(name = "ODBCFIX_FLDAUTO", nullable = false)
    private int odbcfixFldauto;
    @Basic(optional = false)
    @Column(nullable = false)
    private double pImpoConsumo;
    @Basic(optional = false)
    @Column(nullable = false)
    private double vrPImpoConsumo;
    @Basic(optional = false)
    @Column(nullable = false)
    private double entradasINV;
    @Basic(optional = false)
    @Column(nullable = false)
    private double salidasINV;
    @Column(precision = 22)
    private Double dBCostoPromedioProducto;
    @JoinColumn(name = "ImpP", referencedColumnName = "Regedit", nullable = false)
    @ManyToOne(optional = false)
    private FacturarmovimientodiarioPlantilla impP;
    @JoinColumn(name = "CodigoProducto", referencedColumnName = "CODIGO", nullable = false)
    @ManyToOne(optional = false)
    private Productos codigoProducto;

    public InventariodiarioPlantilla() {
    }

    public InventariodiarioPlantilla(Integer cody) {
        this.cody = cody;
    }

    public InventariodiarioPlantilla(Integer cody, int odbcfixFldauto, double pImpoConsumo, double vrPImpoConsumo, double entradasINV, double salidasINV) {
        this.cody = cody;
        this.odbcfixFldauto = odbcfixFldauto;
        this.pImpoConsumo = pImpoConsumo;
        this.vrPImpoConsumo = vrPImpoConsumo;
        this.entradasINV = entradasINV;
        this.salidasINV = salidasINV;
    }

    public Integer getCody() {
        return cody;
    }

    public void setCody(Integer cody) {
        this.cody = cody;
    }

    public Date getFIng() {
        return fIng;
    }

    public void setFIng(Date fIng) {
        this.fIng = fIng;
    }

    public BigDecimal getPVrBruto() {
        return pVrBruto;
    }

    public void setPVrBruto(BigDecimal pVrBruto) {
        this.pVrBruto = pVrBruto;
    }

    public Double getPiva() {
        return piva;
    }

    public void setPiva(Double piva) {
        this.piva = piva;
    }

    public BigDecimal getPVrIVA() {
        return pVrIVA;
    }

    public void setPVrIVA(BigDecimal pVrIVA) {
        this.pVrIVA = pVrIVA;
    }

    public BigDecimal getPVrTotal() {
        return pVrTotal;
    }

    public void setPVrTotal(BigDecimal pVrTotal) {
        this.pVrTotal = pVrTotal;
    }

    public BigDecimal getPVrTotalGen() {
        return pVrTotalGen;
    }

    public void setPVrTotalGen(BigDecimal pVrTotalGen) {
        this.pVrTotalGen = pVrTotalGen;
    }

    public Double getCanje() {
        return canje;
    }

    public void setCanje(Double canje) {
        this.canje = canje;
    }

    public Double getCantidad() {
        return cantidad;
    }

    public void setCantidad(Double cantidad) {
        this.cantidad = cantidad;
    }

    public Double getEntradas() {
        return entradas;
    }

    public void setEntradas(Double entradas) {
        this.entradas = entradas;
    }

    public Double getSalidas() {
        return salidas;
    }

    public void setSalidas(Double salidas) {
        this.salidas = salidas;
    }

    public Integer getGCostoBruto() {
        return gCostoBruto;
    }

    public void setGCostoBruto(Integer gCostoBruto) {
        this.gCostoBruto = gCostoBruto;
    }

    public Double getPorcentajeDescuento() {
        return porcentajeDescuento;
    }

    public void setPorcentajeDescuento(Double porcentajeDescuento) {
        this.porcentajeDescuento = porcentajeDescuento;
    }

    public Integer getPVrDescuento() {
        return pVrDescuento;
    }

    public void setPVrDescuento(Integer pVrDescuento) {
        this.pVrDescuento = pVrDescuento;
    }

    public Integer getPTotalDescuento() {
        return pTotalDescuento;
    }

    public void setPTotalDescuento(Integer pTotalDescuento) {
        this.pTotalDescuento = pTotalDescuento;
    }

    public BigDecimal getPBase() {
        return pBase;
    }

    public void setPBase(BigDecimal pBase) {
        this.pBase = pBase;
    }

    public Integer getRegedit() {
        return regedit;
    }

    public void setRegedit(Integer regedit) {
        this.regedit = regedit;
    }

    public String getLote() {
        return lote;
    }

    public void setLote(String lote) {
        this.lote = lote;
    }

    public String getDetalle() {
        return detalle;
    }

    public void setDetalle(String detalle) {
        this.detalle = detalle;
    }

    public int getOdbcfixFldauto() {
        return odbcfixFldauto;
    }

    public void setOdbcfixFldauto(int odbcfixFldauto) {
        this.odbcfixFldauto = odbcfixFldauto;
    }

    public double getPImpoConsumo() {
        return pImpoConsumo;
    }

    public void setPImpoConsumo(double pImpoConsumo) {
        this.pImpoConsumo = pImpoConsumo;
    }

    public double getVrPImpoConsumo() {
        return vrPImpoConsumo;
    }

    public void setVrPImpoConsumo(double vrPImpoConsumo) {
        this.vrPImpoConsumo = vrPImpoConsumo;
    }

    public double getEntradasINV() {
        return entradasINV;
    }

    public void setEntradasINV(double entradasINV) {
        this.entradasINV = entradasINV;
    }

    public double getSalidasINV() {
        return salidasINV;
    }

    public void setSalidasINV(double salidasINV) {
        this.salidasINV = salidasINV;
    }

    public Double getDBCostoPromedioProducto() {
        return dBCostoPromedioProducto;
    }

    public void setDBCostoPromedioProducto(Double dBCostoPromedioProducto) {
        this.dBCostoPromedioProducto = dBCostoPromedioProducto;
    }

    public FacturarmovimientodiarioPlantilla getImpP() {
        return impP;
    }

    public void setImpP(FacturarmovimientodiarioPlantilla impP) {
        this.impP = impP;
    }

    public Productos getCodigoProducto() {
        return codigoProducto;
    }

    public void setCodigoProducto(Productos codigoProducto) {
        this.codigoProducto = codigoProducto;
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
        if (!(object instanceof InventariodiarioPlantilla)) {
            return false;
        }
        InventariodiarioPlantilla other = (InventariodiarioPlantilla) object;
        if ((this.cody == null && other.cody != null) || (this.cody != null && !this.cody.equals(other.cody))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.InventariodiarioPlantilla[ cody=" + cody + " ]";
    }
    
}
