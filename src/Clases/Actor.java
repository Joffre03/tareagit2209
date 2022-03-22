/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

/**
 *
 * @author W10 USUARIO
 */
public class Actor {
    private String nombre;
    private int edad;
    private String nombreficticio;

    public Actor() {
    }

    public Actor(String nombre, int edad, String nombreficticio) {
        this.nombre = nombre;
        this.edad = edad;
        this.nombreficticio = nombreficticio;
    }

    public String getNombreficticio() {
        return nombreficticio;
    }

    public void setNombreficticio(String nombreficticio) {
        this.nombreficticio = nombreficticio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "Actor{" + "nombre=" + nombre + ", edad=" + edad + ", nombreficticio=" + nombreficticio + '}';
    }
    
    
    
}
