/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.UniqueConstraint;

/**
 *
 * @author yesidherrera
 */
@Entity
@Table(uniqueConstraints = {
    @UniqueConstraint(columnNames = {"Cody"})})
@NamedQueries({
    @NamedQuery(name = "Productos.findAll", query = "SELECT p FROM Productos p")})
public class Productos implements Serializable {

    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @Column(nullable = false)
    private int cody;
    @Temporal(TemporalType.TIMESTAMP)
    private Date fecha;
    @Id
    @Basic(optional = false)
    @Column(nullable = false, length = 50)
    private String codigo;
    @Column(length = 300)
    private String descripcion;
    @Column(length = 50)
    private String ubicacion;
    @Column(length = 50)
    private String puesto;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(precision = 22)
    private Double compraVrBruto;
    @Column(precision = 22)
    private Double compraIva;
    @Column(precision = 22)
    private Double compravrIva;
    @Column(precision = 22)
    private Double compravrtotal;
    @Column(precision = 22)
    private Double ventavrbruto;
    @Column(precision = 22)
    private Double ventaiva;
    @Column(precision = 22)
    private Double ventavriva;
    @Column(precision = 22)
    private Double ventavrtotal;
    @Column(precision = 7, scale = 2)
    private Double porcentajeUtilidad;
    @Column(precision = 22)
    private Double vrutilidad;
    private Boolean preparado;
    @Basic(optional = false)
    @Column(nullable = false)
    private boolean miv;
    @Column(precision = 22)
    private Double dbpromediocompravrbruto;
    @Column(precision = 22)
    private Double promediocompravrbruto;
    @Column(precision = 22)
    private Double p2VrBruto;
    @Column(precision = 22)
    private Double p2iva;
    @Column(precision = 22)
    private Double p2VrIVA;
    @Column(precision = 22)
    private Double p2VrTotal;
    @Column(precision = 22)
    private Double p3VrBruto;
    @Column(precision = 22)
    private Double p3iva;
    @Column(precision = 22)
    private Double p3VrIVA;
    @Column(precision = 22)
    private Double p3VrTotal;
    @Column(precision = 22)
    private Double p2VrUtilidad;
    private Integer p2Utilidad;
    @Column(precision = 22)
    private Double p3VrUtilidad;
    private Integer p3Utilidad;
    private Integer bin;
    @Basic(optional = false)
    @Column(nullable = false)
    private short tipoIVA;
    @Column(length = 45)
    private String excluido;
    @Column(length = 50)
    private String ean13;
    @Basic(optional = false)
    @Column(nullable = false)
    private boolean activofijo;
    @Column(precision = 22)
    private Double stockMin;
    @Column(precision = 22)
    private Double stockMax;
    @Column(precision = 22)
    private Double puntoPedido;
    @Column(length = 50)
    private String detalle;
    private Boolean habilitado;
    @Column(precision = 22)
    private Double pDetal1;
    @Column(precision = 22)
    private Double cDetal1;
    @Column(precision = 22)
    private Double pDetal2;
    @Column(precision = 22)
    private Double cDetal2;
    @Column(precision = 22)
    private Double pDetal3;
    @Column(precision = 22)
    private Double cDetal3;
    @Column(precision = 22)
    private Double pDetal4;
    @Column(precision = 22)
    private Double cDetal4;
    @Column(precision = 22)
    private Double tipo;
    @Column(precision = 22)
    private Double pDetal5;
    @Column(precision = 22)
    private Double cDetal5;
    @Basic(optional = false)
    @Column(name = "ODBCFIX_FLDAUTO", nullable = false)
    private int odbcfixFldauto;
    @Basic(optional = false)
    @Column(nullable = false)
    private double dBSaldo;
    @Column(length = 45)
    private String cuentaPUC;
    @Basic(optional = false)
    @Column(nullable = false)
    private double ultimoPrecioCompra;
    @Basic(optional = false)
    @Column(nullable = false)
    private double dBSaldoINV;
    @Basic(optional = false)
    @Column(nullable = false)
    private boolean actualizarVrCompraAuto;
    private Short articuloHotel;
    @Column(precision = 22)
    private Double p4VrBruto;
    @Column(precision = 22)
    private Double p4iva;
    @Column(precision = 22)
    private Double p4VrIVA;
    @Column(precision = 22)
    private Double p4VrTotal;
    @Column(precision = 22)
    private Double p4VrUtilidad;
    @Column(precision = 22)
    private Double p4Utilidad;
    @Column(precision = 22)
    private Double porcentaje1;
    @Column(precision = 22)
    private Double porcentaje2;
    @Column(precision = 22)
    private Double porcentaje3;
    @Column(precision = 22)
    private Double porcentaje4;
    @Column(precision = 22)
    private Double dbpromediocompravrtotal;
    private Short minUnid;
    @Column(precision = 22)
    private Double ventaImpoconsumo;
    @Column(precision = 22)
    private Double ventaVrImpoconsumo;
    @Column(precision = 22)
    private Double p2Impoconsumo;
    @Column(precision = 22)
    private Double p2VrImpoconsumo;
    @Column(precision = 22)
    private Double p3Impoconsumo;
    @Column(precision = 22)
    private Double p3VrImpoconsumo;
    @Column(precision = 22)
    private Double p4Impoconsumo;
    @Column(precision = 22)
    private Double p4VrImpoconsumo;
    @Column(precision = 22)
    private Double compraImpoconsumo;
    @Column(precision = 22)
    private Double compraVrImpoconsumo;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "codigoProducto")
    private List<Inventariopendiente> inventariopendienteList;
    @JoinColumn(name = "Categoria", referencedColumnName = "cody")
    @ManyToOne
    private Categorias categoria;
    @JoinColumn(name = "CodigoLinea", referencedColumnName = "Codigo", nullable = false)
    @ManyToOne(optional = false)
    private Lineas codigoLinea;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "codigoProducto")
    private List<InventariodiarioPlantilla> inventariodiarioPlantillaList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "codigoSubProducto")
    private List<Subproductos> subproductosList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "codigoProducto")
    private List<Inventariodiario> inventariodiarioList;

    public Productos() {
    }

    public Productos(String codigo) {
        this.codigo = codigo;
    }

    public Productos(String codigo, int cody, boolean miv, short tipoIVA, boolean activofijo, int odbcfixFldauto, double dBSaldo, double ultimoPrecioCompra, double dBSaldoINV, boolean actualizarVrCompraAuto) {
        this.codigo = codigo;
        this.cody = cody;
        this.miv = miv;
        this.tipoIVA = tipoIVA;
        this.activofijo = activofijo;
        this.odbcfixFldauto = odbcfixFldauto;
        this.dBSaldo = dBSaldo;
        this.ultimoPrecioCompra = ultimoPrecioCompra;
        this.dBSaldoINV = dBSaldoINV;
        this.actualizarVrCompraAuto = actualizarVrCompraAuto;
    }

    public int getCody() {
        return cody;
    }

    public void setCody(int cody) {
        this.cody = cody;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    public Double getCompraVrBruto() {
        return compraVrBruto;
    }

    public void setCompraVrBruto(Double compraVrBruto) {
        this.compraVrBruto = compraVrBruto;
    }

    public Double getCompraIva() {
        return compraIva;
    }

    public void setCompraIva(Double compraIva) {
        this.compraIva = compraIva;
    }

    public Double getCompravrIva() {
        return compravrIva;
    }

    public void setCompravrIva(Double compravrIva) {
        this.compravrIva = compravrIva;
    }

    public Double getCompravrtotal() {
        return compravrtotal;
    }

    public void setCompravrtotal(Double compravrtotal) {
        this.compravrtotal = compravrtotal;
    }

    public Double getVentavrbruto() {
        return ventavrbruto;
    }

    public void setVentavrbruto(Double ventavrbruto) {
        this.ventavrbruto = ventavrbruto;
    }

    public Double getVentaiva() {
        return ventaiva;
    }

    public void setVentaiva(Double ventaiva) {
        this.ventaiva = ventaiva;
    }

    public Double getVentavriva() {
        return ventavriva;
    }

    public void setVentavriva(Double ventavriva) {
        this.ventavriva = ventavriva;
    }

    public Double getVentavrtotal() {
        return ventavrtotal;
    }

    public void setVentavrtotal(Double ventavrtotal) {
        this.ventavrtotal = ventavrtotal;
    }

    public Double getPorcentajeUtilidad() {
        return porcentajeUtilidad;
    }

    public void setPorcentajeUtilidad(Double porcentajeUtilidad) {
        this.porcentajeUtilidad = porcentajeUtilidad;
    }

    public Double getVrutilidad() {
        return vrutilidad;
    }

    public void setVrutilidad(Double vrutilidad) {
        this.vrutilidad = vrutilidad;
    }

    public Boolean getPreparado() {
        return preparado;
    }

    public void setPreparado(Boolean preparado) {
        this.preparado = preparado;
    }

    public boolean getMiv() {
        return miv;
    }

    public void setMiv(boolean miv) {
        this.miv = miv;
    }

    public Double getDbpromediocompravrbruto() {
        return dbpromediocompravrbruto;
    }

    public void setDbpromediocompravrbruto(Double dbpromediocompravrbruto) {
        this.dbpromediocompravrbruto = dbpromediocompravrbruto;
    }

    public Double getPromediocompravrbruto() {
        return promediocompravrbruto;
    }

    public void setPromediocompravrbruto(Double promediocompravrbruto) {
        this.promediocompravrbruto = promediocompravrbruto;
    }

    public Double getP2VrBruto() {
        return p2VrBruto;
    }

    public void setP2VrBruto(Double p2VrBruto) {
        this.p2VrBruto = p2VrBruto;
    }

    public Double getP2iva() {
        return p2iva;
    }

    public void setP2iva(Double p2iva) {
        this.p2iva = p2iva;
    }

    public Double getP2VrIVA() {
        return p2VrIVA;
    }

    public void setP2VrIVA(Double p2VrIVA) {
        this.p2VrIVA = p2VrIVA;
    }

    public Double getP2VrTotal() {
        return p2VrTotal;
    }

    public void setP2VrTotal(Double p2VrTotal) {
        this.p2VrTotal = p2VrTotal;
    }

    public Double getP3VrBruto() {
        return p3VrBruto;
    }

    public void setP3VrBruto(Double p3VrBruto) {
        this.p3VrBruto = p3VrBruto;
    }

    public Double getP3iva() {
        return p3iva;
    }

    public void setP3iva(Double p3iva) {
        this.p3iva = p3iva;
    }

    public Double getP3VrIVA() {
        return p3VrIVA;
    }

    public void setP3VrIVA(Double p3VrIVA) {
        this.p3VrIVA = p3VrIVA;
    }

    public Double getP3VrTotal() {
        return p3VrTotal;
    }

    public void setP3VrTotal(Double p3VrTotal) {
        this.p3VrTotal = p3VrTotal;
    }

    public Double getP2VrUtilidad() {
        return p2VrUtilidad;
    }

    public void setP2VrUtilidad(Double p2VrUtilidad) {
        this.p2VrUtilidad = p2VrUtilidad;
    }

    public Integer getP2Utilidad() {
        return p2Utilidad;
    }

    public void setP2Utilidad(Integer p2Utilidad) {
        this.p2Utilidad = p2Utilidad;
    }

    public Double getP3VrUtilidad() {
        return p3VrUtilidad;
    }

    public void setP3VrUtilidad(Double p3VrUtilidad) {
        this.p3VrUtilidad = p3VrUtilidad;
    }

    public Integer getP3Utilidad() {
        return p3Utilidad;
    }

    public void setP3Utilidad(Integer p3Utilidad) {
        this.p3Utilidad = p3Utilidad;
    }

    public Integer getBin() {
        return bin;
    }

    public void setBin(Integer bin) {
        this.bin = bin;
    }

    public short getTipoIVA() {
        return tipoIVA;
    }

    public void setTipoIVA(short tipoIVA) {
        this.tipoIVA = tipoIVA;
    }

    public String getExcluido() {
        return excluido;
    }

    public void setExcluido(String excluido) {
        this.excluido = excluido;
    }

    public String getEan13() {
        return ean13;
    }

    public void setEan13(String ean13) {
        this.ean13 = ean13;
    }

    public boolean getActivofijo() {
        return activofijo;
    }

    public void setActivofijo(boolean activofijo) {
        this.activofijo = activofijo;
    }

    public Double getStockMin() {
        return stockMin;
    }

    public void setStockMin(Double stockMin) {
        this.stockMin = stockMin;
    }

    public Double getStockMax() {
        return stockMax;
    }

    public void setStockMax(Double stockMax) {
        this.stockMax = stockMax;
    }

    public Double getPuntoPedido() {
        return puntoPedido;
    }

    public void setPuntoPedido(Double puntoPedido) {
        this.puntoPedido = puntoPedido;
    }

    public String getDetalle() {
        return detalle;
    }

    public void setDetalle(String detalle) {
        this.detalle = detalle;
    }

    public Boolean getHabilitado() {
        return habilitado;
    }

    public void setHabilitado(Boolean habilitado) {
        this.habilitado = habilitado;
    }

    public Double getPDetal1() {
        return pDetal1;
    }

    public void setPDetal1(Double pDetal1) {
        this.pDetal1 = pDetal1;
    }

    public Double getCDetal1() {
        return cDetal1;
    }

    public void setCDetal1(Double cDetal1) {
        this.cDetal1 = cDetal1;
    }

    public Double getPDetal2() {
        return pDetal2;
    }

    public void setPDetal2(Double pDetal2) {
        this.pDetal2 = pDetal2;
    }

    public Double getCDetal2() {
        return cDetal2;
    }

    public void setCDetal2(Double cDetal2) {
        this.cDetal2 = cDetal2;
    }

    public Double getPDetal3() {
        return pDetal3;
    }

    public void setPDetal3(Double pDetal3) {
        this.pDetal3 = pDetal3;
    }

    public Double getCDetal3() {
        return cDetal3;
    }

    public void setCDetal3(Double cDetal3) {
        this.cDetal3 = cDetal3;
    }

    public Double getPDetal4() {
        return pDetal4;
    }

    public void setPDetal4(Double pDetal4) {
        this.pDetal4 = pDetal4;
    }

    public Double getCDetal4() {
        return cDetal4;
    }

    public void setCDetal4(Double cDetal4) {
        this.cDetal4 = cDetal4;
    }

    public Double getTipo() {
        return tipo;
    }

    public void setTipo(Double tipo) {
        this.tipo = tipo;
    }

    public Double getPDetal5() {
        return pDetal5;
    }

    public void setPDetal5(Double pDetal5) {
        this.pDetal5 = pDetal5;
    }

    public Double getCDetal5() {
        return cDetal5;
    }

    public void setCDetal5(Double cDetal5) {
        this.cDetal5 = cDetal5;
    }

    public int getOdbcfixFldauto() {
        return odbcfixFldauto;
    }

    public void setOdbcfixFldauto(int odbcfixFldauto) {
        this.odbcfixFldauto = odbcfixFldauto;
    }

    public double getDBSaldo() {
        return dBSaldo;
    }

    public void setDBSaldo(double dBSaldo) {
        this.dBSaldo = dBSaldo;
    }

    public String getCuentaPUC() {
        return cuentaPUC;
    }

    public void setCuentaPUC(String cuentaPUC) {
        this.cuentaPUC = cuentaPUC;
    }

    public double getUltimoPrecioCompra() {
        return ultimoPrecioCompra;
    }

    public void setUltimoPrecioCompra(double ultimoPrecioCompra) {
        this.ultimoPrecioCompra = ultimoPrecioCompra;
    }

    public double getDBSaldoINV() {
        return dBSaldoINV;
    }

    public void setDBSaldoINV(double dBSaldoINV) {
        this.dBSaldoINV = dBSaldoINV;
    }

    public boolean getActualizarVrCompraAuto() {
        return actualizarVrCompraAuto;
    }

    public void setActualizarVrCompraAuto(boolean actualizarVrCompraAuto) {
        this.actualizarVrCompraAuto = actualizarVrCompraAuto;
    }

    public Short getArticuloHotel() {
        return articuloHotel;
    }

    public void setArticuloHotel(Short articuloHotel) {
        this.articuloHotel = articuloHotel;
    }

    public Double getP4VrBruto() {
        return p4VrBruto;
    }

    public void setP4VrBruto(Double p4VrBruto) {
        this.p4VrBruto = p4VrBruto;
    }

    public Double getP4iva() {
        return p4iva;
    }

    public void setP4iva(Double p4iva) {
        this.p4iva = p4iva;
    }

    public Double getP4VrIVA() {
        return p4VrIVA;
    }

    public void setP4VrIVA(Double p4VrIVA) {
        this.p4VrIVA = p4VrIVA;
    }

    public Double getP4VrTotal() {
        return p4VrTotal;
    }

    public void setP4VrTotal(Double p4VrTotal) {
        this.p4VrTotal = p4VrTotal;
    }

    public Double getP4VrUtilidad() {
        return p4VrUtilidad;
    }

    public void setP4VrUtilidad(Double p4VrUtilidad) {
        this.p4VrUtilidad = p4VrUtilidad;
    }

    public Double getP4Utilidad() {
        return p4Utilidad;
    }

    public void setP4Utilidad(Double p4Utilidad) {
        this.p4Utilidad = p4Utilidad;
    }

    public Double getPorcentaje1() {
        return porcentaje1;
    }

    public void setPorcentaje1(Double porcentaje1) {
        this.porcentaje1 = porcentaje1;
    }

    public Double getPorcentaje2() {
        return porcentaje2;
    }

    public void setPorcentaje2(Double porcentaje2) {
        this.porcentaje2 = porcentaje2;
    }

    public Double getPorcentaje3() {
        return porcentaje3;
    }

    public void setPorcentaje3(Double porcentaje3) {
        this.porcentaje3 = porcentaje3;
    }

    public Double getPorcentaje4() {
        return porcentaje4;
    }

    public void setPorcentaje4(Double porcentaje4) {
        this.porcentaje4 = porcentaje4;
    }

    public Double getDbpromediocompravrtotal() {
        return dbpromediocompravrtotal;
    }

    public void setDbpromediocompravrtotal(Double dbpromediocompravrtotal) {
        this.dbpromediocompravrtotal = dbpromediocompravrtotal;
    }

    public Short getMinUnid() {
        return minUnid;
    }

    public void setMinUnid(Short minUnid) {
        this.minUnid = minUnid;
    }

    public Double getVentaImpoconsumo() {
        return ventaImpoconsumo;
    }

    public void setVentaImpoconsumo(Double ventaImpoconsumo) {
        this.ventaImpoconsumo = ventaImpoconsumo;
    }

    public Double getVentaVrImpoconsumo() {
        return ventaVrImpoconsumo;
    }

    public void setVentaVrImpoconsumo(Double ventaVrImpoconsumo) {
        this.ventaVrImpoconsumo = ventaVrImpoconsumo;
    }

    public Double getP2Impoconsumo() {
        return p2Impoconsumo;
    }

    public void setP2Impoconsumo(Double p2Impoconsumo) {
        this.p2Impoconsumo = p2Impoconsumo;
    }

    public Double getP2VrImpoconsumo() {
        return p2VrImpoconsumo;
    }

    public void setP2VrImpoconsumo(Double p2VrImpoconsumo) {
        this.p2VrImpoconsumo = p2VrImpoconsumo;
    }

    public Double getP3Impoconsumo() {
        return p3Impoconsumo;
    }

    public void setP3Impoconsumo(Double p3Impoconsumo) {
        this.p3Impoconsumo = p3Impoconsumo;
    }

    public Double getP3VrImpoconsumo() {
        return p3VrImpoconsumo;
    }

    public void setP3VrImpoconsumo(Double p3VrImpoconsumo) {
        this.p3VrImpoconsumo = p3VrImpoconsumo;
    }

    public Double getP4Impoconsumo() {
        return p4Impoconsumo;
    }

    public void setP4Impoconsumo(Double p4Impoconsumo) {
        this.p4Impoconsumo = p4Impoconsumo;
    }

    public Double getP4VrImpoconsumo() {
        return p4VrImpoconsumo;
    }

    public void setP4VrImpoconsumo(Double p4VrImpoconsumo) {
        this.p4VrImpoconsumo = p4VrImpoconsumo;
    }

    public Double getCompraImpoconsumo() {
        return compraImpoconsumo;
    }

    public void setCompraImpoconsumo(Double compraImpoconsumo) {
        this.compraImpoconsumo = compraImpoconsumo;
    }

    public Double getCompraVrImpoconsumo() {
        return compraVrImpoconsumo;
    }

    public void setCompraVrImpoconsumo(Double compraVrImpoconsumo) {
        this.compraVrImpoconsumo = compraVrImpoconsumo;
    }

    public List<Inventariopendiente> getInventariopendienteList() {
        return inventariopendienteList;
    }

    public void setInventariopendienteList(List<Inventariopendiente> inventariopendienteList) {
        this.inventariopendienteList = inventariopendienteList;
    }

    public Categorias getCategoria() {
        return categoria;
    }

    public void setCategoria(Categorias categoria) {
        this.categoria = categoria;
    }

    public Lineas getCodigoLinea() {
        return codigoLinea;
    }

    public void setCodigoLinea(Lineas codigoLinea) {
        this.codigoLinea = codigoLinea;
    }

    public List<InventariodiarioPlantilla> getInventariodiarioPlantillaList() {
        return inventariodiarioPlantillaList;
    }

    public void setInventariodiarioPlantillaList(List<InventariodiarioPlantilla> inventariodiarioPlantillaList) {
        this.inventariodiarioPlantillaList = inventariodiarioPlantillaList;
    }

    public List<Subproductos> getSubproductosList() {
        return subproductosList;
    }

    public void setSubproductosList(List<Subproductos> subproductosList) {
        this.subproductosList = subproductosList;
    }

    public List<Inventariodiario> getInventariodiarioList() {
        return inventariodiarioList;
    }

    public void setInventariodiarioList(List<Inventariodiario> inventariodiarioList) {
        this.inventariodiarioList = inventariodiarioList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codigo != null ? codigo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Productos)) {
            return false;
        }
        Productos other = (Productos) object;
        if ((this.codigo == null && other.codigo != null) || (this.codigo != null && !this.codigo.equals(other.codigo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.Productos[ codigo=" + codigo + " ]";
    }
    
}
