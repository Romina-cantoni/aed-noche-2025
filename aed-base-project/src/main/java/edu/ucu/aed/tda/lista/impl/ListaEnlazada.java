package edu.ucu.aed.tda.lista.impl;

import edu.ucu.aed.tda.lista.TDALista;
import edu.ucu.aed.tda.lista.TDANodo;

public class ListaEnlazada<T extends Comparable<T>> implements TDALista<T> {
    protected TDANodo<T> primero;
    protected int cantidadDeElementos;

    public ListaEnlazada(){
        this.primero = null;
        this.cantidadDeElementos = 0;
    }

    @Override
    public String imprimir() {
        return imprimir(", ");
    }

    @Override
    public String imprimir(String delimitador) {
        if (esVacia()){
            return "Lista vacia";
        }
        TDANodo<T> actual = primero;

        StringBuilder sb = new StringBuilder();

        while (actual != null) {
            if (actual.getSiguiente() != null) {
                sb.append("Nodo que contiene " + actual.getDato().toString() + delimitador + " ");
            }
            // Evita agregar el separador después del último elemento (Ej: 1,2,3,4, ->
            // 1,2,3,4)
            else {
                sb.append("Nodo que contiene " + actual.getDato().toString());
            }

            actual = actual.getSiguiente();
        }

        return sb.toString();
    }

    @Override
    public int cantElementos() {
        return cantidadDeElementos;
    }

    @Override
    public boolean esVacia() {
        return (primero == null);
    }

    @Override
    public boolean insertar(T data) {
        if (esVacia()) {
            Nodo<T> nodo = new Nodo<T>(data, null);
            primero = nodo;
            cantidadDeElementos += 1;
            return true;
        }

        TDANodo<T> actual = primero;
        while (actual.getSiguiente() != null && actual.getDato() != data){
            actual = actual.getSiguiente();
        }
        
        if (actual.getDato() == data){
            // ya hay un nodo con ese dato
            return false;
        }

        Nodo<T> nuevonodo = new Nodo<>(data, null);
        actual.setSiguiente(nuevonodo);
        cantidadDeElementos += 1;
        return true;

    }

    public boolean insertarOrdenado(T data){
        TDANodo<T> nuevoNodo = new Nodo<>(data, null);
        //Caso: Lista vacia
        if (esVacia()) {
            primero = nuevoNodo;
            return true;
        }

        //Caso: Antes del primero
        if (data.compareTo(primero.getDato()) < 0) {
            nuevoNodo.setSiguiente(primero);
            primero = nuevoNodo;
            return true;
        }

        TDANodo<T> actual = primero;
        // Se busca hasta el final de la lista o hasta que encuentre la etiqueta que
        // coincida
        while (actual.getSiguiente() != null && data.compareTo(actual.getSiguiente().getDato()) >= 0) {
            actual = actual.getSiguiente();
        }

        nuevoNodo.setSiguiente(actual.getSiguiente());
        actual.setSiguiente(nuevoNodo);
        cantidadDeElementos += 1;
        return true;
    }

    @Override
    public T buscar(Comparable<T> identificador) {
        if (esVacia()) {
            return null;
        } else {
            TDANodo<T> actual = primero;
            while (actual != null) {
                if (identificador.compareTo(actual.getDato()) == 0) {
                    return actual.getDato();
                }
                actual = actual.getSiguiente();
            }
            return null;
        }
    }

    @Override
    public T eliminar(Comparable<T> identificador) {
        TDANodo<T> actual = primero;
        // No hay nada para eliminar
        if (actual == null) {
            return null;
        }
        // Solo hay un elemento
        if (identificador.equals(actual.getDato())) {
            T datoeliminado = primero.getDato();
            primero = actual.getSiguiente();
            this.cantidadDeElementos -= 1;
            return datoeliminado;
        }
        // Buscamos el nodo previo al que queremos eliminar
        while (actual.getSiguiente() != null && !actual.getSiguiente().getDato().equals(identificador)) {
            actual = actual.getSiguiente();
        }
        if (actual.getSiguiente() == null) { // no exsiste el nodo con la clave a buscar
            return null;
        }
        // Salteamos la referencia del nodo que queremos eliminar
        T datoeliminado = actual.getSiguiente().dato;
        actual.setSiguiente(actual.getSiguiente().getSiguiente());
        this.cantidadDeElementos -= 1;
        return datoeliminado;
    }
    
}