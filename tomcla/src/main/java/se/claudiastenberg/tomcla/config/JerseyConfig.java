package se.claudiastenberg.tomcla.config;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.module.paramnames.ParameterNamesModule;
import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JerseyConfig extends ResourceConfig {
    public JerseyConfig() {
        packages("se.claudiastenberg.tomcla.resource");
    }

    @Bean
    public ObjectMapper objectMapper() {
        return new ObjectMapper().registerModule(new ParameterNamesModule());
    }
}