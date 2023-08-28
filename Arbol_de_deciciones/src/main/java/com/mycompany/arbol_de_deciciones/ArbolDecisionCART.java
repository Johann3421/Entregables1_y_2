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
public class ArbolDecisionCART {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        System.out.println("Gestión de Inventario");

        System.out.print("Demanda prevista (unidades): ");
        int demandaPrevista = scanner.nextInt();

        System.out.print("Cantidad de stock actual (unidades): ");
        int stockActual = scanner.nextInt();

        if (demandaPrevista >= stockActual) {
            System.out.println("Se necesita aumentar el stock para satisfacer la demanda prevista.");
        } else {
            System.out.println("El stock actual es suficiente para satisfacer la demanda prevista.");
        }
    }
    
}
