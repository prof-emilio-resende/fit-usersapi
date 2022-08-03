package br.edu.impacta.authn.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class PublicSecurityFilter {
    @Bean
    public SecurityFilterChain publicFilterChain(HttpSecurity http) throws Exception {
        http
            .antMatcher("/Public/**")
            .authorizeHttpRequests((authorize -> {
                try {
                    authorize
                        .antMatchers("/Public/**").permitAll();
                } catch (Exception ex) {
                    System.out.println("error during authN for public resources...");
                    ex.printStackTrace();
                }
            }));

        return http.build();
    }
}