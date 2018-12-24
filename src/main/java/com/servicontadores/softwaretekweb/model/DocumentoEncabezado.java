package com.servicontadores.softwaretekweb.model;

import lombok.Data;
import org.hibernate.envers.Audited;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Date;
import java.util.List;

@Entity
@Data
public class DocumentoEncabezado extends Auditable<String>{

    @Id
    @GeneratedValue
    private Long id;

    @OneToMany
    private List<DocumentoDetalle> documentoDetalleList;

    @NotNull
    @OneToOne
    private Empresa empresa;

    @NotNull
    @Audited
    private Integer comprobanteId;

    @NotNull
    @Audited
    private String noDocumento;

    @NotNull
    @Audited
    private Date fecha;

    @Audited
    private Date fechaFinal;

    @Audited
    private String observacion;

    @Audited
    private String proceso;

    @Audited
    @OneToOne
    private DocumentoEncabezado documentoEncabezadoAnterior;

    @Audited
    @OneToOne
    private FormaPago formaPago1;

    @Audited
    @OneToOne
    private int nitFormaPago1Id;

    @Audited
    @OneToOne
    private CuentaPUC pucFormaPago1;

    @Audited
    @OneToOne
    private FormaPago formaPago2;

    @Audited
    @OneToOne
    private int nitFormaPago2Id;

    @Audited
    @OneToOne
    private CuentaPUC pucFormaPago2;

    @Audited
    @OneToOne
    private FormaPago formaPago3;


    @Audited
    @OneToOne
    private int nitFormaPago3Id;

    @Audited
    @OneToOne
    private CuentaPUC pucFormaPago3;

    @Audited
    @OneToOne
    private FormaPago formaPago4;


    @Audited
    @OneToOne
    private int nitFormaPago4Id;

    @Audited
    @OneToOne
    private CuentaPUC pucFormaPago4;


}
