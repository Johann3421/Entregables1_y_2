/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author Marco
 */
import java.util.Scanner;
public class ArbolDecisionCHAID {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        System.out.println("Clasificación de Clientes");

        System.out.print("Historial de Pedidos (1: Bueno, 0: Regular): ");
        int historialPedidos = scanner.nextInt();

        System.out.print("Preferencias de Productos (1: Alta, 0: Baja): ");
        int preferenciasProductos = scanner.nextInt();

        if (historialPedidos == 1) {
            if (preferenciasProductos == 1) {
                System.out.println("Cliente pertenece al grupo de clientes premium.");
            } else {
                System.out.println("Cliente pertenece al grupo de clientes regulares.");
            }
        } else {
            System.out.println("Cliente pertenece al grupo de clientes ocasionales.");
        }
    }
    
}
