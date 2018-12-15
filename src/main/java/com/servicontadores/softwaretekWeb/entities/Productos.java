/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.servicontadores.softwaretekWeb.entities;

import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 *
 * @author yesidherrera
 */
@Data
@Entity
public class Productos implements Serializable {
    
    
    @Column @NotNull
    private int cody;
    
    @Temporal(TemporalType.TIMESTAMP)
    private Date fecha;
    
    @Id
    
    @Column(nullable = false, length = 50)
    private String codigo;
    
    @Column(length = 300)
    private String descripcion;
    
    @Column(length = 50)
    private String ubicacion;
    
    @Column(length = 50)
    private String puesto;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    
    @Column
    private Double compraVrBruto;
    
    @Column
    private Double compraIva;
    
    @Column
    private Double compravrIva;
    
    @Column
    private Double compravrtotal;
    
    @Column
    private Double ventavrbruto;
    
    @Column
    private Double ventaiva;
    
    @Column
    private Double ventavriva;
    
    @Column
    private Double ventavrtotal;
    
    @Column(precision = 7, scale = 2)
    private Double porcentajeUtilidad;
    
    @Column
    private Double vrutilidad;
    private Boolean preparado;
    
    
    @Column @NotNull
    private boolean miv;
    
    @Column
    private Double dbpromediocompravrbruto;
    
    @Column
    private Double promediocompravrbruto;
    
    @Column
    private Double p2VrBruto;
    
    @Column
    private Double p2iva;
    
    @Column
    private Double p2VrIVA;
    
    @Column
    private Double p2VrTotal;
    
    @Column
    private Double p3VrBruto;
    
    @Column
    private Double p3iva;
    
    @Column
    private Double p3VrIVA;
    
    @Column
    private Double p3VrTotal;
    
    @Column
    private Double p2VrUtilidad;

    @Column @NotNull
    private Integer p2Utilidad;
    
    @Column
    private Double p3VrUtilidad;

    @Column @NotNull
    private Integer p3Utilidad;

    @Column @NotNull
    private Integer bin;
    
    
    @Column @NotNull
    private short tipoIVA;
    
    @Column(length = 45)
    private String excluido;
    
    @Column(length = 50)
    private String ean13;
    
    
    @Column @NotNull
    private boolean activofijo;
    
    @Column
    private Double stockMin;
    
    @Column
    private Double stockMax;
    
    @Column
    private Double puntoPedido;
    
    @Column(length = 50)
    private String detalle;

    @Column @NotNull
    private Boolean habilitado;
    
    @Column
    private Double pDetal1;
    
    @Column
    private Double cDetal1;
    
    @Column
    private Double pDetal2;
    
    @Column
    private Double cDetal2;
    
    @Column
    private Double pDetal3;
    
    @Column
    private Double cDetal3;
    
    @Column
    private Double pDetal4;
    
    @Column
    private Double cDetal4;
    
    @Column
    private Double tipo;
    
    @Column
    private Double pDetal5;
    
    @Column
    private Double cDetal5;
    
    
    @Column(name = "ODBCFIX_FLDAUTO", nullable = false)
    private int odbcfixFldauto;
    
    
    @Column @NotNull
    private double dBSaldo;
    
    @Column(length = 45)
    private String cuentaPUC;
    
    
    @Column @NotNull
    private double ultimoPrecioCompra;
    
    
    @Column @NotNull
    private double dBSaldoINV;
    
    
    @Column @NotNull
    private boolean actualizarVrCompraAuto;
    
    private Short articuloHotel;
    
    @Column
    private Double p4VrBruto;
    
    @Column
    private Double p4iva;
    
    @Column
    private Double p4VrIVA;
    
    @Column
    private Double p4VrTotal;
    
    @Column
    private Double p4VrUtilidad;
    
    @Column
    private Double p4Utilidad;
    
    @Column
    private Double porcentaje1;
    
    @Column
    private Double porcentaje2;
    
    @Column
    private Double porcentaje3;
    
    @Column
    private Double porcentaje4;
    
    @Column
    private Double dbpromediocompravrtotal;
    private Short minUnid;
    
    @Column
    private Double ventaImpoconsumo;
    
    @Column
    private Double ventaVrImpoconsumo;
    
    @Column
    private Double p2Impoconsumo;
    
    @Column
    private Double p2VrImpoconsumo;
    
    @Column
    private Double p3Impoconsumo;
    
    @Column
    private Double p3VrImpoconsumo;
    
    @Column
    private Double p4Impoconsumo;
    
    @Column
    private Double p4VrImpoconsumo;
    
    @Column
    private Double compraImpoconsumo;
    
    @Column
    private Double compraVrImpoconsumo;
    
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "codigoProducto")
    private List<Inventariopendiente> inventariopendienteList;
    
    @JoinColumn(name = "Categoria", referencedColumnName = "cody")
    @ManyToOne
    private Categorias categoria;
    
    @JoinColumn(name = "CodigoLinea", referencedColumnName = "Codigo", nullable = false)
    @ManyToOne(optional = false)
    private Lineas codigoLinea;
    
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "codigoProducto")
    private List<InventariodiarioPlantilla> inventariodiarioPlantillaList;
    
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "codigoSubProducto")
    private List<Subproductos> subproductosList;
    
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "codigoProducto")
    private List<Inventariodiario> inventariodiarioList;
    
}
