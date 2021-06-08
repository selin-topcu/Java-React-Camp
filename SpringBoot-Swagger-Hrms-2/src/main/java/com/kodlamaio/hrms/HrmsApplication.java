package com.kodlamaio.hrms;

import com.kodlamaio.hrms.mernisservice.JLNKPSPublicSoap;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableSwagger2
public class HrmsApplication {


    public static void main(String[] args) throws Exception {
        SpringApplication.run(HrmsApplication.class, args);
        JLNKPSPublicSoap publicSoap = new JLNKPSPublicSoap();
        JLNKPSPublicSoap client =new JLNKPSPublicSoap();
        boolean TCkontrol = client.TCKimlikNoDogrula(Long.valueOf("55783393310"),"Selin","Dayıoğlu",1999);
        if(TCkontrol==true){

            System.out.println("Kimlik Doğrulandı");

        }
        else {
            System.out.println("Kimlik Doğrulanamadı");

        }

    }

    @Bean
    public Docket api() {
        return new Docket(DocumentationType.SWAGGER_2)
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.kodlamaio.hrms"))
                .build();
    }
}
