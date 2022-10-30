package me.zakaria.CICDSpringBoot;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.github.javafaker.Faker;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Locale;

@RestController
public class CustomController {

    @GetMapping("/")
    public String healthCheck() {
        return "App Is Running";
    }

    @GetMapping("/version")
    public String version() {
        return "1.0.0";
    }

    @GetMapping("/nations")
    public JsonNode nations() {
        var objectMapper = new ObjectMapper();
        var faker = new Faker(new Locale("en-US"));
        var nations = objectMapper.createArrayNode();

        for (int i = 0; i < 10; i++) {
            nations.add(faker.country().name());
        }
        return nations;
    }

    @GetMapping("/currencies")
    public JsonNode getRandomCurrencices(){
        var objectMapper = new ObjectMapper();
        var faker = new Faker(new Locale("en-US"));
        var currencies = objectMapper.createArrayNode();
        for (int i = 0; i < 10; i++) {
            currencies.add(objectMapper.createObjectNode()
                            .put("name", faker.currency().name())
                            .put("code", faker.currency().code())
                    );
        }

        return currencies;
    }
}
