/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import java.io.Serializable;
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
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author yesidherrera
 */
@Entity
@NamedQueries({
    @NamedQuery(name = "Movimiento.findAll", query = "SELECT m FROM Movimiento m")})
public class Movimiento implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(nullable = false)
    private Integer cody;
    @Basic(optional = false)
    @Column(nullable = false)
    private int imp;
    @Temporal(TemporalType.TIMESTAMP)
    private Date feIngDat;
    @Column(length = 8)
    private String codigoCuentaNIIF;
    @Column(length = 50)
    private String nro;
    @Column(length = 120)
    private String detal;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(precision = 22)
    private Double debito;
    @Column(precision = 22)
    private Double credito;
    @Column(precision = 22)
    private Double base;
    private Integer especiales;
    @Column(length = 50)
    private String sistemaPago;
    private Integer capital;
    @Column(precision = 7, scale = 2)
    private Double porcentaje;
    @Column(precision = 7, scale = 2)
    private Double porcentajeR;
    private Integer intereses;
    private Integer valorAPagar;
    @Column(length = 50)
    private String formaPago;
    private Integer plazoM;
    private Integer noCuotas;
    private Integer vrCuotas;
    @Basic(optional = false)
    @Column(name = "ODBCFIX_FLDAUTO", nullable = false)
    private int odbcfixFldauto;
    @Column(precision = 22)
    private Double noDeducible;
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaVencimiento;
    @Column(length = 45)
    private String noCheque;
    @JoinColumn(name = "CodigoCDC", referencedColumnName = "Codigo")
    @ManyToOne
    private Cdc codigoCDC;
    @JoinColumn(name = "CodigoCuenta", referencedColumnName = "CodCuenta")
    @ManyToOne
    private Cuentas codigoCuenta;
    @JoinColumn(name = "CodigoTercero", referencedColumnName = "Codigo")
    @ManyToOne
    private Nit codigoTercero;

    public Movimiento() {
    }

    public Movimiento(Integer cody) {
        this.cody = cody;
    }

    public Movimiento(Integer cody, int imp, int odbcfixFldauto) {
        this.cody = cody;
        this.imp = imp;
        this.odbcfixFldauto = odbcfixFldauto;
    }

    public Integer getCody() {
        return cody;
    }

    public void setCody(Integer cody) {
        this.cody = cody;
    }

    public int getImp() {
        return imp;
    }

    public void setImp(int imp) {
        this.imp = imp;
    }

    public Date getFeIngDat() {
        return feIngDat;
    }

    public void setFeIngDat(Date feIngDat) {
        this.feIngDat = feIngDat;
    }

    public String getCodigoCuentaNIIF() {
        return codigoCuentaNIIF;
    }

    public void setCodigoCuentaNIIF(String codigoCuentaNIIF) {
        this.codigoCuentaNIIF = codigoCuentaNIIF;
    }

    public String getNro() {
        return nro;
    }

    public void setNro(String nro) {
        this.nro = nro;
    }

    public String getDetal() {
        return detal;
    }

    public void setDetal(String detal) {
        this.detal = detal;
    }

    public Double getDebito() {
        return debito;
    }

    public void setDebito(Double debito) {
        this.debito = debito;
    }

    public Double getCredito() {
        return credito;
    }

    public void setCredito(Double credito) {
        this.credito = credito;
    }

    public Double getBase() {
        return base;
    }

    public void setBase(Double base) {
        this.base = base;
    }

    public Integer getEspeciales() {
        return especiales;
    }

    public void setEspeciales(Integer especiales) {
        this.especiales = especiales;
    }

    public String getSistemaPago() {
        return sistemaPago;
    }

    public void setSistemaPago(String sistemaPago) {
        this.sistemaPago = sistemaPago;
    }

    public Integer getCapital() {
        return capital;
    }

    public void setCapital(Integer capital) {
        this.capital = capital;
    }

    public Double getPorcentaje() {
        return porcentaje;
    }

    public void setPorcentaje(Double porcentaje) {
        this.porcentaje = porcentaje;
    }

    public Double getPorcentajeR() {
        return porcentajeR;
    }

    public void setPorcentajeR(Double porcentajeR) {
        this.porcentajeR = porcentajeR;
    }

    public Integer getIntereses() {
        return intereses;
    }

    public void setIntereses(Integer intereses) {
        this.intereses = intereses;
    }

    public Integer getValorAPagar() {
        return valorAPagar;
    }

    public void setValorAPagar(Integer valorAPagar) {
        this.valorAPagar = valorAPagar;
    }

    public String getFormaPago() {
        return formaPago;
    }

    public void setFormaPago(String formaPago) {
        this.formaPago = formaPago;
    }

    public Integer getPlazoM() {
        return plazoM;
    }

    public void setPlazoM(Integer plazoM) {
        this.plazoM = plazoM;
    }

    public Integer getNoCuotas() {
        return noCuotas;
    }

    public void setNoCuotas(Integer noCuotas) {
        this.noCuotas = noCuotas;
    }

    public Integer getVrCuotas() {
        return vrCuotas;
    }

    public void setVrCuotas(Integer vrCuotas) {
        this.vrCuotas = vrCuotas;
    }

    public int getOdbcfixFldauto() {
        return odbcfixFldauto;
    }

    public void setOdbcfixFldauto(int odbcfixFldauto) {
        this.odbcfixFldauto = odbcfixFldauto;
    }

    public Double getNoDeducible() {
        return noDeducible;
    }

    public void setNoDeducible(Double noDeducible) {
        this.noDeducible = noDeducible;
    }

    public Date getFechaVencimiento() {
        return fechaVencimiento;
    }

    public void setFechaVencimiento(Date fechaVencimiento) {
        this.fechaVencimiento = fechaVencimiento;
    }

    public String getNoCheque() {
        return noCheque;
    }

    public void setNoCheque(String noCheque) {
        this.noCheque = noCheque;
    }

    public Cdc getCodigoCDC() {
        return codigoCDC;
    }

    public void setCodigoCDC(Cdc codigoCDC) {
        this.codigoCDC = codigoCDC;
    }

    public Cuentas getCodigoCuenta() {
        return codigoCuenta;
    }

    public void setCodigoCuenta(Cuentas codigoCuenta) {
        this.codigoCuenta = codigoCuenta;
    }

    public Nit getCodigoTercero() {
        return codigoTercero;
    }

    public void setCodigoTercero(Nit codigoTercero) {
        this.codigoTercero = codigoTercero;
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
        if (!(object instanceof Movimiento)) {
            return false;
        }
        Movimiento other = (Movimiento) object;
        if ((this.cody == null && other.cody != null) || (this.cody != null && !this.cody.equals(other.cody))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.Movimiento[ cody=" + cody + " ]";
    }
    
}
