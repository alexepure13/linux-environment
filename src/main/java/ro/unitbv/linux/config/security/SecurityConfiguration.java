package ro.unitbv.linux.config.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.util.matcher.AntPathRequestMatcher;

@EnableWebSecurity
public class SecurityConfiguration extends WebSecurityConfigurerAdapter {

    private static final String[] STATICCONTENT = {ContextPath.CSS.getContextString(), ContextPath.JS.getContextString(), ContextPath.IMG.getContextString(), ContextPath.BOOTSTRAP.getContextString(), ContextPath.BOOSTRAP_CSS.getContextString(), ContextPath.BOOTSTRAP_JS.getContextString(), ContextPath.FONTS.getContextString()};

    @Autowired
    UserDetailsService userDetailsService;

    @Bean
    public DaoAuthenticationProvider authenticationProvider() {
        DaoAuthenticationProvider authProvider = new DaoAuthenticationProvider();
        authProvider.setUserDetailsService(userDetailsService());
        authProvider.setPasswordEncoder(passwordEncoder());

        return authProvider;
    }
    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth.userDetailsService(userDetailsService);
    }


    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.csrf().disable()

                .authorizeRequests()
                .antMatchers(STATICCONTENT).permitAll()
                .antMatchers("/index").hasAuthority("INDEX_VIEW")
                .antMatchers("/despre").hasAuthority("DESPRE_VIEW")
                .antMatchers("/distributii").hasAuthority("DISTRIBUTII_VIEW")
                .antMatchers("/istoria").hasAuthority("ISTORIA_VIEW")
                .antMatchers("/wiki").hasAuthority("WIKI_VIEW")
                .antMatchers("/chat").hasAuthority("CHAT_VIEW")
                .antMatchers("/chat-login").hasAuthority("CHAT_VIEW")
                .antMatchers("/profile").hasAuthority("PROFILE_VIEW")
                .antMatchers("/admin").hasAuthority("ADMIN_VIEW")
                .antMatchers("/sendMail").permitAll()
                .antMatchers("/register").permitAll()
                .antMatchers("/addUser").permitAll()
                .antMatchers("/h2-console/**").permitAll()
                .anyRequest().authenticated()
                .and().formLogin().loginProcessingUrl("/signin").loginPage("/login").defaultSuccessUrl("/", true).permitAll()
                .usernameParameter("cattia-username")
                .passwordParameter("cattia-password")
                .and()
                .logout().logoutRequestMatcher(new AntPathRequestMatcher("/logout")).logoutSuccessUrl("/login").clearAuthentication(true)
                .and().formLogin().loginPage("/login").permitAll()
                .and().exceptionHandling().accessDeniedPage("/accessDenied")
                .and()
                .formLogin()
                .loginPage("/login")
                    .permitAll()
                .and()
                .logout()
                    .permitAll();



        http.headers().frameOptions().disable();

    }

    @Override
    public void configure(WebSecurity web) throws Exception{
        web.ignoring().antMatchers("/static/**", "/css/**", "/js/**","/img/**","/fonts/**","/bootsrap/**","/boostrap/css/**","/bootstrap/js/**");
    }

    @Bean
    public BCryptPasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }
}

