package edu.ucu.aed.tda.lista.impl;

import edu.ucu.aed.tda.lista.TDANodo;

public class Nodo<T extends Comparable<T>> implements TDANodo<T>{

    protected T dato;
    protected Nodo<T> siguiente;

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
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'setSiguiente'");
    }

    @Override
    public T getDato() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getDato'");
    }

}
