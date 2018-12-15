/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.servicontadores.softwaretekWeb.entities;

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
    @NamedQuery(name = "Codigonotacredcliente.findAll", query = "SELECT c FROM Codigonotacredcliente c")})
public class Codigonotacredcliente implements Serializable {

    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @Column(nullable = false)
    private int cody;
    @Id
    @Basic(optional = false)
    @Column(nullable = false)
    private Integer codigo;
    @Column(length = 100)
    private String nombreNCCliente;
    @Column(length = 50)
    private String cuentaDebito;
    @Column(length = 50)
    private String retecionCuentaCredito;
    @Basic(optional = false)
    @Column(name = "ODBCFIX_FLDAUTO", nullable = false)
    private int odbcfixFldauto;
    @OneToMany(mappedBy = "codigoNotaCredito")
    private List<Cxc> cxcList;

    public Codigonotacredcliente() {
    }

    public Codigonotacredcliente(Integer codigo) {
        this.codigo = codigo;
    }

    public Codigonotacredcliente(Integer codigo, int cody, int odbcfixFldauto) {
        this.codigo = codigo;
        this.cody = cody;
        this.odbcfixFldauto = odbcfixFldauto;
    }

    public int getCody() {
        return cody;
    }

    public void setCody(int cody) {
        this.cody = cody;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public String getNombreNCCliente() {
        return nombreNCCliente;
    }

    public void setNombreNCCliente(String nombreNCCliente) {
        this.nombreNCCliente = nombreNCCliente;
    }

    public String getCuentaDebito() {
        return cuentaDebito;
    }

    public void setCuentaDebito(String cuentaDebito) {
        this.cuentaDebito = cuentaDebito;
    }

    public String getRetecionCuentaCredito() {
        return retecionCuentaCredito;
    }

    public void setRetecionCuentaCredito(String retecionCuentaCredito) {
        this.retecionCuentaCredito = retecionCuentaCredito;
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
        if (!(object instanceof Codigonotacredcliente)) {
            return false;
        }
        Codigonotacredcliente other = (Codigonotacredcliente) object;
        if ((this.codigo == null && other.codigo != null) || (this.codigo != null && !this.codigo.equals(other.codigo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.Codigonotacredcliente[ codigo=" + codigo + " ]";
    }
    
}
