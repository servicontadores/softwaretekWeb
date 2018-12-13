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
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
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
    @NamedQuery(name = "Conceptosproductos.findAll", query = "SELECT c FROM Conceptosproductos c")})
public class Conceptosproductos implements Serializable {

    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @Column(nullable = false)
    private int cody;
    @Id
    @Basic(optional = false)
    @Column(nullable = false)
    private Integer codigo;
    private Integer indice;
    @Column(length = 50)
    private String nombreConcepto;
    @Column(length = 50)
    private String naturaleza;
    @Column(length = 50)
    private String muevePrecios;
    @Column(length = 50)
    private String tipoMovimiento;
    @Column(length = 2)
    private String afectaCosto;
    private Integer grupo;
    @Basic(optional = false)
    @Column(nullable = false)
    private boolean disponible;
    @Basic(optional = false)
    @Column(nullable = false)
    private boolean consecutivo;
    @Basic(optional = false)
    @Column(nullable = false)
    private boolean tabPorReg;
    @Column(length = 50)
    private String fuente;
    @Column(length = 50)
    private String cuentaBase;
    @Column(length = 50)
    private String naturalezaBase;
    @Column(length = 50)
    private String cuentaIVA;
    @Column(length = 50)
    private String naturalezaIVA;
    @Column(length = 50)
    private String cuentaReteFuente;
    @Column(length = 50)
    private String naturalezaReteFuente;
    @Column(length = 50)
    private String cuentaTotalMovimiento;
    @Column(length = 50)
    private String naturalezaTotalMovimiento;
    @Column(length = 50)
    private String cuentaCosto1;
    @Column(length = 50)
    private String naturalezaCosto1;
    @Column(length = 50)
    private String cuentaCosto2;
    @Column(length = 50)
    private String naturalezaCosto2;
    private Integer noConsecutivo;
    @Column(length = 50)
    private String etiquetaParaMostrar;
    @Column(length = 50)
    private String prefijo;
    @Column(length = 120)
    private String resolucionDIAN;
    private Integer bin;
    @Column(length = 20)
    private String cuentaReteIVA;
    @Column(length = 20)
    private String naturalezaReteIVA;
    @Column(length = 45)
    private String cuentaReteICA;
    @Column(length = 45)
    private String naturalezaReteICA;
    private Integer codigosucursal;
    @Column(length = 45)
    private String cuentaRETECREEDebito;
    @Column(length = 45)
    private String cuentaRETECREECredito;
    @Column(length = 200)
    private String impreso1;
    @Column(length = 200)
    private String impreso2;
    @Column(length = 200)
    private String impreso3;
    @Basic(optional = false)
    @Column(nullable = false)
    private short mueveIVA;
    @Basic(optional = false)
    @Column(nullable = false)
    private short exigeLogin;
    @Basic(optional = false)
    @Column(nullable = false)
    private short exigeVendedor;
    @Basic(optional = false)
    @Column(nullable = false)
    private short exigeTercero;
    @Basic(optional = false)
    @Column(nullable = false)
    private short exigeDocReferencia;
    @Column(length = 45)
    private String velocidad;
    @Column(name = "ODBCFIX_FLDAUTO")
    private Integer odbcfixFldauto;
    @Basic(optional = false)
    @Column(nullable = false)
    private short generaVale;
    @Basic(optional = false)
    @Column(nullable = false)
    private short contabilizar;
    @Basic(optional = false)
    @Column(nullable = false)
    private short verificarEntrega;
    @Column(length = 45)
    private String naturalezaImpoConsumo;
    @Column(length = 45)
    private String cuentaImpoConsumo;
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaVencimiento;
    private Integer consecutivoInicial;
    private Integer consecutivoFinal;
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaExpedicion;
    @Column(length = 20)
    private String resolucionNo;
    @Basic(optional = false)
    @Column(nullable = false)
    private short mueveInventario;
    @Column(length = 255)
    private String autoriza;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "codigoConcepto")
    private List<FacturarmovimientodiarioPlantilla> facturarmovimientodiarioPlantillaList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "codigoConcepto")
    private List<Facturarmovimientodiario> facturarmovimientodiarioList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "codigoConcepto")
    private List<Conceptossucursal> conceptossucursalList;
    @OneToMany(mappedBy = "codigoConcepto")
    private List<Encabezadootrosingresos> encabezadootrosingresosList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "codigoConcepto")
    private List<Facturarmovimientopendiente> facturarmovimientopendienteList;
    @OneToMany(mappedBy = "codigoConcepto")
    private List<Encabezadoegresos> encabezadoegresosList;
    @OneToOne(cascade = CascadeType.ALL, mappedBy = "conceptosproductos")
    private PuntosConfiguracion puntosConfiguracion;
    @OneToMany(mappedBy = "codigoConcepto")
    private List<Configuracionconceptos> configuracionconceptosList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "codigoConcepto")
    private List<Formapagoconcepto> formapagoconceptoList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "codigoConcepto")
    private List<Formatodocumentosconcepto> formatodocumentosconceptoList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "codigoConcepto")
    private List<PuntosTarifas> puntosTarifasList;

    public Conceptosproductos() {
    }

    public Conceptosproductos(Integer codigo) {
        this.codigo = codigo;
    }

    public Conceptosproductos(Integer codigo, int cody, boolean disponible, boolean consecutivo, boolean tabPorReg, short mueveIVA, short exigeLogin, short exigeVendedor, short exigeTercero, short exigeDocReferencia, short generaVale, short contabilizar, short verificarEntrega, short mueveInventario) {
        this.codigo = codigo;
        this.cody = cody;
        this.disponible = disponible;
        this.consecutivo = consecutivo;
        this.tabPorReg = tabPorReg;
        this.mueveIVA = mueveIVA;
        this.exigeLogin = exigeLogin;
        this.exigeVendedor = exigeVendedor;
        this.exigeTercero = exigeTercero;
        this.exigeDocReferencia = exigeDocReferencia;
        this.generaVale = generaVale;
        this.contabilizar = contabilizar;
        this.verificarEntrega = verificarEntrega;
        this.mueveInventario = mueveInventario;
    }

    public int getCody() {
        return cody;
    }

    public void setCody(int cody) {
        this.cody = cody;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public Integer getIndice() {
        return indice;
    }

    public void setIndice(Integer indice) {
        this.indice = indice;
    }

    public String getNombreConcepto() {
        return nombreConcepto;
    }

    public void setNombreConcepto(String nombreConcepto) {
        this.nombreConcepto = nombreConcepto;
    }

    public String getNaturaleza() {
        return naturaleza;
    }

    public void setNaturaleza(String naturaleza) {
        this.naturaleza = naturaleza;
    }

    public String getMuevePrecios() {
        return muevePrecios;
    }

    public void setMuevePrecios(String muevePrecios) {
        this.muevePrecios = muevePrecios;
    }

    public String getTipoMovimiento() {
        return tipoMovimiento;
    }

    public void setTipoMovimiento(String tipoMovimiento) {
        this.tipoMovimiento = tipoMovimiento;
    }

    public String getAfectaCosto() {
        return afectaCosto;
    }

    public void setAfectaCosto(String afectaCosto) {
        this.afectaCosto = afectaCosto;
    }

    public Integer getGrupo() {
        return grupo;
    }

    public void setGrupo(Integer grupo) {
        this.grupo = grupo;
    }

    public boolean getDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }

    public boolean getConsecutivo() {
        return consecutivo;
    }

    public void setConsecutivo(boolean consecutivo) {
        this.consecutivo = consecutivo;
    }

    public boolean getTabPorReg() {
        return tabPorReg;
    }

    public void setTabPorReg(boolean tabPorReg) {
        this.tabPorReg = tabPorReg;
    }

    public String getFuente() {
        return fuente;
    }

    public void setFuente(String fuente) {
        this.fuente = fuente;
    }

    public String getCuentaBase() {
        return cuentaBase;
    }

    public void setCuentaBase(String cuentaBase) {
        this.cuentaBase = cuentaBase;
    }

    public String getNaturalezaBase() {
        return naturalezaBase;
    }

    public void setNaturalezaBase(String naturalezaBase) {
        this.naturalezaBase = naturalezaBase;
    }

    public String getCuentaIVA() {
        return cuentaIVA;
    }

    public void setCuentaIVA(String cuentaIVA) {
        this.cuentaIVA = cuentaIVA;
    }

    public String getNaturalezaIVA() {
        return naturalezaIVA;
    }

    public void setNaturalezaIVA(String naturalezaIVA) {
        this.naturalezaIVA = naturalezaIVA;
    }

    public String getCuentaReteFuente() {
        return cuentaReteFuente;
    }

    public void setCuentaReteFuente(String cuentaReteFuente) {
        this.cuentaReteFuente = cuentaReteFuente;
    }

    public String getNaturalezaReteFuente() {
        return naturalezaReteFuente;
    }

    public void setNaturalezaReteFuente(String naturalezaReteFuente) {
        this.naturalezaReteFuente = naturalezaReteFuente;
    }

    public String getCuentaTotalMovimiento() {
        return cuentaTotalMovimiento;
    }

    public void setCuentaTotalMovimiento(String cuentaTotalMovimiento) {
        this.cuentaTotalMovimiento = cuentaTotalMovimiento;
    }

    public String getNaturalezaTotalMovimiento() {
        return naturalezaTotalMovimiento;
    }

    public void setNaturalezaTotalMovimiento(String naturalezaTotalMovimiento) {
        this.naturalezaTotalMovimiento = naturalezaTotalMovimiento;
    }

    public String getCuentaCosto1() {
        return cuentaCosto1;
    }

    public void setCuentaCosto1(String cuentaCosto1) {
        this.cuentaCosto1 = cuentaCosto1;
    }

    public String getNaturalezaCosto1() {
        return naturalezaCosto1;
    }

    public void setNaturalezaCosto1(String naturalezaCosto1) {
        this.naturalezaCosto1 = naturalezaCosto1;
    }

    public String getCuentaCosto2() {
        return cuentaCosto2;
    }

    public void setCuentaCosto2(String cuentaCosto2) {
        this.cuentaCosto2 = cuentaCosto2;
    }

    public String getNaturalezaCosto2() {
        return naturalezaCosto2;
    }

    public void setNaturalezaCosto2(String naturalezaCosto2) {
        this.naturalezaCosto2 = naturalezaCosto2;
    }

    public Integer getNoConsecutivo() {
        return noConsecutivo;
    }

    public void setNoConsecutivo(Integer noConsecutivo) {
        this.noConsecutivo = noConsecutivo;
    }

    public String getEtiquetaParaMostrar() {
        return etiquetaParaMostrar;
    }

    public void setEtiquetaParaMostrar(String etiquetaParaMostrar) {
        this.etiquetaParaMostrar = etiquetaParaMostrar;
    }

    public String getPrefijo() {
        return prefijo;
    }

    public void setPrefijo(String prefijo) {
        this.prefijo = prefijo;
    }

    public String getResolucionDIAN() {
        return resolucionDIAN;
    }

    public void setResolucionDIAN(String resolucionDIAN) {
        this.resolucionDIAN = resolucionDIAN;
    }

    public Integer getBin() {
        return bin;
    }

    public void setBin(Integer bin) {
        this.bin = bin;
    }

    public String getCuentaReteIVA() {
        return cuentaReteIVA;
    }

    public void setCuentaReteIVA(String cuentaReteIVA) {
        this.cuentaReteIVA = cuentaReteIVA;
    }

    public String getNaturalezaReteIVA() {
        return naturalezaReteIVA;
    }

    public void setNaturalezaReteIVA(String naturalezaReteIVA) {
        this.naturalezaReteIVA = naturalezaReteIVA;
    }

    public String getCuentaReteICA() {
        return cuentaReteICA;
    }

    public void setCuentaReteICA(String cuentaReteICA) {
        this.cuentaReteICA = cuentaReteICA;
    }

    public String getNaturalezaReteICA() {
        return naturalezaReteICA;
    }

    public void setNaturalezaReteICA(String naturalezaReteICA) {
        this.naturalezaReteICA = naturalezaReteICA;
    }

    public Integer getCodigosucursal() {
        return codigosucursal;
    }

    public void setCodigosucursal(Integer codigosucursal) {
        this.codigosucursal = codigosucursal;
    }

    public String getCuentaRETECREEDebito() {
        return cuentaRETECREEDebito;
    }

    public void setCuentaRETECREEDebito(String cuentaRETECREEDebito) {
        this.cuentaRETECREEDebito = cuentaRETECREEDebito;
    }

    public String getCuentaRETECREECredito() {
        return cuentaRETECREECredito;
    }

    public void setCuentaRETECREECredito(String cuentaRETECREECredito) {
        this.cuentaRETECREECredito = cuentaRETECREECredito;
    }

    public String getImpreso1() {
        return impreso1;
    }

    public void setImpreso1(String impreso1) {
        this.impreso1 = impreso1;
    }

    public String getImpreso2() {
        return impreso2;
    }

    public void setImpreso2(String impreso2) {
        this.impreso2 = impreso2;
    }

    public String getImpreso3() {
        return impreso3;
    }

    public void setImpreso3(String impreso3) {
        this.impreso3 = impreso3;
    }

    public short getMueveIVA() {
        return mueveIVA;
    }

    public void setMueveIVA(short mueveIVA) {
        this.mueveIVA = mueveIVA;
    }

    public short getExigeLogin() {
        return exigeLogin;
    }

    public void setExigeLogin(short exigeLogin) {
        this.exigeLogin = exigeLogin;
    }

    public short getExigeVendedor() {
        return exigeVendedor;
    }

    public void setExigeVendedor(short exigeVendedor) {
        this.exigeVendedor = exigeVendedor;
    }

    public short getExigeTercero() {
        return exigeTercero;
    }

    public void setExigeTercero(short exigeTercero) {
        this.exigeTercero = exigeTercero;
    }

    public short getExigeDocReferencia() {
        return exigeDocReferencia;
    }

    public void setExigeDocReferencia(short exigeDocReferencia) {
        this.exigeDocReferencia = exigeDocReferencia;
    }

    public String getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(String velocidad) {
        this.velocidad = velocidad;
    }

    public Integer getOdbcfixFldauto() {
        return odbcfixFldauto;
    }

    public void setOdbcfixFldauto(Integer odbcfixFldauto) {
        this.odbcfixFldauto = odbcfixFldauto;
    }

    public short getGeneraVale() {
        return generaVale;
    }

    public void setGeneraVale(short generaVale) {
        this.generaVale = generaVale;
    }

    public short getContabilizar() {
        return contabilizar;
    }

    public void setContabilizar(short contabilizar) {
        this.contabilizar = contabilizar;
    }

    public short getVerificarEntrega() {
        return verificarEntrega;
    }

    public void setVerificarEntrega(short verificarEntrega) {
        this.verificarEntrega = verificarEntrega;
    }

    public String getNaturalezaImpoConsumo() {
        return naturalezaImpoConsumo;
    }

    public void setNaturalezaImpoConsumo(String naturalezaImpoConsumo) {
        this.naturalezaImpoConsumo = naturalezaImpoConsumo;
    }

    public String getCuentaImpoConsumo() {
        return cuentaImpoConsumo;
    }

    public void setCuentaImpoConsumo(String cuentaImpoConsumo) {
        this.cuentaImpoConsumo = cuentaImpoConsumo;
    }

    public Date getFechaVencimiento() {
        return fechaVencimiento;
    }

    public void setFechaVencimiento(Date fechaVencimiento) {
        this.fechaVencimiento = fechaVencimiento;
    }

    public Integer getConsecutivoInicial() {
        return consecutivoInicial;
    }

    public void setConsecutivoInicial(Integer consecutivoInicial) {
        this.consecutivoInicial = consecutivoInicial;
    }

    public Integer getConsecutivoFinal() {
        return consecutivoFinal;
    }

    public void setConsecutivoFinal(Integer consecutivoFinal) {
        this.consecutivoFinal = consecutivoFinal;
    }

    public Date getFechaExpedicion() {
        return fechaExpedicion;
    }

    public void setFechaExpedicion(Date fechaExpedicion) {
        this.fechaExpedicion = fechaExpedicion;
    }

    public String getResolucionNo() {
        return resolucionNo;
    }

    public void setResolucionNo(String resolucionNo) {
        this.resolucionNo = resolucionNo;
    }

    public short getMueveInventario() {
        return mueveInventario;
    }

    public void setMueveInventario(short mueveInventario) {
        this.mueveInventario = mueveInventario;
    }

    public String getAutoriza() {
        return autoriza;
    }

    public void setAutoriza(String autoriza) {
        this.autoriza = autoriza;
    }

    public List<FacturarmovimientodiarioPlantilla> getFacturarmovimientodiarioPlantillaList() {
        return facturarmovimientodiarioPlantillaList;
    }

    public void setFacturarmovimientodiarioPlantillaList(List<FacturarmovimientodiarioPlantilla> facturarmovimientodiarioPlantillaList) {
        this.facturarmovimientodiarioPlantillaList = facturarmovimientodiarioPlantillaList;
    }

    public List<Facturarmovimientodiario> getFacturarmovimientodiarioList() {
        return facturarmovimientodiarioList;
    }

    public void setFacturarmovimientodiarioList(List<Facturarmovimientodiario> facturarmovimientodiarioList) {
        this.facturarmovimientodiarioList = facturarmovimientodiarioList;
    }

    public List<Conceptossucursal> getConceptossucursalList() {
        return conceptossucursalList;
    }

    public void setConceptossucursalList(List<Conceptossucursal> conceptossucursalList) {
        this.conceptossucursalList = conceptossucursalList;
    }

    public List<Encabezadootrosingresos> getEncabezadootrosingresosList() {
        return encabezadootrosingresosList;
    }

    public void setEncabezadootrosingresosList(List<Encabezadootrosingresos> encabezadootrosingresosList) {
        this.encabezadootrosingresosList = encabezadootrosingresosList;
    }

    public List<Facturarmovimientopendiente> getFacturarmovimientopendienteList() {
        return facturarmovimientopendienteList;
    }

    public void setFacturarmovimientopendienteList(List<Facturarmovimientopendiente> facturarmovimientopendienteList) {
        this.facturarmovimientopendienteList = facturarmovimientopendienteList;
    }

    public List<Encabezadoegresos> getEncabezadoegresosList() {
        return encabezadoegresosList;
    }

    public void setEncabezadoegresosList(List<Encabezadoegresos> encabezadoegresosList) {
        this.encabezadoegresosList = encabezadoegresosList;
    }

    public PuntosConfiguracion getPuntosConfiguracion() {
        return puntosConfiguracion;
    }

    public void setPuntosConfiguracion(PuntosConfiguracion puntosConfiguracion) {
        this.puntosConfiguracion = puntosConfiguracion;
    }

    public List<Configuracionconceptos> getConfiguracionconceptosList() {
        return configuracionconceptosList;
    }

    public void setConfiguracionconceptosList(List<Configuracionconceptos> configuracionconceptosList) {
        this.configuracionconceptosList = configuracionconceptosList;
    }

    public List<Formapagoconcepto> getFormapagoconceptoList() {
        return formapagoconceptoList;
    }

    public void setFormapagoconceptoList(List<Formapagoconcepto> formapagoconceptoList) {
        this.formapagoconceptoList = formapagoconceptoList;
    }

    public List<Formatodocumentosconcepto> getFormatodocumentosconceptoList() {
        return formatodocumentosconceptoList;
    }

    public void setFormatodocumentosconceptoList(List<Formatodocumentosconcepto> formatodocumentosconceptoList) {
        this.formatodocumentosconceptoList = formatodocumentosconceptoList;
    }

    public List<PuntosTarifas> getPuntosTarifasList() {
        return puntosTarifasList;
    }

    public void setPuntosTarifasList(List<PuntosTarifas> puntosTarifasList) {
        this.puntosTarifasList = puntosTarifasList;
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
        if (!(object instanceof Conceptosproductos)) {
            return false;
        }
        Conceptosproductos other = (Conceptosproductos) object;
        if ((this.codigo == null && other.codigo != null) || (this.codigo != null && !this.codigo.equals(other.codigo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.Conceptosproductos[ codigo=" + codigo + " ]";
    }
    
}
