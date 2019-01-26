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

    @OneToOne
    private FormaPago formaPago1;


    private int nitFormaPago1Id;

    @OneToOne
    private FormaPago formaPago2;

    private int nitFormaPago2Id;

    @OneToOne
    private FormaPago formaPago3;

    private int nitFormaPago3Id;

    @OneToOne
    private FormaPago formaPago4;

    private int nitFormaPago4Id;

}
