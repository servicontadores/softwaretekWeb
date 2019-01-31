package com.servicontadores.softwaretekweb.helpers.FE.DTOs;

import lombok.Data;
import java.util.Date;
import java.util.List;

@Data
public class SucursalDTO {
   private String guid="";
   private String Nombre;
   private String TipoJson="";
   private String Sistema="";
   private String Direccion;
   private String Pais;
   private String Email;
   private String Department;
   private String CitySubdivisionName;
   private String CityName;
}
