![](https://github.com/Lylio/image-repo/blob/master/logos/spring-boot.png?raw=true)
![](https://github.com/Lylio/image-repo/blob/master/logos/angular.png?raw=true)
![](https://github.com/Lylio/image-repo/blob/master/logos/postgres.png?raw=true)

# BugOut

### Description
A bug/issue tracking application. Demo can be found hosted on (coming soon).

### Tech Stack
- Spring Boot (JDK 8)
- Angular
- PostgreSQL

#### Database
1. Create a PostgreSQL database called 'bugout' using **psql** or database IDE:  
   `CREATE DATABASE bugout`
2. Create tables and insert test data by executing the **psql** command  
<<<<<<< HEAD
`\i src\main\resources\import.sql`  
=======
   `\i src\main\resources\import.sql`
>>>>>>> restoration of broken app


#### Spring Profiles

There are two Spring profiles available with corresponding database config data: **dev** and **prod**.

1. Create a JAR file with the command `mvn clean package` in the application's root folder
2. In the /target directory, run the JAR file and include the desired **dev** or **prod** profile passed as an
<<<<<<< HEAD
argument:
=======
   argument:
>>>>>>> restoration of broken app

e.g. `java -jar -Dspring.profiles.active=dev bugout-0.0.1-SNAPSHOT.jar`

#### Docker Launch
1. `docker build -t bugout .`
2. `docker run -p 8080:8080 bugout:latest`
3. Navigate to http://localhost:8080

#### Maven Launch
1. `mvn spring-boot:run`
2. Open browser at http://localhost:8080

##### Credits
- https://medium.com/@fsonmezay/restful-issue-tracking-application-with-spring-boot-and-angularjs-61b69537b10e
<<<<<<< HEAD
- ©2017 Ferdi Sönmezay
=======
- ©2017 Ferdi Sönmezay
>>>>>>> restoration of broken app
