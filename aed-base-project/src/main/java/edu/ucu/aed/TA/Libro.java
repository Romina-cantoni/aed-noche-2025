package edu.ucu.aed.TA;

public class Libro implements Comparable<Libro>{
    private String titulo;
    private int codigoId;
    private double precio;
    private int stock;

    public Libro(String titulo,int codigoId, double precio, int stock){
        this.titulo = titulo;
        this.codigoId = codigoId;
        this.precio = precio;
        this.stock = stock;
    }

    @Override
    public int compareTo(Libro o) {
        if (codigoId != 0 || o.codigoId!=0){
            return titulo.compareTo(o.titulo);
        } else {
            return codigoId - o.codigoId;
        }
    }
}
