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
    @NamedQuery(name = "Sistemag.findAll", query = "SELECT s FROM Sistemag s")})
public class Sistemag implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(nullable = false, length = 50)
    private String codigoUsuario;
    private Integer g1;
    private Integer g2;
    private Integer g3;
    private Integer g4;
    private Integer g5;
    private Integer g6;
    private Integer g7;
    private Integer g8;
    private Integer g9;
    private Integer g10;
    private Integer g11;
    private Integer g12;
    private Integer g13;
    private Integer g14;
    private Integer g15;
    @Basic(optional = false)
    @Column(name = "ODBCFIX_FLDAUTO", nullable = false)
    private int odbcfixFldauto;

    public Sistemag() {
    }

    public Sistemag(String codigoUsuario) {
        this.codigoUsuario = codigoUsuario;
    }

    public Sistemag(String codigoUsuario, int odbcfixFldauto) {
        this.codigoUsuario = codigoUsuario;
        this.odbcfixFldauto = odbcfixFldauto;
    }

    public String getCodigoUsuario() {
        return codigoUsuario;
    }

    public void setCodigoUsuario(String codigoUsuario) {
        this.codigoUsuario = codigoUsuario;
    }

    public Integer getG1() {
        return g1;
    }

    public void setG1(Integer g1) {
        this.g1 = g1;
    }

    public Integer getG2() {
        return g2;
    }

    public void setG2(Integer g2) {
        this.g2 = g2;
    }

    public Integer getG3() {
        return g3;
    }

    public void setG3(Integer g3) {
        this.g3 = g3;
    }

    public Integer getG4() {
        return g4;
    }

    public void setG4(Integer g4) {
        this.g4 = g4;
    }

    public Integer getG5() {
        return g5;
    }

    public void setG5(Integer g5) {
        this.g5 = g5;
    }

    public Integer getG6() {
        return g6;
    }

    public void setG6(Integer g6) {
        this.g6 = g6;
    }

    public Integer getG7() {
        return g7;
    }

    public void setG7(Integer g7) {
        this.g7 = g7;
    }

    public Integer getG8() {
        return g8;
    }

    public void setG8(Integer g8) {
        this.g8 = g8;
    }

    public Integer getG9() {
        return g9;
    }

    public void setG9(Integer g9) {
        this.g9 = g9;
    }

    public Integer getG10() {
        return g10;
    }

    public void setG10(Integer g10) {
        this.g10 = g10;
    }

    public Integer getG11() {
        return g11;
    }

    public void setG11(Integer g11) {
        this.g11 = g11;
    }

    public Integer getG12() {
        return g12;
    }

    public void setG12(Integer g12) {
        this.g12 = g12;
    }

    public Integer getG13() {
        return g13;
    }

    public void setG13(Integer g13) {
        this.g13 = g13;
    }

    public Integer getG14() {
        return g14;
    }

    public void setG14(Integer g14) {
        this.g14 = g14;
    }

    public Integer getG15() {
        return g15;
    }

    public void setG15(Integer g15) {
        this.g15 = g15;
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
        if (!(object instanceof Sistemag)) {
            return false;
        }
        Sistemag other = (Sistemag) object;
        if ((this.codigoUsuario == null && other.codigoUsuario != null) || (this.codigoUsuario != null && !this.codigoUsuario.equals(other.codigoUsuario))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.Sistemag[ codigoUsuario=" + codigoUsuario + " ]";
    }
    
}
