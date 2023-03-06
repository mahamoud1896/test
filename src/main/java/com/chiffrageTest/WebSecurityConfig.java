
  package com.chiffrageTest;
  
  
  
  import java.io.IOException;
  
  import javax.servlet.ServletException; import
  javax.servlet.http.HttpServletRequest; import
  javax.servlet.http.HttpServletResponse;
  
  import org.springframework.beans.factory.annotation.Autowired; import
  org.springframework.context.annotation.Bean; import
  org.springframework.context.annotation.Configuration; import
  org.springframework.security.authentication.dao.DaoAuthenticationProvider;
  import
  org.springframework.security.config.annotation.authentication.builders.
  AuthenticationManagerBuilder; import
  org.springframework.security.config.annotation.web.builders.HttpSecurity;
  import
  org.springframework.security.config.annotation.web.builders.WebSecurity;
  import org.springframework.security.config.annotation.web.configuration.
  WebSecurityConfigurerAdapter; import
  org.springframework.security.core.Authentication; import
  org.springframework.security.core.userdetails.UserDetailsService; import
  org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
  
  import
  org.springframework.security.web.authentication.AuthenticationSuccessHandler;
  
  
  
  //import com.chiffrageTest.boot.CustomOAuth2User;
  
  
  
  
  
  @Configuration public class WebSecurityConfig extends
  WebSecurityConfigurerAdapter {
  
  
  @Bean public UserDetailsService userDetailsService() { return new
  com.chiffrageTest.userInfo.UserDetailsServiceImpl(); }
  
  @Bean public BCryptPasswordEncoder passwordEncoder() { return new
  BCryptPasswordEncoder(); }
  
  @Bean public DaoAuthenticationProvider authenticationProvider() {
  DaoAuthenticationProvider authProvider = new DaoAuthenticationProvider();
  
  authProvider.setPasswordEncoder(passwordEncoder());
  authProvider.setUserDetailsService(userDetailsService());
  
  return authProvider; }
  
  @Override protected void configure(AuthenticationManagerBuilder auth) throws
  Exception { auth.authenticationProvider(authenticationProvider()); }
  
  
  
  @Override public void configure(WebSecurity web) throws Exception { web
  .ignoring() .antMatchers("/resources/**", "/static/**","/assets/**",
  "/vendor/**","/css/**", "/js/**", "/images/**", "/fonts/**", "/scss/**"); }
  
  @Override protected void configure(HttpSecurity http) throws Exception {
  
		/*
		 * http.authorizeRequests() .antMatchers("/", "/login", "/oauth/**").permitAll()
		 * .anyRequest().authenticated() .and() // .formLogin().permitAll() // .and()
		 * .oauth2Login() .loginPage("/login") ;
		 * 
		 * 
		 * 
		 * 
		 * http.csrf().disable().authorizeRequests(a -> a .antMatchers("/", "/signup",
		 * "/oauth/**", "/loggin").permitAll() .anyRequest().authenticated()
		 * ).oauth2Login().loginPage("/homePage");
		 */
  
  
  
  
  
  
  http.authorizeRequests()
  .antMatchers("/deleteObjectif/**").hasAnyAuthority("DG", "COMMERCIAL")
  .antMatchers("/deleteUser/**").hasAnyAuthority("DG", "COMMERCIAL")
  .antMatchers("/deleteRole/**").hasAnyAuthority("DG", "COMMERCIAL")
  .antMatchers("/newObjectifAnnuel/**").hasAnyAuthority("DG", "COMMERCIAL")
  //.antMatchers("/newFP/**").hasAuthority("DG") 
  .antMatchers("/","/loggin", "/oauth/**").permitAll() 
  .anyRequest().authenticated()
  .and()
  
  
  //.formLogin().permitAll() //.loginPage("/loggin")
  //.usernameParameter("email") //.passwordParameter("pass")
  //.successHandler(loginSuccessHandler) //.defaultSuccessUrl("/homePage")
  //
  .oauth2Login() .loginPage("/loggin") .defaultSuccessUrl("/homePage")
  .userInfoEndpoint() .userService(oauthUserService) .and() .successHandler(new
  AuthenticationSuccessHandler() {
  
  @Override public void onAuthenticationSuccess(HttpServletRequest request,
  HttpServletResponse response, Authentication authentication) throws
  IOException, ServletException {
  System.out.println("AuthenticationSuccessHandler invoked");
  System.out.println("Authentication name: " + authentication.getName());
  com.chiffrageTest.userInfo.CustomOAuth2User oauthUser =
  (com.chiffrageTest.userInfo.CustomOAuth2User) authentication.getPrincipal();
  
  userService.processOAuthPostLogin(oauthUser.getEmail());
  
  response.sendRedirect("/homePage"); } }) //.defaultSuccessUrl("/list") 
  .and()
  .logout().logoutSuccessUrl("/loggin").permitAll() .and()
  .exceptionHandling().accessDeniedPage("/403") ;
  
  
  
  }
  
  
  
  @Autowired private com.chiffrageTest.userInfo.LoginSuccessHandler
  loginSuccessHandler;
  
  @Autowired private com.chiffrageTest.userInfo.CustomOAuth2UserService
  oauthUserService;
  
  // @Autowired private OAuth2UserService<OAuth2UserRequest, OAuth2User>oauthUserService;
  
  @Autowired private com.chiffrageTest.userInfo.UserService userService;
  
  // @Autowired private UserDetailsService userService;
  
  
  
  
  }
  
 