/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 *
 * @author yesidherrera
 */
@Embeddable
public class NuevanominaEmpleadosPK implements Serializable {

    @Basic(optional = false)
    @Column(name = "Id_Empleado", nullable = false)
    private int idEmpleado;
    @Basic(optional = false)
    @Column(nullable = false, length = 45)
    private String nit;

    public NuevanominaEmpleadosPK() {
    }

    public NuevanominaEmpleadosPK(int idEmpleado, String nit) {
        this.idEmpleado = idEmpleado;
        this.nit = nit;
    }

    public int getIdEmpleado() {
        return idEmpleado;
    }

    public void setIdEmpleado(int idEmpleado) {
        this.idEmpleado = idEmpleado;
    }

    public String getNit() {
        return nit;
    }

    public void setNit(String nit) {
        this.nit = nit;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) idEmpleado;
        hash += (nit != null ? nit.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof NuevanominaEmpleadosPK)) {
            return false;
        }
        NuevanominaEmpleadosPK other = (NuevanominaEmpleadosPK) object;
        if (this.idEmpleado != other.idEmpleado) {
            return false;
        }
        if ((this.nit == null && other.nit != null) || (this.nit != null && !this.nit.equals(other.nit))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.NuevanominaEmpleadosPK[ idEmpleado=" + idEmpleado + ", nit=" + nit + " ]";
    }
    
}
