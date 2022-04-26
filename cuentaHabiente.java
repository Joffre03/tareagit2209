/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javabasico2209;

/**
 *
 * @author W10 USUARIO
 */
public class cuentaHabiente {
    public static void main(String[] args){
        System.out.println("Arreglos de clientes");
        Clientes[] cliente= new Clientes[5];
        cliente [0]=new Clientes(7897354, "Edgar Alvarez Canseco", 300000.00f);
        cliente [1]=new Clientes(6578321, "Brenda Hernandez Espinosa", 45000.00f);
        cliente [2]=new Clientes(5478910, "Geilloth Lopez Hernandez", 32000.00f);
        cliente [3]=new Clientes(7893409, "Jordanna Jimenez Kuri", 63000.00f);
        cliente [4]=new Clientes(6789003, "Joffe Alvarez Hernandez", 51000.00f);
        System.out.println(cliente[0]);
        cliente[0].sacarDinero(10600.00f);
        System.out.println(cliente[1]);
        cliente[1].sacarDinero(3200.00f);
        System.out.println(cliente[2]);
        cliente[2].sacarDinero(4300.00f);
        System.out.println(cliente[3]);
        cliente[3].sacarDinero(6900.00f);
        System.out.println(cliente[4]);
        cliente[4].sacarDinero(1100.00f);
        System.out.println("For each");
        for (Clientes clientes : cliente){
         System.out.println(clientes.nivelCliente());
        }
        
    }
}
