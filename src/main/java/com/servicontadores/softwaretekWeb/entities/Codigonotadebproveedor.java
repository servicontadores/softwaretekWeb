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
    @NamedQuery(name = "Codigonotadebproveedor.findAll", query = "SELECT c FROM Codigonotadebproveedor c")})
public class Codigonotadebproveedor implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(nullable = false)
    private Integer codigo;
    @Column(length = 45)
    private String nombreNDProveedor;
    @Column(length = 45)
    private String cuentaCredito;
    @Column(length = 45)
    private String retencionCuentaDebito;
    @Basic(optional = false)
    @Column(name = "ODBCFIX_FLDAUTO", nullable = false)
    private int odbcfixFldauto;
    @OneToMany(mappedBy = "codigoNotaDebito")
    private List<Cxp> cxpList;

    public Codigonotadebproveedor() {
    }

    public Codigonotadebproveedor(Integer codigo) {
        this.codigo = codigo;
    }

    public Codigonotadebproveedor(Integer codigo, int odbcfixFldauto) {
        this.codigo = codigo;
        this.odbcfixFldauto = odbcfixFldauto;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public String getNombreNDProveedor() {
        return nombreNDProveedor;
    }

    public void setNombreNDProveedor(String nombreNDProveedor) {
        this.nombreNDProveedor = nombreNDProveedor;
    }

    public String getCuentaCredito() {
        return cuentaCredito;
    }

    public void setCuentaCredito(String cuentaCredito) {
        this.cuentaCredito = cuentaCredito;
    }

    public String getRetencionCuentaDebito() {
        return retencionCuentaDebito;
    }

    public void setRetencionCuentaDebito(String retencionCuentaDebito) {
        this.retencionCuentaDebito = retencionCuentaDebito;
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
        if (!(object instanceof Codigonotadebproveedor)) {
            return false;
        }
        Codigonotadebproveedor other = (Codigonotadebproveedor) object;
        if ((this.codigo == null && other.codigo != null) || (this.codigo != null && !this.codigo.equals(other.codigo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.Codigonotadebproveedor[ codigo=" + codigo + " ]";
    }
    
}
