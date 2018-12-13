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
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
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
    @UniqueConstraint(columnNames = {"CodigoActivo"})})
@NamedQueries({
    @NamedQuery(name = "Activosdepreciables.findAll", query = "SELECT a FROM Activosdepreciables a")})
public class Activosdepreciables implements Serializable {

    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @Column(nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date fecha;
    @Basic(optional = false)
    @Column(nullable = false, length = 50)
    private String codigoActivo;
    @Basic(optional = false)
    @Column(nullable = false, length = 45)
    private String descripcion;
    @Column(length = 200)
    private String detalle;
    @Basic(optional = false)
    @Column(nullable = false)
    private int vrCostoActual;
    private Integer noDocumento;
    @Basic(optional = false)
    @Column(nullable = false)
    private boolean habilitado;
    @Basic(optional = false)
    @Column(nullable = false)
    private int vidaUtil;
    @Basic(optional = false)
    @Column(nullable = false)
    private int depreciacionAcumulada;
    @Basic(optional = false)
    @Column(nullable = false)
    private int vrCosto;
    @Basic(optional = false)
    @Column(nullable = false)
    private double depreciacion;
    @Basic(optional = false)
    @Column(nullable = false, length = 45)
    private String cuentaDebito;
    @Basic(optional = false)
    @Column(nullable = false, length = 45)
    private String cuentaDepreciacion;
    @Basic(optional = false)
    @Column(nullable = false)
    private short cdc;
    @Basic(optional = false)
    @Column(nullable = false)
    private int conteo;
    @Basic(optional = false)
    @Column(nullable = false)
    private boolean depreciar;
    @Basic(optional = false)
    @Column(nullable = false)
    private boolean depreciable;
    @Basic(optional = false)
    @Column(name = "ODBCFIX_FLDAUTO", nullable = false)
    private int odbcfixFldauto;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(nullable = false)
    private Integer indice;
    @Basic(optional = false)
    @Column(nullable = false)
    private short dadoDeBaja;
    @JoinColumn(name = "Categoria", referencedColumnName = "cody", nullable = false)
    @ManyToOne(optional = false)
    private Categorias categoria;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "codigoActivo")
    private List<Movimientoactivosdepreciables> movimientoactivosdepreciablesList;

    public Activosdepreciables() {
    }

    public Activosdepreciables(Integer indice) {
        this.indice = indice;
    }

    public Activosdepreciables(Integer indice, Date fecha, String codigoActivo, String descripcion, int vrCostoActual, boolean habilitado, int vidaUtil, int depreciacionAcumulada, int vrCosto, double depreciacion, String cuentaDebito, String cuentaDepreciacion, short cdc, int conteo, boolean depreciar, boolean depreciable, int odbcfixFldauto, short dadoDeBaja) {
        this.indice = indice;
        this.fecha = fecha;
        this.codigoActivo = codigoActivo;
        this.descripcion = descripcion;
        this.vrCostoActual = vrCostoActual;
        this.habilitado = habilitado;
        this.vidaUtil = vidaUtil;
        this.depreciacionAcumulada = depreciacionAcumulada;
        this.vrCosto = vrCosto;
        this.depreciacion = depreciacion;
        this.cuentaDebito = cuentaDebito;
        this.cuentaDepreciacion = cuentaDepreciacion;
        this.cdc = cdc;
        this.conteo = conteo;
        this.depreciar = depreciar;
        this.depreciable = depreciable;
        this.odbcfixFldauto = odbcfixFldauto;
        this.dadoDeBaja = dadoDeBaja;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getCodigoActivo() {
        return codigoActivo;
    }

    public void setCodigoActivo(String codigoActivo) {
        this.codigoActivo = codigoActivo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getDetalle() {
        return detalle;
    }

    public void setDetalle(String detalle) {
        this.detalle = detalle;
    }

    public int getVrCostoActual() {
        return vrCostoActual;
    }

    public void setVrCostoActual(int vrCostoActual) {
        this.vrCostoActual = vrCostoActual;
    }

    public Integer getNoDocumento() {
        return noDocumento;
    }

    public void setNoDocumento(Integer noDocumento) {
        this.noDocumento = noDocumento;
    }

    public boolean getHabilitado() {
        return habilitado;
    }

    public void setHabilitado(boolean habilitado) {
        this.habilitado = habilitado;
    }

    public int getVidaUtil() {
        return vidaUtil;
    }

    public void setVidaUtil(int vidaUtil) {
        this.vidaUtil = vidaUtil;
    }

    public int getDepreciacionAcumulada() {
        return depreciacionAcumulada;
    }

    public void setDepreciacionAcumulada(int depreciacionAcumulada) {
        this.depreciacionAcumulada = depreciacionAcumulada;
    }

    public int getVrCosto() {
        return vrCosto;
    }

    public void setVrCosto(int vrCosto) {
        this.vrCosto = vrCosto;
    }

    public double getDepreciacion() {
        return depreciacion;
    }

    public void setDepreciacion(double depreciacion) {
        this.depreciacion = depreciacion;
    }

    public String getCuentaDebito() {
        return cuentaDebito;
    }

    public void setCuentaDebito(String cuentaDebito) {
        this.cuentaDebito = cuentaDebito;
    }

    public String getCuentaDepreciacion() {
        return cuentaDepreciacion;
    }

    public void setCuentaDepreciacion(String cuentaDepreciacion) {
        this.cuentaDepreciacion = cuentaDepreciacion;
    }

    public short getCdc() {
        return cdc;
    }

    public void setCdc(short cdc) {
        this.cdc = cdc;
    }

    public int getConteo() {
        return conteo;
    }

    public void setConteo(int conteo) {
        this.conteo = conteo;
    }

    public boolean getDepreciar() {
        return depreciar;
    }

    public void setDepreciar(boolean depreciar) {
        this.depreciar = depreciar;
    }

    public boolean getDepreciable() {
        return depreciable;
    }

    public void setDepreciable(boolean depreciable) {
        this.depreciable = depreciable;
    }

    public int getOdbcfixFldauto() {
        return odbcfixFldauto;
    }

    public void setOdbcfixFldauto(int odbcfixFldauto) {
        this.odbcfixFldauto = odbcfixFldauto;
    }

    public Integer getIndice() {
        return indice;
    }

    public void setIndice(Integer indice) {
        this.indice = indice;
    }

    public short getDadoDeBaja() {
        return dadoDeBaja;
    }

    public void setDadoDeBaja(short dadoDeBaja) {
        this.dadoDeBaja = dadoDeBaja;
    }

    public Categorias getCategoria() {
        return categoria;
    }

    public void setCategoria(Categorias categoria) {
        this.categoria = categoria;
    }

    public List<Movimientoactivosdepreciables> getMovimientoactivosdepreciablesList() {
        return movimientoactivosdepreciablesList;
    }

    public void setMovimientoactivosdepreciablesList(List<Movimientoactivosdepreciables> movimientoactivosdepreciablesList) {
        this.movimientoactivosdepreciablesList = movimientoactivosdepreciablesList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (indice != null ? indice.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Activosdepreciables)) {
            return false;
        }
        Activosdepreciables other = (Activosdepreciables) object;
        if ((this.indice == null && other.indice != null) || (this.indice != null && !this.indice.equals(other.indice))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.Activosdepreciables[ indice=" + indice + " ]";
    }
    
}
