/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package services;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.Statement;
import models.Conexion;


/**
 *
 * @author mbarz
 */
public class Environment {
    
    public static Conexion conectar() {
        try {
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/universidad", "root", "Mjbb_2005");
            Statement miStatement = con.createStatement();
            return new Conexion(miStatement, con);
        } catch (SQLException ex) {
            Logger.getLogger(EmpleadoService.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
        
    }
}
