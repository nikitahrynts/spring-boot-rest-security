package by.hryntsaliou.springboot.cruddemo.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;

@Configuration
public class SpringSecurityConfig {

    @Bean
    public InMemoryUserDetailsManager inMemoryUserDetailsManager() {

        UserDetails nikita = User.builder()
                .username("nikita")
                .password("{noop}test123")
                .roles("EMPLOYEE")
                .build();

        UserDetails anton = User.builder()
                .username("srulik")
                .password("{noop}123")
                .roles("EMPLOYEE", "MANGER")
                .build();

        UserDetails stas = User.builder()
                .username("silvername")
                .password("{noop}123")
                .roles("EMPLOYEE", "MANAGER", "ADMIN")
                .build();

        return new InMemoryUserDetailsManager(nikita, anton, stas);
    }
}


