package com.servicontadores.softwaretekweb.helpers.FE.DTOs;

import lombok.Data;

import java.util.List;

@Data
public class ReceptorDTO {
    private String identificacion;
    private String tipoIdentificacion;
    private String razonSocial;
    private String nombreComercial;
    private String direccion;
    private String pais;
    private String email;
    private String department;
    private String CitySubdivisionName;
    private String cityName;
    private List<NombreValorDTO>descripcion;
}
