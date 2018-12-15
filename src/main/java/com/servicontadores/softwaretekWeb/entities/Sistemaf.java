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
    @NamedQuery(name = "Sistemaf.findAll", query = "SELECT s FROM Sistemaf s")})
public class Sistemaf implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(nullable = false, length = 50)
    private String codigoUsuario;
    private Integer f1;
    private Integer f2;
    private Integer f3;
    private Integer f4;
    private Integer f5;
    private Integer f6;
    private Integer f7;
    private Integer f8;
    private Integer f9;
    private Integer f10;
    private Integer f11;
    private Integer f12;
    private Integer f13;
    private Integer f14;
    private Integer f15;
    private Integer f16;
    private Integer f17;
    private Integer f18;
    private Integer f19;
    private Integer f20;
    private Integer f21;
    private Integer f22;
    private Integer f23;
    private Integer f24;
    private Integer f25;
    private Integer f26;
    private Integer f27;
    private Integer f28;
    private Integer f29;
    private Integer f30;
    private Integer f31;
    private Integer f32;
    @Basic(optional = false)
    @Column(name = "ODBCFIX_FLDAUTO", nullable = false)
    private int odbcfixFldauto;

    public Sistemaf() {
    }

    public Sistemaf(String codigoUsuario) {
        this.codigoUsuario = codigoUsuario;
    }

    public Sistemaf(String codigoUsuario, int odbcfixFldauto) {
        this.codigoUsuario = codigoUsuario;
        this.odbcfixFldauto = odbcfixFldauto;
    }

    public String getCodigoUsuario() {
        return codigoUsuario;
    }

    public void setCodigoUsuario(String codigoUsuario) {
        this.codigoUsuario = codigoUsuario;
    }

    public Integer getF1() {
        return f1;
    }

    public void setF1(Integer f1) {
        this.f1 = f1;
    }

    public Integer getF2() {
        return f2;
    }

    public void setF2(Integer f2) {
        this.f2 = f2;
    }

    public Integer getF3() {
        return f3;
    }

    public void setF3(Integer f3) {
        this.f3 = f3;
    }

    public Integer getF4() {
        return f4;
    }

    public void setF4(Integer f4) {
        this.f4 = f4;
    }

    public Integer getF5() {
        return f5;
    }

    public void setF5(Integer f5) {
        this.f5 = f5;
    }

    public Integer getF6() {
        return f6;
    }

    public void setF6(Integer f6) {
        this.f6 = f6;
    }

    public Integer getF7() {
        return f7;
    }

    public void setF7(Integer f7) {
        this.f7 = f7;
    }

    public Integer getF8() {
        return f8;
    }

    public void setF8(Integer f8) {
        this.f8 = f8;
    }

    public Integer getF9() {
        return f9;
    }

    public void setF9(Integer f9) {
        this.f9 = f9;
    }

    public Integer getF10() {
        return f10;
    }

    public void setF10(Integer f10) {
        this.f10 = f10;
    }

    public Integer getF11() {
        return f11;
    }

    public void setF11(Integer f11) {
        this.f11 = f11;
    }

    public Integer getF12() {
        return f12;
    }

    public void setF12(Integer f12) {
        this.f12 = f12;
    }

    public Integer getF13() {
        return f13;
    }

    public void setF13(Integer f13) {
        this.f13 = f13;
    }

    public Integer getF14() {
        return f14;
    }

    public void setF14(Integer f14) {
        this.f14 = f14;
    }

    public Integer getF15() {
        return f15;
    }

    public void setF15(Integer f15) {
        this.f15 = f15;
    }

    public Integer getF16() {
        return f16;
    }

    public void setF16(Integer f16) {
        this.f16 = f16;
    }

    public Integer getF17() {
        return f17;
    }

    public void setF17(Integer f17) {
        this.f17 = f17;
    }

    public Integer getF18() {
        return f18;
    }

    public void setF18(Integer f18) {
        this.f18 = f18;
    }

    public Integer getF19() {
        return f19;
    }

    public void setF19(Integer f19) {
        this.f19 = f19;
    }

    public Integer getF20() {
        return f20;
    }

    public void setF20(Integer f20) {
        this.f20 = f20;
    }

    public Integer getF21() {
        return f21;
    }

    public void setF21(Integer f21) {
        this.f21 = f21;
    }

    public Integer getF22() {
        return f22;
    }

    public void setF22(Integer f22) {
        this.f22 = f22;
    }

    public Integer getF23() {
        return f23;
    }

    public void setF23(Integer f23) {
        this.f23 = f23;
    }

    public Integer getF24() {
        return f24;
    }

    public void setF24(Integer f24) {
        this.f24 = f24;
    }

    public Integer getF25() {
        return f25;
    }

    public void setF25(Integer f25) {
        this.f25 = f25;
    }

    public Integer getF26() {
        return f26;
    }

    public void setF26(Integer f26) {
        this.f26 = f26;
    }

    public Integer getF27() {
        return f27;
    }

    public void setF27(Integer f27) {
        this.f27 = f27;
    }

    public Integer getF28() {
        return f28;
    }

    public void setF28(Integer f28) {
        this.f28 = f28;
    }

    public Integer getF29() {
        return f29;
    }

    public void setF29(Integer f29) {
        this.f29 = f29;
    }

    public Integer getF30() {
        return f30;
    }

    public void setF30(Integer f30) {
        this.f30 = f30;
    }

    public Integer getF31() {
        return f31;
    }

    public void setF31(Integer f31) {
        this.f31 = f31;
    }

    public Integer getF32() {
        return f32;
    }

    public void setF32(Integer f32) {
        this.f32 = f32;
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
        if (!(object instanceof Sistemaf)) {
            return false;
        }
        Sistemaf other = (Sistemaf) object;
        if ((this.codigoUsuario == null && other.codigoUsuario != null) || (this.codigoUsuario != null && !this.codigoUsuario.equals(other.codigoUsuario))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.Sistemaf[ codigoUsuario=" + codigoUsuario + " ]";
    }
    
}
