package sample.connectivity;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionClass {

        private static final String USERNAME="root";
        private static final String PASSWORD="";
        private static final String CONN="jdbc:mysql://localhost:3306/projectimi";

        public static Connection getConnection() throws SQLException{

            return DriverManager.getConnection(CONN,USERNAME,PASSWORD);
        }
    }

