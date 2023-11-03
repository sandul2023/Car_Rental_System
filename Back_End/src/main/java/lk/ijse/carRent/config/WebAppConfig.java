package lk.ijse.carRent.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Configuration
@ComponentScan(basePackages = {"lk.ijse.carRent.controller","lk.ijse.carRent.advisor"})
@EnableWebMvc
public class WebAppConfig {
    public WebAppConfig(){
        System.out.println("WebAppConfig: Web App Instantiated");
    }
}
