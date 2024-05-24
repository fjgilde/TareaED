/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tarea6;

/**
 * Esta clase realiza operaciones sobre los productos y calcula descuentos.
 */
public class Tarea6EDClase {
    double total;

    /**
     * Aplica un descuento a los productos.
     *
     * @param valorProducto El valor de un producto.
     * @param numProductos  El número de productos.
     * @return El total con el descuento aplicado.
     */
    public double aplicarDescuento(double valorProducto, int numProductos) {
        if (numProductos > 3) {
            valorProducto -= 5;
        }
        if (numProductos != 0) {
            total = valorProducto * 0.8;
        } else {
            total = valorProducto * 0.95;
        }
        return total;
    }

    /**
     * Muestra el resultado del total a pagar y la confirmación de envío.
     *
     * @param numProductos El número de productos.
     */
    public void resultado(int numProductos) {
        System.out.println("El total a pagar es: " + total);
        System.out.println("Enviado");
    }
}

