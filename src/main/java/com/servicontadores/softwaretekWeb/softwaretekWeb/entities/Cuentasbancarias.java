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
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author yesidherrera
 */
@Entity
@NamedQueries({
    @NamedQuery(name = "Cuentasbancarias.findAll", query = "SELECT c FROM Cuentasbancarias c")})
public class Cuentasbancarias implements Serializable {

    private static final long serialVersionUID = 1L;
    @Temporal(TemporalType.TIMESTAMP)
    private Date fecha;
    @Column(length = 50)
    private String nombreBanco;
    @Id
    @Basic(optional = false)
    @Column(nullable = false, length = 50)
    private String noCuenta;
    @Column(length = 50)
    private String observacion;
    @Basic(optional = false)
    @Column(name = "ODBCFIX_FLDAUTO", nullable = false)
    private int odbcfixFldauto;
    @OneToMany(mappedBy = "noCuentaOCheque")
    private List<Encabezadootrosingresos> encabezadootrosingresosList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "noCuentaOCheque")
    private List<Retiro> retiroList;
    @JoinColumn(name = "NIT", referencedColumnName = "Codigo", nullable = false)
    @ManyToOne(optional = false)
    private Nit nit;
    @JoinColumn(name = "CuentaPUC", referencedColumnName = "CodCuenta")
    @ManyToOne
    private Cuentas cuentaPUC;
    @OneToMany(mappedBy = "noCuentaOCheque")
    private List<Consignacion> consignacionList;

    public Cuentasbancarias() {
    }

    public Cuentasbancarias(String noCuenta) {
        this.noCuenta = noCuenta;
    }

    public Cuentasbancarias(String noCuenta, int odbcfixFldauto) {
        this.noCuenta = noCuenta;
        this.odbcfixFldauto = odbcfixFldauto;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getNombreBanco() {
        return nombreBanco;
    }

    public void setNombreBanco(String nombreBanco) {
        this.nombreBanco = nombreBanco;
    }

    public String getNoCuenta() {
        return noCuenta;
    }

    public void setNoCuenta(String noCuenta) {
        this.noCuenta = noCuenta;
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

    public Nit getNit() {
        return nit;
    }

    public void setNit(Nit nit) {
        this.nit = nit;
    }

    public Cuentas getCuentaPUC() {
        return cuentaPUC;
    }

    public void setCuentaPUC(Cuentas cuentaPUC) {
        this.cuentaPUC = cuentaPUC;
    }

    public List<Consignacion> getConsignacionList() {
        return consignacionList;
    }

    public void setConsignacionList(List<Consignacion> consignacionList) {
        this.consignacionList = consignacionList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (noCuenta != null ? noCuenta.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Cuentasbancarias)) {
            return false;
        }
        Cuentasbancarias other = (Cuentasbancarias) object;
        if ((this.noCuenta == null && other.noCuenta != null) || (this.noCuenta != null && !this.noCuenta.equals(other.noCuenta))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.Cuentasbancarias[ noCuenta=" + noCuenta + " ]";
    }
    
}
