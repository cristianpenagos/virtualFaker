package com.udea.virtualfaker;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import com.fasterxml.jackson.databind.JsonNode;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class VirtualFakerApplicationTests {

    @Autowired
    DataController dataController;

    @Test
    void health(){
        assertEquals("HEALTH CHECK OK::: Hola desde el Servidor", dataController.healtCheck());
    }
    @Test
    void version(){
        assertEquals("Version is 1.0.0::: Mira no mas que chulada", dataController.version());
    }

    @Test
    void nationLength(){
        Integer nationLength = dataController.getRandomNations().size();
        assertEquals(10, nationLength);
    }

    @Test
    void currenciesLength(){
        Integer currenciesLength = dataController.getRandomCurrencies().size();
        assertEquals(20, currenciesLength);
    }
    @Test
    public void testRandomCurrenciesCodeFormat(){
        DataController dataController = new DataController();
        JsonNode response = dataController.getRandomCurrencies();
        for (int i=0; i< response.size(); i++) {
            JsonNode currency = response.get(i);
            String code = currency.get("code").asText();
            assertTrue(code.matches("[A-Z]{3}"));
        }
    }


    @Test
    public void testRandomNationsPerformance(){
        DataController controller = new DataController();
        long startTime = System.currentTimeMillis();
        controller.getRandomNations();
        long endTime = System.currentTimeMillis();
        long executionTime = endTime - startTime;
        System.out.println(executionTime);
        assertTrue(executionTime < 2000);

    }
}
