package com.inventario.com.inventario.com.inventario.com.inventario;

public class utils {
}
package com.inventario.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {
    private static final String URL = "jdbc:mysql://localhost:3306/inventario_db";
    private static final String USER = "root"; // Cambia si es necesario
    private static final String PASSWORD = ""; // Cambia si es necesario

    public static Connection getConnection() {
        try {
            return DriverManager.getConnection(URL, USER, PASSWORD);
        } catch (SQLException e) {
            System.out.println("Error al conectar a la base de datos: " + e.getMessage());
            return null;
        }
    }
}
