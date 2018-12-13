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
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author yesidherrera
 */
@Entity
@NamedQueries({
    @NamedQuery(name = "Sucursales.findAll", query = "SELECT s FROM Sucursales s")})
public class Sucursales implements Serializable {

    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @Column(nullable = false)
    private int codyS;
    @Id
    @Basic(optional = false)
    @Column(nullable = false)
    private Integer codigo;
    @Column(length = 50)
    private String nombreSucursal;
    @Column(length = 50)
    private String detal;
    @Basic(optional = false)
    @Column(nullable = false)
    private int codigoEmpresa;
    @Basic(optional = false)
    @Column(nullable = false, length = 100)
    private String direccion;
    @Basic(optional = false)
    @Column(nullable = false, length = 45)
    private String telefono;
    @Basic(optional = false)
    @Column(nullable = false, length = 45)
    private String regimen;
    @Basic(optional = false)
    @Column(nullable = false, length = 100)
    private String propietario;
    @Basic(optional = false)
    @Column(nullable = false, length = 45)
    private String nit;
    @Basic(optional = false)
    @Column(name = "ODBCFIX_FLDAUTO", nullable = false)
    private int odbcfixFldauto;
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaSuc;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "codigoSucursal")
    private List<FacturarmovimientodiarioPlantilla> facturarmovimientodiarioPlantillaList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "codigoSucursal")
    private List<Movimientocuentasbancarias> movimientocuentasbancariasList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "codigoSucursal")
    private List<Facturarmovimientodiario> facturarmovimientodiarioList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "codigoSucursal")
    private List<Conceptossucursal> conceptossucursalList;
    @OneToMany(mappedBy = "codigoSucursal")
    private List<Encabezadootrosingresos> encabezadootrosingresosList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "codigoSucursal")
    private List<Retiro> retiroList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "codigoSucursal")
    private List<Facturarmovimientopendiente> facturarmovimientopendienteList;
    @OneToMany(mappedBy = "codigoSucursal")
    private List<Movimientocaja> movimientocajaList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "codigoSucursal")
    private List<Encabezadoegresos> encabezadoegresosList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "codigoSucursal")
    private List<Configuracionconceptos> configuracionconceptosList;
    @OneToMany(mappedBy = "codigoSucursal")
    private List<Cxc> cxcList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "codigoSucursal")
    private List<Encabezadomovimiento> encabezadomovimientoList;
    @OneToMany(mappedBy = "codigoSucursal")
    private List<Cxp> cxpList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "codigoSucursal")
    private List<Consignacion> consignacionList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "codigoSucursal")
    private List<ParqueaderoRegistroingresos> parqueaderoRegistroingresosList;

    public Sucursales() {
    }

    public Sucursales(Integer codigo) {
        this.codigo = codigo;
    }

    public Sucursales(Integer codigo, int codyS, int codigoEmpresa, String direccion, String telefono, String regimen, String propietario, String nit, int odbcfixFldauto) {
        this.codigo = codigo;
        this.codyS = codyS;
        this.codigoEmpresa = codigoEmpresa;
        this.direccion = direccion;
        this.telefono = telefono;
        this.regimen = regimen;
        this.propietario = propietario;
        this.nit = nit;
        this.odbcfixFldauto = odbcfixFldauto;
    }

    public int getCodyS() {
        return codyS;
    }

    public void setCodyS(int codyS) {
        this.codyS = codyS;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public String getNombreSucursal() {
        return nombreSucursal;
    }

    public void setNombreSucursal(String nombreSucursal) {
        this.nombreSucursal = nombreSucursal;
    }

    public String getDetal() {
        return detal;
    }

    public void setDetal(String detal) {
        this.detal = detal;
    }

    public int getCodigoEmpresa() {
        return codigoEmpresa;
    }

    public void setCodigoEmpresa(int codigoEmpresa) {
        this.codigoEmpresa = codigoEmpresa;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getRegimen() {
        return regimen;
    }

    public void setRegimen(String regimen) {
        this.regimen = regimen;
    }

    public String getPropietario() {
        return propietario;
    }

    public void setPropietario(String propietario) {
        this.propietario = propietario;
    }

    public String getNit() {
        return nit;
    }

    public void setNit(String nit) {
        this.nit = nit;
    }

    public int getOdbcfixFldauto() {
        return odbcfixFldauto;
    }

    public void setOdbcfixFldauto(int odbcfixFldauto) {
        this.odbcfixFldauto = odbcfixFldauto;
    }

    public Date getFechaSuc() {
        return fechaSuc;
    }

    public void setFechaSuc(Date fechaSuc) {
        this.fechaSuc = fechaSuc;
    }

    public List<FacturarmovimientodiarioPlantilla> getFacturarmovimientodiarioPlantillaList() {
        return facturarmovimientodiarioPlantillaList;
    }

    public void setFacturarmovimientodiarioPlantillaList(List<FacturarmovimientodiarioPlantilla> facturarmovimientodiarioPlantillaList) {
        this.facturarmovimientodiarioPlantillaList = facturarmovimientodiarioPlantillaList;
    }

    public List<Movimientocuentasbancarias> getMovimientocuentasbancariasList() {
        return movimientocuentasbancariasList;
    }

    public void setMovimientocuentasbancariasList(List<Movimientocuentasbancarias> movimientocuentasbancariasList) {
        this.movimientocuentasbancariasList = movimientocuentasbancariasList;
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

    public List<Retiro> getRetiroList() {
        return retiroList;
    }

    public void setRetiroList(List<Retiro> retiroList) {
        this.retiroList = retiroList;
    }

    public List<Facturarmovimientopendiente> getFacturarmovimientopendienteList() {
        return facturarmovimientopendienteList;
    }

    public void setFacturarmovimientopendienteList(List<Facturarmovimientopendiente> facturarmovimientopendienteList) {
        this.facturarmovimientopendienteList = facturarmovimientopendienteList;
    }

    public List<Movimientocaja> getMovimientocajaList() {
        return movimientocajaList;
    }

    public void setMovimientocajaList(List<Movimientocaja> movimientocajaList) {
        this.movimientocajaList = movimientocajaList;
    }

    public List<Encabezadoegresos> getEncabezadoegresosList() {
        return encabezadoegresosList;
    }

    public void setEncabezadoegresosList(List<Encabezadoegresos> encabezadoegresosList) {
        this.encabezadoegresosList = encabezadoegresosList;
    }

    public List<Configuracionconceptos> getConfiguracionconceptosList() {
        return configuracionconceptosList;
    }

    public void setConfiguracionconceptosList(List<Configuracionconceptos> configuracionconceptosList) {
        this.configuracionconceptosList = configuracionconceptosList;
    }

    public List<Cxc> getCxcList() {
        return cxcList;
    }

    public void setCxcList(List<Cxc> cxcList) {
        this.cxcList = cxcList;
    }

    public List<Encabezadomovimiento> getEncabezadomovimientoList() {
        return encabezadomovimientoList;
    }

    public void setEncabezadomovimientoList(List<Encabezadomovimiento> encabezadomovimientoList) {
        this.encabezadomovimientoList = encabezadomovimientoList;
    }

    public List<Cxp> getCxpList() {
        return cxpList;
    }

    public void setCxpList(List<Cxp> cxpList) {
        this.cxpList = cxpList;
    }

    public List<Consignacion> getConsignacionList() {
        return consignacionList;
    }

    public void setConsignacionList(List<Consignacion> consignacionList) {
        this.consignacionList = consignacionList;
    }

    public List<ParqueaderoRegistroingresos> getParqueaderoRegistroingresosList() {
        return parqueaderoRegistroingresosList;
    }

    public void setParqueaderoRegistroingresosList(List<ParqueaderoRegistroingresos> parqueaderoRegistroingresosList) {
        this.parqueaderoRegistroingresosList = parqueaderoRegistroingresosList;
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
        if (!(object instanceof Sucursales)) {
            return false;
        }
        Sucursales other = (Sucursales) object;
        if ((this.codigo == null && other.codigo != null) || (this.codigo != null && !this.codigo.equals(other.codigo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.Sucursales[ codigo=" + codigo + " ]";
    }
    
}
