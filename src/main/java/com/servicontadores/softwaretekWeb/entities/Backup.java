/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.servicontadores.softwaretekWeb.entities;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author yesidherrera
 */
@Entity
@NamedQueries({
    @NamedQuery(name = "Backup.findAll", query = "SELECT b FROM Backup b")})
public class Backup implements Serializable {

    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @Column(nullable = false, length = 255)
    private String rutabackup;
    @Id
    @Basic(optional = false)
    @Column(nullable = false)
    private Integer indice;
    @Basic(optional = false)
    @Column(nullable = false, length = 100)
    private String rutaMysql;
    @Basic(optional = false)
    @Column(nullable = false)
    private int programacionbackup;
    @Basic(optional = false)
    @Column(nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date fecha;
    @Basic(optional = false)
    @Column(nullable = false, length = 255)
    private String usuario;
    @Basic(optional = false)
    @Column(nullable = false, length = 255)
    private String password;
    @Basic(optional = false)
    @Column(nullable = false, length = 255)
    private String esquema;
    @Basic(optional = false)
    @Column(nullable = false, length = 255)
    private String iPHost;
    @Basic(optional = false)
    @Column(nullable = false, length = 255)
    private String rutarestore;
    @Basic(optional = false)
    @Column(name = "ODBCFIX_FLDAUTO", nullable = false)
    private int odbcfixFldauto;
    @Basic(optional = false)
    @Column(nullable = false, length = 10)
    private String puerto;
    @Lob
    private byte[] fondo;

    public Backup() {
    }

    public Backup(Integer indice) {
        this.indice = indice;
    }

    public Backup(Integer indice, String rutabackup, String rutaMysql, int programacionbackup, Date fecha, String usuario, String password, String esquema, String iPHost, String rutarestore, int odbcfixFldauto, String puerto) {
        this.indice = indice;
        this.rutabackup = rutabackup;
        this.rutaMysql = rutaMysql;
        this.programacionbackup = programacionbackup;
        this.fecha = fecha;
        this.usuario = usuario;
        this.password = password;
        this.esquema = esquema;
        this.iPHost = iPHost;
        this.rutarestore = rutarestore;
        this.odbcfixFldauto = odbcfixFldauto;
        this.puerto = puerto;
    }

    public String getRutabackup() {
        return rutabackup;
    }

    public void setRutabackup(String rutabackup) {
        this.rutabackup = rutabackup;
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

    public int getProgramacionbackup() {
        return programacionbackup;
    }

    public void setProgramacionbackup(int programacionbackup) {
        this.programacionbackup = programacionbackup;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
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

    public String getEsquema() {
        return esquema;
    }

    public void setEsquema(String esquema) {
        this.esquema = esquema;
    }

    public String getIPHost() {
        return iPHost;
    }

    public void setIPHost(String iPHost) {
        this.iPHost = iPHost;
    }

    public String getRutarestore() {
        return rutarestore;
    }

    public void setRutarestore(String rutarestore) {
        this.rutarestore = rutarestore;
    }

    public int getOdbcfixFldauto() {
        return odbcfixFldauto;
    }

    public void setOdbcfixFldauto(int odbcfixFldauto) {
        this.odbcfixFldauto = odbcfixFldauto;
    }

    public String getPuerto() {
        return puerto;
    }

    public void setPuerto(String puerto) {
        this.puerto = puerto;
    }

    public byte[] getFondo() {
        return fondo;
    }

    public void setFondo(byte[] fondo) {
        this.fondo = fondo;
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
        if (!(object instanceof Backup)) {
            return false;
        }
        Backup other = (Backup) object;
        if ((this.indice == null && other.indice != null) || (this.indice != null && !this.indice.equals(other.indice))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.Backup[ indice=" + indice + " ]";
    }
    
}
