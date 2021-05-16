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
public class Cola {
    private NodoCola inicio;
    private NodoCola ultimo;
    
    public Cola (){
        inicio = null;
        ultimo = null;
    }
    
    public void encolar(int dato){
        NodoCola aux = new NodoCola(dato,inicio);
        if(inicio == null){
            inicio = aux;
            ultimo = aux;
        }
        else{
            ultimo.setSiguiente(aux);
            ultimo = aux;
        }
    }
    
    public int desencolar(){
        int dato = 0;
        if(inicio != null){
            dato = inicio.getInformacion();
            inicio = inicio.getSiguiente();
        }
        else System.out.println("La cola esta vacia");
        
        return dato;
    }
    
    public void imprimirCola(){
        NodoCola aux = inicio;
        while(aux != null){
            System.out.println(aux.getInformacion());
            aux = aux.getSiguiente();
        }
    }
}
