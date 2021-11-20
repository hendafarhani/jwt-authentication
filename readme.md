# jwt-authentication

This project is built with spring, spring boot and spring security. And developed with java 8. <br /> 
It implements authentication using jwt functionality provided by Spring security framework.

## Project structure

- ### src/main/java/com/sample/jwtauthentication/config: <br />
Package for security configuration: <br />
**JwtRequestFilter**: Implements class OncePerRequestFilter for request's token validation. <br />
**JwtTokenUtil**: Utils containing methods for token treatments. <br />
**WebSecurityConfig**:
Extends WebSecurityConfigurerAdapter to configure the application's security against coming requests. <br />
- ### src/main/java/com/sample/jwtauthentication/controller: <br />
Package for rest controllers: <br />
**HelloWorldController** <br />
**JwtAuthenticationController**:
   An endpoint allowing the user authentication.  <br />
- ### src/main/java/com/sample/jwtauthentication/model: <br />
Package for application classes: <br />
**JwtRequest**:
Encapsulates properties coming from an authentication request. <br />
**JwtResponse**:
Encapsulates properties to be produced once an authentication request is successful. <br />
**UserDao**:
Encapsulates properties of a loaded application's user. <br />

- ### src/main/java/com/sample/jwtauthentication/service: <br />
Package for application services: <br />
**JwtUserDetailsService**:
Implements UserDetailsService, it is responsible on retrieving the registered user information. <br />

