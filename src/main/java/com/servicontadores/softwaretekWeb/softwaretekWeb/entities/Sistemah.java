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
    @NamedQuery(name = "Sistemah.findAll", query = "SELECT s FROM Sistemah s")})
public class Sistemah implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(nullable = false, length = 50)
    private String codigoUsuario;
    private Integer h1;
    private Integer h2;
    private Integer h3;
    private Integer h4;
    private Integer h5;
    private Integer h6;
    private Integer h7;
    private Integer h8;
    private Integer h9;
    private Integer h10;
    private Integer h11;
    private Integer h12;
    private Integer h13;
    private Integer h14;
    private Integer h15;
    private Integer h16;
    private Integer h17;
    private Integer h18;
    private Integer h19;
    private Integer h20;
    private Integer h21;
    private Integer h22;
    private Integer h23;
    private Integer h24;
    private Integer h25;
    private Integer h26;
    private Integer h27;
    private Integer h28;
    private Integer h29;
    private Integer h30;
    private Integer h31;
    private Integer h32;
    @Basic(optional = false)
    @Column(name = "ODBCFIX_FLDAUTO", nullable = false)
    private int odbcfixFldauto;

    public Sistemah() {
    }

    public Sistemah(String codigoUsuario) {
        this.codigoUsuario = codigoUsuario;
    }

    public Sistemah(String codigoUsuario, int odbcfixFldauto) {
        this.codigoUsuario = codigoUsuario;
        this.odbcfixFldauto = odbcfixFldauto;
    }

    public String getCodigoUsuario() {
        return codigoUsuario;
    }

    public void setCodigoUsuario(String codigoUsuario) {
        this.codigoUsuario = codigoUsuario;
    }

    public Integer getH1() {
        return h1;
    }

    public void setH1(Integer h1) {
        this.h1 = h1;
    }

    public Integer getH2() {
        return h2;
    }

    public void setH2(Integer h2) {
        this.h2 = h2;
    }

    public Integer getH3() {
        return h3;
    }

    public void setH3(Integer h3) {
        this.h3 = h3;
    }

    public Integer getH4() {
        return h4;
    }

    public void setH4(Integer h4) {
        this.h4 = h4;
    }

    public Integer getH5() {
        return h5;
    }

    public void setH5(Integer h5) {
        this.h5 = h5;
    }

    public Integer getH6() {
        return h6;
    }

    public void setH6(Integer h6) {
        this.h6 = h6;
    }

    public Integer getH7() {
        return h7;
    }

    public void setH7(Integer h7) {
        this.h7 = h7;
    }

    public Integer getH8() {
        return h8;
    }

    public void setH8(Integer h8) {
        this.h8 = h8;
    }

    public Integer getH9() {
        return h9;
    }

    public void setH9(Integer h9) {
        this.h9 = h9;
    }

    public Integer getH10() {
        return h10;
    }

    public void setH10(Integer h10) {
        this.h10 = h10;
    }

    public Integer getH11() {
        return h11;
    }

    public void setH11(Integer h11) {
        this.h11 = h11;
    }

    public Integer getH12() {
        return h12;
    }

    public void setH12(Integer h12) {
        this.h12 = h12;
    }

    public Integer getH13() {
        return h13;
    }

    public void setH13(Integer h13) {
        this.h13 = h13;
    }

    public Integer getH14() {
        return h14;
    }

    public void setH14(Integer h14) {
        this.h14 = h14;
    }

    public Integer getH15() {
        return h15;
    }

    public void setH15(Integer h15) {
        this.h15 = h15;
    }

    public Integer getH16() {
        return h16;
    }

    public void setH16(Integer h16) {
        this.h16 = h16;
    }

    public Integer getH17() {
        return h17;
    }

    public void setH17(Integer h17) {
        this.h17 = h17;
    }

    public Integer getH18() {
        return h18;
    }

    public void setH18(Integer h18) {
        this.h18 = h18;
    }

    public Integer getH19() {
        return h19;
    }

    public void setH19(Integer h19) {
        this.h19 = h19;
    }

    public Integer getH20() {
        return h20;
    }

    public void setH20(Integer h20) {
        this.h20 = h20;
    }

    public Integer getH21() {
        return h21;
    }

    public void setH21(Integer h21) {
        this.h21 = h21;
    }

    public Integer getH22() {
        return h22;
    }

    public void setH22(Integer h22) {
        this.h22 = h22;
    }

    public Integer getH23() {
        return h23;
    }

    public void setH23(Integer h23) {
        this.h23 = h23;
    }

    public Integer getH24() {
        return h24;
    }

    public void setH24(Integer h24) {
        this.h24 = h24;
    }

    public Integer getH25() {
        return h25;
    }

    public void setH25(Integer h25) {
        this.h25 = h25;
    }

    public Integer getH26() {
        return h26;
    }

    public void setH26(Integer h26) {
        this.h26 = h26;
    }

    public Integer getH27() {
        return h27;
    }

    public void setH27(Integer h27) {
        this.h27 = h27;
    }

    public Integer getH28() {
        return h28;
    }

    public void setH28(Integer h28) {
        this.h28 = h28;
    }

    public Integer getH29() {
        return h29;
    }

    public void setH29(Integer h29) {
        this.h29 = h29;
    }

    public Integer getH30() {
        return h30;
    }

    public void setH30(Integer h30) {
        this.h30 = h30;
    }

    public Integer getH31() {
        return h31;
    }

    public void setH31(Integer h31) {
        this.h31 = h31;
    }

    public Integer getH32() {
        return h32;
    }

    public void setH32(Integer h32) {
        this.h32 = h32;
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
        if (!(object instanceof Sistemah)) {
            return false;
        }
        Sistemah other = (Sistemah) object;
        if ((this.codigoUsuario == null && other.codigoUsuario != null) || (this.codigoUsuario != null && !this.codigoUsuario.equals(other.codigoUsuario))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.Sistemah[ codigoUsuario=" + codigoUsuario + " ]";
    }
    
}
