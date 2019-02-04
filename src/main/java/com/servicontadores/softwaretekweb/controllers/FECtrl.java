package com.servicontadores.softwaretekweb.controllers;

import com.google.gson.Gson;
import com.servicontadores.softwaretekweb.helpers.FE.DTOs.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.persistence.EntityManager;
import java.util.*;

@Controller
public class FECtrl {

    @Autowired
    EntityManager entityManager;

    @GetMapping("/json")
    @ResponseBody
    public String getJson(){

        List<Object[]> results =  entityManager.createNativeQuery("SELECT facturarmovimientodiario.Fecha AS Fecha,conceptosproductos.Prefijo AS Serie,facturarmovimientodiario.NoDocumento AS Folio,'COP' AS Moneda,facturarmovimientodiario.NoFacturaDevolucion AS Referencia,facturarmovimientodiario.Detal AS Observaciones,facturarmovimientodiario.Plazo AS FechaVencimiento,sucursales.NombreSucursal AS SucursalFactura,vendedor.Codigo AS DocumentoVendedor,facturarmovimientodiario.CodigoFormaPago,formaspago.FormaPago,sucursales.NombreSucursal,'' AS TipoJson,'' AS Sistema,sucursales.Direccion AS DireccionSucursal,'COP' AS PaisSucursal,'' AS EmailSucursal,'' AS DepartmentSuc,'' AS CitySubdivisionNameSuc,'' AS CityNameSuc,sucursales.NIT AS IdentificacionEmisor,vistanit.tipodocumento AS TipoIdentificacionEmisor,vistanit.NombreCompleto AS RazonSocialEmisor,vistanit.NombreCompleto AS NombreComercialEmisor,sucursales.Direccion AS DireccionEmisor,'CO' AS PaisEmisor,vistanit.CorreoEMail AS EmailEmisor,'' AS DepartmentEmisor,'' AS CitySubdivisionNameEmisor,'' AS CityNameEmisor,sucursales.Telefono AS TelefonoEmisor,facturarmovimientodiario.NIT AS Identificacion,nit.tipodocumento AS TipoIdentificacion,nit.NombreCompleto AS RazonSocial,nit.NombreCompleto AS NombreComercial,nit.Direccion AS DireccionReceptor,pais.CodigoDIAN AS Pais,nit.CorreoEMail AS Email,departamento.NombreDepartamento AS Department,municipio.NombreMunicipio AS CitySubdivisionName,municipio.NombreMunicipio AS CityName,'' AS SectorEmpresarial,nit.Telefono AS Telefono FROM facturarmovimientodiario INNER JOIN conceptosproductos ON conceptosproductos.Codigo = facturarmovimientodiario.CodigoConcepto INNER JOIN sucursales ON facturarmovimientodiario.CodigoSucursal = sucursales.Codigo INNER JOIN formaspago ON facturarmovimientodiario.CodigoFormaPago = formaspago.Codigo INNER JOIN nit ON facturarmovimientodiario.NIT = nit.Codigo INNER JOIN vendedor ON facturarmovimientodiario.CodigoVendedor = vendedor.CodigoVendedor INNER JOIN municipio ON nit.codigomunicipio = municipio.CodigoMunicipio INNER JOIN pais ON nit.codigopais = pais.CodigoPais INNER JOIN departamento ON nit.codigodepartamento = departamento.CodigoDepartamento AND departamento.CodigoDepartamento = municipio.CodigoDepartamento INNER JOIN vistanit ON sucursales.NIT = vistanit.Codigo WHERE facturarmovimientodiario.NoDocumento = 27;").getResultList();
        List<Object[]>results2=   entityManager.createNativeQuery("SELECT productos.Descripcion AS Producto,inventariodiario.Cantidad2 AS Cantidad,Round(inventariodiario.PVrBruto2) AS ValorUnitario,Round(inventariodiario.Pbase * inventariodiario.Cantidad2) AS SubTotal,Round(inventariodiario.PVrTotalGen) AS Total, inventariodiario.CodigoProducto AS Codigo,inventariodiario.PIVA,Round(inventariodiario.PVrIVA),Round(inventariodiario.PVrDescuento),facturarmovimientodiario.ReteF AS PorcentajeRTE,facturarmovimientodiario.ReteFuente, facturarmovimientodiario.retei AS PorcentajeReteIva,facturarmovimientodiario.reteiva,facturarmovimientodiario.ReteICA,facturarmovimientodiario.ReteIK AS PorcentajeReteICA,inventariodiario.PImpoConsumo,Round(inventariodiario.VrPImpoConsumo),inventariodiario.Detalle FROM facturarmovimientodiario INNER JOIN inventariodiario ON facturarmovimientodiario.Regedit = inventariodiario.ImpP INNER JOIN productos ON inventariodiario.CodigoProducto =productos.CODIGO WHERE facturarmovimientodiario.NoDocumento = 27;").getResultList();

        //Variables de Encabezado
        Date Fecha=new Date();
        String Serie="";
        Integer Folio=0;
        String Moneda="COP";
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

        //Variables de subDetalles
        String producto="";
        double Cantidad=0;
        double valorUnitario=0;
        double subTotal=0;
        Number total=0;
        String Codigo="";
        double pIva=0;
        double valorIVA=0;
        double valorDescuento=0;
        double porcentajeRTE=0;
        double valorRTE=0;
        double porcentajeRTIVA=0;
        double valorRTIVA=0;
        double porcentajeRTICA=0;
        double valorRTICA=0;
        double porcentajeImpC=0;
        double valorImpC=0;
        String detalleProducto="";


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

        for(Object [] record:results2){
            producto=(String) record[0];
            Cantidad=(double) record[1];
            valorUnitario=(double) record[2];
            subTotal=(double) record[3];
            total=(Number) record[4];
            Codigo=(String) record[5];
        }

        // SE CREA OBJETO DTO Y SE ESTABLECEN SUS VALORES.

        /* Encabezado Comprobante */

        ComprobanteDTO comprobante = new ComprobanteDTO();
        comprobante.setTipoComprobante("01");
        comprobante.setFecha(Fecha.toString());
        comprobante.setSerie(Serie);
        comprobante.setFolio(Folio.toString());
        comprobante.setMoneda(Moneda);
        comprobante.setReferencia("cr123");
        comprobante.setConceptoRef("");
        comprobante.setObservaciones("");

        List<NombreValorDTO> listaDescripcionCte=new ArrayList<>();
        NombreValorDTO descripcion=new NombreValorDTO();

        descripcion.setNombre("Fecha Vencimiento");
        descripcion.setValor(plazo.toString());
        listaDescripcionCte.add(descripcion);

        descripcion=new NombreValorDTO();
        descripcion.setNombre("Orden Compra Cliente");
        descripcion.setValor("");
        listaDescripcionCte.add(descripcion);

        descripcion=new NombreValorDTO();
        descripcion.setNombre("Sucursal Factura");
        descripcion.setValor(SucursalFactura);
        listaDescripcionCte.add(descripcion);

        descripcion=new NombreValorDTO();
        descripcion.setNombre("Sucursal Cliente");
        descripcion.setValor("");
        listaDescripcionCte.add(descripcion);

        comprobante.setDescripcion(listaDescripcionCte);


        List<CodigoValorDTO> listaMetodoPago = new ArrayList<>();
        CodigoValorDTO metodoPago = new CodigoValorDTO();

        if(CodigoFormaPago==1){
            codigoFormaPagoDian="10";
        }


        metodoPago.setCodigo(codigoFormaPagoDian);
        metodoPago.setValor(FormaPago);

        listaMetodoPago.add(metodoPago);

        comprobante.setMetodoPago(listaMetodoPago);


        /* Encabezado de Sucursal */

        SucursalDTO Sucursal= new SucursalDTO();
        Sucursal.setGuid("");
        Sucursal.setNombre(nombreSucursal);
        Sucursal.setTipoJson("");
        Sucursal.setSistema("");
        Sucursal.setDireccion(DirSucursal);
        Sucursal.setPais(paisSucursal);
        Sucursal.setEmail(emailSucursal);
        Sucursal.setDepartment(DtoSucursal);
        Sucursal.setCityName(citySucursal);
        Sucursal.setCitySubdivisionName(citySubSucursal);



       /* Encabezado del Emisor */

        EmisorDTO emisor=new EmisorDTO();
        emisor.setIdentificacion(identificacionEmisor);
        emisor.setTipoIdentificacion(tipoIdEmisor);
        emisor.setRazonSocial(razonSocialEmisor);
        emisor.setNombreComercial(nombreComercialEmisor);
        emisor.setDireccion(direccionEmisor);
        emisor.setPais(paisEmisor);
        emisor.setEmail(emailEmisor);
        emisor.setDepartment(departamentoEmisor);
        emisor.setCitySubdivisionName(citySubEmisor);
        emisor.setCityName(cityEmisor);

        List<NombreValorDTO>listaDescripcionEmisor=new ArrayList<>();
        NombreValorDTO descripcionEmisor=new NombreValorDTO();
        descripcionEmisor.setNombre("Telefono");
        descripcionEmisor.setValor(telEmisor);
        listaDescripcionEmisor.add(descripcionEmisor);
        emisor.setDescripcion(listaDescripcionEmisor);


        /* Encabezado del Receptor */

        ReceptorDTO receptor=new ReceptorDTO();
        receptor.setIdentificacion(identificacionReceptor);
        receptor.setTipoIdentificacion(tipoIdReceptor);
        receptor.setRazonSocial(razonSocialReceptor);
        receptor.setNombreComercial(nombreComercialReceptor);
        receptor.setDireccion(direccionReceptor);
        receptor.setPais(paisReceptor);
        receptor.setEmail(emailReceptor);
        receptor.setDepartment(departamentoReceptor);
        receptor.setCitySubdivisionName(citySubReceptor);
        receptor.setCityName(cityReceptor);

        List<NombreValorDTO>listaDescripcionReceptor=new ArrayList<>();
        NombreValorDTO descripcionReceptor=new NombreValorDTO();
        descripcionReceptor.setNombre("Sector Empresarial");
        descripcionReceptor.setValor("");
        listaDescripcionReceptor.add(descripcionReceptor);

        descripcionReceptor=new NombreValorDTO();
        descripcionReceptor.setNombre("Telefono");
        descripcionReceptor.setValor(telReceptor);
        listaDescripcionReceptor.add(descripcionReceptor);
        receptor.setDescripcion(listaDescripcionReceptor);

        /* Encabezado subDetalles */

        List<ActivosDTO>listaActivos=new ArrayList<>();
        ActivosDTO Activos=new ActivosDTO();

        Activos.setNombre(producto);
        Activos.setCantidad(Cantidad);
        Activos.setValorUnitario(valorUnitario);
        Activos.setSubTotal(subTotal);
        Activos.setTotal(total);
        Activos.setCodigo(Codigo);
       listaActivos.add(Activos);




        /* Encebezado del Objeto DTO Global */

        MovimientosDTO movimientos=new MovimientosDTO();
        movimientos.setComprobante(comprobante);
        movimientos.setSucursal(Sucursal);
        movimientos.setEmisor(emisor);
        movimientos.setReceptor(receptor);
        movimientos.setDetalles(listaActivos);
        Gson gson = new Gson();
        String jsonStr = gson.toJson(movimientos);
        return jsonStr;

    }


}
