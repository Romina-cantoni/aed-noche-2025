package edu.ucu.aed.ut02.Ejercicio1;

import edu.ucu.aed.tda.lista.TDALista;

import java.util.ArrayList;

public class ListaLibros implements TDALista<Stock> {
    private ArrayList<Stock> catalogo;


    public ListaLibros() {
        this.catalogo = new ArrayList<>();
    }

    @Override
    public boolean insertar(Stock libro) {
        catalogo.add(libro);
        return true;
    }

    @Override
    public Stock buscar(Comparable<Stock> libro) {
        for (Stock l : catalogo) {
            if (l.equals(libro)) {
                return l;
            }
        }
        return null;
    }

    public Stock eliminar (Comparable<Stock> libro) {
        Stock aEliminar = buscar(libro);
        if (aEliminar != null) {
            catalogo.remove(aEliminar);
        }
        return aEliminar;
    }

    @Override
    public String imprimir() {
        StringBuilder sb = new StringBuilder();
        for (Libro l : catalogo) {
            sb.append(l.toString()).append("\n");
        }
        return sb.toString();
    }

    @Override
    public String imprimir(String delimitador) {
        StringBuilder sb = new StringBuilder();
        for (Libro l : catalogo) {
            sb.append(l.toString()).append(delimitador);
        }
        return sb.toString();
    }

    @Override
    public int cantElementos() {
        return catalogo.size();
    }

    @Override
    public boolean esVacia() {
        return catalogo.isEmpty();
    }
}
