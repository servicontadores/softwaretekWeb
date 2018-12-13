/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
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
    @NamedQuery(name = "Conceptoscarteracxc.findAll", query = "SELECT c FROM Conceptoscarteracxc c")})
public class Conceptoscarteracxc implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(nullable = false)
    private Integer codigo;
    @Column(name = "Nombre Concepto", length = 50)
    private String nombreConcepto;
    @Column(length = 50)
    private String cuentaDebito;
    @Basic(optional = false)
    @Column(name = "ODBCFIX_FLDAUTO", nullable = false)
    private int odbcfixFldauto;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "codigoConceptoCartera")
    private List<Cxc> cxcList;

    public Conceptoscarteracxc() {
    }

    public Conceptoscarteracxc(Integer codigo) {
        this.codigo = codigo;
    }

    public Conceptoscarteracxc(Integer codigo, int odbcfixFldauto) {
        this.codigo = codigo;
        this.odbcfixFldauto = odbcfixFldauto;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public String getNombreConcepto() {
        return nombreConcepto;
    }

    public void setNombreConcepto(String nombreConcepto) {
        this.nombreConcepto = nombreConcepto;
    }

    public String getCuentaDebito() {
        return cuentaDebito;
    }

    public void setCuentaDebito(String cuentaDebito) {
        this.cuentaDebito = cuentaDebito;
    }

    public int getOdbcfixFldauto() {
        return odbcfixFldauto;
    }

    public void setOdbcfixFldauto(int odbcfixFldauto) {
        this.odbcfixFldauto = odbcfixFldauto;
    }

    public List<Cxc> getCxcList() {
        return cxcList;
    }

    public void setCxcList(List<Cxc> cxcList) {
        this.cxcList = cxcList;
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
        if (!(object instanceof Conceptoscarteracxc)) {
            return false;
        }
        Conceptoscarteracxc other = (Conceptoscarteracxc) object;
        if ((this.codigo == null && other.codigo != null) || (this.codigo != null && !this.codigo.equals(other.codigo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.Conceptoscarteracxc[ codigo=" + codigo + " ]";
    }
    
}
