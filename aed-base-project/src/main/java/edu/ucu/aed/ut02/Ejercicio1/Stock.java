package edu.ucu.aed.ut02.Ejercicio1;

public class Stock implements Comparable<Stock> {
    private Libro libro;
    private int stock;

    public Stock (Libro libro, int stock) {
        this.libro = libro;
        this.stock = 0;
    }

    public Libro getLibro() {
        return libro;
    }

    public int getStock() {
        return stock;
    }

    public void agregarStock(int cantidad) {
        if (cantidad <= 0 ) { return; }
        this.stock += cantidad;
    }

    public void quitarStock(int cantidad) {
        if (cantidad <= 0) { return;}
        if (cantidad > this.stock) {
            this.stock -= cantidad;
        }
    }

    @Override
    public String toString() {
        return libro.toString() + ". Cantidad: " + this.stock;
    }

    public int compareTo(Stock stock) {
        return this.libro.titulo.compareToIgnoreCase(libro.titulo);
    }
}
