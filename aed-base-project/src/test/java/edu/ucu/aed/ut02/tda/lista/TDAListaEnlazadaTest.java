package edu.ucu.aed.ut02.tda.lista;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import edu.ucu.aed.tda.lista.TDALista;
import edu.ucu.aed.tda.lista.impl.ListaEnlazada;

public class TDAListaEnlazadaTest  extends Assertions {
     TDALista<String> lista = null;

    @BeforeEach
    void setUp() {
        // Antes de iniciar cada test se llama al constructor con un tipo definido (no
        // puede ser genérico, no puede ser tipo T)
        lista = new ListaEnlazada<String>();
    }

    void añadirNodo(){
        lista.insertar("hola");
    }

    @Test
    void testEsVacia() {
        assertTrue(lista.esVacia());
    }

    @Test
    void testNoEsVacia(){
        añadirNodo();
        assertFalse(lista.esVacia());
    }

    @Test
    void testBuscar(){
        lista.insertar("hola");
        
    }

    @Test
    void testInsertar() {
        // agrego un elementos
        lista.insertar("a");
        assertEquals("a", lista.buscar("a"));
        // agrego otro elemento
        lista.insertar("b");
        assertEquals("b", lista.buscar("b"));
    }

    @Test
    void testInsertarRepetido() {
        // agrego dos elementos
        lista.insertar("a");
        lista.insertar("a");
        assertEquals(2, lista.cantElementos());
        
    }

    @Test
    void testEliminar() {
        // agrego dos elementos
        añadirNodo();
        assertEquals(lista.eliminar("hola"), "hola");
        assertEquals(0,lista.cantElementos());
    }

}
