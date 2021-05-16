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
public class NodoColaG <A> {
    private A informacion;
    private NodoColaG <A> siguiente;
    
    public NodoColaG(A dato, NodoColaG x){
        this.informacion = dato;
        this.siguiente = x;
    }

    public A getInformacion() {
        return informacion;
    }

    public void setInformacion(A informacion) {
        this.informacion = informacion;
    }

    public NodoColaG<A> getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(NodoColaG<A> siguiente) {
        this.siguiente = siguiente;
    }
}
