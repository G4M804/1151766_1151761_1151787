package Servicios;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {
    
    private static final String URL = "jdbc:mysql://localhost:3306/gimnasio";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "";
    private Connection connection = null;
    public  Connection getConnection() {
        
        

        try {
            Class.forName("com.mysql.jdbc.Driver");
            connection = (Connection) DriverManager.getConnection(this.URL, this.USERNAME, this.PASSWORD);
            System.out.println("Conexion realizada con exito");
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println(e);
            System.out.println("Conexion fallida");
        }
        return connection;
    }
}

