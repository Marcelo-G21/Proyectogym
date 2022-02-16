/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;

/**
 *
 * @author srtelo
 */
public class DaoUsuario {
    String rut, nombre, apellido, correo;
    int fono;
    String direccion, username, password;
    int tipologin;

    public DaoUsuario(String rut, String nombre, String apellido, String correo, int fono, String direccion, String username, String password, int tipologin) {
        this.rut = rut;
        this.nombre = nombre;
        this.apellido = apellido;
        this.correo = correo;
        this.fono = fono;
        this.direccion = direccion;
        this.username = username;
        this.password = password;
        this.tipologin = tipologin;
    }

    
    
    public DaoUsuario() {
    }

    public String getRut() {
        return rut;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public int getFono() {
        return fono;
    }

    public void setFono(int fono) {
        this.fono = fono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getTipologin() {
        return tipologin;
    }

    public void setTipologin(int tipologin) {
        this.tipologin = tipologin;
    }

    
    
    
}
