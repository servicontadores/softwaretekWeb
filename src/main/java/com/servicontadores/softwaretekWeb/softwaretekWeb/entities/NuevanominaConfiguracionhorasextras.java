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
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 *
 * @author yesidherrera
 */
@Entity
@Table(name = "nuevanomina_configuracionhorasextras")
@NamedQueries({
    @NamedQuery(name = "NuevanominaConfiguracionhorasextras.findAll", query = "SELECT n FROM NuevanominaConfiguracionhorasextras n")})
public class NuevanominaConfiguracionhorasextras implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(nullable = false)
    private Integer indice;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(precision = 22)
    private Double tarifaExtraDiurnaSemanal;
    @Column(precision = 22)
    private Double tarifaNocturnaSemanal;
    @Column(precision = 22)
    private Double tarifaExtraNocturnaSemanal;
    @Column(precision = 22)
    private Double tarifaDiurnaDominical;
    @Column(precision = 22)
    private Double tarifaExtraDiurnaDominical;
    @Column(precision = 22)
    private Double tarifaNocturnaDominical;
    @Column(precision = 22)
    private Double tarifaExtraNocturnaDominical;

    public NuevanominaConfiguracionhorasextras() {
    }

    public NuevanominaConfiguracionhorasextras(Integer indice) {
        this.indice = indice;
    }

    public Integer getIndice() {
        return indice;
    }

    public void setIndice(Integer indice) {
        this.indice = indice;
    }

    public Double getTarifaExtraDiurnaSemanal() {
        return tarifaExtraDiurnaSemanal;
    }

    public void setTarifaExtraDiurnaSemanal(Double tarifaExtraDiurnaSemanal) {
        this.tarifaExtraDiurnaSemanal = tarifaExtraDiurnaSemanal;
    }

    public Double getTarifaNocturnaSemanal() {
        return tarifaNocturnaSemanal;
    }

    public void setTarifaNocturnaSemanal(Double tarifaNocturnaSemanal) {
        this.tarifaNocturnaSemanal = tarifaNocturnaSemanal;
    }

    public Double getTarifaExtraNocturnaSemanal() {
        return tarifaExtraNocturnaSemanal;
    }

    public void setTarifaExtraNocturnaSemanal(Double tarifaExtraNocturnaSemanal) {
        this.tarifaExtraNocturnaSemanal = tarifaExtraNocturnaSemanal;
    }

    public Double getTarifaDiurnaDominical() {
        return tarifaDiurnaDominical;
    }

    public void setTarifaDiurnaDominical(Double tarifaDiurnaDominical) {
        this.tarifaDiurnaDominical = tarifaDiurnaDominical;
    }

    public Double getTarifaExtraDiurnaDominical() {
        return tarifaExtraDiurnaDominical;
    }

    public void setTarifaExtraDiurnaDominical(Double tarifaExtraDiurnaDominical) {
        this.tarifaExtraDiurnaDominical = tarifaExtraDiurnaDominical;
    }

    public Double getTarifaNocturnaDominical() {
        return tarifaNocturnaDominical;
    }

    public void setTarifaNocturnaDominical(Double tarifaNocturnaDominical) {
        this.tarifaNocturnaDominical = tarifaNocturnaDominical;
    }

    public Double getTarifaExtraNocturnaDominical() {
        return tarifaExtraNocturnaDominical;
    }

    public void setTarifaExtraNocturnaDominical(Double tarifaExtraNocturnaDominical) {
        this.tarifaExtraNocturnaDominical = tarifaExtraNocturnaDominical;
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
        if (!(object instanceof NuevanominaConfiguracionhorasextras)) {
            return false;
        }
        NuevanominaConfiguracionhorasextras other = (NuevanominaConfiguracionhorasextras) object;
        if ((this.indice == null && other.indice != null) || (this.indice != null && !this.indice.equals(other.indice))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.NuevanominaConfiguracionhorasextras[ indice=" + indice + " ]";
    }
    
}
