package gr.pf.team2.constructionwebapp.configuration;


import gr.pf.team2.constructionwebapp.authenticationhandlers.LoginSuccessHandler;
import gr.pf.team2.constructionwebapp.service.UserDetailsServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {


    @Autowired
    private LoginSuccessHandler loginSuccessHandler;



    @Bean
    public UserDetailsService userDetailsService() {
        return new UserDetailsServiceImpl();
    }

    @Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }

    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth.userDetailsService(userDetailsService())
                .passwordEncoder(passwordEncoder());
    }

    @Override
    public void configure(HttpSecurity security) throws Exception{
        security
                .csrf().disable()

                //LOGIN Configuration
                .formLogin()
                .loginPage("/login")
                .successHandler(loginSuccessHandler)
                .failureUrl("/login?error=true")


                //LOGOUT Configuration
                .and()
                .logout()
                .logoutUrl("/logout")
                .logoutSuccessUrl("/login")
                .deleteCookies("JSESSIONID")
                .permitAll()
                .and()

                //AUTHORIZATION AND ROLES
                .authorizeRequests()
                .antMatchers("/login/**").anonymous()
                .antMatchers("/admin/**").hasAuthority("ADMIN")
                .antMatchers("/user/**").hasAuthority("USER")
                .antMatchers("/css/**").permitAll()
                .antMatchers("/js/**").permitAll()

                .anyRequest().authenticated()

                //ERROR HANDLING FOR ACCESS DENIED
                .and()
                .exceptionHandling().accessDeniedPage("/error/access-denied")
                .and()
                .headers()
                .frameOptions()
                .sameOrigin();
    }

}
