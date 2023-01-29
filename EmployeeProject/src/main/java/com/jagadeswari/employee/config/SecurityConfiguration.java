package com.jagadeswari.employee.config;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class SecurityConfiguration {
	@Autowired
    DataSource dataSource;
	@Bean
 	public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
		/*
		 * http.authorizeHttpRequests() .anyRequest().authenticated() .and()
		 * .formLogin().permitAll();
		 * 
		 * http.authorizeHttpRequests() .requestMatchers("/").permitAll()
		 * .requestMatchers("/welcome").hasAnyRole("ROLE_USER, ROLE_ADMIN")
		 * .requestMatchers("/employees").hasAnyRole("ROLE_ADMIN")
		 * .anyRequest().formLogin().permitAll();
		 */
		http.authorizeHttpRequests()
        .requestMatchers("/employee").hasRole("ROLE_ADMIN")
        .requestMatchers("/user").hasRole("ROLE_USER")
        .anyRequest().authenticated()
        .and().formLogin();
		/*http
 			.authorizeHttpRequests()
 				.requestMatchers("/employee").permitAll()
 				.requestMatchers("/**").hasRole("ROLE_USER")
 				.and()
 			.formLogin();*/
 		return http.build();
 	}
    @Autowired
    public void configureGlobal(AuthenticationManagerBuilder auth) throws Exception {
         auth
        .jdbcAuthentication()
        .dataSource(dataSource)
        .passwordEncoder( new BCryptPasswordEncoder())
        .usersByUsernameQuery("select username, password, enabled from users where username=?")
        .authoritiesByUsernameQuery("select username, role from users where username=?");
    }
    
   

}
