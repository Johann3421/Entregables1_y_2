/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.arbol_de_deciciones;
import java.util.Scanner;

/**
 *
 * @author Marco
 */
public class Árbol_de_Decisión_de_Entropía {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        System.out.println("Evaluación de Pedido");

        System.out.print("¿La complejidad del pedido es alta? (1: Sí, 0: No): ");
        int complejidadAlta = scanner.nextInt();

        System.out.print("¿La demanda del producto es alta? (1: Sí, 0: No): ");
        int demandaAlta = scanner.nextInt();

        if (complejidadAlta == 1) {
            System.out.println("Registrar el pedido debido a la complejidad alta.");
        } else if (demandaAlta == 1) {
            System.out.println("Registrar el pedido debido a la demanda alta.");
        } else {
            System.out.println("No registrar el pedido.");
        }
    }
    
}
