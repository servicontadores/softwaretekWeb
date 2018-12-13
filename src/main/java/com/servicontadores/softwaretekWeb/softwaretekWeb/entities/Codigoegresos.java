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
    @NamedQuery(name = "Codigoegresos.findAll", query = "SELECT c FROM Codigoegresos c")})
public class Codigoegresos implements Serializable {

    private static final long serialVersionUID = 1L;
    private Integer cody;
    @Id
    @Basic(optional = false)
    @Column(nullable = false, length = 50)
    private String codigo;
    @Column(length = 100)
    private String nombreEgreso;
    @Basic(optional = false)
    @Column(nullable = false)
    private boolean esGasto;
    private Integer bin;
    @Basic(optional = false)
    @Column(nullable = false)
    private boolean esAnticipo;
    private Integer grupo;
    @Column(name = "ODBCFIX_FLDAUTO")
    private Integer odbcfixFldauto;
    private Boolean mostrar;
    @JoinColumn(name = "CuentaDebito", referencedColumnName = "CodCuenta")
    @ManyToOne
    private Cuentas cuentaDebito;
    @JoinColumn(name = "CuentaIVA", referencedColumnName = "CodCuenta")
    @ManyToOne
    private Cuentas cuentaIVA;
    @JoinColumn(name = "CuentaReteIK", referencedColumnName = "CodCuenta")
    @ManyToOne
    private Cuentas cuentaReteIK;
    @JoinColumn(name = "CuentaReteIVA", referencedColumnName = "CodCuenta")
    @ManyToOne
    private Cuentas cuentaReteIVA;
    @JoinColumn(name = "CuentaCREE", referencedColumnName = "CodCuenta")
    @ManyToOne
    private Cuentas cuentaCREE;
    @JoinColumn(name = "RetecionCuentaCredito", referencedColumnName = "CodCuenta")
    @ManyToOne
    private Cuentas retecionCuentaCredito;
    @OneToMany(mappedBy = "codigoEgreso")
    private List<Egresos> egresosList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "codigoEgreso")
    private List<PuntosConfiguracion> puntosConfiguracionList;

    public Codigoegresos() {
    }

    public Codigoegresos(String codigo) {
        this.codigo = codigo;
    }

    public Codigoegresos(String codigo, boolean esGasto, boolean esAnticipo) {
        this.codigo = codigo;
        this.esGasto = esGasto;
        this.esAnticipo = esAnticipo;
    }

    public Integer getCody() {
        return cody;
    }

    public void setCody(Integer cody) {
        this.cody = cody;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombreEgreso() {
        return nombreEgreso;
    }

    public void setNombreEgreso(String nombreEgreso) {
        this.nombreEgreso = nombreEgreso;
    }

    public boolean getEsGasto() {
        return esGasto;
    }

    public void setEsGasto(boolean esGasto) {
        this.esGasto = esGasto;
    }

    public Integer getBin() {
        return bin;
    }

    public void setBin(Integer bin) {
        this.bin = bin;
    }

    public boolean getEsAnticipo() {
        return esAnticipo;
    }

    public void setEsAnticipo(boolean esAnticipo) {
        this.esAnticipo = esAnticipo;
    }

    public Integer getGrupo() {
        return grupo;
    }

    public void setGrupo(Integer grupo) {
        this.grupo = grupo;
    }

    public Integer getOdbcfixFldauto() {
        return odbcfixFldauto;
    }

    public void setOdbcfixFldauto(Integer odbcfixFldauto) {
        this.odbcfixFldauto = odbcfixFldauto;
    }

    public Boolean getMostrar() {
        return mostrar;
    }

    public void setMostrar(Boolean mostrar) {
        this.mostrar = mostrar;
    }

    public Cuentas getCuentaDebito() {
        return cuentaDebito;
    }

    public void setCuentaDebito(Cuentas cuentaDebito) {
        this.cuentaDebito = cuentaDebito;
    }

    public Cuentas getCuentaIVA() {
        return cuentaIVA;
    }

    public void setCuentaIVA(Cuentas cuentaIVA) {
        this.cuentaIVA = cuentaIVA;
    }

    public Cuentas getCuentaReteIK() {
        return cuentaReteIK;
    }

    public void setCuentaReteIK(Cuentas cuentaReteIK) {
        this.cuentaReteIK = cuentaReteIK;
    }

    public Cuentas getCuentaReteIVA() {
        return cuentaReteIVA;
    }

    public void setCuentaReteIVA(Cuentas cuentaReteIVA) {
        this.cuentaReteIVA = cuentaReteIVA;
    }

    public Cuentas getCuentaCREE() {
        return cuentaCREE;
    }

    public void setCuentaCREE(Cuentas cuentaCREE) {
        this.cuentaCREE = cuentaCREE;
    }

    public Cuentas getRetecionCuentaCredito() {
        return retecionCuentaCredito;
    }

    public void setRetecionCuentaCredito(Cuentas retecionCuentaCredito) {
        this.retecionCuentaCredito = retecionCuentaCredito;
    }

    public List<Egresos> getEgresosList() {
        return egresosList;
    }

    public void setEgresosList(List<Egresos> egresosList) {
        this.egresosList = egresosList;
    }

    public List<PuntosConfiguracion> getPuntosConfiguracionList() {
        return puntosConfiguracionList;
    }

    public void setPuntosConfiguracionList(List<PuntosConfiguracion> puntosConfiguracionList) {
        this.puntosConfiguracionList = puntosConfiguracionList;
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
        if (!(object instanceof Codigoegresos)) {
            return false;
        }
        Codigoegresos other = (Codigoegresos) object;
        if ((this.codigo == null && other.codigo != null) || (this.codigo != null && !this.codigo.equals(other.codigo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.Codigoegresos[ codigo=" + codigo + " ]";
    }
    
}
