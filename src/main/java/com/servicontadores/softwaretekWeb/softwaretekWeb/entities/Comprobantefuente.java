/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;

/**
 *
 * @author yesidherrera
 */
@Entity
@NamedQueries({
    @NamedQuery(name = "Comprobantefuente.findAll", query = "SELECT c FROM Comprobantefuente c")})
public class Comprobantefuente implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(nullable = false, length = 15)
    private String codFuente;
    @Column(length = 50)
    private String nombreFuente;
    @Basic(optional = false)
    @Column(name = "ODBCFIX_FLDAUTO", nullable = false)
    private int odbcfixFldauto;
    @Basic(optional = false)
    @Column(nullable = false)
    private short normaLocal;
    @Basic(optional = false)
    @Column(nullable = false)
    private short normaNIIF;
    @OneToMany(mappedBy = "codigoFuente")
    private List<Encabezadomovimiento> encabezadomovimientoList;

    public Comprobantefuente() {
    }

    public Comprobantefuente(String codFuente) {
        this.codFuente = codFuente;
    }

    public Comprobantefuente(String codFuente, int odbcfixFldauto, short normaLocal, short normaNIIF) {
        this.codFuente = codFuente;
        this.odbcfixFldauto = odbcfixFldauto;
        this.normaLocal = normaLocal;
        this.normaNIIF = normaNIIF;
    }

    public String getCodFuente() {
        return codFuente;
    }

    public void setCodFuente(String codFuente) {
        this.codFuente = codFuente;
    }

    public String getNombreFuente() {
        return nombreFuente;
    }

    public void setNombreFuente(String nombreFuente) {
        this.nombreFuente = nombreFuente;
    }

    public int getOdbcfixFldauto() {
        return odbcfixFldauto;
    }

    public void setOdbcfixFldauto(int odbcfixFldauto) {
        this.odbcfixFldauto = odbcfixFldauto;
    }

    public short getNormaLocal() {
        return normaLocal;
    }

    public void setNormaLocal(short normaLocal) {
        this.normaLocal = normaLocal;
    }

    public short getNormaNIIF() {
        return normaNIIF;
    }

    public void setNormaNIIF(short normaNIIF) {
        this.normaNIIF = normaNIIF;
    }

    public List<Encabezadomovimiento> getEncabezadomovimientoList() {
        return encabezadomovimientoList;
    }

    public void setEncabezadomovimientoList(List<Encabezadomovimiento> encabezadomovimientoList) {
        this.encabezadomovimientoList = encabezadomovimientoList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codFuente != null ? codFuente.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Comprobantefuente)) {
            return false;
        }
        Comprobantefuente other = (Comprobantefuente) object;
        if ((this.codFuente == null && other.codFuente != null) || (this.codFuente != null && !this.codFuente.equals(other.codFuente))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.Comprobantefuente[ codFuente=" + codFuente + " ]";
    }
    
}
