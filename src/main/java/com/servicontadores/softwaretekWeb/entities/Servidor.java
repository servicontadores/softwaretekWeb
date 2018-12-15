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
    @NamedQuery(name = "Servidor.findAll", query = "SELECT s FROM Servidor s")})
public class Servidor implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(nullable = false)
    private Integer indice;
    @Basic(optional = false)
    @Column(nullable = false, length = 100)
    private String rutaMysql;
    @Basic(optional = false)
    @Column(nullable = false, length = 45)
    private String usuario;
    @Basic(optional = false)
    @Column(nullable = false, length = 45)
    private String password;
    @Basic(optional = false)
    @Column(nullable = false, length = 45)
    private String iPHost;
    @Basic(optional = false)
    @Column(nullable = false, length = 45)
    private String puerto;
    @Basic(optional = false)
    @Column(nullable = false, length = 45)
    private String versionMysql;
    @Basic(optional = false)
    @Column(nullable = false, length = 100)
    private String esquema;

    public Servidor() {
    }

    public Servidor(Integer indice) {
        this.indice = indice;
    }

    public Servidor(Integer indice, String rutaMysql, String usuario, String password, String iPHost, String puerto, String versionMysql, String esquema) {
        this.indice = indice;
        this.rutaMysql = rutaMysql;
        this.usuario = usuario;
        this.password = password;
        this.iPHost = iPHost;
        this.puerto = puerto;
        this.versionMysql = versionMysql;
        this.esquema = esquema;
    }

    public Integer getIndice() {
        return indice;
    }

    public void setIndice(Integer indice) {
        this.indice = indice;
    }

    public String getRutaMysql() {
        return rutaMysql;
    }

    public void setRutaMysql(String rutaMysql) {
        this.rutaMysql = rutaMysql;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getIPHost() {
        return iPHost;
    }

    public void setIPHost(String iPHost) {
        this.iPHost = iPHost;
    }

    public String getPuerto() {
        return puerto;
    }

    public void setPuerto(String puerto) {
        this.puerto = puerto;
    }

    public String getVersionMysql() {
        return versionMysql;
    }

    public void setVersionMysql(String versionMysql) {
        this.versionMysql = versionMysql;
    }

    public String getEsquema() {
        return esquema;
    }

    public void setEsquema(String esquema) {
        this.esquema = esquema;
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
        if (!(object instanceof Servidor)) {
            return false;
        }
        Servidor other = (Servidor) object;
        if ((this.indice == null && other.indice != null) || (this.indice != null && !this.indice.equals(other.indice))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.Servidor[ indice=" + indice + " ]";
    }
    
}
