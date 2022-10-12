# spring-boot-security-token-authentication-jwt-example

In this template we learn the simple example of spring-boot-security-token-authentication-jwt with Spring-boot Security
using JwtAuthenticationEntryPoint and WebSecurityConfig.


# Technology

* Java 1.8
* Spring Boot 2.7.3 (with Spring Web MVC, spring-boot-starter-security, io.jsonwebtoken and javax.xml.bind dependencies)
* Maven 3.8.1 or above

# Create & Setup Spring Boot project
Use Spring web tool or your development tool (Spring Intializer.io, Spring Tool Suite, Eclipse, Intellij) to create a Spring Boot project.

Then open pom.xml and add these dependencies:


* spring-boot-starter-web
* spring-boot-starter-security
* io.jsonwebtoken
* javax.xml.bind
* junit-vintage-engine
* spring-boot-starter-test
* spring-boot-maven-plugin

# Configure Spring boot with Spring Data JPA
Under src/main/resources folder, open application.properties and add following lines.
<br />
jwt.secret=knoldusnext <br />
server.port=8085 <br />

# Run Spring Boot application

mvn spring-boot:run or   <br />
SpringApplication.run(SpringBootJwtApplication.class, args)

# Result

Finally test this application by the below steps -

* 1. Generate JSON Web Token (JWT) -
     Create POST request (localhost:8085/authenticate) and provide username and password in request body as given below.
     
     {
     "username":"knoldusnext",
     "password":"password"
     }

* 2. Validate JSON Web Token (JWT) -
     Now use GET request localhost:8085/greeting with above generated JWT Token in header request.