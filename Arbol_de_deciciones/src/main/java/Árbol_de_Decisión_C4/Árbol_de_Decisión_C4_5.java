/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Árbol_de_Decisión_C4;
import java.util.Scanner;

/**
 *
 * @author Marco
 */
public class Árbol_de_Decisión_C4_5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        System.out.println("Priorización de Pedidos");

        System.out.print("¿La orden es urgente? (1: Sí, 0: No): ");
        int esUrgente = scanner.nextInt();

        System.out.print("¿Los productos están disponibles? (1: Sí, 0: No): ");
        int productosDisponibles = scanner.nextInt();

        if (esUrgente == 1) {
            if (productosDisponibles == 1) {
                System.out.println("Priorizar el pedido debido a su urgencia y disponibilidad de productos.");
            } else {
                System.out.println("Priorizar el pedido debido a su urgencia, pero los productos no están disponibles.");
            }
        } else {
            if (productosDisponibles == 1) {
                System.out.println("No es necesario priorizar el pedido, ya que los productos están disponibles.");
            } else {
                System.out.println("No es necesario priorizar el pedido, ya que no es urgente y los productos no están disponibles.");
            }
        }
    }
    
}
