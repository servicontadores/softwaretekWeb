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
    @NamedQuery(name = "Sistemad.findAll", query = "SELECT s FROM Sistemad s")})
public class Sistemad implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(nullable = false, length = 50)
    private String codigoUsuario;
    private Integer d1;
    private Integer d2;
    private Integer d3;
    private Integer d4;
    private Integer d5;
    private Integer d6;
    private Integer d7;
    private Integer d8;
    private Integer d9;
    private Integer d10;
    private Integer d11;
    private Integer d12;
    private Integer d13;
    private Integer d14;
    private Integer d15;
    private Integer d16;
    @Basic(optional = false)
    @Column(name = "ODBCFIX_FLDAUTO", nullable = false)
    private int odbcfixFldauto;

    public Sistemad() {
    }

    public Sistemad(String codigoUsuario) {
        this.codigoUsuario = codigoUsuario;
    }

    public Sistemad(String codigoUsuario, int odbcfixFldauto) {
        this.codigoUsuario = codigoUsuario;
        this.odbcfixFldauto = odbcfixFldauto;
    }

    public String getCodigoUsuario() {
        return codigoUsuario;
    }

    public void setCodigoUsuario(String codigoUsuario) {
        this.codigoUsuario = codigoUsuario;
    }

    public Integer getD1() {
        return d1;
    }

    public void setD1(Integer d1) {
        this.d1 = d1;
    }

    public Integer getD2() {
        return d2;
    }

    public void setD2(Integer d2) {
        this.d2 = d2;
    }

    public Integer getD3() {
        return d3;
    }

    public void setD3(Integer d3) {
        this.d3 = d3;
    }

    public Integer getD4() {
        return d4;
    }

    public void setD4(Integer d4) {
        this.d4 = d4;
    }

    public Integer getD5() {
        return d5;
    }

    public void setD5(Integer d5) {
        this.d5 = d5;
    }

    public Integer getD6() {
        return d6;
    }

    public void setD6(Integer d6) {
        this.d6 = d6;
    }

    public Integer getD7() {
        return d7;
    }

    public void setD7(Integer d7) {
        this.d7 = d7;
    }

    public Integer getD8() {
        return d8;
    }

    public void setD8(Integer d8) {
        this.d8 = d8;
    }

    public Integer getD9() {
        return d9;
    }

    public void setD9(Integer d9) {
        this.d9 = d9;
    }

    public Integer getD10() {
        return d10;
    }

    public void setD10(Integer d10) {
        this.d10 = d10;
    }

    public Integer getD11() {
        return d11;
    }

    public void setD11(Integer d11) {
        this.d11 = d11;
    }

    public Integer getD12() {
        return d12;
    }

    public void setD12(Integer d12) {
        this.d12 = d12;
    }

    public Integer getD13() {
        return d13;
    }

    public void setD13(Integer d13) {
        this.d13 = d13;
    }

    public Integer getD14() {
        return d14;
    }

    public void setD14(Integer d14) {
        this.d14 = d14;
    }

    public Integer getD15() {
        return d15;
    }

    public void setD15(Integer d15) {
        this.d15 = d15;
    }

    public Integer getD16() {
        return d16;
    }

    public void setD16(Integer d16) {
        this.d16 = d16;
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
        if (!(object instanceof Sistemad)) {
            return false;
        }
        Sistemad other = (Sistemad) object;
        if ((this.codigoUsuario == null && other.codigoUsuario != null) || (this.codigoUsuario != null && !this.codigoUsuario.equals(other.codigoUsuario))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.Sistemad[ codigoUsuario=" + codigoUsuario + " ]";
    }
    
}
