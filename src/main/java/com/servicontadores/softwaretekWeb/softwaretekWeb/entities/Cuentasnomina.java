/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;

/**
 *
 * @author yesidherrera
 */
@Entity
@NamedQueries({
    @NamedQuery(name = "Cuentasnomina.findAll", query = "SELECT c FROM Cuentasnomina c")})
public class Cuentasnomina implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(nullable = false)
    private Integer codigoTipoTercero;
    @Column(length = 50)
    private String basico;
    @Column(length = 50)
    private String auxT;
    @Column(length = 50)
    private String he;
    @Column(length = 50)
    private String comisiones;
    @Column(length = 50)
    private String bonificaciones;
    @Column(length = 50)
    private String otros;
    @Column(length = 50)
    private String aportSalud;
    @Column(length = 50)
    private String aportSaludEmpresa;
    @Column(length = 50)
    private String aportPension;
    @Column(length = 50)
    private String aportPensionEmpresa;
    @Column(length = 50)
    private String aporteARL;
    @Column(length = 50)
    private String aporteCCF;
    @Column(length = 50)
    private String aporteAFP;
    @Column(length = 50)
    private String cesantias;
    @Column(length = 50)
    private String intCesantias;
    @Column(length = 50)
    private String primas;
    @Column(length = 50)
    private String vacaciones;
    @Column(length = 50)
    private String retefuente;
    @Column(length = 50)
    private String icbf;
    @Column(length = 50)
    private String sena;
    @Column(length = 50)
    private String fsp;
    @Column(length = 50)
    private String retFte;
    @Column(length = 50)
    private String prestamos;
    @Column(length = 50)
    private String otras;
    @Column(length = 50)
    private String causacion;
    @Column(length = 50)
    private String efectivo;
    private Integer cody;
    @Column(length = 45)
    private String incapacidad;
    @Column(length = 45)
    private String suspension;
    @Column(name = "ODBCFIX_FLDAUTO")
    private Integer odbcfixFldauto;

    public Cuentasnomina() {
    }

    public Cuentasnomina(Integer codigoTipoTercero) {
        this.codigoTipoTercero = codigoTipoTercero;
    }

    public Integer getCodigoTipoTercero() {
        return codigoTipoTercero;
    }

    public void setCodigoTipoTercero(Integer codigoTipoTercero) {
        this.codigoTipoTercero = codigoTipoTercero;
    }

    public String getBasico() {
        return basico;
    }

    public void setBasico(String basico) {
        this.basico = basico;
    }

    public String getAuxT() {
        return auxT;
    }

    public void setAuxT(String auxT) {
        this.auxT = auxT;
    }

    public String getHe() {
        return he;
    }

    public void setHe(String he) {
        this.he = he;
    }

    public String getComisiones() {
        return comisiones;
    }

    public void setComisiones(String comisiones) {
        this.comisiones = comisiones;
    }

    public String getBonificaciones() {
        return bonificaciones;
    }

    public void setBonificaciones(String bonificaciones) {
        this.bonificaciones = bonificaciones;
    }

    public String getOtros() {
        return otros;
    }

    public void setOtros(String otros) {
        this.otros = otros;
    }

    public String getAportSalud() {
        return aportSalud;
    }

    public void setAportSalud(String aportSalud) {
        this.aportSalud = aportSalud;
    }

    public String getAportSaludEmpresa() {
        return aportSaludEmpresa;
    }

    public void setAportSaludEmpresa(String aportSaludEmpresa) {
        this.aportSaludEmpresa = aportSaludEmpresa;
    }

    public String getAportPension() {
        return aportPension;
    }

    public void setAportPension(String aportPension) {
        this.aportPension = aportPension;
    }

    public String getAportPensionEmpresa() {
        return aportPensionEmpresa;
    }

    public void setAportPensionEmpresa(String aportPensionEmpresa) {
        this.aportPensionEmpresa = aportPensionEmpresa;
    }

    public String getAporteARL() {
        return aporteARL;
    }

    public void setAporteARL(String aporteARL) {
        this.aporteARL = aporteARL;
    }

    public String getAporteCCF() {
        return aporteCCF;
    }

    public void setAporteCCF(String aporteCCF) {
        this.aporteCCF = aporteCCF;
    }

    public String getAporteAFP() {
        return aporteAFP;
    }

    public void setAporteAFP(String aporteAFP) {
        this.aporteAFP = aporteAFP;
    }

    public String getCesantias() {
        return cesantias;
    }

    public void setCesantias(String cesantias) {
        this.cesantias = cesantias;
    }

    public String getIntCesantias() {
        return intCesantias;
    }

    public void setIntCesantias(String intCesantias) {
        this.intCesantias = intCesantias;
    }

    public String getPrimas() {
        return primas;
    }

    public void setPrimas(String primas) {
        this.primas = primas;
    }

    public String getVacaciones() {
        return vacaciones;
    }

    public void setVacaciones(String vacaciones) {
        this.vacaciones = vacaciones;
    }

    public String getRetefuente() {
        return retefuente;
    }

    public void setRetefuente(String retefuente) {
        this.retefuente = retefuente;
    }

    public String getIcbf() {
        return icbf;
    }

    public void setIcbf(String icbf) {
        this.icbf = icbf;
    }

    public String getSena() {
        return sena;
    }

    public void setSena(String sena) {
        this.sena = sena;
    }

    public String getFsp() {
        return fsp;
    }

    public void setFsp(String fsp) {
        this.fsp = fsp;
    }

    public String getRetFte() {
        return retFte;
    }

    public void setRetFte(String retFte) {
        this.retFte = retFte;
    }

    public String getPrestamos() {
        return prestamos;
    }

    public void setPrestamos(String prestamos) {
        this.prestamos = prestamos;
    }

    public String getOtras() {
        return otras;
    }

    public void setOtras(String otras) {
        this.otras = otras;
    }

    public String getCausacion() {
        return causacion;
    }

    public void setCausacion(String causacion) {
        this.causacion = causacion;
    }

    public String getEfectivo() {
        return efectivo;
    }

    public void setEfectivo(String efectivo) {
        this.efectivo = efectivo;
    }

    public Integer getCody() {
        return cody;
    }

    public void setCody(Integer cody) {
        this.cody = cody;
    }

    public String getIncapacidad() {
        return incapacidad;
    }

    public void setIncapacidad(String incapacidad) {
        this.incapacidad = incapacidad;
    }

    public String getSuspension() {
        return suspension;
    }

    public void setSuspension(String suspension) {
        this.suspension = suspension;
    }

    public Integer getOdbcfixFldauto() {
        return odbcfixFldauto;
    }

    public void setOdbcfixFldauto(Integer odbcfixFldauto) {
        this.odbcfixFldauto = odbcfixFldauto;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codigoTipoTercero != null ? codigoTipoTercero.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Cuentasnomina)) {
            return false;
        }
        Cuentasnomina other = (Cuentasnomina) object;
        if ((this.codigoTipoTercero == null && other.codigoTipoTercero != null) || (this.codigoTipoTercero != null && !this.codigoTipoTercero.equals(other.codigoTipoTercero))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.Cuentasnomina[ codigoTipoTercero=" + codigoTipoTercero + " ]";
    }
    
}
