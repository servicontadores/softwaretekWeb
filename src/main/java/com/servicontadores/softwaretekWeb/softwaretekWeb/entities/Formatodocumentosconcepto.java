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
    @NamedQuery(name = "Formatodocumentosconcepto.findAll", query = "SELECT f FROM Formatodocumentosconcepto f")})
public class Formatodocumentosconcepto implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(nullable = false)
    private Integer indice;
    @Basic(optional = false)
    @Column(nullable = false, length = 45)
    private String nombreDocumento;
    @JoinColumn(name = "CodigoConcepto", referencedColumnName = "Codigo", nullable = false)
    @ManyToOne(optional = false)
    private Conceptosproductos codigoConcepto;

    public Formatodocumentosconcepto() {
    }

    public Formatodocumentosconcepto(Integer indice) {
        this.indice = indice;
    }

    public Formatodocumentosconcepto(Integer indice, String nombreDocumento) {
        this.indice = indice;
        this.nombreDocumento = nombreDocumento;
    }

    public Integer getIndice() {
        return indice;
    }

    public void setIndice(Integer indice) {
        this.indice = indice;
    }

    public String getNombreDocumento() {
        return nombreDocumento;
    }

    public void setNombreDocumento(String nombreDocumento) {
        this.nombreDocumento = nombreDocumento;
    }

    public Conceptosproductos getCodigoConcepto() {
        return codigoConcepto;
    }

    public void setCodigoConcepto(Conceptosproductos codigoConcepto) {
        this.codigoConcepto = codigoConcepto;
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
        if (!(object instanceof Formatodocumentosconcepto)) {
            return false;
        }
        Formatodocumentosconcepto other = (Formatodocumentosconcepto) object;
        if ((this.indice == null && other.indice != null) || (this.indice != null && !this.indice.equals(other.indice))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.Formatodocumentosconcepto[ indice=" + indice + " ]";
    }
    
}
