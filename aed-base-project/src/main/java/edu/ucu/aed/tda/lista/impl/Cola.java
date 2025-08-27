package edu.ucu.aed.tda.lista.impl;

import edu.ucu.aed.tda.lista.TDACola;

public class Cola<T extends Comparable<T>> extends ListaEnlazada<T> implements TDACola<T> {

    private Nodo<T> ultimo;

    public Cola(){
        this.primero = null;
        this.ultimo = null;
    }

    @Override
    public T frente() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'frente'");
    }

    @Override
    public T quitarDeCola() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'quitarDeCola'");
    }

    @Override
    public boolean ponerEnCola(T elemento){
       Nodo<T> nodo = new Nodo<T>(elemento, null);
        // no hay elementos en la lista
        if (primero == null) {
            primero = nodo;
            ultimo = nodo;
            return true;
        }
        // no está el condicional de primero != null porque se sobreentiende que si pasó
        // el anterior condicional (hace un return),
        // existe un primer elemnto de la lista
        if (primero.getSiguiente() == null)
        // caso donde hay un solo elemento
        {
            primero.siguiente = nodo;
            ultimo = nodo;
            return true;
            // se ejecuta el bloque de abajo que rige para el resto de casos
        }
        Nodo<T> aux = ultimo;
        aux.siguiente = nodo;
        ultimo = aux.siguiente;
        return true;
        // Por construcción del nodo, el nodo.siguiente es nulo también, la siguiente
        // linea no iría:
        // ultimo.siguiente = null;

        }
    }

    /* 
    

    public boolean pop() {
        if (isEmpty()) {
            return false;
        }

        Nodo aux = primero;
        primero = primero.siguiente;
        aux.siguiente = null;
        return true;
    }

    public T getPrimero() {
        return primero.dato;
    }

    public T getUltimo() {
        return ultimo.dato;
    }

    public boolean isEmpty() {
        return (primero == null && ultimo == null);
    }

}
    */


