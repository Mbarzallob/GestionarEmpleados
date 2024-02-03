/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package services;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import models.Conexion;
import models.Empleado;

/**
 *
 * @author mbarz
 */
public class EmpleadoService {
    
    Connection con;
    Statement miStatement;
    
    public EmpleadoService(Conexion con) {
        this.con = con.getCon();
        this.miStatement = con.getStatement();
    }
    
    public boolean existeCedula(String cedula) {
        try {
            String consulta = "SELECT * FROM EMPLEADO WHERE cedula = ?";
            PreparedStatement preparedStatement = con.prepareStatement(consulta);
            preparedStatement.setString(1, cedula);
            ResultSet empleado = preparedStatement.executeQuery();
            return !empleado.next();
        } catch (SQLException ex) {
            Logger.getLogger(EmpleadoService.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
    
    public boolean agregarEmpleado(Empleado e) {
        PreparedStatement sentencia;
        try {
            sentencia = con.prepareStatement("INSERT INTO Empleado VALUES (?,?,?,?,?,?);");
            sentencia.setString(1, e.getCedula());
            sentencia.setString(2, e.getNombre());
            sentencia.setString(3, e.getApellido());
            sentencia.setString(4, e.getTelefono());
            sentencia.setString(5, e.getSalario());
            sentencia.setInt(6, e.getIdTipoContrato());
            
            sentencia.executeUpdate();
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(EmpleadoService.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
    
    public boolean eliminarEmpleado(String cedula) {
        PreparedStatement sentencia;
        try {
            sentencia = con.prepareStatement("DELETE FROM Empleado where cedula = ?;");
            sentencia.setString(1, cedula);
            sentencia.executeUpdate();
            return true;
        } catch (SQLException e) {
            Logger.getLogger(EmpleadoService.class.getName()).log(Level.SEVERE, null, e);
            
        }
        return false;
    }
    
    public Empleado buscarEmpleado(String cedula) {
        try {
            String consulta = "SELECT * FROM EMPLEADO WHERE cedula = ?";
            PreparedStatement preparedStatement = con.prepareStatement(consulta);
            preparedStatement.setString(1, cedula);
            
            ResultSet empleado = preparedStatement.executeQuery();
            if (empleado.next()) {
                return new Empleado(empleado.getString("cedula"), empleado.getString("nombre"), empleado.getString("apellido"), empleado.getString("telefono"), empleado.getString("salario"), empleado.getInt("idTipoContrato"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(EmpleadoService.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    
    public boolean modificarEmpleado(Empleado e) {
        PreparedStatement sentencia;
        try {
            sentencia = con.prepareStatement("UPDATE Empleado set nombre = ?, apellido = ?, telefono = ?, salario = ?, idTipoContrato = ? where cedula = ?");
            sentencia.setString(1, e.getNombre());
            sentencia.setString(2, e.getApellido());
            sentencia.setString(3, e.getTelefono());
            sentencia.setString(4, e.getSalario());
            sentencia.setInt(5, e.getIdTipoContrato());
            sentencia.setString(6, e.getCedula());
            sentencia.executeUpdate();
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(EmpleadoService.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    public List<Empleado> listarEmpleados() {
        List<Empleado> listaEmpleados = new ArrayList<>();
        try {
            ResultSet listado = miStatement.executeQuery("select e.cedula, e.nombre, e.apellido, e.telefono, e.salario, t.descripcion from empleado e inner join tipocontrato t on e.idTipoContrato=t.idTipoContrato;");
            while(listado.next()){
                listaEmpleados.add(new Empleado(listado.getString("cedula"), listado.getString("nombre"), listado.getString("apellido"), listado.getString("telefono"), listado.getString("salario"), listado.getString("descripcion")));
            }
        } catch (SQLException ex) {
            Logger.getLogger(EmpleadoService.class.getName()).log(Level.SEVERE, null, ex);
        }
        return listaEmpleados;
    }
}
