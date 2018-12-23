package com.servicontadores.softwaretekWeb.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.persistence.EntityManager;
import java.util.List;

@Controller
public class FEController {

    @Autowired
    EntityManager entityManager;

    @GetMapping("/json")
    @ResponseBody
    public List<Object> getJson(){
        List<Object> result = entityManager.createNativeQuery("select * from codigoegresos;").getResultList();
        return result;
    }


}
