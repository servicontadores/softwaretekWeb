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
import javax.persistence.Lob;
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
    @NamedQuery(name = "Nit.findAll", query = "SELECT n FROM Nit n")})
public class Nit implements Serializable {

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
    @Column(length = 250)
    private String nombreCompleto;
    @Column(length = 50)
    private String telefono;
    @Column(length = 200)
    private String direccion;
    @Lob
    @Column(length = 2147483647)
    private String correoEMail;
    @Lob
    @Column(length = 2147483647)
    private String paginaHttP;
    @Column(length = 50)
    private String nombreContacto;
    @Column(length = 50)
    private String telefonoContacto;
    @Column(length = 50)
    private String direccionContacto;
    private Integer tipo;
    @Column(length = 50)
    private String representanteLegal;
    @Column(length = 200)
    private String detalle;
    private Integer bin;
    @Column(length = 10)
    private String administradora;
    @Basic(optional = false)
    @Column(nullable = false, length = 10)
    private String tipodocumento;
    @Basic(optional = false)
    @Column(nullable = false)
    private short dv;
    @Column(length = 45)
    private String primerapellido;
    @Column(length = 45)
    private String segundoapellido;
    @Column(length = 45)
    private String primernombre;
    @Column(length = 45)
    private String segundonombre;
    @Column(length = 200)
    private String razonsocial;
    @Basic(optional = false)
    @Column(nullable = false, length = 45)
    private String codigodepartamento;
    @Basic(optional = false)
    @Column(nullable = false, length = 45)
    private String codigomunicipio;
    @Basic(optional = false)
    @Column(nullable = false, length = 45)
    private String codigopais;
    @Column(length = 45)
    private String cuentaBancaria;
    @Basic(optional = false)
    @Column(nullable = false)
    private int cupo;
    private Boolean habilitado;
    @Column(name = "ODBCFIX_FLDAUTO")
    private Integer odbcfixFldauto;
    @Basic(optional = false)
    @Column(nullable = false)
    private double pInteres;
    @Column(length = 50)
    private String terceroEnlazado;
    @Basic(optional = false)
    @Column(nullable = false)
    private int codigoListaPrecio;
    @Basic(optional = false)
    @Column(nullable = false)
    private int codigoFormaPago;
    @Column(length = 50)
    private String vendedorEnlazado;
    @Basic(optional = false)
    @Column(nullable = false)
    private short esVendedor;
    @Basic(optional = false)
    @Column(nullable = false)
    private short plazoPredeterminado;
    @Column(length = 50)
    private String mostrar;
    @Column(length = 255)
    private String profesion;
    @Column(length = 255)
    private String empresa;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "nit")
    private List<FacturarmovimientodiarioPlantilla> facturarmovimientodiarioPlantillaList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "nit")
    private List<Egresos> egresosList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "nit")
    private List<Facturarmovimientodiario> facturarmovimientodiarioList;
    @OneToMany(mappedBy = "nit")
    private List<Encabezadootrosingresos> encabezadootrosingresosList;
    @OneToMany(mappedBy = "nITEncargado")
    private List<CitasRegistrocitas> citasRegistrocitasList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "nit")
    private List<CitasRegistrocitas> citasRegistrocitasList1;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "nit")
    private List<Facturarmovimientopendiente> facturarmovimientopendienteList;
    @OneToMany(mappedBy = "nit")
    private List<Encabezadoegresos> encabezadoegresosList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "nit")
    private List<PuntosMovimientos> puntosMovimientosList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "nit")
    private List<Cxc> cxcList;
    @OneToMany(mappedBy = "nit")
    private List<Nomina> nominaList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "nit")
    private List<Cxp> cxpList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "nit")
    private List<Cuentasbancarias> cuentasbancariasList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "nit")
    private List<PresupuestosEncabezadomovimiento> presupuestosEncabezadomovimientoList;
    @OneToMany(mappedBy = "codigoTercero")
    private List<Movimiento> movimientoList;
    @OneToMany(mappedBy = "tercero")
    private List<ParqueaderoRegistroingresos> parqueaderoRegistroingresosList;
    @OneToOne(cascade = CascadeType.ALL, mappedBy = "nit1")
    private CitasEncargados citasEncargados;
    @OneToOne(cascade = CascadeType.ALL, mappedBy = "nit1")
    private PuntosNit puntosNit;

    public Nit() {
    }

    public Nit(String codigo) {
        this.codigo = codigo;
    }

    public Nit(String codigo, int cody, String tipodocumento, short dv, String codigodepartamento, String codigomunicipio, String codigopais, int cupo, double pInteres, int codigoListaPrecio, int codigoFormaPago, short esVendedor, short plazoPredeterminado) {
        this.codigo = codigo;
        this.cody = cody;
        this.tipodocumento = tipodocumento;
        this.dv = dv;
        this.codigodepartamento = codigodepartamento;
        this.codigomunicipio = codigomunicipio;
        this.codigopais = codigopais;
        this.cupo = cupo;
        this.pInteres = pInteres;
        this.codigoListaPrecio = codigoListaPrecio;
        this.codigoFormaPago = codigoFormaPago;
        this.esVendedor = esVendedor;
        this.plazoPredeterminado = plazoPredeterminado;
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

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getCorreoEMail() {
        return correoEMail;
    }

    public void setCorreoEMail(String correoEMail) {
        this.correoEMail = correoEMail;
    }

    public String getPaginaHttP() {
        return paginaHttP;
    }

    public void setPaginaHttP(String paginaHttP) {
        this.paginaHttP = paginaHttP;
    }

    public String getNombreContacto() {
        return nombreContacto;
    }

    public void setNombreContacto(String nombreContacto) {
        this.nombreContacto = nombreContacto;
    }

    public String getTelefonoContacto() {
        return telefonoContacto;
    }

    public void setTelefonoContacto(String telefonoContacto) {
        this.telefonoContacto = telefonoContacto;
    }

    public String getDireccionContacto() {
        return direccionContacto;
    }

    public void setDireccionContacto(String direccionContacto) {
        this.direccionContacto = direccionContacto;
    }

    public Integer getTipo() {
        return tipo;
    }

    public void setTipo(Integer tipo) {
        this.tipo = tipo;
    }

    public String getRepresentanteLegal() {
        return representanteLegal;
    }

    public void setRepresentanteLegal(String representanteLegal) {
        this.representanteLegal = representanteLegal;
    }

    public String getDetalle() {
        return detalle;
    }

    public void setDetalle(String detalle) {
        this.detalle = detalle;
    }

    public Integer getBin() {
        return bin;
    }

    public void setBin(Integer bin) {
        this.bin = bin;
    }

    public String getAdministradora() {
        return administradora;
    }

    public void setAdministradora(String administradora) {
        this.administradora = administradora;
    }

    public String getTipodocumento() {
        return tipodocumento;
    }

    public void setTipodocumento(String tipodocumento) {
        this.tipodocumento = tipodocumento;
    }

    public short getDv() {
        return dv;
    }

    public void setDv(short dv) {
        this.dv = dv;
    }

    public String getPrimerapellido() {
        return primerapellido;
    }

    public void setPrimerapellido(String primerapellido) {
        this.primerapellido = primerapellido;
    }

    public String getSegundoapellido() {
        return segundoapellido;
    }

    public void setSegundoapellido(String segundoapellido) {
        this.segundoapellido = segundoapellido;
    }

    public String getPrimernombre() {
        return primernombre;
    }

    public void setPrimernombre(String primernombre) {
        this.primernombre = primernombre;
    }

    public String getSegundonombre() {
        return segundonombre;
    }

    public void setSegundonombre(String segundonombre) {
        this.segundonombre = segundonombre;
    }

    public String getRazonsocial() {
        return razonsocial;
    }

    public void setRazonsocial(String razonsocial) {
        this.razonsocial = razonsocial;
    }

    public String getCodigodepartamento() {
        return codigodepartamento;
    }

    public void setCodigodepartamento(String codigodepartamento) {
        this.codigodepartamento = codigodepartamento;
    }

    public String getCodigomunicipio() {
        return codigomunicipio;
    }

    public void setCodigomunicipio(String codigomunicipio) {
        this.codigomunicipio = codigomunicipio;
    }

    public String getCodigopais() {
        return codigopais;
    }

    public void setCodigopais(String codigopais) {
        this.codigopais = codigopais;
    }

    public String getCuentaBancaria() {
        return cuentaBancaria;
    }

    public void setCuentaBancaria(String cuentaBancaria) {
        this.cuentaBancaria = cuentaBancaria;
    }

    public int getCupo() {
        return cupo;
    }

    public void setCupo(int cupo) {
        this.cupo = cupo;
    }

    public Boolean getHabilitado() {
        return habilitado;
    }

    public void setHabilitado(Boolean habilitado) {
        this.habilitado = habilitado;
    }

    public Integer getOdbcfixFldauto() {
        return odbcfixFldauto;
    }

    public void setOdbcfixFldauto(Integer odbcfixFldauto) {
        this.odbcfixFldauto = odbcfixFldauto;
    }

    public double getPInteres() {
        return pInteres;
    }

    public void setPInteres(double pInteres) {
        this.pInteres = pInteres;
    }

    public String getTerceroEnlazado() {
        return terceroEnlazado;
    }

    public void setTerceroEnlazado(String terceroEnlazado) {
        this.terceroEnlazado = terceroEnlazado;
    }

    public int getCodigoListaPrecio() {
        return codigoListaPrecio;
    }

    public void setCodigoListaPrecio(int codigoListaPrecio) {
        this.codigoListaPrecio = codigoListaPrecio;
    }

    public int getCodigoFormaPago() {
        return codigoFormaPago;
    }

    public void setCodigoFormaPago(int codigoFormaPago) {
        this.codigoFormaPago = codigoFormaPago;
    }

    public String getVendedorEnlazado() {
        return vendedorEnlazado;
    }

    public void setVendedorEnlazado(String vendedorEnlazado) {
        this.vendedorEnlazado = vendedorEnlazado;
    }

    public short getEsVendedor() {
        return esVendedor;
    }

    public void setEsVendedor(short esVendedor) {
        this.esVendedor = esVendedor;
    }

    public short getPlazoPredeterminado() {
        return plazoPredeterminado;
    }

    public void setPlazoPredeterminado(short plazoPredeterminado) {
        this.plazoPredeterminado = plazoPredeterminado;
    }

    public String getMostrar() {
        return mostrar;
    }

    public void setMostrar(String mostrar) {
        this.mostrar = mostrar;
    }

    public String getProfesion() {
        return profesion;
    }

    public void setProfesion(String profesion) {
        this.profesion = profesion;
    }

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    public List<FacturarmovimientodiarioPlantilla> getFacturarmovimientodiarioPlantillaList() {
        return facturarmovimientodiarioPlantillaList;
    }

    public void setFacturarmovimientodiarioPlantillaList(List<FacturarmovimientodiarioPlantilla> facturarmovimientodiarioPlantillaList) {
        this.facturarmovimientodiarioPlantillaList = facturarmovimientodiarioPlantillaList;
    }

    public List<Egresos> getEgresosList() {
        return egresosList;
    }

    public void setEgresosList(List<Egresos> egresosList) {
        this.egresosList = egresosList;
    }

    public List<Facturarmovimientodiario> getFacturarmovimientodiarioList() {
        return facturarmovimientodiarioList;
    }

    public void setFacturarmovimientodiarioList(List<Facturarmovimientodiario> facturarmovimientodiarioList) {
        this.facturarmovimientodiarioList = facturarmovimientodiarioList;
    }

    public List<Encabezadootrosingresos> getEncabezadootrosingresosList() {
        return encabezadootrosingresosList;
    }

    public void setEncabezadootrosingresosList(List<Encabezadootrosingresos> encabezadootrosingresosList) {
        this.encabezadootrosingresosList = encabezadootrosingresosList;
    }

    public List<CitasRegistrocitas> getCitasRegistrocitasList() {
        return citasRegistrocitasList;
    }

    public void setCitasRegistrocitasList(List<CitasRegistrocitas> citasRegistrocitasList) {
        this.citasRegistrocitasList = citasRegistrocitasList;
    }

    public List<CitasRegistrocitas> getCitasRegistrocitasList1() {
        return citasRegistrocitasList1;
    }

    public void setCitasRegistrocitasList1(List<CitasRegistrocitas> citasRegistrocitasList1) {
        this.citasRegistrocitasList1 = citasRegistrocitasList1;
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

    public List<PuntosMovimientos> getPuntosMovimientosList() {
        return puntosMovimientosList;
    }

    public void setPuntosMovimientosList(List<PuntosMovimientos> puntosMovimientosList) {
        this.puntosMovimientosList = puntosMovimientosList;
    }

    public List<Cxc> getCxcList() {
        return cxcList;
    }

    public void setCxcList(List<Cxc> cxcList) {
        this.cxcList = cxcList;
    }

    public List<Nomina> getNominaList() {
        return nominaList;
    }

    public void setNominaList(List<Nomina> nominaList) {
        this.nominaList = nominaList;
    }

    public List<Cxp> getCxpList() {
        return cxpList;
    }

    public void setCxpList(List<Cxp> cxpList) {
        this.cxpList = cxpList;
    }

    public List<Cuentasbancarias> getCuentasbancariasList() {
        return cuentasbancariasList;
    }

    public void setCuentasbancariasList(List<Cuentasbancarias> cuentasbancariasList) {
        this.cuentasbancariasList = cuentasbancariasList;
    }

    public List<PresupuestosEncabezadomovimiento> getPresupuestosEncabezadomovimientoList() {
        return presupuestosEncabezadomovimientoList;
    }

    public void setPresupuestosEncabezadomovimientoList(List<PresupuestosEncabezadomovimiento> presupuestosEncabezadomovimientoList) {
        this.presupuestosEncabezadomovimientoList = presupuestosEncabezadomovimientoList;
    }

    public List<Movimiento> getMovimientoList() {
        return movimientoList;
    }

    public void setMovimientoList(List<Movimiento> movimientoList) {
        this.movimientoList = movimientoList;
    }

    public List<ParqueaderoRegistroingresos> getParqueaderoRegistroingresosList() {
        return parqueaderoRegistroingresosList;
    }

    public void setParqueaderoRegistroingresosList(List<ParqueaderoRegistroingresos> parqueaderoRegistroingresosList) {
        this.parqueaderoRegistroingresosList = parqueaderoRegistroingresosList;
    }

    public CitasEncargados getCitasEncargados() {
        return citasEncargados;
    }

    public void setCitasEncargados(CitasEncargados citasEncargados) {
        this.citasEncargados = citasEncargados;
    }

    public PuntosNit getPuntosNit() {
        return puntosNit;
    }

    public void setPuntosNit(PuntosNit puntosNit) {
        this.puntosNit = puntosNit;
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
        if (!(object instanceof Nit)) {
            return false;
        }
        Nit other = (Nit) object;
        if ((this.codigo == null && other.codigo != null) || (this.codigo != null && !this.codigo.equals(other.codigo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.Nit[ codigo=" + codigo + " ]";
    }
    
}
