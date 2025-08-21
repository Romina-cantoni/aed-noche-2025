package edu.ucu.aed.ut02.Ejercicio1;


public class Main {
    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca();

        Libro hp1 = new Libro("harry potter 1", "0", 200);
        Libro hp2 = new Libro("harry potter 2", "1", 201);
        Libro hp3 = new Libro("harry potter 3", "2", 202);
        Libro hp4 = new Libro("harry potter 4", "3", 203);
        Libro hp5 = new Libro("harry potter 5", "4", 204);
        Libro hp6 = new Libro("harry potter 6", "5", 205);
        Libro hp7 = new Libro("harry potter 7", "6", 206);

        biblioteca.addLibro(hp1);
        biblioteca.addLibro(hp2);
        biblioteca.addLibro(hp3);
        biblioteca.addLibro(hp4);
        biblioteca.addLibro(hp5);
        biblioteca.addLibro(hp6);
        biblioteca.addLibro(hp7);

        biblioteca.imprimirLibros();
    }
}