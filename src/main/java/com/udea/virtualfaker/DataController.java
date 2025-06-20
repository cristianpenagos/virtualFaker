package com.udea.virtualfaker;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.github.javafaker.Faker;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Locale;

@RestController                     //HTTP Request
public class DataController {

    @GetMapping("/")
    public String healtCheck(){
        return "HEALT CHECK OK::: Hola desde el Servidor";
    }
    @GetMapping("/version")
    public String version(){
        return "Version is 1.0.0::: Mira no mas que chulada";
    }
    @GetMapping("/nations")
    public JsonNode nations(){
        var objectMapper = new ObjectMapper();
        var faker = new Faker(new Locale("en-US"));
        var nations = objectMapper.createArrayNode();
        for(var i=0; i<10; i++){
            var nation = faker.nation();
            nations.add(objectMapper.createObjectNode()
                    .put("nationality", nation.nationality())
                    .put("capitalCity", nation.capitalCity())
                    .put("bandera", nation.flag())
                    .put("languaje", nation.language()));
        }
        return nations;
    }
}
