/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tarea6;

/**
 * Clase principal que ejecuta el programa.
 */
public class Tarea6EDMain {

    /**
     * Método principal donde se agregan los datos.
     *
     * @param args Los argumentos de la línea de comandos.
     */
    public static void main(String[] args) {
        Tarea6EDClase miCarrito = new Tarea6EDClase();
        miCarrito.aplicarDescuento(100, 5);
        miCarrito.resultado(5); // Llamar al método resultado para mostrar el total
    }
}