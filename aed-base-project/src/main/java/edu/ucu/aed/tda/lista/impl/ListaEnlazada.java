package edu.ucu.aed.tda.lista.impl;

import edu.ucu.aed.tda.lista.TDALista;

public class ListaEnlazada<T extends Comparable<T>> implements TDALista<T> {
    protected Nodo<T> primero;
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
        Nodo<T> actual = primero;

        StringBuilder sb = new StringBuilder();

        while (actual != null) {
            if (actual.siguiente != null) {
                sb.append("Nodo que contiene " + actual.dato.toString() + delimitador + " ");
            }
            // Evita agregar el separador después del último elemento (Ej: 1,2,3,4, ->
            // 1,2,3,4)
            else {
                sb.append("Nodo que contiene " + actual.dato.toString());
            }

            actual = actual.siguiente;
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

        Nodo<T> actual = primero;
        while (actual.siguiente != null){
            actual = actual.siguiente;
        }

        Nodo<T> nuevonodo = new Nodo<>(data, null);
        actual.siguiente = nuevonodo;
        cantidadDeElementos += 1;
        return true;

    }

    public boolean insertarOrdenado(T data){
        Nodo<T> nuevoNodo = new Nodo<>(data, null);
        //Caso: Lista vacia
        if (esVacia()) {
            primero = nuevoNodo;
            return true;
        }

        //Caso: Antes del primero
        if (data.compareTo(primero.dato) < 0) {
            nuevoNodo.siguiente = primero;
            primero = nuevoNodo;
            return true;
        }

        Nodo<T> actual = primero;
        // Se busca hasta el final de la lista o hasta que encuentre la etiqueta que
        // coincida
        while (actual.siguiente != null && data.compareTo(actual.siguiente.dato) >= 0) {
            actual = actual.siguiente;
        }

        nuevoNodo.siguiente = actual.siguiente;
        actual.siguiente = nuevoNodo;
        cantidadDeElementos += 1;
        return true;
    }

    @Override
    public T buscar(Comparable<T> identificador) {
        if (esVacia()) {
            return null;
        } else {
            Nodo<T> actual = primero;
            while (actual != null) {
                if (identificador.compareTo(actual.dato) == 0) {
                    return actual.dato;
                }
                actual = actual.siguiente;
            }
            return null;
        }
    }

    @Override
    public T eliminar(Comparable<T> identificador) {
        Nodo<T> actual = primero;
        // No hay nada para eliminar
        if (actual == null) {
            return null;
        }
        // Solo hay un elemento
        if (identificador.equals(actual.dato)) {
            T datoeliminado = primero.dato;
            primero = actual.siguiente;
            this.cantidadDeElementos -= 1;
            return datoeliminado;
        }
        // Buscamos el nodo previo al que queremos eliminar
        while (actual.siguiente != null && !actual.siguiente.dato.equals(identificador)) {
            actual = actual.siguiente;
        }
        if (actual.siguiente == null) { // no exsiste el nodo con la clave a buscar
            return null;
        }
        // Salteamos la referencia del nodo que queremos eliminar
        T datoeliminado = actual.siguiente.dato;
        actual.siguiente = actual.siguiente.siguiente;
        this.cantidadDeElementos -= 1;
        return datoeliminado;
    }
    
}