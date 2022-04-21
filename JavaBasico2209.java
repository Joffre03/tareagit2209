/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javabasico2209;

import javax.swing.JOptionPane;

/**
 *
 * @author W10 USUARIO
 */
public class JavaBasico2209 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    int edad= 20;
        System.out.println("Edad ="+ edad);
        Integer edad2= new Integer (22);
        System.out.println(edad2);
        double x = edad2.doubleValue();
        System.out.println(x);
        System.out.println(edad2.shortValue());
        System.out.println(".-.-.-.-.-.-.-.-.");
        //convertir Strings a entero
        String cadena="99";
        int altura = Integer.parseInt(cadena);//metodo miembro o de clase
        altura+=1;
        System.out.println("Altura ="+ altura);
        
        float y= Float.parseFloat(cadena);
        y=y + 0.5f;
        System.out.println("Altura ="+ y);
        System.out.println("----------");
        
        Arbol tree1 = new Arbol(2.4f, 15);
        Arbol tree2 = new Arbol(2.4f, 15);
        Arbol tree3 = new Arbol(2.4f, 15);
        Arbol tree4 = new Arbol(2.4f, 15);
        System.out.println(tree1);
        
        System.out.println("Troncos de arbol="+ Arbol.tronco);
        System.out.println("Troncos de arbol="+ tree1.tronco);
        System.out.println("Troncos de arbol="+ tree2.tronco);
        System.out.println("Troncos de arbol="+ tree3.tronco);
        
        JOptionPane.showMessageDialog(null, "Hola mundo", "Aqui va el titulo", JOptionPane.INFORMATION_MESSAGE);
        String dato= JOptionPane.showInputDialog(null, "Dame tu edad", "Introducir datos", JOptionPane.INFORMATION_MESSAGE);
        System.out.println(dato);
        
        
        
        
    
    }
        
}
