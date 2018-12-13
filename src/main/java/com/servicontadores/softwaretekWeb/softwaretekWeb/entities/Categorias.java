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

/**
 *
 * @author yesidherrera
 */
@Entity
@NamedQueries({
    @NamedQuery(name = "Categorias.findAll", query = "SELECT c FROM Categorias c")})
public class Categorias implements Serializable {

    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @Column(nullable = false, length = 50)
    private String nombreCategoria;
    @Column(length = 50)
    private String detal;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(nullable = false)
    private Integer cody;
    @Basic(optional = false)
    @Column(name = "ODBCFIX_FLDAUTO", nullable = false)
    private int odbcfixFldauto;
    @Column(length = 45)
    private String cuentaPUC;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "categoria")
    private List<Cuentaconceptocategoriatarifa> cuentaconceptocategoriatarifaList;
    @OneToMany(mappedBy = "categoria")
    private List<Productos> productosList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "categoria")
    private List<Activosdepreciables> activosdepreciablesList;

    public Categorias() {
    }

    public Categorias(Integer cody) {
        this.cody = cody;
    }

    public Categorias(Integer cody, String nombreCategoria, int odbcfixFldauto) {
        this.cody = cody;
        this.nombreCategoria = nombreCategoria;
        this.odbcfixFldauto = odbcfixFldauto;
    }

    public String getNombreCategoria() {
        return nombreCategoria;
    }

    public void setNombreCategoria(String nombreCategoria) {
        this.nombreCategoria = nombreCategoria;
    }

    public String getDetal() {
        return detal;
    }

    public void setDetal(String detal) {
        this.detal = detal;
    }

    public Integer getCody() {
        return cody;
    }

    public void setCody(Integer cody) {
        this.cody = cody;
    }

    public int getOdbcfixFldauto() {
        return odbcfixFldauto;
    }

    public void setOdbcfixFldauto(int odbcfixFldauto) {
        this.odbcfixFldauto = odbcfixFldauto;
    }

    public String getCuentaPUC() {
        return cuentaPUC;
    }

    public void setCuentaPUC(String cuentaPUC) {
        this.cuentaPUC = cuentaPUC;
    }

    public List<Cuentaconceptocategoriatarifa> getCuentaconceptocategoriatarifaList() {
        return cuentaconceptocategoriatarifaList;
    }

    public void setCuentaconceptocategoriatarifaList(List<Cuentaconceptocategoriatarifa> cuentaconceptocategoriatarifaList) {
        this.cuentaconceptocategoriatarifaList = cuentaconceptocategoriatarifaList;
    }

    public List<Productos> getProductosList() {
        return productosList;
    }

    public void setProductosList(List<Productos> productosList) {
        this.productosList = productosList;
    }

    public List<Activosdepreciables> getActivosdepreciablesList() {
        return activosdepreciablesList;
    }

    public void setActivosdepreciablesList(List<Activosdepreciables> activosdepreciablesList) {
        this.activosdepreciablesList = activosdepreciablesList;
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
        if (!(object instanceof Categorias)) {
            return false;
        }
        Categorias other = (Categorias) object;
        if ((this.cody == null && other.cody != null) || (this.cody != null && !this.cody.equals(other.cody))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.Categorias[ cody=" + cody + " ]";
    }
    
}
