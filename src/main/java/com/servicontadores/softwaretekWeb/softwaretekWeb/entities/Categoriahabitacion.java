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
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;

/**
 *
 * @author yesidherrera
 */
@Entity
@NamedQueries({
    @NamedQuery(name = "Categoriahabitacion.findAll", query = "SELECT c FROM Categoriahabitacion c")})
public class Categoriahabitacion implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(nullable = false)
    private Integer cody;
    @Column(length = 255)
    private String categoria;
    private Integer saldo1;
    private Integer saldo2;
    private Integer saldo3;

    public Categoriahabitacion() {
    }

    public Categoriahabitacion(Integer cody) {
        this.cody = cody;
    }

    public Integer getCody() {
        return cody;
    }

    public void setCody(Integer cody) {
        this.cody = cody;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public Integer getSaldo1() {
        return saldo1;
    }

    public void setSaldo1(Integer saldo1) {
        this.saldo1 = saldo1;
    }

    public Integer getSaldo2() {
        return saldo2;
    }

    public void setSaldo2(Integer saldo2) {
        this.saldo2 = saldo2;
    }

    public Integer getSaldo3() {
        return saldo3;
    }

    public void setSaldo3(Integer saldo3) {
        this.saldo3 = saldo3;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (cody != null ? cody.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Categoriahabitacion)) {
            return false;
        }
        Categoriahabitacion other = (Categoriahabitacion) object;
        if ((this.cody == null && other.cody != null) || (this.cody != null && !this.cody.equals(other.cody))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.Categoriahabitacion[ cody=" + cody + " ]";
    }
    
}
