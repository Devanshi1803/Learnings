package Maven;

public class JDBC {
	// JDBC: Java DataBase Connectivity
	// to retrieve/store/access data -> SQL needed
	// Client/User - <Application> - Data

	// JDBC is part of JDK and it is an API, which gives you a way to connect your
	// Data with Application.

	// Data can be stored in any database -> postgres, mysql, mongodb,...

	// JDBC is just a connection setup to Database. Actual implementation for JDBC
	// connector is of respective database only(Jar file called JDBC driver of
	// particular DB).
	// to connect to database, you will need database installed in machine and jar
	// files to connect.

	// once database is installed, you will need jar file(DB provides us a library
	// which is an implementation of JDBC connector called JDBC driver). In other
	// words, JDBC is an API that provides a standard interface for connecting Java
	// applications to relational databases. However, each database vendor has its
	// own implementation of the JDBC driver. Therefore, you need to download and
	// include the specific JDBC driver for the database you're using. The driver
	// JAR file contains the necessary classes and code to establish a connection.

	// following are the steps to connect your application to your database using
	// JDBC.

	// step-1 -> Import package (JDBC-related classes and interfaces are part of the
	// java.sql package. By importing these packages, you make the JDBC classes
	// available for use in your Java code.)

	// step-2 -> Define Database URL, Username, and Password (The
	// database URL specifies the location of the database, including the protocol,
	// host, port, and database name. The username and password are required for
	// authentication when connecting to the database.)

	// step-3 -> load and register driver (Before you can establish a connection,
	// you need to load and register the JDBC driver. This step is crucial because
	// it allows the DriverManager to identify and use the appropriate driver for
	// the specific database. The JDBC API uses the Java ServiceLoader mechanism to
	// automatically load and register JDBC drivers. However, in some older JDBC
	// versions or specific circumstances, manual loading may be required.
	// Registering the driver involves loading the driver class into memory. This is
	// essential because it allows the DriverManager to recognize and instantiate
	// the appropriate driver when a connection to the database is requested.)

	// step-4 -> create connection (Once the driver is registered, you can use the
	// DriverManager.getConnection method to create a connection to the database.
	// The getConnection method takes the database URL, username, and password as
	// parameters.)

	// step-5 -> perform operation (After establishing a connection, you can perform
	// various database operations such as querying, updating, or inserting data.
	// This step involves using the Connection object to interact with the
	// database.)

	// step-6 -> close connection (It's essential to close the database connection
	// when you're done with it to release resources and free up connections on the
	// database server. Not closing connections properly can lead to resource leaks
	// and potential issues with the database server.)

}
