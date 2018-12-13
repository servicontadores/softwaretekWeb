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
import javax.persistence.Id;
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
    @NamedQuery(name = "Empleado.findAll", query = "SELECT e FROM Empleado e")})
public class Empleado implements Serializable {

    private static final long serialVersionUID = 1L;
    @Temporal(TemporalType.TIMESTAMP)
    private Date fecha;
    @Id
    @Basic(optional = false)
    @Column(nullable = false, length = 50)
    private String codigo;
    @Column(length = 50)
    private String cargo;
    @Column(length = 50)
    private String seccion;
    private Integer sueldoBasicoNit;
    @Basic(optional = false)
    @Column(nullable = false)
    private boolean activo;
    @Column(length = 50)
    private String eps;
    @Column(length = 50)
    private String arp;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(precision = 22)
    private Double tarARP;
    @Column(length = 50)
    private String ccf;
    @Column(length = 50)
    private String afp;
    @Basic(optional = false)
    @Column(name = "ODBCFIX_FLDAUTO", nullable = false)
    private int odbcfixFldauto;
    @Column(precision = 22)
    private Double iBCSalud;
    @Column(precision = 22)
    private Double iBCPension;
    @Column(precision = 22)
    private Double ibcarp;
    @Column(precision = 22)
    private Double iBCCesantias;
    @Column(precision = 22)
    private Double iBCIntCesantias;
    @Column(precision = 22)
    private Double ibcpfccf;
    @Column(precision = 22)
    private Double ibcpficbf;
    @Column(precision = 22)
    private Double ibcpfsena;
    @Column(precision = 22)
    private Double iBCPrimas;
    @Column(precision = 22)
    private Double ibcrtft;
    @Column(precision = 22)
    private Double iBCVacaciones;
    @Basic(optional = false)
    @Column(nullable = false)
    private boolean habilitado;
    @Column(length = 50)
    private String sena;
    @Column(length = 45)
    private String icbf;

    public Empleado() {
    }

    public Empleado(String codigo) {
        this.codigo = codigo;
    }

    public Empleado(String codigo, boolean activo, int odbcfixFldauto, boolean habilitado) {
        this.codigo = codigo;
        this.activo = activo;
        this.odbcfixFldauto = odbcfixFldauto;
        this.habilitado = habilitado;
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

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getSeccion() {
        return seccion;
    }

    public void setSeccion(String seccion) {
        this.seccion = seccion;
    }

    public Integer getSueldoBasicoNit() {
        return sueldoBasicoNit;
    }

    public void setSueldoBasicoNit(Integer sueldoBasicoNit) {
        this.sueldoBasicoNit = sueldoBasicoNit;
    }

    public boolean getActivo() {
        return activo;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }

    public String getEps() {
        return eps;
    }

    public void setEps(String eps) {
        this.eps = eps;
    }

    public String getArp() {
        return arp;
    }

    public void setArp(String arp) {
        this.arp = arp;
    }

    public Double getTarARP() {
        return tarARP;
    }

    public void setTarARP(Double tarARP) {
        this.tarARP = tarARP;
    }

    public String getCcf() {
        return ccf;
    }

    public void setCcf(String ccf) {
        this.ccf = ccf;
    }

    public String getAfp() {
        return afp;
    }

    public void setAfp(String afp) {
        this.afp = afp;
    }

    public int getOdbcfixFldauto() {
        return odbcfixFldauto;
    }

    public void setOdbcfixFldauto(int odbcfixFldauto) {
        this.odbcfixFldauto = odbcfixFldauto;
    }

    public Double getIBCSalud() {
        return iBCSalud;
    }

    public void setIBCSalud(Double iBCSalud) {
        this.iBCSalud = iBCSalud;
    }

    public Double getIBCPension() {
        return iBCPension;
    }

    public void setIBCPension(Double iBCPension) {
        this.iBCPension = iBCPension;
    }

    public Double getIbcarp() {
        return ibcarp;
    }

    public void setIbcarp(Double ibcarp) {
        this.ibcarp = ibcarp;
    }

    public Double getIBCCesantias() {
        return iBCCesantias;
    }

    public void setIBCCesantias(Double iBCCesantias) {
        this.iBCCesantias = iBCCesantias;
    }

    public Double getIBCIntCesantias() {
        return iBCIntCesantias;
    }

    public void setIBCIntCesantias(Double iBCIntCesantias) {
        this.iBCIntCesantias = iBCIntCesantias;
    }

    public Double getIbcpfccf() {
        return ibcpfccf;
    }

    public void setIbcpfccf(Double ibcpfccf) {
        this.ibcpfccf = ibcpfccf;
    }

    public Double getIbcpficbf() {
        return ibcpficbf;
    }

    public void setIbcpficbf(Double ibcpficbf) {
        this.ibcpficbf = ibcpficbf;
    }

    public Double getIbcpfsena() {
        return ibcpfsena;
    }

    public void setIbcpfsena(Double ibcpfsena) {
        this.ibcpfsena = ibcpfsena;
    }

    public Double getIBCPrimas() {
        return iBCPrimas;
    }

    public void setIBCPrimas(Double iBCPrimas) {
        this.iBCPrimas = iBCPrimas;
    }

    public Double getIbcrtft() {
        return ibcrtft;
    }

    public void setIbcrtft(Double ibcrtft) {
        this.ibcrtft = ibcrtft;
    }

    public Double getIBCVacaciones() {
        return iBCVacaciones;
    }

    public void setIBCVacaciones(Double iBCVacaciones) {
        this.iBCVacaciones = iBCVacaciones;
    }

    public boolean getHabilitado() {
        return habilitado;
    }

    public void setHabilitado(boolean habilitado) {
        this.habilitado = habilitado;
    }

    public String getSena() {
        return sena;
    }

    public void setSena(String sena) {
        this.sena = sena;
    }

    public String getIcbf() {
        return icbf;
    }

    public void setIcbf(String icbf) {
        this.icbf = icbf;
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
        if (!(object instanceof Empleado)) {
            return false;
        }
        Empleado other = (Empleado) object;
        if ((this.codigo == null && other.codigo != null) || (this.codigo != null && !this.codigo.equals(other.codigo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.Empleado[ codigo=" + codigo + " ]";
    }
    
}
