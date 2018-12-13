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
import javax.persistence.Table;

/**
 *
 * @author yesidherrera
 */
@Entity
@Table(name = "parqueadero_tipovehiculo")
@NamedQueries({
    @NamedQuery(name = "ParqueaderoTipovehiculo.findAll", query = "SELECT p FROM ParqueaderoTipovehiculo p")})
public class ParqueaderoTipovehiculo implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(nullable = false)
    private Integer codigoTipoVehiculo;
    @Basic(optional = false)
    @Column(nullable = false, length = 50)
    private String tipoVehiculo;
    @Column(length = 100)
    private String detalle;
    @Basic(optional = false)
    @Column(nullable = false)
    private int tarifaMinuto;

    public ParqueaderoTipovehiculo() {
    }

    public ParqueaderoTipovehiculo(Integer codigoTipoVehiculo) {
        this.codigoTipoVehiculo = codigoTipoVehiculo;
    }

    public ParqueaderoTipovehiculo(Integer codigoTipoVehiculo, String tipoVehiculo, int tarifaMinuto) {
        this.codigoTipoVehiculo = codigoTipoVehiculo;
        this.tipoVehiculo = tipoVehiculo;
        this.tarifaMinuto = tarifaMinuto;
    }

    public Integer getCodigoTipoVehiculo() {
        return codigoTipoVehiculo;
    }

    public void setCodigoTipoVehiculo(Integer codigoTipoVehiculo) {
        this.codigoTipoVehiculo = codigoTipoVehiculo;
    }

    public String getTipoVehiculo() {
        return tipoVehiculo;
    }

    public void setTipoVehiculo(String tipoVehiculo) {
        this.tipoVehiculo = tipoVehiculo;
    }

    public String getDetalle() {
        return detalle;
    }

    public void setDetalle(String detalle) {
        this.detalle = detalle;
    }

    public int getTarifaMinuto() {
        return tarifaMinuto;
    }

    public void setTarifaMinuto(int tarifaMinuto) {
        this.tarifaMinuto = tarifaMinuto;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codigoTipoVehiculo != null ? codigoTipoVehiculo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ParqueaderoTipovehiculo)) {
            return false;
        }
        ParqueaderoTipovehiculo other = (ParqueaderoTipovehiculo) object;
        if ((this.codigoTipoVehiculo == null && other.codigoTipoVehiculo != null) || (this.codigoTipoVehiculo != null && !this.codigoTipoVehiculo.equals(other.codigoTipoVehiculo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.ParqueaderoTipovehiculo[ codigoTipoVehiculo=" + codigoTipoVehiculo + " ]";
    }
    
}
