package edu.ucu.aed.TA;

import edu.ucu.aed.tda.lista.TDALista;

public class Lista<T extends Comparable<T>> implements TDALista<T> {
    private Nodo<T> primero;

    @Override
    public String imprimir() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'imprimir'");
    }

    @Override
    public String imprimir(String delimitador) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'imprimir'");
    }

    @Override
    public int cantElementos() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'cantElementos'");
    }

    @Override
    public boolean esVacia() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'esVacia'");
    }

    @Override
    public boolean insertar(T data) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'insertar'");
    }

    @Override
    public T buscar(Comparable<T> identificador) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'buscar'");
    }

    @Override
    public T eliminar(Comparable<T> identificador) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'eliminar'");
    }
    
}