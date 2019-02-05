package com.servicontadores.softwaretekweb.helpers.FE.DTOs;
import lombok.Data;

@Data
public class ImpuestosDTO {

    private String impuesto="";
    private String nombre="";
    private Number porcentaje;
    private Number totalImp;

}
