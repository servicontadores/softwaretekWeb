/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
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
    @NamedQuery(name = "Formaspago.findAll", query = "SELECT f FROM Formaspago f")})
public class Formaspago implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(nullable = false)
    private Integer codigo;
    @Column(length = 50)
    private String formaPago;
    private Boolean mueveBancos;
    private Boolean abrirCaja;
    @Column(length = 50)
    private String observacion;
    @Basic(optional = false)
    @Column(name = "ODBCFIX_FLDAUTO", nullable = false)
    private int odbcfixFldauto;
    @Basic(optional = false)
    @Column(nullable = false)
    private boolean generaCartera;
    private Integer codigoConceptoCartera;
    private Boolean esCruceDeAnticipo;
    @OneToMany(mappedBy = "codigoFormaPago")
    private List<Encabezadootrosingresos> encabezadootrosingresosList;
    @OneToMany(mappedBy = "codigoFormaPago")
    private List<Encabezadoegresos> encabezadoegresosList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "codigoFormaPago")
    private List<Formapagoconcepto> formapagoconceptoList;
    @JoinColumn(name = "Cuenta", referencedColumnName = "CodCuenta")
    @ManyToOne
    private Cuentas cuenta;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "codigoFormaPago")
    private List<PuntosTarifas> puntosTarifasList;

    public Formaspago() {
    }

    public Formaspago(Integer codigo) {
        this.codigo = codigo;
    }

    public Formaspago(Integer codigo, int odbcfixFldauto, boolean generaCartera) {
        this.codigo = codigo;
        this.odbcfixFldauto = odbcfixFldauto;
        this.generaCartera = generaCartera;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public String getFormaPago() {
        return formaPago;
    }

    public void setFormaPago(String formaPago) {
        this.formaPago = formaPago;
    }

    public Boolean getMueveBancos() {
        return mueveBancos;
    }

    public void setMueveBancos(Boolean mueveBancos) {
        this.mueveBancos = mueveBancos;
    }

    public Boolean getAbrirCaja() {
        return abrirCaja;
    }

    public void setAbrirCaja(Boolean abrirCaja) {
        this.abrirCaja = abrirCaja;
    }

    public String getObservacion() {
        return observacion;
    }

    public void setObservacion(String observacion) {
        this.observacion = observacion;
    }

    public int getOdbcfixFldauto() {
        return odbcfixFldauto;
    }

    public void setOdbcfixFldauto(int odbcfixFldauto) {
        this.odbcfixFldauto = odbcfixFldauto;
    }

    public boolean getGeneraCartera() {
        return generaCartera;
    }

    public void setGeneraCartera(boolean generaCartera) {
        this.generaCartera = generaCartera;
    }

    public Integer getCodigoConceptoCartera() {
        return codigoConceptoCartera;
    }

    public void setCodigoConceptoCartera(Integer codigoConceptoCartera) {
        this.codigoConceptoCartera = codigoConceptoCartera;
    }

    public Boolean getEsCruceDeAnticipo() {
        return esCruceDeAnticipo;
    }

    public void setEsCruceDeAnticipo(Boolean esCruceDeAnticipo) {
        this.esCruceDeAnticipo = esCruceDeAnticipo;
    }

    public List<Encabezadootrosingresos> getEncabezadootrosingresosList() {
        return encabezadootrosingresosList;
    }

    public void setEncabezadootrosingresosList(List<Encabezadootrosingresos> encabezadootrosingresosList) {
        this.encabezadootrosingresosList = encabezadootrosingresosList;
    }

    public List<Encabezadoegresos> getEncabezadoegresosList() {
        return encabezadoegresosList;
    }

    public void setEncabezadoegresosList(List<Encabezadoegresos> encabezadoegresosList) {
        this.encabezadoegresosList = encabezadoegresosList;
    }

    public List<Formapagoconcepto> getFormapagoconceptoList() {
        return formapagoconceptoList;
    }

    public void setFormapagoconceptoList(List<Formapagoconcepto> formapagoconceptoList) {
        this.formapagoconceptoList = formapagoconceptoList;
    }

    public Cuentas getCuenta() {
        return cuenta;
    }

    public void setCuenta(Cuentas cuenta) {
        this.cuenta = cuenta;
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
        if (!(object instanceof Formaspago)) {
            return false;
        }
        Formaspago other = (Formaspago) object;
        if ((this.codigo == null && other.codigo != null) || (this.codigo != null && !this.codigo.equals(other.codigo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.Formaspago[ codigo=" + codigo + " ]";
    }
    
}
