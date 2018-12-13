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
import javax.persistence.JoinColumn;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToOne;

/**
 *
 * @author yesidherrera
 */
@Entity
@NamedQueries({
    @NamedQuery(name = "Sistemab.findAll", query = "SELECT s FROM Sistemab s")})
public class Sistemab implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(nullable = false, length = 50)
    private String codigoUsuario;
    private Integer b1;
    private Integer b2;
    private Integer b3;
    private Integer b4;
    private Integer b5;
    private Integer b6;
    private Integer b7;
    private Integer b8;
    private Integer b9;
    private Integer b10;
    private Integer b11;
    private Integer b12;
    private Integer b13;
    @Basic(optional = false)
    @Column(name = "ODBCFIX_FLDAUTO", nullable = false)
    private int odbcfixFldauto;
    @JoinColumn(name = "CodigoUsuario", referencedColumnName = "Codigo", nullable = false, insertable = false, updatable = false)
    @OneToOne(optional = false)
    private User user;

    public Sistemab() {
    }

    public Sistemab(String codigoUsuario) {
        this.codigoUsuario = codigoUsuario;
    }

    public Sistemab(String codigoUsuario, int odbcfixFldauto) {
        this.codigoUsuario = codigoUsuario;
        this.odbcfixFldauto = odbcfixFldauto;
    }

    public String getCodigoUsuario() {
        return codigoUsuario;
    }

    public void setCodigoUsuario(String codigoUsuario) {
        this.codigoUsuario = codigoUsuario;
    }

    public Integer getB1() {
        return b1;
    }

    public void setB1(Integer b1) {
        this.b1 = b1;
    }

    public Integer getB2() {
        return b2;
    }

    public void setB2(Integer b2) {
        this.b2 = b2;
    }

    public Integer getB3() {
        return b3;
    }

    public void setB3(Integer b3) {
        this.b3 = b3;
    }

    public Integer getB4() {
        return b4;
    }

    public void setB4(Integer b4) {
        this.b4 = b4;
    }

    public Integer getB5() {
        return b5;
    }

    public void setB5(Integer b5) {
        this.b5 = b5;
    }

    public Integer getB6() {
        return b6;
    }

    public void setB6(Integer b6) {
        this.b6 = b6;
    }

    public Integer getB7() {
        return b7;
    }

    public void setB7(Integer b7) {
        this.b7 = b7;
    }

    public Integer getB8() {
        return b8;
    }

    public void setB8(Integer b8) {
        this.b8 = b8;
    }

    public Integer getB9() {
        return b9;
    }

    public void setB9(Integer b9) {
        this.b9 = b9;
    }

    public Integer getB10() {
        return b10;
    }

    public void setB10(Integer b10) {
        this.b10 = b10;
    }

    public Integer getB11() {
        return b11;
    }

    public void setB11(Integer b11) {
        this.b11 = b11;
    }

    public Integer getB12() {
        return b12;
    }

    public void setB12(Integer b12) {
        this.b12 = b12;
    }

    public Integer getB13() {
        return b13;
    }

    public void setB13(Integer b13) {
        this.b13 = b13;
    }

    public int getOdbcfixFldauto() {
        return odbcfixFldauto;
    }

    public void setOdbcfixFldauto(int odbcfixFldauto) {
        this.odbcfixFldauto = odbcfixFldauto;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
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
        if (!(object instanceof Sistemab)) {
            return false;
        }
        Sistemab other = (Sistemab) object;
        if ((this.codigoUsuario == null && other.codigoUsuario != null) || (this.codigoUsuario != null && !this.codigoUsuario.equals(other.codigoUsuario))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.Sistemab[ codigoUsuario=" + codigoUsuario + " ]";
    }
    
}
