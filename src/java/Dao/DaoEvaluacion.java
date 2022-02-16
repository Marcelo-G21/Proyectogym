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
public class DaoEvaluacion {
    int idEvaluacion;
    String rut;
    int peso, estatura;
    String fecha;
    float IMC;
    String estado, fdesde, fhasta;

    public DaoEvaluacion(int idEvaluacion, String rut, int peso, int estatura, String fecha, float IMC, String estado) {
        this.idEvaluacion = idEvaluacion;
        this.rut = rut;
        this.peso = peso;
        this.estatura = estatura;
        this.fecha = fecha;
        this.IMC = IMC;
        this.estado = estado;
    }
    
    public DaoEvaluacion(String rut, String fdesde, String fhasta) {
        this.rut = rut;
        this.fdesde = fdesde;             //Para poder enviar los datos en el objeto a evaluacion.BuscarEvaluaciones
        this.fhasta = fhasta;
    }
    
    public DaoEvaluacion(){
    }

    public int getIdEvaluacion() {
        return idEvaluacion;
    }

    public void setIdEvaluacion(int idEvaluacion) {
        this.idEvaluacion = idEvaluacion;
    }
    
    public String getRut() {
        return rut;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public int getEstatura() {
        return estatura;
    }

    public void setEstatura(int estatura) {
        this.estatura = estatura;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public float getIMC() {
        return IMC;
    }

    public void setIMC(float IMC) {
        this.IMC = IMC;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getFdesde() {
        return fdesde;
    }

    public void setFdesde(String fdesde) {
        this.fdesde = fdesde;
    }

    public String getFhasta() {
        return fhasta;
    }

    public void setFhasta(String fhasta) {
        this.fhasta = fhasta;
    }

    
    
}
