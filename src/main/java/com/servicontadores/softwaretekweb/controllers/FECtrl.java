package com.servicontadores.softwaretekweb.controllers;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import sun.util.calendar.BaseCalendar;

import javax.persistence.EntityManager;
import java.math.BigInteger;
import java.text.SimpleDateFormat;
import java.util.*;

@Controller
public class FECtrl {

    @Autowired
    EntityManager entityManager;

    @GetMapping("/json")
    @ResponseBody
    public JSONArray getJson(){

        List<Object[]> results =  entityManager.createNativeQuery("SELECT facturarmovimientodiario.Fecha AS Fecha,conceptosproductos.Prefijo AS Serie,facturarmovimientodiario.NoDocumento AS Folio,'COP' AS Moneda,facturarmovimientodiario.NoFacturaDevolucion AS Referencia,facturarmovimientodiario.Detal AS Observaciones,facturarmovimientodiario.Plazo AS FechaVencimiento,sucursales.NombreSucursal AS SucursalFactura,vendedor.Codigo AS DocumentoVendedor,facturarmovimientodiario.CodigoFormaPago,formaspago.FormaPago,sucursales.NombreSucursal,'' AS TipoJson,'' AS Sistema,sucursales.Direccion AS DireccionSucursal,'COP' AS PaisSucursal,'' AS EmailSucursal,'' AS DepartmentSuc,'' AS CitySubdivisionNameSuc,'' AS CityNameSuc,sucursales.NIT AS IdentificacionEmisor,vistanit.tipodocumento AS TipoIdentificacionEmisor,vistanit.NombreCompleto AS RazonSocialEmisor,vistanit.NombreCompleto AS NombreComercialEmisor,sucursales.Direccion AS DireccionEmisor,'CO' AS PaisEmisor,vistanit.CorreoEMail AS EmailEmisor,'' AS DepartmentEmisor,'' AS CitySubdivisionNameEmisor,'' AS CityNameEmisor,sucursales.Telefono AS TelefonoEmisor,facturarmovimientodiario.NIT AS Identificacion,nit.tipodocumento AS TipoIdentificacion,nit.NombreCompleto AS RazonSocial,nit.NombreCompleto AS NombreComercial,nit.Direccion AS DireccionReceptor,pais.CodigoDIAN AS Pais,nit.CorreoEMail AS Email,departamento.NombreDepartamento AS Department,municipio.NombreMunicipio AS CitySubdivisionName,municipio.NombreMunicipio AS CityName,'' AS SectorEmpresarial,nit.Telefono AS Telefono FROM facturarmovimientodiario INNER JOIN conceptosproductos ON conceptosproductos.Codigo = facturarmovimientodiario.CodigoConcepto INNER JOIN sucursales ON facturarmovimientodiario.CodigoSucursal = sucursales.Codigo INNER JOIN formaspago ON facturarmovimientodiario.CodigoFormaPago = formaspago.Codigo INNER JOIN nit ON facturarmovimientodiario.NIT = nit.Codigo INNER JOIN vendedor ON facturarmovimientodiario.CodigoVendedor = vendedor.CodigoVendedor INNER JOIN municipio ON nit.codigomunicipio = municipio.CodigoMunicipio INNER JOIN pais ON nit.codigopais = pais.CodigoPais INNER JOIN departamento ON nit.codigodepartamento = departamento.CodigoDepartamento AND departamento.CodigoDepartamento = municipio.CodigoDepartamento INNER JOIN vistanit ON sucursales.NIT = vistanit.Codigo WHERE facturarmovimientodiario.NoDocumento = 27;").getResultList();

        Date Fecha=new Date();
        String Serie="";
        Integer Folio=0;
        String Moneda="";
        String Observaciones="";
        Integer plazo=0;
        String SucursalFactura="";
        Integer CodigoFormaPago=0;
        String codigoFormaPagoDian="";
        String FormaPago="";
        String nombreSucursal="";
        String DirSucursal="";
        String paisSucursal="";
        String emailSucursal="";
        String DtoSucursal="";
        String citySubSucursal="";
        String citySucursal="";
        String identificacionEmisor="";
        String tipoIdEmisor="";
        String razonSocialEmisor="";
        String nombreComercialEmisor="";
        String direccionEmisor="";
        String paisEmisor="";
        String departamentoEmisor="";
        String emailEmisor="";
        String citySubEmisor="";
        String cityEmisor="";
        String telEmisor="";
        String identificacionReceptor="";
        String tipoIdReceptor="";
        String razonSocialReceptor="";
        String nombreComercialReceptor="";
        String direccionReceptor="";
        String paisReceptor="";
        String departamentoReceptor="";
        String emailReceptor="";
        String citySubReceptor="";
        String cityReceptor="";
        String telReceptor="";


        for(Object[] record:results){
            //SimpleDateFormat formatoFecha = new SimpleDateFormat("yyyy/MM/dd");
            //SimpleDateFormat formato = new SimpleDateFormat("yyyy-MM-dd");
            Fecha= (Date) record[0];
            Serie = (String) record[1];
            Folio = (Integer) record[2];
            Moneda=(String) record[3];
            Observaciones=(String) record[5];
            plazo=(Integer) record[6];
            SucursalFactura=(String) record[7];
            CodigoFormaPago=(Integer) record[9];
            FormaPago=(String) record[10];
            nombreSucursal=(String) record[11];
            DirSucursal=(String) record[14];
            paisSucursal=(String) record[15];
            emailSucursal=(String) record[16];
            DtoSucursal=(String) record[17];
            citySubSucursal=(String) record[18];
            citySucursal=(String) record[19];
            identificacionEmisor=(String) record[20];
            tipoIdEmisor=(String) record[21];
            razonSocialEmisor=(String) record[22];
            nombreComercialEmisor=(String) record[23];
            direccionEmisor=(String) record[24];
            paisEmisor=(String) record[25];
            emailEmisor=(String) record[26];
            departamentoEmisor=(String) record[27];
            citySubEmisor=(String) record[28];
            cityEmisor=(String) record[29];
            telEmisor=(String) record[30];

            identificacionReceptor=(String) record[31];
            tipoIdReceptor=(String) record[32];
            razonSocialReceptor=(String) record[33];
            nombreComercialReceptor=(String) record[34];
            direccionReceptor=(String) record[35];
            paisReceptor=(String) record[36];
            emailReceptor=(String) record[37];
            departamentoReceptor=(String) record[38];
            citySubReceptor=(String) record[39];
            cityReceptor=(String) record[40];
            telReceptor=(String) record[41];

        }
        Map Objeto= new LinkedHashMap();


        JSONArray jsonArray = new JSONArray();
        //Encabezado de Comprobante

        Objeto.put("Fecha",Fecha);
        Objeto.put("Serie",Serie);
        Objeto.put("Folio",Folio);
        Objeto.put("Moneda",Moneda);
        Objeto.put("Observaciones",Observaciones);

        JSONObject Comprobante = new JSONObject(Objeto);



        jsonArray.add(Comprobante);

        return jsonArray;


    }


}
