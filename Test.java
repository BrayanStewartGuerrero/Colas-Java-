/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Colas;

/**
 * 
 * @author Brayan Guerrero
 */
public class Test {
    public static void main(String[] args) {
        Cola c = new Cola();
        
        c.encolar(10);
        c.encolar(100);
        c.encolar(1000);
        
        System.out.println("El primero en salir es: "+c.desencolar());
        System.out.println("El segundo en salir es: "+c.desencolar());
    }
}
