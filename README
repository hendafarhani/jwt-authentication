# jwt-authentication

This project is built with spring, spring boot, spring security, java 8 and maven <br />
It introduces jwt authentication functionality using Spring Security framework.

## Development server

First run `npm i`
Run JSON server: `json-server –watch db.json`
Run Angular project: `ng serve --open`
The app will automatically navigate to `http://localhost:4200/`.
The app will automatically reload if you change any of the source files.

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
Package for application classes<br />
**JwtRequest**:
Encapsulates properties coming from an authentication request. <br />
**JwtResponse**:
Encapsulates properties to be produced once an authentication request is successful. <br />
**UserDao**:
Encapsulates properties of loaded user saved into the system. <br />

- ### src/main/java/com/sample/jwtauthentication/service: <br />
Package for application services<br />
**JwtUserDetailsService**:
Implements UserDetailsService, it is responsible on retrieving the registered user information. <br />

