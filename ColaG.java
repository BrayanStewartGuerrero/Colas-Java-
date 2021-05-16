/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Colas;

/**
 * 
 * @author Brayan Guerrero
 * @param <A>
 */
public class ColaG <A>{
    private NodoColaG <A> inicio;
    private NodoColaG <A> ultimo;
    
    public ColaG (){
        inicio = null;
        ultimo = null;
    }
    
    public void encolar(A dato){
        NodoColaG aux = new NodoColaG(dato,inicio);
        if(inicio == null){
            inicio = aux;
            ultimo = aux;
        }
        else{
            ultimo.setSiguiente(aux);
            ultimo = aux;
        }
    }
    
    public A desencolar(){
        A dato = null;
        if(inicio != null){
            dato = inicio.getInformacion();
            inicio = inicio.getSiguiente();
        }
        else System.out.println("La cola esta vacia");
        
        return dato;
    }
    
    public void imprimirCola(){
        NodoColaG aux = inicio;
        while(aux != null){
            System.out.println(aux.getInformacion());
            aux = aux.getSiguiente();
        }
    }
}
