/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package services;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import models.Conexion;
import models.TipoContrato;

/**
 *
 * @author mbarz
 */
public class TipoContratoService {

    Connection con;
    Statement miStatement;

    public TipoContratoService(Conexion con) {
        this.con = con.getCon();
        this.miStatement = con.getStatement();
        
    }
    public List<TipoContrato> listarContratos() {
        List<TipoContrato> listaContratos = new ArrayList<>();
        try {
            ResultSet listado = miStatement.executeQuery("SELECT * FROM TipoContrato;");
            while(listado.next()){
                listaContratos.add(new TipoContrato(listado.getInt("idTipoContrato"),listado.getString("descripcion")));
            }
        } catch (SQLException ex) {
            Logger.getLogger(EmpleadoService.class.getName()).log(Level.SEVERE, null, ex);
        }
        return listaContratos;
    }

    public ResultSet buscarContrato(int id) {
        try {
            String consulta = "SELECT * FROM TipoContrato WHERE idTipoContrato = ?";
            PreparedStatement preparedStatement = con.prepareStatement(consulta);
            preparedStatement.setInt(1, id);

            ResultSet empleado = preparedStatement.executeQuery();
        } catch (SQLException ex) {
            Logger.getLogger(EmpleadoService.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

}
