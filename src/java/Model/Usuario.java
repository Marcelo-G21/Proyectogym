/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import Dao.DaoUsuario;
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
public class Usuario {
    
    Conexion conexion = new Conexion();
    
    public List<DaoUsuario> login(Object obj) {
        List <DaoUsuario> datosLogin = new ArrayList<>();
        
        DaoUsuario daoPersona = (DaoUsuario) obj;
        Connection connection;
        PreparedStatement pst;
        ResultSet resultSet;
        
        String query = "select * from tblusuario where username = ? and password = ? and tipologin = ?";
        
        try {
            Class.forName(conexion.getDriver());
            connection = (Connection) DriverManager.getConnection(conexion.getUrl(), conexion.getUsuario(), conexion.getClave());
            pst = (PreparedStatement) connection.prepareStatement(query);
            pst.setString(1, daoPersona.getUsername());
            pst.setString(2, daoPersona.getPassword());
            pst.setInt(3, daoPersona.getTipologin());
            resultSet = pst.executeQuery();
            
            while(resultSet.next()){
             datosLogin.add(new DaoUsuario(resultSet.getString(1), resultSet.getString(2), resultSet.getString(3),resultSet.getString(4), resultSet.getInt(5), resultSet.getString(6), resultSet.getString(7), resultSet.getString(8), resultSet.getInt(9)));
            }
        } catch(ClassNotFoundException | SQLException e){
            e.getMessage();
        }
        
         return datosLogin;
    }
    
    public  List<DaoUsuario> ListarUsuariosTipoL(int parametro){
            List<DaoUsuario> datosUsuarios = new ArrayList<>();
            
            Connection con;
            PreparedStatement pst;
            ResultSet rs;
            
            String query = "select * from tblusuario where tipologin = ?";
        
        try {
            Class.forName(conexion.getDriver());
            con = (Connection) DriverManager.getConnection(conexion.getUrl(), conexion.getUsuario(), conexion.getClave());
            pst = (PreparedStatement) con.prepareStatement(query);
            pst.setInt(1, parametro);
            rs = pst.executeQuery();
            
            while(rs.next()){
                datosUsuarios.add(new DaoUsuario(rs.getString(1), rs.getString(2),rs.getString(3),rs.getString(4),rs.getInt(5),rs.getString(6), rs.getString(7),rs.getString(8),rs.getInt(9)));
            }
            
        } catch (ClassNotFoundException | SQLException e) {
            e.getMessage();            
        }        
        return datosUsuarios;
        }
    
    public  List<DaoUsuario> ListarUsuariosRut(String parametro){
            List<DaoUsuario> datosUsuarios = new ArrayList<>();
            
            Connection con;
            PreparedStatement pst;
            ResultSet rs;
            
            String query = "select * from tblusuario where rut = ?";
        
        try {
            Class.forName(conexion.getDriver());
            con = (Connection) DriverManager.getConnection(conexion.getUrl(), conexion.getUsuario(), conexion.getClave());
            pst = (PreparedStatement) con.prepareStatement(query);
            pst.setString(1, parametro);
            rs = pst.executeQuery();
            
            while(rs.next()){
                datosUsuarios.add(new DaoUsuario(rs.getString(1), rs.getString(2),rs.getString(3),rs.getString(4),rs.getInt(5),rs.getString(6), rs.getString(7),rs.getString(8),rs.getInt(9)));
            }
            
        } catch (ClassNotFoundException | SQLException e) {
            e.getMessage();            
        }        
        return datosUsuarios;
        }
    
    public String EditDatosUsuario(Object obj){
        String resp="";
        int nfilas;
        DaoUsuario daoUsuario = (DaoUsuario) obj;
        Connection connection;
        PreparedStatement pst;
        
        String query = "update tblusuario set correo = ?, fono = ?, direccion = ? where rut = ?";
        
        try {
            Class.forName(conexion.getDriver());
            connection = (Connection) DriverManager.getConnection(conexion.getUrl(), conexion.getUsuario(), conexion.getClave());
            pst = (PreparedStatement) connection.prepareStatement(query);
            
            pst.setString(1, daoUsuario.getCorreo());
            pst.setInt(2, daoUsuario.getFono());
            pst.setString(3, daoUsuario.getDireccion());
            pst.setString(4, daoUsuario.getRut());
            
            nfilas = pst.executeUpdate();
            if(nfilas > 0 ){
            resp = "Registro actualizado con exito";
            }else{
            resp  = "No se pudo actualizar";
            }
            
        } catch (ClassNotFoundException | SQLException e) {
            resp = e.getMessage();
        }        
        return resp;
    }
    
    public String InsertarUsuario(Object obj){
        String resp="";
        int nfilas;
        DaoUsuario daoUsuario = (DaoUsuario) obj;
        Connection connection;
        PreparedStatement pst;
        
        String query = "insert into tblusuario values (?,?,?,?,?,?,?,?,?)";
        
        try {
            Class.forName(conexion.getDriver());
            connection = (Connection) DriverManager.getConnection(conexion.getUrl(), conexion.getUsuario(), conexion.getClave());
            pst = (PreparedStatement) connection.prepareStatement(query);
            
            pst.setString(1, daoUsuario.getRut());
            pst.setString(2, daoUsuario.getNombre());
            pst.setString(3, daoUsuario.getApellido());
            pst.setString(4, daoUsuario.getCorreo());
            pst.setInt(5, daoUsuario.getFono());
            pst.setString(6, daoUsuario.getDireccion());
            pst.setString(7, daoUsuario.getUsername());
            pst.setString(8, daoUsuario.getPassword());
            pst.setInt(9, daoUsuario.getTipologin());
            
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
    
    public String DeleteUsuario(Object obj){
        String resp="";
        int nfilas;
        DaoUsuario daoUsuario = (DaoUsuario) obj;
        Connection connection;
        PreparedStatement pst;
        
        String query = "delete from tblusuario where rut = ? and tipologin = ?";
        
        try {
            Class.forName(conexion.getDriver());
            connection = (Connection) DriverManager.getConnection(conexion.getUrl(), conexion.getUsuario(), conexion.getClave());
            pst = (PreparedStatement) connection.prepareStatement(query);
            
            pst.setString(1, daoUsuario.getRut());
            pst.setInt(2, daoUsuario.getTipologin());
            
            nfilas = pst.executeUpdate();
            if(nfilas > 0 ){
            resp = "Registro borrado con exito";
            }else{
            resp  = "No se pudo borrar";
            }
            
        } catch (ClassNotFoundException | SQLException e) {
            resp = e.getMessage();
        }        
        return resp;
    }
    
}
