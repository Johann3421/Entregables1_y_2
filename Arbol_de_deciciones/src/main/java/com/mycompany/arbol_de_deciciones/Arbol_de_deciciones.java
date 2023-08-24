/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.arbol_de_deciciones;
import java.util.Scanner;
/**
 *
 * @author Marco
 */
public class Arbol_de_deciciones {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Evaluación de Cliente para Compra");

        System.out.print("Historial de Compras (1: Sí, 0: No): ");
        int historialCompras = scanner.nextInt();

        System.out.print("Categoría de Productos (1: Electrónica, 0: Ropa): ");
        int categoriaProductos = scanner.nextInt();

        System.out.print("Uso Diario (0: Bajo, 1: Medio, 2: Alto): ");
        int usoDiario = scanner.nextInt();

        if (historialCompras == 1) {
            if (categoriaProductos == 1) {
                if (usoDiario == 2) {
                    System.out.println("Cliente probablemente realizará una compra.");
                } else {
                    System.out.println("Cliente posiblemente realizará una compra.");
                }
            } else {
                System.out.println("Cliente posiblemente realizará una compra.");
            }
        } else {
            if (usoDiario == 0) {
                System.out.println("Cliente probablemente no realizará una compra.");
            } else {
                System.out.println("Cliente posiblemente no realizará una compra.");
            }
        }
    }
}
