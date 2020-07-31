_______________________________________________________________________________________________________________________
					IPL TICKET BOOKING SYSTEM

This project consists of two main parts:
1. The NETBEANS interface
2. MySQL Database


NOTE-
*. The system running this project must have JDK version less than or equal to 8.(if it has the Apache Netbeans then JDK version should be 11 or greater).
*. It should have NetBeans version greater than 7.
*. It should also have MySQL version 5.5 or greater.

To run the health management  system program follow the following steps:
1. Open NetBeans IDE version
2. Next click on the 'Open Project' option at the top left corner and select the HealthMemo project from the project documents.
3. Now make sure there is a connection made to the MySQL Server. 
	3.1 The connection should have the following configuration:
		i. The MySQL server should be on localhost on port 3306
	       ii. It should have the default username 'healthuser'.
	      iii. It should have password as 'healthuser'.	
4. Run the 'Login.java' form in the src folder of the HealthApp project.
5. Now you can follow the user interface options for navigating youself through the forms and book tickets.


==========================================================================================================
To setup the database.
    1.copy the healthMemo.sql file to a location of choice
    2.now with the help of MySql terminal client create database named "heathMemo".
    3.open command promt with admin access and move to the following directory-
        "C:\Program Files\MySQL\MySQL Server 8.0\bin"
    4.In command promt write the command "mysql -u healthuser -p healthuser < (file path)\healthMemo.sql"
    5.In MySQL client write "use healthMemo"  
==========================================================================================================
To run the program execute Login.java file in src directory using netbeans.
----------------------------------------------------------------------------------------------------------
Hritik Sharma (185001060)
Hariharan Sundaraman (105001054)
----------------------------------------------------------------------------------------------------------
____________________________________________________________________________________________________________________________
