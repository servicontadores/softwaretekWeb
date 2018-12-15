/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.servicontadores.softwaretekWeb.entities;

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
    @NamedQuery(name = "Sistemae.findAll", query = "SELECT s FROM Sistemae s")})
public class Sistemae implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(nullable = false, length = 50)
    private String codigoUsuario;
    private Integer e1;
    private Integer e2;
    private Integer e3;
    private Integer e4;
    private Integer e5;
    private Integer e6;
    private Integer e7;
    private Integer e8;
    private Integer e9;
    private Integer e10;
    private Integer e11;
    private Integer e12;
    private Integer e13;
    private Integer e14;
    private Integer e15;
    private Integer e16;
    private Integer e17;
    private Integer e18;
    private Integer e19;
    private Integer e20;
    private Integer e21;
    private Integer e22;
    private Integer e23;
    private Integer e24;
    private Integer e25;
    private Integer e26;
    private Integer e27;
    private Integer e28;
    private Integer e29;
    private Integer e30;
    private Integer e31;
    private Integer e32;
    private Integer e33;
    @Basic(optional = false)
    @Column(name = "ODBCFIX_FLDAUTO", nullable = false)
    private int odbcfixFldauto;

    public Sistemae() {
    }

    public Sistemae(String codigoUsuario) {
        this.codigoUsuario = codigoUsuario;
    }

    public Sistemae(String codigoUsuario, int odbcfixFldauto) {
        this.codigoUsuario = codigoUsuario;
        this.odbcfixFldauto = odbcfixFldauto;
    }

    public String getCodigoUsuario() {
        return codigoUsuario;
    }

    public void setCodigoUsuario(String codigoUsuario) {
        this.codigoUsuario = codigoUsuario;
    }

    public Integer getE1() {
        return e1;
    }

    public void setE1(Integer e1) {
        this.e1 = e1;
    }

    public Integer getE2() {
        return e2;
    }

    public void setE2(Integer e2) {
        this.e2 = e2;
    }

    public Integer getE3() {
        return e3;
    }

    public void setE3(Integer e3) {
        this.e3 = e3;
    }

    public Integer getE4() {
        return e4;
    }

    public void setE4(Integer e4) {
        this.e4 = e4;
    }

    public Integer getE5() {
        return e5;
    }

    public void setE5(Integer e5) {
        this.e5 = e5;
    }

    public Integer getE6() {
        return e6;
    }

    public void setE6(Integer e6) {
        this.e6 = e6;
    }

    public Integer getE7() {
        return e7;
    }

    public void setE7(Integer e7) {
        this.e7 = e7;
    }

    public Integer getE8() {
        return e8;
    }

    public void setE8(Integer e8) {
        this.e8 = e8;
    }

    public Integer getE9() {
        return e9;
    }

    public void setE9(Integer e9) {
        this.e9 = e9;
    }

    public Integer getE10() {
        return e10;
    }

    public void setE10(Integer e10) {
        this.e10 = e10;
    }

    public Integer getE11() {
        return e11;
    }

    public void setE11(Integer e11) {
        this.e11 = e11;
    }

    public Integer getE12() {
        return e12;
    }

    public void setE12(Integer e12) {
        this.e12 = e12;
    }

    public Integer getE13() {
        return e13;
    }

    public void setE13(Integer e13) {
        this.e13 = e13;
    }

    public Integer getE14() {
        return e14;
    }

    public void setE14(Integer e14) {
        this.e14 = e14;
    }

    public Integer getE15() {
        return e15;
    }

    public void setE15(Integer e15) {
        this.e15 = e15;
    }

    public Integer getE16() {
        return e16;
    }

    public void setE16(Integer e16) {
        this.e16 = e16;
    }

    public Integer getE17() {
        return e17;
    }

    public void setE17(Integer e17) {
        this.e17 = e17;
    }

    public Integer getE18() {
        return e18;
    }

    public void setE18(Integer e18) {
        this.e18 = e18;
    }

    public Integer getE19() {
        return e19;
    }

    public void setE19(Integer e19) {
        this.e19 = e19;
    }

    public Integer getE20() {
        return e20;
    }

    public void setE20(Integer e20) {
        this.e20 = e20;
    }

    public Integer getE21() {
        return e21;
    }

    public void setE21(Integer e21) {
        this.e21 = e21;
    }

    public Integer getE22() {
        return e22;
    }

    public void setE22(Integer e22) {
        this.e22 = e22;
    }

    public Integer getE23() {
        return e23;
    }

    public void setE23(Integer e23) {
        this.e23 = e23;
    }

    public Integer getE24() {
        return e24;
    }

    public void setE24(Integer e24) {
        this.e24 = e24;
    }

    public Integer getE25() {
        return e25;
    }

    public void setE25(Integer e25) {
        this.e25 = e25;
    }

    public Integer getE26() {
        return e26;
    }

    public void setE26(Integer e26) {
        this.e26 = e26;
    }

    public Integer getE27() {
        return e27;
    }

    public void setE27(Integer e27) {
        this.e27 = e27;
    }

    public Integer getE28() {
        return e28;
    }

    public void setE28(Integer e28) {
        this.e28 = e28;
    }

    public Integer getE29() {
        return e29;
    }

    public void setE29(Integer e29) {
        this.e29 = e29;
    }

    public Integer getE30() {
        return e30;
    }

    public void setE30(Integer e30) {
        this.e30 = e30;
    }

    public Integer getE31() {
        return e31;
    }

    public void setE31(Integer e31) {
        this.e31 = e31;
    }

    public Integer getE32() {
        return e32;
    }

    public void setE32(Integer e32) {
        this.e32 = e32;
    }

    public Integer getE33() {
        return e33;
    }

    public void setE33(Integer e33) {
        this.e33 = e33;
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
        hash += (codigoUsuario != null ? codigoUsuario.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Sistemae)) {
            return false;
        }
        Sistemae other = (Sistemae) object;
        if ((this.codigoUsuario == null && other.codigoUsuario != null) || (this.codigoUsuario != null && !this.codigoUsuario.equals(other.codigoUsuario))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.Sistemae[ codigoUsuario=" + codigoUsuario + " ]";
    }
    
}
