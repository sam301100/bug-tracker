<h1 align="center"> Bug Tracker 🐞</h1>

> A bug/issue tracking application
                                                                                                                  
## Setup & Launch

### Database
1. Create a PostgreSQL database called 'bugout' using **psql** or database IDE:  
   `CREATE DATABASE bugout`
2. Create tables and insert test data by executing the **psql** command
   `\i src\main\resources\import.sql`

### Spring Profiles

There are two Spring profiles available with corresponding database config data: **dev** and **prod**.

1. Create a JAR file with the command `mvn clean package` in the application's root folder
2. In the /target directory, run the JAR file and include the desired **dev** or **prod** profile passed as an
argument:

e.g. `java -jar -Dspring.profiles.active=dev bugout-0.0.1-SNAPSHOT.jar`

### Docker Launch
1. `docker build -t bugout .`
2. `docker run -p 8080:8080 bugout:latest`
3. Navigate to http://localhost:8080

### Maven Launch
1. `mvn spring-boot:run`  
or
2. To launch with profile - `mvn spring-boot:run -Dspring.profiles.active=dev`
3. Open browser at http://localhost:8080


## 🤝 Contributing

Contributions, issues and feature requests are welcome.<br />

## Author

👤 **Samruddhi Somwanshi**

- Website: [@myportfolio](https://sam301100.github.io/my-portfolio/)
- Github: [@sam301100](https://github.com/sam301100)

## Show your support

Please ⭐️ this repository if this project helped you!


## 📝 License

Copyright © 2023 [Samruddhi Somwanshi](https://github.com/sam301100).<br />