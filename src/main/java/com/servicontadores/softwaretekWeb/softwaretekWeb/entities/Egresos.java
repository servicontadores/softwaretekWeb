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
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;

/**
 *
 * @author yesidherrera
 */
@Entity
@NamedQueries({
    @NamedQuery(name = "Egresos.findAll", query = "SELECT e FROM Egresos e")})
public class Egresos implements Serializable {

    private static final long serialVersionUID = 1L;
    private Integer cody;
    private Integer base;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(precision = 7, scale = 2)
    private Double porcentajeRetefuente;
    @Column(precision = 22)
    private Double porcentajeReteIVa;
    @Column(precision = 22)
    private Double porcentajeIVa;
    @Basic(optional = false)
    @Column(nullable = false)
    private int vrRetefuente;
    @Basic(optional = false)
    @Column(nullable = false)
    private int vrReteIVa;
    @Basic(optional = false)
    @Column(nullable = false)
    private int vrIVa;
    @Basic(optional = false)
    @Column(nullable = false)
    private int valorEgreso;
    @Column(length = 100)
    private String observacion;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(nullable = false)
    private Integer regedit;
    private Integer docRef;
    @Column(precision = 22)
    private Double porcentajeReteICa;
    private Integer vrReteICa;
    @Basic(optional = false)
    @Column(name = "ODBCFIX_FLDAUTO", nullable = false)
    private int odbcfixFldauto;
    private Integer rubro;
    @Basic(optional = false)
    @Column(nullable = false)
    private double pcree;
    @Basic(optional = false)
    @Column(nullable = false)
    private double cree;
    @Column(precision = 22)
    private Double otrasDeducciones;
    @Basic(optional = false)
    @Column(nullable = false)
    private double vrImpuestos;
    private Integer codigoformapago;
    @JoinColumn(name = "Imp", referencedColumnName = "Regedit", nullable = false)
    @ManyToOne(optional = false)
    private Encabezadoegresos imp;
    @JoinColumn(name = "NIT", referencedColumnName = "Codigo", nullable = false)
    @ManyToOne(optional = false)
    private Nit nit;
    @JoinColumn(name = "CodigoEgreso", referencedColumnName = "Codigo")
    @ManyToOne
    private Codigoegresos codigoEgreso;

    public Egresos() {
    }

    public Egresos(Integer regedit) {
        this.regedit = regedit;
    }

    public Egresos(Integer regedit, int vrRetefuente, int vrReteIVa, int vrIVa, int valorEgreso, int odbcfixFldauto, double pcree, double cree, double vrImpuestos) {
        this.regedit = regedit;
        this.vrRetefuente = vrRetefuente;
        this.vrReteIVa = vrReteIVa;
        this.vrIVa = vrIVa;
        this.valorEgreso = valorEgreso;
        this.odbcfixFldauto = odbcfixFldauto;
        this.pcree = pcree;
        this.cree = cree;
        this.vrImpuestos = vrImpuestos;
    }

    public Integer getCody() {
        return cody;
    }

    public void setCody(Integer cody) {
        this.cody = cody;
    }

    public Integer getBase() {
        return base;
    }

    public void setBase(Integer base) {
        this.base = base;
    }

    public Double getPorcentajeRetefuente() {
        return porcentajeRetefuente;
    }

    public void setPorcentajeRetefuente(Double porcentajeRetefuente) {
        this.porcentajeRetefuente = porcentajeRetefuente;
    }

    public Double getPorcentajeReteIVa() {
        return porcentajeReteIVa;
    }

    public void setPorcentajeReteIVa(Double porcentajeReteIVa) {
        this.porcentajeReteIVa = porcentajeReteIVa;
    }

    public Double getPorcentajeIVa() {
        return porcentajeIVa;
    }

    public void setPorcentajeIVa(Double porcentajeIVa) {
        this.porcentajeIVa = porcentajeIVa;
    }

    public int getVrRetefuente() {
        return vrRetefuente;
    }

    public void setVrRetefuente(int vrRetefuente) {
        this.vrRetefuente = vrRetefuente;
    }

    public int getVrReteIVa() {
        return vrReteIVa;
    }

    public void setVrReteIVa(int vrReteIVa) {
        this.vrReteIVa = vrReteIVa;
    }

    public int getVrIVa() {
        return vrIVa;
    }

    public void setVrIVa(int vrIVa) {
        this.vrIVa = vrIVa;
    }

    public int getValorEgreso() {
        return valorEgreso;
    }

    public void setValorEgreso(int valorEgreso) {
        this.valorEgreso = valorEgreso;
    }

    public String getObservacion() {
        return observacion;
    }

    public void setObservacion(String observacion) {
        this.observacion = observacion;
    }

    public Integer getRegedit() {
        return regedit;
    }

    public void setRegedit(Integer regedit) {
        this.regedit = regedit;
    }

    public Integer getDocRef() {
        return docRef;
    }

    public void setDocRef(Integer docRef) {
        this.docRef = docRef;
    }

    public Double getPorcentajeReteICa() {
        return porcentajeReteICa;
    }

    public void setPorcentajeReteICa(Double porcentajeReteICa) {
        this.porcentajeReteICa = porcentajeReteICa;
    }

    public Integer getVrReteICa() {
        return vrReteICa;
    }

    public void setVrReteICa(Integer vrReteICa) {
        this.vrReteICa = vrReteICa;
    }

    public int getOdbcfixFldauto() {
        return odbcfixFldauto;
    }

    public void setOdbcfixFldauto(int odbcfixFldauto) {
        this.odbcfixFldauto = odbcfixFldauto;
    }

    public Integer getRubro() {
        return rubro;
    }

    public void setRubro(Integer rubro) {
        this.rubro = rubro;
    }

    public double getPcree() {
        return pcree;
    }

    public void setPcree(double pcree) {
        this.pcree = pcree;
    }

    public double getCree() {
        return cree;
    }

    public void setCree(double cree) {
        this.cree = cree;
    }

    public Double getOtrasDeducciones() {
        return otrasDeducciones;
    }

    public void setOtrasDeducciones(Double otrasDeducciones) {
        this.otrasDeducciones = otrasDeducciones;
    }

    public double getVrImpuestos() {
        return vrImpuestos;
    }

    public void setVrImpuestos(double vrImpuestos) {
        this.vrImpuestos = vrImpuestos;
    }

    public Integer getCodigoformapago() {
        return codigoformapago;
    }

    public void setCodigoformapago(Integer codigoformapago) {
        this.codigoformapago = codigoformapago;
    }

    public Encabezadoegresos getImp() {
        return imp;
    }

    public void setImp(Encabezadoegresos imp) {
        this.imp = imp;
    }

    public Nit getNit() {
        return nit;
    }

    public void setNit(Nit nit) {
        this.nit = nit;
    }

    public Codigoegresos getCodigoEgreso() {
        return codigoEgreso;
    }

    public void setCodigoEgreso(Codigoegresos codigoEgreso) {
        this.codigoEgreso = codigoEgreso;
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
        if (!(object instanceof Egresos)) {
            return false;
        }
        Egresos other = (Egresos) object;
        if ((this.regedit == null && other.regedit != null) || (this.regedit != null && !this.regedit.equals(other.regedit))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.Egresos[ regedit=" + regedit + " ]";
    }
    
}
