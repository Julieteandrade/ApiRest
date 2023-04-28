package com.avanade.rpg.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.service.VendorExtension;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

import java.util.ArrayList;

import static springfox.documentation.builders.PathSelectors.regex;

@Configuration
public class SwaggerConfig {
    @Bean
    public Docket productApi() {
        return new Docket(DocumentationType.SWAGGER_2).select()
                .apis(RequestHandlerSelectors.basePackage(
                        "com.avanade.rpg"))
                .paths(regex("/rpg.*"))
                .build()
                .apiInfo(metaInfo());

    }

    private ApiInfo metaInfo() {

        ApiInfo apiInfo = new ApiInfo("API REST RPG Characters", "Character list API REST.", "1.0.0",
                "Terms of Service", new Contact("Juliete Andrade",
                "https://github.com/Julieteandrade",
                "julie_sp1990@hotmail.com"),
                "Apache License Version 2.0",
                "https://www.apache.org/licesen.html",
                new ArrayList<VendorExtension>());

        return apiInfo;

    }
}


