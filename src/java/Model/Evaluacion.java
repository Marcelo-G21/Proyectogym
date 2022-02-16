/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import Dao.DaoEvaluacion;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author srtelo
 */
public class Evaluacion {
    
    Conexion conexion = new Conexion();
    
    public String InsertarEva(Object obj){
        String resp="";
        int nfilas;
        DaoEvaluacion daoEvaluacion = (DaoEvaluacion) obj;
        Connection connection;
        PreparedStatement pst;
        
        String query = "insert into tblevaluacion values(null,?,?,?,?,?,?, null, null)";
        
        try {
            Class.forName(conexion.getDriver());
            connection = (Connection) DriverManager.getConnection(conexion.getUrl(), conexion.getUsuario(), conexion.getClave());
            pst = (PreparedStatement) connection.prepareStatement(query);
            pst.setString(1, daoEvaluacion.getRut());
            pst.setInt(2, daoEvaluacion.getPeso());
            pst.setInt(3, daoEvaluacion.getEstatura());
            pst.setString(4, daoEvaluacion.getFecha());
            pst.setFloat(5, daoEvaluacion.getIMC());
            pst.setString(6, daoEvaluacion.getEstado());
            
            nfilas = pst.executeUpdate();
            if(nfilas > 0 ){
            resp = "Registro insertado con exito";
            }else{
            resp  = "No se pudo insertar";
            }
            
        } catch (ClassNotFoundException | SQLException e) {
            resp = e.getMessage();
        }        
        return resp;
    }
    
    public List<DaoEvaluacion> BuscarEvaluaciones(Object obj){
        DaoEvaluacion daoEvaluacion = (DaoEvaluacion) obj;
        List<DaoEvaluacion> datosE = new ArrayList<>();
        Connection connection;
        PreparedStatement pst;
        ResultSet rs;
        
        String query = "select * from tblevaluacion where rut = ? and fecha between ? and ? order by fecha asc";
        
        try {
            Class.forName(conexion.getDriver());
            connection = (Connection) DriverManager.getConnection(conexion.getUrl(), conexion.getUsuario(), conexion.getClave());
            pst = (PreparedStatement) connection.prepareStatement(query);
            pst.setString(1, daoEvaluacion.getRut());
            pst.setString(2, daoEvaluacion.getFdesde());
            pst.setString(3, daoEvaluacion.getFhasta());
            rs = pst.executeQuery();
            
             while(rs.next()){
             datosE.add(new DaoEvaluacion(rs.getInt(1) , rs.getString(2), rs.getInt(3), rs.getInt(4), rs.getString(5), rs.getFloat(6), rs.getString(7)));
            }
            
        } catch (ClassNotFoundException | SQLException e) {
            e.getMessage();
        }        
        return datosE;
    }
}
