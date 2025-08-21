package edu.ucu.aed.ut02.Ejercicio1;

public class Libro implements Comparable<Libro> {
    String titulo;
    String ISBN;
    int precio;

    public Libro() {
        this.titulo = "";
        this.ISBN = "";
        this.precio = 0;
    }

    public Libro(String titulo, String ISBN, int precio) {
        this.titulo = titulo;
        this.ISBN = ISBN;
        this.precio = precio;
    }

    public String toString() {
        return titulo + " - $" + precio;
    }

    @Override
    public int compareTo(Libro libro) {
        return this.titulo.compareToIgnoreCase(libro.titulo);
    }
}
