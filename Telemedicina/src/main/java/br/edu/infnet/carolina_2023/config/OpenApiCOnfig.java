package br.edu.infnet.carolina_2023.config;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;
import org.springframework.context.annotation.Bean;

public class OpenApiCOnfig {

    @Bean
    public OpenAPI customerOpenAPI() {
        return new OpenAPI()
                .info(new Info()
                    .title("Telemedicina")
                        .version("v1")
                        .description("Projeto Telemedicina - Carolina Azevedo")
                        .license(new License().name("Apache 2.0"))

        );


    }
}
