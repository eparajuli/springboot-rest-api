# springboot-rest-api
In this project I am trying to create a RESTful API using Java, Springboot, JPA, Hibernate, MySQL. 

# Technologies Used

  - Java
  - SpringBoot
  - MySQL
  - JPA
  - Hibernate
  - Maven
  - Apache Tomcat

# Steps to follow to perform the CRUD operations
Install postman from https://www.getpostman.com/ and run it. Everything needed to perform the CRUD operations is explained in the following sections.
  - ## Create new records
    - Select the method POST in Postman
    - Enter the address http://localhost:8080/springboot-rest-api/employee/save
    - Put the following in the body:
        {
	        "employeeId":1,
	        empolyeeName:'user0',
	        salary:1000,
        }
    - Hit the send button

  - ## Get All employee records
    - Select the method GET in Postman
    - Enter the address http://localhost:8080/springboot-rest-api/employee/all
    - Hit the send button

  - ## Get an employee by id
    - Select the method GET in Postman
    - Enter the address http://localhost:8080/springboot-rest-api/employee/by/1
    - Hit the send button
     
  - ## Delete an employee by id
    - Select the method DELETE in Postman
    - Enter the address http://localhost:8080/springboot-rest-api/employee/delete/5
    - Hit the send button

  - ## GET all employee records
    - Select the method GET in Postman
    - Enter the address http://localhost:8080/springboot-rest-api/employee/all
    - Hit the send button

  - ## UPDATE employee records
    - Select the method PUT in Postman
    - Enter the address http://localhost:8080/springboot-rest-api/employee/update
    - Put the following in the body
        {
    "employeeId": 1,
    "employeeName": "user1",    //updating this value from user0 to user1
    "salary": 1000
}
    - Hit the send button



