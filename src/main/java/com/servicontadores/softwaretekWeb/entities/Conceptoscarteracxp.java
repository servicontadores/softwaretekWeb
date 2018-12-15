/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.servicontadores.softwaretekWeb.entities;

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
    @NamedQuery(name = "Conceptoscarteracxp.findAll", query = "SELECT c FROM Conceptoscarteracxp c")})
public class Conceptoscarteracxp implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(nullable = false)
    private Integer codigo;
    @Column(name = "Nombre Concepto", length = 50)
    private String nombreConcepto;
    @Column(length = 50)
    private String cuentaCredito;
    @Basic(optional = false)
    @Column(name = "ODBCFIX_FLDAUTO", nullable = false)
    private int odbcfixFldauto;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "codigoConceptoCartera")
    private List<Cxp> cxpList;

    public Conceptoscarteracxp() {
    }

    public Conceptoscarteracxp(Integer codigo) {
        this.codigo = codigo;
    }

    public Conceptoscarteracxp(Integer codigo, int odbcfixFldauto) {
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

    public String getCuentaCredito() {
        return cuentaCredito;
    }

    public void setCuentaCredito(String cuentaCredito) {
        this.cuentaCredito = cuentaCredito;
    }

    public int getOdbcfixFldauto() {
        return odbcfixFldauto;
    }

    public void setOdbcfixFldauto(int odbcfixFldauto) {
        this.odbcfixFldauto = odbcfixFldauto;
    }

    public List<Cxp> getCxpList() {
        return cxpList;
    }

    public void setCxpList(List<Cxp> cxpList) {
        this.cxpList = cxpList;
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
        if (!(object instanceof Conceptoscarteracxp)) {
            return false;
        }
        Conceptoscarteracxp other = (Conceptoscarteracxp) object;
        if ((this.codigo == null && other.codigo != null) || (this.codigo != null && !this.codigo.equals(other.codigo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.Conceptoscarteracxp[ codigo=" + codigo + " ]";
    }
    
}
