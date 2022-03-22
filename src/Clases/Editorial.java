/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

/**
 *
 * @author W10 USUARIO
 */
public class Editorial {
    String nombre;
    int añoPublicacion;
    int edicion;

    public Editorial() {
    }

    public Editorial(String nombre, int añoPublicacion, int edicion) {
        this.nombre = nombre;
        this.añoPublicacion = añoPublicacion;
        this.edicion = edicion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getAñoPublicacion() {
        return añoPublicacion;
    }

    public void setAñoPublicacion(int añoPublicacion) {
        this.añoPublicacion = añoPublicacion;
    }

    public int getEdicion() {
        return edicion;
    }

    public void setEdicion(int edicion) {
        this.edicion = edicion;
    }

    @Override
    public String toString() {
        return "Editorial{" + "nombre=" + nombre + ", a\u00f1oPublicacion=" + añoPublicacion + ", edicion=" + edicion + '}';
    }
    
    
}
