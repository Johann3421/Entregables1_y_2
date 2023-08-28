/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author Marco
 */
import java.util.Scanner;
public class ArbolDecisionID3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        System.out.println("Evaluación de Pedido");

        System.out.print("Ubicación del Cliente (1: Local, 0: Fuera de la Ciudad): ");
        int ubicacionCliente = scanner.nextInt();

        System.out.print("Disponibilidad de Repartidores (1: Disponibles, 0: No Disponibles): ");
        int disponibilidadRepartidores = scanner.nextInt();

        if (ubicacionCliente == 1) {
            System.out.println("El pedido es válido y debe registrarse.");
        } else {
            if (disponibilidadRepartidores == 1) {
                System.out.println("El pedido es válido y debe registrarse.");
            } else {
                System.out.println("El pedido no es válido y no debe registrarse.");
            }
        }
    }
    
}
