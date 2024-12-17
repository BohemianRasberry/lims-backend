package com.backend.lims;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class CorsConfig implements WebMvcConfigurer {
    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/**")
            .allowedOrigins("http://localhost:3000", "https://lims-nmis.vercel.app/")
            .allowedMethods("GET", "POST", "PUT", "DELETE")
            .allowCredentials(true); // If you need to include cookies in the request
    }
}
