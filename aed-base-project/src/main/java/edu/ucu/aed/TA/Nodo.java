package edu.ucu.aed.TA;

import edu.ucu.aed.tda.lista.TDANodo;

public class Nodo<T extends Comparable<T>> implements TDANodo<T>{

    private T dato;
    private Nodo<T> siguiente;

    public Nodo(T dato, Nodo<T> siguiente){
        this.dato = dato;
        this.siguiente = siguiente;
    }

    @Override
    public TDANodo<T> getSiguiente() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getSiguiente'");
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
