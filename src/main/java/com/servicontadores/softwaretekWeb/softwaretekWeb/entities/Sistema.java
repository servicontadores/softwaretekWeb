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
    @NamedQuery(name = "Sistema.findAll", query = "SELECT s FROM Sistema s")})
public class Sistema implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(nullable = false, length = 50)
    private String codigoUsuario;
    @Column(name = "1")
    private Integer a;
    @Column(name = "2")
    private Integer a1;
    @Column(name = "3")
    private Integer a2;
    @Column(name = "4")
    private Integer a3;
    @Column(name = "5")
    private Integer a4;
    @Column(name = "6")
    private Integer a5;
    @Column(name = "7")
    private Integer a6;
    @Column(name = "8")
    private Integer a7;
    @Column(name = "9")
    private Integer a8;
    @Column(name = "10")
    private Integer a9;
    @Column(name = "11")
    private Integer a10;
    @Column(name = "12")
    private Integer a11;
    @Column(name = "ODBCFIX_FLDAUTO")
    private Integer odbcfixFldauto;
    @Column(name = "13")
    private Integer a12;
    @Column(name = "14")
    private Integer a13;
    @Basic(optional = false)
    @Column(nullable = false)
    private short manejaMultiplesSucursales;

    public Sistema() {
    }

    public Sistema(String codigoUsuario) {
        this.codigoUsuario = codigoUsuario;
    }

    public Sistema(String codigoUsuario, short manejaMultiplesSucursales) {
        this.codigoUsuario = codigoUsuario;
        this.manejaMultiplesSucursales = manejaMultiplesSucursales;
    }

    public String getCodigoUsuario() {
        return codigoUsuario;
    }

    public void setCodigoUsuario(String codigoUsuario) {
        this.codigoUsuario = codigoUsuario;
    }

    public Integer getA() {
        return a;
    }

    public void setA(Integer a) {
        this.a = a;
    }

    public Integer getA1() {
        return a1;
    }

    public void setA1(Integer a1) {
        this.a1 = a1;
    }

    public Integer getA2() {
        return a2;
    }

    public void setA2(Integer a2) {
        this.a2 = a2;
    }

    public Integer getA3() {
        return a3;
    }

    public void setA3(Integer a3) {
        this.a3 = a3;
    }

    public Integer getA4() {
        return a4;
    }

    public void setA4(Integer a4) {
        this.a4 = a4;
    }

    public Integer getA5() {
        return a5;
    }

    public void setA5(Integer a5) {
        this.a5 = a5;
    }

    public Integer getA6() {
        return a6;
    }

    public void setA6(Integer a6) {
        this.a6 = a6;
    }

    public Integer getA7() {
        return a7;
    }

    public void setA7(Integer a7) {
        this.a7 = a7;
    }

    public Integer getA8() {
        return a8;
    }

    public void setA8(Integer a8) {
        this.a8 = a8;
    }

    public Integer getA9() {
        return a9;
    }

    public void setA9(Integer a9) {
        this.a9 = a9;
    }

    public Integer getA10() {
        return a10;
    }

    public void setA10(Integer a10) {
        this.a10 = a10;
    }

    public Integer getA11() {
        return a11;
    }

    public void setA11(Integer a11) {
        this.a11 = a11;
    }

    public Integer getOdbcfixFldauto() {
        return odbcfixFldauto;
    }

    public void setOdbcfixFldauto(Integer odbcfixFldauto) {
        this.odbcfixFldauto = odbcfixFldauto;
    }

    public Integer getA12() {
        return a12;
    }

    public void setA12(Integer a12) {
        this.a12 = a12;
    }

    public Integer getA13() {
        return a13;
    }

    public void setA13(Integer a13) {
        this.a13 = a13;
    }

    public short getManejaMultiplesSucursales() {
        return manejaMultiplesSucursales;
    }

    public void setManejaMultiplesSucursales(short manejaMultiplesSucursales) {
        this.manejaMultiplesSucursales = manejaMultiplesSucursales;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codigoUsuario != null ? codigoUsuario.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Sistema)) {
            return false;
        }
        Sistema other = (Sistema) object;
        if ((this.codigoUsuario == null && other.codigoUsuario != null) || (this.codigoUsuario != null && !this.codigoUsuario.equals(other.codigoUsuario))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.Sistema[ codigoUsuario=" + codigoUsuario + " ]";
    }
    
}
