package br.edu.impacta.authn.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class PrivateSecurityFilter {
    @Bean
    public SecurityFilterChain privateFilterChain(HttpSecurity http) throws Exception {
        http
            .antMatcher("/Private/**")
            .authorizeHttpRequests((authorize -> {
                try {
                    authorize
                        .anyRequest()
                            .authenticated()
                            .and().oauth2ResourceServer().jwt();

                } catch (Exception ex) {
                    System.out.println("error during authN for private resources...");
                    ex.printStackTrace();
                }
            }))
            .cors()
            .and().csrf().disable();

        return http.build();
    }
}
