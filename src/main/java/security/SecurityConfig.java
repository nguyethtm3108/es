package security;

import org.keycloak.OAuth2Constants;
import org.keycloak.admin.client.Keycloak;
import org.keycloak.admin.client.KeycloakBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.oauth2.server.resource.authentication.JwtAuthenticationConverter;
import org.springframework.security.web.SecurityFilterChain;

public class SecurityConfig {

  @Bean
  SecurityFilterChain defaultSecurityFilterChain(HttpSecurity http) throws Exception {

    http.authorizeHttpRequests(
        authz ->
            authz
                .requestMatchers(HttpMethod.GET, "/api/**")
                .authenticated()
                .requestMatchers("/api/**")
                .authenticated()
                .anyRequest()
                .permitAll());
    http.oauth2Login(Customizer.withDefaults());
    http.oauth2ResourceServer(Customizer.withDefaults());
    http.oauth2ResourceServer(
        oauth2ResourceServerCustomizer ->
            oauth2ResourceServerCustomizer.jwt(
                jwtCustomizer ->
                    jwtCustomizer.jwtAuthenticationConverter(new JwtAuthenticationConverter())));
    return http.build();
  }

  @Bean
  private Keycloak getInstance() {
    return KeycloakBuilder
        .builder()
        .serverUrl("http://localhost:8080/")
        .realm("auth")
        .grantType(OAuth2Constants.PASSWORD)
        .username("nguyethtm1")
        .password("admin")
        .clientId("es-2023")
        .build();
  }
}
