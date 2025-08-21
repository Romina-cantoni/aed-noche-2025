package edu.ucu.aed.ut02.Ejercicio1;

import edu.ucu.aed.tda.lista.TDALista;

import java.util.List;

public class Biblioteca {
    private TDALista<Stock> libros;


    public Biblioteca() {
        this.libros = new ListaStock();
    }

    void addLibro(Libro libro) {
        libros.insertar(new Stock(libro));
    }

    void eliminarLibro(Stock libro) {
        libros.eliminar(libro);
    }

    void imprimirLibros() {
        System.out.println(libros.imprimir());
    }

}
