package com.techie.microservices.inventory.config;


import io.swagger.v3.oas.models.ExternalDocumentation;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class OpenAPIConfig {

    @Bean
    public OpenAPI inventoryServiceAPI(){
        return new OpenAPI()
                .info(new Info().title("inventory Service API").description("THIS IS REST API FOR inventory SERVICE")
                        .version("v0.0.1")
                        .license(new License().name("Apache 2.0")))
                .externalDocs(new ExternalDocumentation().description("YOU CAN REFER TO THE inventory SERIVCE WIKI DOCUMENTATION ")
                        .url("https:??inventory-service-dummy-url.com/docs"));

    }
}
