package me.zakaria.CICDSpringBoot;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;


@SpringBootTest
public class CustomControllerTest {


    @Autowired
    CustomController customController;

    @Test
    void health(){
        Assertions.assertEquals("App Is Running", customController.healthCheck());
    }

    @Test
    void version(){
        Assertions.assertEquals("1.0.0", customController.version());
    }

    @Test
    void nationsLength(){
        Assertions.assertEquals(10, customController.nations().size());
    }

    @Test
    void currenciesLength(){
        Assertions.assertEquals(10, customController.getRandomCurrencices().size());
    }
}
