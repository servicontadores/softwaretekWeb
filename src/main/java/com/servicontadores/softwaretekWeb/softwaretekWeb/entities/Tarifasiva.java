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
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;

/**
 *
 * @author yesidherrera
 */
@Entity
@NamedQueries({
    @NamedQuery(name = "Tarifasiva.findAll", query = "SELECT t FROM Tarifasiva t")})
public class Tarifasiva implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(nullable = false)
    private Integer codigo;
    @Basic(optional = false)
    @Column(nullable = false)
    private double tarifa;
    @Column(length = 45)
    private String iVAVentas;
    @Column(length = 45)
    private String iVACompras;
    @Column(length = 45)
    private String iVADevVentas;
    @Column(length = 45)
    private String iVADevCompras;
    @Column(length = 45)
    private String baseVentas;
    @Column(length = 45)
    private String descuentoVentas;
    @Column(length = 45)
    private String devolucionVentas;
    @Column(length = 45)
    private String baseCompras;
    @Column(length = 45)
    private String descuentoCompras;
    @Column(length = 45)
    private String devolucionCompras;
    @Basic(optional = false)
    @Column(name = "ODBCFIX_FLDAUTO", nullable = false)
    private int odbcfixFldauto;

    public Tarifasiva() {
    }

    public Tarifasiva(Integer codigo) {
        this.codigo = codigo;
    }

    public Tarifasiva(Integer codigo, double tarifa, int odbcfixFldauto) {
        this.codigo = codigo;
        this.tarifa = tarifa;
        this.odbcfixFldauto = odbcfixFldauto;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public double getTarifa() {
        return tarifa;
    }

    public void setTarifa(double tarifa) {
        this.tarifa = tarifa;
    }

    public String getIVAVentas() {
        return iVAVentas;
    }

    public void setIVAVentas(String iVAVentas) {
        this.iVAVentas = iVAVentas;
    }

    public String getIVACompras() {
        return iVACompras;
    }

    public void setIVACompras(String iVACompras) {
        this.iVACompras = iVACompras;
    }

    public String getIVADevVentas() {
        return iVADevVentas;
    }

    public void setIVADevVentas(String iVADevVentas) {
        this.iVADevVentas = iVADevVentas;
    }

    public String getIVADevCompras() {
        return iVADevCompras;
    }

    public void setIVADevCompras(String iVADevCompras) {
        this.iVADevCompras = iVADevCompras;
    }

    public String getBaseVentas() {
        return baseVentas;
    }

    public void setBaseVentas(String baseVentas) {
        this.baseVentas = baseVentas;
    }

    public String getDescuentoVentas() {
        return descuentoVentas;
    }

    public void setDescuentoVentas(String descuentoVentas) {
        this.descuentoVentas = descuentoVentas;
    }

    public String getDevolucionVentas() {
        return devolucionVentas;
    }

    public void setDevolucionVentas(String devolucionVentas) {
        this.devolucionVentas = devolucionVentas;
    }

    public String getBaseCompras() {
        return baseCompras;
    }

    public void setBaseCompras(String baseCompras) {
        this.baseCompras = baseCompras;
    }

    public String getDescuentoCompras() {
        return descuentoCompras;
    }

    public void setDescuentoCompras(String descuentoCompras) {
        this.descuentoCompras = descuentoCompras;
    }

    public String getDevolucionCompras() {
        return devolucionCompras;
    }

    public void setDevolucionCompras(String devolucionCompras) {
        this.devolucionCompras = devolucionCompras;
    }

    public int getOdbcfixFldauto() {
        return odbcfixFldauto;
    }

    public void setOdbcfixFldauto(int odbcfixFldauto) {
        this.odbcfixFldauto = odbcfixFldauto;
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
        if (!(object instanceof Tarifasiva)) {
            return false;
        }
        Tarifasiva other = (Tarifasiva) object;
        if ((this.codigo == null && other.codigo != null) || (this.codigo != null && !this.codigo.equals(other.codigo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.Tarifasiva[ codigo=" + codigo + " ]";
    }
    
}
