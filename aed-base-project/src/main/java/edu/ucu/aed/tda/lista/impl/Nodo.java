package edu.ucu.aed.tda.lista.impl;

import edu.ucu.aed.tda.lista.TDANodo;

public class Nodo<T extends Comparable<T>> implements TDANodo<T>{

    private T dato;
    private TDANodo<T> siguiente;

    public Nodo(T dato, Nodo<T> siguiente){
        this.dato = dato;
        this.siguiente = siguiente;
    }

    @Override
    public TDANodo<T> getSiguiente() {
        return siguiente;
    }

    @Override
    public void setSiguiente(TDANodo<T> siguiente) {
        this.siguiente = siguiente;
    }

    @Override
    public T getDato() {
        return dato;
    }

}
