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
    @NamedQuery(name = "Sistemac.findAll", query = "SELECT s FROM Sistemac s")})
public class Sistemac implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(nullable = false, length = 50)
    private String codigoUsuario;
    private Integer c1;
    private Integer c2;
    private Integer c3;
    private Integer c4;
    private Integer c5;
    private Integer c6;
    private Integer c7;
    private Integer c8;
    private Integer c9;
    private Integer c10;
    private Integer c11;
    private Integer c12;
    private Integer c13;
    private Integer c14;
    private Integer c15;
    private Integer c16;
    @Basic(optional = false)
    @Column(name = "ODBCFIX_FLDAUTO", nullable = false)
    private int odbcfixFldauto;

    public Sistemac() {
    }

    public Sistemac(String codigoUsuario) {
        this.codigoUsuario = codigoUsuario;
    }

    public Sistemac(String codigoUsuario, int odbcfixFldauto) {
        this.codigoUsuario = codigoUsuario;
        this.odbcfixFldauto = odbcfixFldauto;
    }

    public String getCodigoUsuario() {
        return codigoUsuario;
    }

    public void setCodigoUsuario(String codigoUsuario) {
        this.codigoUsuario = codigoUsuario;
    }

    public Integer getC1() {
        return c1;
    }

    public void setC1(Integer c1) {
        this.c1 = c1;
    }

    public Integer getC2() {
        return c2;
    }

    public void setC2(Integer c2) {
        this.c2 = c2;
    }

    public Integer getC3() {
        return c3;
    }

    public void setC3(Integer c3) {
        this.c3 = c3;
    }

    public Integer getC4() {
        return c4;
    }

    public void setC4(Integer c4) {
        this.c4 = c4;
    }

    public Integer getC5() {
        return c5;
    }

    public void setC5(Integer c5) {
        this.c5 = c5;
    }

    public Integer getC6() {
        return c6;
    }

    public void setC6(Integer c6) {
        this.c6 = c6;
    }

    public Integer getC7() {
        return c7;
    }

    public void setC7(Integer c7) {
        this.c7 = c7;
    }

    public Integer getC8() {
        return c8;
    }

    public void setC8(Integer c8) {
        this.c8 = c8;
    }

    public Integer getC9() {
        return c9;
    }

    public void setC9(Integer c9) {
        this.c9 = c9;
    }

    public Integer getC10() {
        return c10;
    }

    public void setC10(Integer c10) {
        this.c10 = c10;
    }

    public Integer getC11() {
        return c11;
    }

    public void setC11(Integer c11) {
        this.c11 = c11;
    }

    public Integer getC12() {
        return c12;
    }

    public void setC12(Integer c12) {
        this.c12 = c12;
    }

    public Integer getC13() {
        return c13;
    }

    public void setC13(Integer c13) {
        this.c13 = c13;
    }

    public Integer getC14() {
        return c14;
    }

    public void setC14(Integer c14) {
        this.c14 = c14;
    }

    public Integer getC15() {
        return c15;
    }

    public void setC15(Integer c15) {
        this.c15 = c15;
    }

    public Integer getC16() {
        return c16;
    }

    public void setC16(Integer c16) {
        this.c16 = c16;
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
        if (!(object instanceof Sistemac)) {
            return false;
        }
        Sistemac other = (Sistemac) object;
        if ((this.codigoUsuario == null && other.codigoUsuario != null) || (this.codigoUsuario != null && !this.codigoUsuario.equals(other.codigoUsuario))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.Sistemac[ codigoUsuario=" + codigoUsuario + " ]";
    }
    
}
