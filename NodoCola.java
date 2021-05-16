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
public class NodoCola {
    private int informacion;
    private NodoCola siguiente;
    
    public NodoCola(int dato, NodoCola x){
        this.informacion = dato;
        this.siguiente = x;
    }

    public int getInformacion() {
        return informacion;
    }

    public void setInformacion(int informacion) {
        this.informacion = informacion;
    }

    public NodoCola getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(NodoCola siguiente) {
        this.siguiente = siguiente;
    }
}
