/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author yesidherrera
 */
@Entity
@Table(name = "citas_tipocita")
@NamedQueries({
    @NamedQuery(name = "CitasTipocita.findAll", query = "SELECT c FROM CitasTipocita c")})
public class CitasTipocita implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(nullable = false)
    private Integer codigoTipoCita;
    @Basic(optional = false)
    @Column(nullable = false, length = 100)
    private String tipoCita;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "codigoTipoCita")
    private List<CitasRegistrocitas> citasRegistrocitasList;

    public CitasTipocita() {
    }

    public CitasTipocita(Integer codigoTipoCita) {
        this.codigoTipoCita = codigoTipoCita;
    }

    public CitasTipocita(Integer codigoTipoCita, String tipoCita) {
        this.codigoTipoCita = codigoTipoCita;
        this.tipoCita = tipoCita;
    }

    public Integer getCodigoTipoCita() {
        return codigoTipoCita;
    }

    public void setCodigoTipoCita(Integer codigoTipoCita) {
        this.codigoTipoCita = codigoTipoCita;
    }

    public String getTipoCita() {
        return tipoCita;
    }

    public void setTipoCita(String tipoCita) {
        this.tipoCita = tipoCita;
    }

    public List<CitasRegistrocitas> getCitasRegistrocitasList() {
        return citasRegistrocitasList;
    }

    public void setCitasRegistrocitasList(List<CitasRegistrocitas> citasRegistrocitasList) {
        this.citasRegistrocitasList = citasRegistrocitasList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codigoTipoCita != null ? codigoTipoCita.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof CitasTipocita)) {
            return false;
        }
        CitasTipocita other = (CitasTipocita) object;
        if ((this.codigoTipoCita == null && other.codigoTipoCita != null) || (this.codigoTipoCita != null && !this.codigoTipoCita.equals(other.codigoTipoCita))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.CitasTipocita[ codigoTipoCita=" + codigoTipoCita + " ]";
    }
    
}
