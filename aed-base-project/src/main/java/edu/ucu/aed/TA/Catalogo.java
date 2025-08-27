package edu.ucu.aed.TA;

import java.nio.charset.CodingErrorAction;

import edu.ucu.aed.tda.lista.impl.ListaEnlazada;

public class Catalogo{
    
    private ListaEnlazada<Libro> catalogo;

    public Catalogo() {
        catalogo = new ListaEnlazada<>();
    }

    public boolean añadirLibro(Libro l){
        if (catalogo.buscar(l)!=null){
            return false;
        }
        return catalogo.insertarOrdenado(l);
    }

    public void añadirLibro(String titulo, double precio, int stock){
        
        Libro nuevoLibro = new Libro();
        catalogo.insertarOrdenado(l);
        
    }

    public void añadirEjemplar(){

    }

    public void BuscarLibro(Libro Comparable){
        Libro libroBuscado = new Libro(null, null, 0, 0)
        catalogo.buscar(codigoId);
    }

    /*
    1. Incorporar un nuevo libro al catálogo.
    2. Agregar ejemplares a un libro existente.
    3. Registrar préstamo o devolución de un libro.
    4. Retirar del catálogo libros que ya no circulan.
    5. Consultar existencias de un libro por su código.
    6. Listar todos los libros, ordenados por título, con su stock.
    */
}