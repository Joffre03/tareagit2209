/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Libro;

import Clases.Autor;
import Clases.Editorial;

/**
 *
 * @author W10 USUARIO
 */
public class libro {
    Autor autor;
    Editorial editorial;

    public libro() {
    }

    public libro(Autor autor, Editorial editorial) {
        this.autor = autor;
        this.editorial = editorial;
    }

    public Autor getAutor() {
        return autor;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }

    public Editorial getEditorial() {
        return editorial;
    }

    public void setEditorial(Editorial editorial) {
        this.editorial = editorial;
    }

    @Override
    public String toString() {
        return "libro{" + "autor=" + autor + ", editorial=" + editorial + '}';
    }
    
    
}
