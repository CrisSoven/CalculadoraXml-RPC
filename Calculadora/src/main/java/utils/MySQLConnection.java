//Cristopher Soto Ventura
package utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

//CREATE TABLE `xmlrpc`.`operations` (
//  `id` INT NOT NULL AUTO_INCREMENT,
//  `type` VARCHAR(15) NOT NULL,
//  `first_number` DOUBLE NOT NULL,
//  `second_number` DOUBLE NOT NULL,
//  `result` DOUBLE NOT NULL,
//  `created_at` DATETIME NOT NULL DEFAULT NOW(),
//  PRIMARY KEY (`id`));

public class MySQLConnection {
    public static Connection getConnection(){

        try {
            DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
            return DriverManager.getConnection("jdbc:mysql://localhost:3306/xmlrpc","root","root");
        } catch (Exception e) {
            e.printStackTrace();
        }

        return null;
    }

    public static void main(String[] args) {
        try {
            Connection conexion = MySQLConnection.getConnection();
            if (conexion != null) {
                System.out.println("Conectado");
                conexion.close();
            }
            else{
                System.out.println("No conectado");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
