/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tarealibroypelicula;

import Clases.Actor;
import Clases.Autor;
import Clases.Director;
import Clases.Editorial;
import Clases.Productora;
import Libro.libro;
import Pelicula.pelicula;

/**
 *
 * @author W10 USUARIO
 */
public class TareaLibroyPelicula {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String nombre= new String("Maze runner");
        System.out.println(nombre);
        libro milibro= new libro();
        milibro.setAutor(new Autor("James Dashner", 1972));
        milibro.setEditorial(new Editorial("V&R Editorias", 2010, 40));
        System.out.println(milibro);
        
        String nombre2= new String("Ready player one");
        System.out.println(nombre2);
        pelicula mipelicula=new pelicula();
        mipelicula.setProductora(new Productora("Warner Bros", "Hollywood, los Angeles California, EU", "Jack warner, Sam warner, Harry warner, Albert warner"));
        mipelicula.setDirector(new Director("Steve Spielberg", 75, "Cincinnati ohio, Eu"));
        mipelicula.setActor(new Actor("Tye Sheridan", 25, "Wade Owen"));
        System.out.println(mipelicula);
        
    }
    
}
