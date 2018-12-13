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
    @NamedQuery(name = "Sistemai.findAll", query = "SELECT s FROM Sistemai s")})
public class Sistemai implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(nullable = false, length = 50)
    private String codigoUsuario;
    private Integer i1;
    private Integer i2;
    private Integer i3;
    private Integer i4;
    private Integer i5;
    private Integer i6;
    private Integer i7;
    private Integer i8;
    private Integer i9;
    private Integer i10;
    private Integer i11;
    private Integer i12;
    private Integer i13;
    private Integer i14;
    private Integer i15;
    private Integer i16;
    private Integer i17;
    private Integer i18;
    @Basic(optional = false)
    @Column(name = "ODBCFIX_FLDAUTO", nullable = false)
    private int odbcfixFldauto;

    public Sistemai() {
    }

    public Sistemai(String codigoUsuario) {
        this.codigoUsuario = codigoUsuario;
    }

    public Sistemai(String codigoUsuario, int odbcfixFldauto) {
        this.codigoUsuario = codigoUsuario;
        this.odbcfixFldauto = odbcfixFldauto;
    }

    public String getCodigoUsuario() {
        return codigoUsuario;
    }

    public void setCodigoUsuario(String codigoUsuario) {
        this.codigoUsuario = codigoUsuario;
    }

    public Integer getI1() {
        return i1;
    }

    public void setI1(Integer i1) {
        this.i1 = i1;
    }

    public Integer getI2() {
        return i2;
    }

    public void setI2(Integer i2) {
        this.i2 = i2;
    }

    public Integer getI3() {
        return i3;
    }

    public void setI3(Integer i3) {
        this.i3 = i3;
    }

    public Integer getI4() {
        return i4;
    }

    public void setI4(Integer i4) {
        this.i4 = i4;
    }

    public Integer getI5() {
        return i5;
    }

    public void setI5(Integer i5) {
        this.i5 = i5;
    }

    public Integer getI6() {
        return i6;
    }

    public void setI6(Integer i6) {
        this.i6 = i6;
    }

    public Integer getI7() {
        return i7;
    }

    public void setI7(Integer i7) {
        this.i7 = i7;
    }

    public Integer getI8() {
        return i8;
    }

    public void setI8(Integer i8) {
        this.i8 = i8;
    }

    public Integer getI9() {
        return i9;
    }

    public void setI9(Integer i9) {
        this.i9 = i9;
    }

    public Integer getI10() {
        return i10;
    }

    public void setI10(Integer i10) {
        this.i10 = i10;
    }

    public Integer getI11() {
        return i11;
    }

    public void setI11(Integer i11) {
        this.i11 = i11;
    }

    public Integer getI12() {
        return i12;
    }

    public void setI12(Integer i12) {
        this.i12 = i12;
    }

    public Integer getI13() {
        return i13;
    }

    public void setI13(Integer i13) {
        this.i13 = i13;
    }

    public Integer getI14() {
        return i14;
    }

    public void setI14(Integer i14) {
        this.i14 = i14;
    }

    public Integer getI15() {
        return i15;
    }

    public void setI15(Integer i15) {
        this.i15 = i15;
    }

    public Integer getI16() {
        return i16;
    }

    public void setI16(Integer i16) {
        this.i16 = i16;
    }

    public Integer getI17() {
        return i17;
    }

    public void setI17(Integer i17) {
        this.i17 = i17;
    }

    public Integer getI18() {
        return i18;
    }

    public void setI18(Integer i18) {
        this.i18 = i18;
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
        if (!(object instanceof Sistemai)) {
            return false;
        }
        Sistemai other = (Sistemai) object;
        if ((this.codigoUsuario == null && other.codigoUsuario != null) || (this.codigoUsuario != null && !this.codigoUsuario.equals(other.codigoUsuario))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.Sistemai[ codigoUsuario=" + codigoUsuario + " ]";
    }
    
}
