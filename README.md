# BugOut

### Description
A bug/issue tracking application.

|              |                                                                                                                                                                                                                                                                                                                                                            |
|--------------|------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|
| App Link     | [bugout.lyle.app](https://bugout.lyle.app)                                                                                                                                                                                                                                                                                                                 |                                                                                                                                                                                                                                                                                               |
| Tech Stack   | ![Spring Boot](https://img.shields.io/badge/spring%20boot-white.svg?style=for-the-badge&logo=springboot&logoColor=6DB33F) ![React](https://img.shields.io/badge/angular-E23237.svg?style=for-the-badge&logo=angular&logoColor=white) ![PostgreSQL](https://img.shields.io/badge/POSTGRESQL-4169E1.svg?style=for-the-badge&logo=PostgreSQL&logoColor=white) |
| Compiler     | ![Java](https://img.shields.io/badge/JAVA%20-JDK%208-green?style=for-the-badge)                                                                                                                                                                                                                                                                            |                                                                                                                                                                                                                                                                                               |
| Top Language | ![Github Language](https://img.shields.io/github/languages/top/lylio/bugout?style=for-the-badge)                                                                                                                                                                                                                                                           |
| Repo Size    | ![Repo Size](https://img.shields.io/github/repo-size/lylio/bugout?style=for-the-badge)                                                                                                                                                                                                                                                                     |
| Last Commit  | ![Github Commit Activity](https://img.shields.io/github/last-commit/lylio/bugout/main?style=for-the-badge)                                                                                                                                                                                                                                                 |


<br />

### Setup & Launch

#### Database
1. Create a PostgreSQL database called 'bugout' using **psql** or database IDE:  
   `CREATE DATABASE bugout`
2. Create tables and insert test data by executing the **psql** command
   `\i src\main\resources\import.sql`

#### Spring Profiles

There are two Spring profiles available with corresponding database config data: **dev** and **prod**.

1. Create a JAR file with the command `mvn clean package` in the application's root folder
2. In the /target directory, run the JAR file and include the desired **dev** or **prod** profile passed as an
argument:

e.g. `java -jar -Dspring.profiles.active=dev bugout-0.0.1-SNAPSHOT.jar`

#### Docker Launch
1. `docker build -t bugout .`
2. `docker run -p 8080:8080 bugout:latest`
3. Navigate to http://localhost:8080

#### Maven Launch
1. `mvn spring-boot:run`  
or
2. To launch with profile - `mvn spring-boot:run -Dspring.profiles.active=dev`
3. Open browser at http://localhost:8080

### Acknowledgements
The cool repo badges, logos and code stats included in this README are courtesy of [Simple Icons](https://simpleicons.org/) and [Shields.io](https://shields.io/).


