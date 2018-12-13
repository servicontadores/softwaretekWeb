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
import javax.persistence.UniqueConstraint;

/**
 *
 * @author yesidherrera
 */
@Entity
@Table(name = "ppto_grupoppto", uniqueConstraints = {
    @UniqueConstraint(columnNames = {"Codigo", "CodigoProyecto"})})
@NamedQueries({
    @NamedQuery(name = "PptoGrupoppto.findAll", query = "SELECT p FROM PptoGrupoppto p")})
public class PptoGrupoppto implements Serializable {

    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @Column(nullable = false)
    private int codigo;
    @Column(length = 100)
    private String grupo;
    @Column(length = 45)
    private String detalle;
    @Basic(optional = false)
    @Column(nullable = false)
    private int codigoProyecto;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(nullable = false)
    private Integer indice;

    public PptoGrupoppto() {
    }

    public PptoGrupoppto(Integer indice) {
        this.indice = indice;
    }

    public PptoGrupoppto(Integer indice, int codigo, int codigoProyecto) {
        this.indice = indice;
        this.codigo = codigo;
        this.codigoProyecto = codigoProyecto;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getGrupo() {
        return grupo;
    }

    public void setGrupo(String grupo) {
        this.grupo = grupo;
    }

    public String getDetalle() {
        return detalle;
    }

    public void setDetalle(String detalle) {
        this.detalle = detalle;
    }

    public int getCodigoProyecto() {
        return codigoProyecto;
    }

    public void setCodigoProyecto(int codigoProyecto) {
        this.codigoProyecto = codigoProyecto;
    }

    public Integer getIndice() {
        return indice;
    }

    public void setIndice(Integer indice) {
        this.indice = indice;
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
        if (!(object instanceof PptoGrupoppto)) {
            return false;
        }
        PptoGrupoppto other = (PptoGrupoppto) object;
        if ((this.indice == null && other.indice != null) || (this.indice != null && !this.indice.equals(other.indice))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.PptoGrupoppto[ indice=" + indice + " ]";
    }
    
}
