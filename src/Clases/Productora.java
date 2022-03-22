/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

/**
 *
 * @author W10 USUARIO
 */
public class Productora {
    
    private String nombre;
    private String ubicacion;
    private String fundador;

    public Productora() {
    }

    public Productora(String nombre, String ubicacion, String fundador) {
        this.nombre = nombre;
        this.ubicacion = ubicacion;
        this.fundador = fundador;
    }

    public String getFundador() {
        return fundador;
    }

    public void setFundador(String fundador) {
        this.fundador = fundador;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    @Override
    public String toString() {
        return "Productora{" + "nombre=" + nombre + ", ubicacion=" + ubicacion + ", fundador=" + fundador + '}';
    }
    
    
}
