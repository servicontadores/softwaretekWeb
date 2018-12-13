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
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author yesidherrera
 */
@Entity
@NamedQueries({
    @NamedQuery(name = "Inventariopendiente.findAll", query = "SELECT i FROM Inventariopendiente i")})
public class Inventariopendiente implements Serializable {

    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @Column(nullable = false)
    private int cody;
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
    private Integer cancelado;
    private Integer precio;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(nullable = false)
    private Integer id;
    private Short guardado;
    @Column(length = 255)
    private String estado;
    @Column(precision = 11, scale = 0)
    private Double cantidad2;
    @Column(precision = 22)
    private Double dBCostoPromedioProducto;
    @Lob
    @Column(length = 65535)
    private String presentacion;
    private Short mercanciaEntregada;
    private Short conceptoMueveInventario;
    @Column(precision = 22)
    private Double pVrBruto2;
    @Column(precision = 22)
    private Double pBase2;
    @Column(precision = 22)
    private Double pBase3;
    @Column(name = "Id_Unidad")
    private Integer idUnidad;
    @Column(precision = 22)
    private Double tarifaConversion;
    @Column(precision = 22)
    private Double costototalProducto;
    private Short promediodesdeCompravrTotal;
    @Column(precision = 22)
    private Double gCostoBruto2;
    private Short promediarPorCostoPromedio;
    private Short promediarPorCostoUltmCosto;
    private Short promediarPorCostoAnt;
    private Short promedioManual;
    private Short proceso;
    @Column(length = 50)
    private String codigoSinonimo;
    @Column(precision = 22)
    private Double gCostoTotal;
    @JoinColumn(name = "ImpP", referencedColumnName = "Regedit", nullable = false)
    @ManyToOne(optional = false)
    private Facturarmovimientopendiente impP;
    @JoinColumn(name = "CodigoProducto", referencedColumnName = "CODIGO", nullable = false)
    @ManyToOne(optional = false)
    private Productos codigoProducto;

    public Inventariopendiente() {
    }

    public Inventariopendiente(Integer id) {
        this.id = id;
    }

    public Inventariopendiente(Integer id, int cody, int odbcfixFldauto, double pImpoConsumo, double vrPImpoConsumo, double entradasINV, double salidasINV) {
        this.id = id;
        this.cody = cody;
        this.odbcfixFldauto = odbcfixFldauto;
        this.pImpoConsumo = pImpoConsumo;
        this.vrPImpoConsumo = vrPImpoConsumo;
        this.entradasINV = entradasINV;
        this.salidasINV = salidasINV;
    }

    public int getCody() {
        return cody;
    }

    public void setCody(int cody) {
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

    public Integer getCancelado() {
        return cancelado;
    }

    public void setCancelado(Integer cancelado) {
        this.cancelado = cancelado;
    }

    public Integer getPrecio() {
        return precio;
    }

    public void setPrecio(Integer precio) {
        this.precio = precio;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Short getGuardado() {
        return guardado;
    }

    public void setGuardado(Short guardado) {
        this.guardado = guardado;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public Double getCantidad2() {
        return cantidad2;
    }

    public void setCantidad2(Double cantidad2) {
        this.cantidad2 = cantidad2;
    }

    public Double getDBCostoPromedioProducto() {
        return dBCostoPromedioProducto;
    }

    public void setDBCostoPromedioProducto(Double dBCostoPromedioProducto) {
        this.dBCostoPromedioProducto = dBCostoPromedioProducto;
    }

    public String getPresentacion() {
        return presentacion;
    }

    public void setPresentacion(String presentacion) {
        this.presentacion = presentacion;
    }

    public Short getMercanciaEntregada() {
        return mercanciaEntregada;
    }

    public void setMercanciaEntregada(Short mercanciaEntregada) {
        this.mercanciaEntregada = mercanciaEntregada;
    }

    public Short getConceptoMueveInventario() {
        return conceptoMueveInventario;
    }

    public void setConceptoMueveInventario(Short conceptoMueveInventario) {
        this.conceptoMueveInventario = conceptoMueveInventario;
    }

    public Double getPVrBruto2() {
        return pVrBruto2;
    }

    public void setPVrBruto2(Double pVrBruto2) {
        this.pVrBruto2 = pVrBruto2;
    }

    public Double getPBase2() {
        return pBase2;
    }

    public void setPBase2(Double pBase2) {
        this.pBase2 = pBase2;
    }

    public Double getPBase3() {
        return pBase3;
    }

    public void setPBase3(Double pBase3) {
        this.pBase3 = pBase3;
    }

    public Integer getIdUnidad() {
        return idUnidad;
    }

    public void setIdUnidad(Integer idUnidad) {
        this.idUnidad = idUnidad;
    }

    public Double getTarifaConversion() {
        return tarifaConversion;
    }

    public void setTarifaConversion(Double tarifaConversion) {
        this.tarifaConversion = tarifaConversion;
    }

    public Double getCostototalProducto() {
        return costototalProducto;
    }

    public void setCostototalProducto(Double costototalProducto) {
        this.costototalProducto = costototalProducto;
    }

    public Short getPromediodesdeCompravrTotal() {
        return promediodesdeCompravrTotal;
    }

    public void setPromediodesdeCompravrTotal(Short promediodesdeCompravrTotal) {
        this.promediodesdeCompravrTotal = promediodesdeCompravrTotal;
    }

    public Double getGCostoBruto2() {
        return gCostoBruto2;
    }

    public void setGCostoBruto2(Double gCostoBruto2) {
        this.gCostoBruto2 = gCostoBruto2;
    }

    public Short getPromediarPorCostoPromedio() {
        return promediarPorCostoPromedio;
    }

    public void setPromediarPorCostoPromedio(Short promediarPorCostoPromedio) {
        this.promediarPorCostoPromedio = promediarPorCostoPromedio;
    }

    public Short getPromediarPorCostoUltmCosto() {
        return promediarPorCostoUltmCosto;
    }

    public void setPromediarPorCostoUltmCosto(Short promediarPorCostoUltmCosto) {
        this.promediarPorCostoUltmCosto = promediarPorCostoUltmCosto;
    }

    public Short getPromediarPorCostoAnt() {
        return promediarPorCostoAnt;
    }

    public void setPromediarPorCostoAnt(Short promediarPorCostoAnt) {
        this.promediarPorCostoAnt = promediarPorCostoAnt;
    }

    public Short getPromedioManual() {
        return promedioManual;
    }

    public void setPromedioManual(Short promedioManual) {
        this.promedioManual = promedioManual;
    }

    public Short getProceso() {
        return proceso;
    }

    public void setProceso(Short proceso) {
        this.proceso = proceso;
    }

    public String getCodigoSinonimo() {
        return codigoSinonimo;
    }

    public void setCodigoSinonimo(String codigoSinonimo) {
        this.codigoSinonimo = codigoSinonimo;
    }

    public Double getGCostoTotal() {
        return gCostoTotal;
    }

    public void setGCostoTotal(Double gCostoTotal) {
        this.gCostoTotal = gCostoTotal;
    }

    public Facturarmovimientopendiente getImpP() {
        return impP;
    }

    public void setImpP(Facturarmovimientopendiente impP) {
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
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Inventariopendiente)) {
            return false;
        }
        Inventariopendiente other = (Inventariopendiente) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.Inventariopendiente[ id=" + id + " ]";
    }
    
}
