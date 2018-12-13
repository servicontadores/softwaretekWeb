/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;

/**
 *
 * @author yesidherrera
 */
@Entity
@NamedQueries({
    @NamedQuery(name = "Cuentas.findAll", query = "SELECT c FROM Cuentas c")})
public class Cuentas implements Serializable {

    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @Column(nullable = false)
    private int cody;
    @Id
    @Basic(optional = false)
    @Column(nullable = false, length = 50)
    private String codCuenta;
    @Column(length = 100)
    private String nombrecuenta;
    @Column(length = 50)
    private String cdc;
    @Basic(optional = false)
    @Column(nullable = false)
    private boolean nit;
    @Basic(optional = false)
    @Column(nullable = false)
    private boolean mcdc;
    @Basic(optional = false)
    @Column(nullable = false)
    private boolean mBase;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(precision = 7, scale = 2)
    private Double mRetencion;
    @Column(length = 50)
    private String one;
    @Column(length = 50)
    private String two;
    @Column(length = 50)
    private String four;
    @Column(length = 45)
    private String five;
    @Column(name = "ODBCFIX_FLDAUTO")
    private Integer odbcfixFldauto;
    private Short noDeducible;
    @Column(name = "Id_Cuenta")
    private Integer idCuenta;
    @OneToMany(mappedBy = "cuentaDebito")
    private List<Codigoegresos> codigoegresosList;
    @OneToMany(mappedBy = "cuentaIVA")
    private List<Codigoegresos> codigoegresosList1;
    @OneToMany(mappedBy = "cuentaReteIK")
    private List<Codigoegresos> codigoegresosList2;
    @OneToMany(mappedBy = "cuentaReteIVA")
    private List<Codigoegresos> codigoegresosList3;
    @OneToMany(mappedBy = "cuentaCREE")
    private List<Codigoegresos> codigoegresosList4;
    @OneToMany(mappedBy = "retecionCuentaCredito")
    private List<Codigoegresos> codigoegresosList5;
    @JoinColumn(name = "CodigoCuentaNIIF", referencedColumnName = "Codigo")
    @ManyToOne
    private Cuentasniif codigoCuentaNIIF;
    @OneToMany(mappedBy = "cuentaPUC")
    private List<Cuentasbancarias> cuentasbancariasList;
    @OneToMany(mappedBy = "codigoCuenta")
    private List<Movimiento> movimientoList;
    @OneToMany(mappedBy = "cuenta")
    private List<Formaspago> formaspagoList;

    public Cuentas() {
    }

    public Cuentas(String codCuenta) {
        this.codCuenta = codCuenta;
    }

    public Cuentas(String codCuenta, int cody, boolean nit, boolean mcdc, boolean mBase) {
        this.codCuenta = codCuenta;
        this.cody = cody;
        this.nit = nit;
        this.mcdc = mcdc;
        this.mBase = mBase;
    }

    public int getCody() {
        return cody;
    }

    public void setCody(int cody) {
        this.cody = cody;
    }

    public String getCodCuenta() {
        return codCuenta;
    }

    public void setCodCuenta(String codCuenta) {
        this.codCuenta = codCuenta;
    }

    public String getNombrecuenta() {
        return nombrecuenta;
    }

    public void setNombrecuenta(String nombrecuenta) {
        this.nombrecuenta = nombrecuenta;
    }

    public String getCdc() {
        return cdc;
    }

    public void setCdc(String cdc) {
        this.cdc = cdc;
    }

    public boolean getNit() {
        return nit;
    }

    public void setNit(boolean nit) {
        this.nit = nit;
    }

    public boolean getMcdc() {
        return mcdc;
    }

    public void setMcdc(boolean mcdc) {
        this.mcdc = mcdc;
    }

    public boolean getMBase() {
        return mBase;
    }

    public void setMBase(boolean mBase) {
        this.mBase = mBase;
    }

    public Double getMRetencion() {
        return mRetencion;
    }

    public void setMRetencion(Double mRetencion) {
        this.mRetencion = mRetencion;
    }

    public String getOne() {
        return one;
    }

    public void setOne(String one) {
        this.one = one;
    }

    public String getTwo() {
        return two;
    }

    public void setTwo(String two) {
        this.two = two;
    }

    public String getFour() {
        return four;
    }

    public void setFour(String four) {
        this.four = four;
    }

    public String getFive() {
        return five;
    }

    public void setFive(String five) {
        this.five = five;
    }

    public Integer getOdbcfixFldauto() {
        return odbcfixFldauto;
    }

    public void setOdbcfixFldauto(Integer odbcfixFldauto) {
        this.odbcfixFldauto = odbcfixFldauto;
    }

    public Short getNoDeducible() {
        return noDeducible;
    }

    public void setNoDeducible(Short noDeducible) {
        this.noDeducible = noDeducible;
    }

    public Integer getIdCuenta() {
        return idCuenta;
    }

    public void setIdCuenta(Integer idCuenta) {
        this.idCuenta = idCuenta;
    }

    public List<Codigoegresos> getCodigoegresosList() {
        return codigoegresosList;
    }

    public void setCodigoegresosList(List<Codigoegresos> codigoegresosList) {
        this.codigoegresosList = codigoegresosList;
    }

    public List<Codigoegresos> getCodigoegresosList1() {
        return codigoegresosList1;
    }

    public void setCodigoegresosList1(List<Codigoegresos> codigoegresosList1) {
        this.codigoegresosList1 = codigoegresosList1;
    }

    public List<Codigoegresos> getCodigoegresosList2() {
        return codigoegresosList2;
    }

    public void setCodigoegresosList2(List<Codigoegresos> codigoegresosList2) {
        this.codigoegresosList2 = codigoegresosList2;
    }

    public List<Codigoegresos> getCodigoegresosList3() {
        return codigoegresosList3;
    }

    public void setCodigoegresosList3(List<Codigoegresos> codigoegresosList3) {
        this.codigoegresosList3 = codigoegresosList3;
    }

    public List<Codigoegresos> getCodigoegresosList4() {
        return codigoegresosList4;
    }

    public void setCodigoegresosList4(List<Codigoegresos> codigoegresosList4) {
        this.codigoegresosList4 = codigoegresosList4;
    }

    public List<Codigoegresos> getCodigoegresosList5() {
        return codigoegresosList5;
    }

    public void setCodigoegresosList5(List<Codigoegresos> codigoegresosList5) {
        this.codigoegresosList5 = codigoegresosList5;
    }

    public Cuentasniif getCodigoCuentaNIIF() {
        return codigoCuentaNIIF;
    }

    public void setCodigoCuentaNIIF(Cuentasniif codigoCuentaNIIF) {
        this.codigoCuentaNIIF = codigoCuentaNIIF;
    }

    public List<Cuentasbancarias> getCuentasbancariasList() {
        return cuentasbancariasList;
    }

    public void setCuentasbancariasList(List<Cuentasbancarias> cuentasbancariasList) {
        this.cuentasbancariasList = cuentasbancariasList;
    }

    public List<Movimiento> getMovimientoList() {
        return movimientoList;
    }

    public void setMovimientoList(List<Movimiento> movimientoList) {
        this.movimientoList = movimientoList;
    }

    public List<Formaspago> getFormaspagoList() {
        return formaspagoList;
    }

    public void setFormaspagoList(List<Formaspago> formaspagoList) {
        this.formaspagoList = formaspagoList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codCuenta != null ? codCuenta.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Cuentas)) {
            return false;
        }
        Cuentas other = (Cuentas) object;
        if ((this.codCuenta == null && other.codCuenta != null) || (this.codCuenta != null && !this.codCuenta.equals(other.codCuenta))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.Cuentas[ codCuenta=" + codCuenta + " ]";
    }
    
}
