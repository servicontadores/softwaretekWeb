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
    @NamedQuery(name = "Encabezadoegresos.findAll", query = "SELECT e FROM Encabezadoegresos e")})
public class Encabezadoegresos implements Serializable {

    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @Column(nullable = false)
    private int cody;
    @Id
    @Basic(optional = false)
    @Column(nullable = false)
    private Integer regedit;
    @Temporal(TemporalType.TIMESTAMP)
    private Date fecha;
    @Column(length = 50)
    private String fuente;
    private Integer noEgreso;
    @Column(length = 50)
    private String formaEgreso;
    @Column(length = 50)
    private String noCuentaOCheque;
    @Column(length = 50)
    private String cuentaMovimiento;
    @Column(length = 400)
    private String observacion;
    @Column(length = 50)
    private String conceptoEgreso;
    private Integer cancelado;
    private Integer keyNomina;
    @Basic(optional = false)
    @Column(name = "ODBCFIX_FLDAUTO", nullable = false)
    private int odbcfixFldauto;
    @Column(length = 15)
    private String noCheque;
    private Integer key;
    @Basic(optional = false)
    @Column(name = "NoDoc_Auto", nullable = false)
    private boolean noDocAuto;
    @Temporal(TemporalType.TIMESTAMP)
    private Date periodoFechaInicio;
    @Temporal(TemporalType.TIMESTAMP)
    private Date periodoFechaFin;
    private Integer guardado;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "imp")
    private List<Egresos> egresosList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "regedit")
    private List<EgresosImpuestos> egresosImpuestosList;
    @JoinColumn(name = "NIT", referencedColumnName = "Codigo")
    @ManyToOne
    private Nit nit;
    @JoinColumn(name = "CDC", referencedColumnName = "Codigo", nullable = false)
    @ManyToOne(optional = false)
    private Cdc cdc;
    @JoinColumn(name = "CodigoConcepto", referencedColumnName = "Codigo")
    @ManyToOne
    private Conceptosproductos codigoConcepto;
    @JoinColumn(name = "CodigoFormaPago", referencedColumnName = "Codigo")
    @ManyToOne
    private Formaspago codigoFormaPago;
    @JoinColumn(name = "CodigoSucursal", referencedColumnName = "Codigo", nullable = false)
    @ManyToOne(optional = false)
    private Sucursales codigoSucursal;
    @JoinColumn(name = "CodigoUsuario", referencedColumnName = "Codigo")
    @ManyToOne
    private User codigoUsuario;

    public Encabezadoegresos() {
    }

    public Encabezadoegresos(Integer regedit) {
        this.regedit = regedit;
    }

    public Encabezadoegresos(Integer regedit, int cody, int odbcfixFldauto, boolean noDocAuto) {
        this.regedit = regedit;
        this.cody = cody;
        this.odbcfixFldauto = odbcfixFldauto;
        this.noDocAuto = noDocAuto;
    }

    public int getCody() {
        return cody;
    }

    public void setCody(int cody) {
        this.cody = cody;
    }

    public Integer getRegedit() {
        return regedit;
    }

    public void setRegedit(Integer regedit) {
        this.regedit = regedit;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getFuente() {
        return fuente;
    }

    public void setFuente(String fuente) {
        this.fuente = fuente;
    }

    public Integer getNoEgreso() {
        return noEgreso;
    }

    public void setNoEgreso(Integer noEgreso) {
        this.noEgreso = noEgreso;
    }

    public String getFormaEgreso() {
        return formaEgreso;
    }

    public void setFormaEgreso(String formaEgreso) {
        this.formaEgreso = formaEgreso;
    }

    public String getNoCuentaOCheque() {
        return noCuentaOCheque;
    }

    public void setNoCuentaOCheque(String noCuentaOCheque) {
        this.noCuentaOCheque = noCuentaOCheque;
    }

    public String getCuentaMovimiento() {
        return cuentaMovimiento;
    }

    public void setCuentaMovimiento(String cuentaMovimiento) {
        this.cuentaMovimiento = cuentaMovimiento;
    }

    public String getObservacion() {
        return observacion;
    }

    public void setObservacion(String observacion) {
        this.observacion = observacion;
    }

    public String getConceptoEgreso() {
        return conceptoEgreso;
    }

    public void setConceptoEgreso(String conceptoEgreso) {
        this.conceptoEgreso = conceptoEgreso;
    }

    public Integer getCancelado() {
        return cancelado;
    }

    public void setCancelado(Integer cancelado) {
        this.cancelado = cancelado;
    }

    public Integer getKeyNomina() {
        return keyNomina;
    }

    public void setKeyNomina(Integer keyNomina) {
        this.keyNomina = keyNomina;
    }

    public int getOdbcfixFldauto() {
        return odbcfixFldauto;
    }

    public void setOdbcfixFldauto(int odbcfixFldauto) {
        this.odbcfixFldauto = odbcfixFldauto;
    }

    public String getNoCheque() {
        return noCheque;
    }

    public void setNoCheque(String noCheque) {
        this.noCheque = noCheque;
    }

    public Integer getKey() {
        return key;
    }

    public void setKey(Integer key) {
        this.key = key;
    }

    public boolean getNoDocAuto() {
        return noDocAuto;
    }

    public void setNoDocAuto(boolean noDocAuto) {
        this.noDocAuto = noDocAuto;
    }

    public Date getPeriodoFechaInicio() {
        return periodoFechaInicio;
    }

    public void setPeriodoFechaInicio(Date periodoFechaInicio) {
        this.periodoFechaInicio = periodoFechaInicio;
    }

    public Date getPeriodoFechaFin() {
        return periodoFechaFin;
    }

    public void setPeriodoFechaFin(Date periodoFechaFin) {
        this.periodoFechaFin = periodoFechaFin;
    }

    public Integer getGuardado() {
        return guardado;
    }

    public void setGuardado(Integer guardado) {
        this.guardado = guardado;
    }

    public List<Egresos> getEgresosList() {
        return egresosList;
    }

    public void setEgresosList(List<Egresos> egresosList) {
        this.egresosList = egresosList;
    }

    public List<EgresosImpuestos> getEgresosImpuestosList() {
        return egresosImpuestosList;
    }

    public void setEgresosImpuestosList(List<EgresosImpuestos> egresosImpuestosList) {
        this.egresosImpuestosList = egresosImpuestosList;
    }

    public Nit getNit() {
        return nit;
    }

    public void setNit(Nit nit) {
        this.nit = nit;
    }

    public Cdc getCdc() {
        return cdc;
    }

    public void setCdc(Cdc cdc) {
        this.cdc = cdc;
    }

    public Conceptosproductos getCodigoConcepto() {
        return codigoConcepto;
    }

    public void setCodigoConcepto(Conceptosproductos codigoConcepto) {
        this.codigoConcepto = codigoConcepto;
    }

    public Formaspago getCodigoFormaPago() {
        return codigoFormaPago;
    }

    public void setCodigoFormaPago(Formaspago codigoFormaPago) {
        this.codigoFormaPago = codigoFormaPago;
    }

    public Sucursales getCodigoSucursal() {
        return codigoSucursal;
    }

    public void setCodigoSucursal(Sucursales codigoSucursal) {
        this.codigoSucursal = codigoSucursal;
    }

    public User getCodigoUsuario() {
        return codigoUsuario;
    }

    public void setCodigoUsuario(User codigoUsuario) {
        this.codigoUsuario = codigoUsuario;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (regedit != null ? regedit.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Encabezadoegresos)) {
            return false;
        }
        Encabezadoegresos other = (Encabezadoegresos) object;
        if ((this.regedit == null && other.regedit != null) || (this.regedit != null && !this.regedit.equals(other.regedit))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.Encabezadoegresos[ regedit=" + regedit + " ]";
    }
    
}
