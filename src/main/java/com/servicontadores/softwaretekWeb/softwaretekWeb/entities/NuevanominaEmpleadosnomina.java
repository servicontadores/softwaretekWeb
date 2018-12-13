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
@Table(name = "nuevanomina_empleadosnomina")
@NamedQueries({
    @NamedQuery(name = "NuevanominaEmpleadosnomina.findAll", query = "SELECT n FROM NuevanominaEmpleadosnomina n")})
public class NuevanominaEmpleadosnomina implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(nullable = false)
    private Integer indice;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "Id_Empleado", precision = 22)
    private Double idEmpleado;
    private Boolean incluirEnNomina;

    public NuevanominaEmpleadosnomina() {
    }

    public NuevanominaEmpleadosnomina(Integer indice) {
        this.indice = indice;
    }

    public Integer getIndice() {
        return indice;
    }

    public void setIndice(Integer indice) {
        this.indice = indice;
    }

    public Double getIdEmpleado() {
        return idEmpleado;
    }

    public void setIdEmpleado(Double idEmpleado) {
        this.idEmpleado = idEmpleado;
    }

    public Boolean getIncluirEnNomina() {
        return incluirEnNomina;
    }

    public void setIncluirEnNomina(Boolean incluirEnNomina) {
        this.incluirEnNomina = incluirEnNomina;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (indice != null ? indice.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof NuevanominaEmpleadosnomina)) {
            return false;
        }
        NuevanominaEmpleadosnomina other = (NuevanominaEmpleadosnomina) object;
        if ((this.indice == null && other.indice != null) || (this.indice != null && !this.indice.equals(other.indice))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.NuevanominaEmpleadosnomina[ indice=" + indice + " ]";
    }
    
}
