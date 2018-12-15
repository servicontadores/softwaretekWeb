/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.servicontadores.softwaretekWeb.entities;

import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Date;
import java.util.List;

/**
 *
 * @author yesidherrera
 */
@Data
@Entity
@Table(uniqueConstraints = {
    @UniqueConstraint(columnNames = {"CodigoActivo"})})
@NamedQueries({
    @NamedQuery(name = "Activosdepreciables.findAll", query = "SELECT a FROM Activosdepreciables a")})
public class Activosdepreciables{

    @NotNull
    @Temporal(TemporalType.TIMESTAMP)
    private Date fecha;
    @Column(nullable = false, length = 50)
    private String codigoActivo;
    @Basic(optional = false)
    @Column(nullable = false, length = 45)
    private String descripcion;
    @Column(length = 200)
    private String detalle;
    @Basic(optional = false)
    @Column(nullable = false)
    private int vrCostoActual;
    private Integer noDocumento;
    @Basic(optional = false)
    @Column(nullable = false)
    private boolean habilitado;
    @Basic(optional = false)
    @Column(nullable = false)
    private int vidaUtil;
    @Basic(optional = false)
    @Column(nullable = false)
    private int depreciacionAcumulada;
    @Basic(optional = false)
    @Column(nullable = false)
    private int vrCosto;
    @Basic(optional = false)
    @Column(nullable = false)
    private double depreciacion;
    @Basic(optional = false)
    @Column(nullable = false, length = 45)
    private String cuentaDebito;
    @Basic(optional = false)
    @Column(nullable = false, length = 45)
    private String cuentaDepreciacion;
    @Basic(optional = false)
    @Column(nullable = false)
    private short cdc;
    @Basic(optional = false)
    @Column(nullable = false)
    private int conteo;
    @Basic(optional = false)
    @Column(nullable = false)
    private boolean depreciar;
    @Basic(optional = false)
    @Column(nullable = false)
    private boolean depreciable;
    @Basic(optional = false)
    @Column(name = "ODBCFIX_FLDAUTO", nullable = false)
    private int odbcfixFldauto;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(nullable = false)
    private Integer indice;
    @Basic(optional = false)
    @Column(nullable = false)
    private short dadoDeBaja;
    @JoinColumn(name = "Categoria", referencedColumnName = "cody", nullable = false)
    @ManyToOne(optional = false)
    private Categorias categoria;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "codigoActivo")
    private List<Movimientoactivosdepreciables> movimientoactivosdepreciablesList;

}
