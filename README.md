
# Exercici API Rest CRUD amb MySQL

Accedeix a la pàgina ->[https://start.spring.io/](https://start.spring.io/), i genera un projecte Spring boot amb les següents característiques:

PROJECT (gestor de dependències) - Maven o Gradle

LANGUAGE - Java

SPRING BOOT - La darrera versió estable

PROJECT METADATA

Group - cat.itacademy.barcelonactiva.cognoms.nom.s05.t01.n02

Artifact - S05T0N02GognomsNom

Name - S05T01N02GognomsNom

Description - S05T01N02GognomsNom

Package name - cat.itacademy.barcelonactiva.cognoms.nom.s05.t01.n02

PACKAGIN - Jar

JAVA - Mínim versió 11

Dependències:

-   Spring Boot DevTools
-   Spring Web
-   Spring Data JPA
-   MySQL Driver

Tenim una entitat anomenada FlorEntity, que disposa de les següents propietats:

- Integer pk_FlorID
- String nomFlor
- String paisFlor

També tenim una DTO anomenada FlorDTO, que tindrà les mateixes propietats que l’entitat Flor, afegint-ne una:

-   String tipusFlor.

Aquesta propietat, en funció del país d'origen de la flor, haurà d’indicar si és “UE” o “Fora UE”. Per a fer això, pots tenir una llista privada a la mateixa DTO (per exemple: List<String> països), amb els països que formen part de la UE.

Aprofitant l’especificació **JPA**, hauràs de persistir l’entitat **FlorEntity** a una base de dades **MySQL**, seguint el patró **MVC**.

El consell és que **FlorDTO** la facis servir al Controller, i **FlorEntity** al Repository. La capa de serveis serà l’encarregada de fer la traducció entre les dues.

Per a això, depenent del package principal, crearàs una estructura de packages, on ubicaràs les classes que necessitis:

-   cat.itacademy.barcelonactiva.cognoms.nom.s05.t01.n02.controllers
    
-   cat.itacademy.barcelonactiva.cognoms.nom.s05.t01.n02.model.domain
    
-   cat.itacademy.barcelonactiva.cognoms.nom.s05.t01.n02.model.dto
    
-   cat.itacademy.barcelonactiva.cognoms.nom.s05.t01.n02.model.services
    
-   cat.itacademy.barcelonactiva.cognoms.nom.s05.t01.n02.model.repository
    
La classe ubicada al paquet controllers (**FlorController**, per exemple), haurà de ser capaç de donar resposta a les següents peticions per actualitzar i consultar informació:

- http://localhost:9001/flor/add
- http://localhost:9001/flor/update
- http://localhost:9001/flor/delete/{id}
- http://localhost:9001/flor/getOne/{id}
- http://localhost:9001/flor/getAll

Com pots veure, a l’arxiu application.properties, hauràs de configurar que el port a utilitzar sigui el 9001.

**Has d’incloure **swagger** perquè quasevol desenvolupador/a pugui tenir una idea ràpida dels recursos de que disposa l’API.**

Captures de Postman:
![postman s5 t1 n2](https://github.com/christianamor3/SPRINT5-T2-SpringBoot-API_Rest-MySQL-Swagger/assets/151139448/64a5b7bb-d22b-4f96-a22f-26b9f116bed4)
![postman s5 t1 n2 v2](https://github.com/christianamor3/SPRINT5-T2-SpringBoot-API_Rest-MySQL-Swagger/assets/151139448/f23aaecd-fc5d-440a-a8a2-297e0c7f2c66)

Captures de Swagger:
![swagger](https://github.com/christianamor3/SPRINT5-T2-SpringBoot-API_Rest-MySQL-Swagger/assets/151139448/643c32a7-74a3-4060-a50d-4dc5b47ad150)
