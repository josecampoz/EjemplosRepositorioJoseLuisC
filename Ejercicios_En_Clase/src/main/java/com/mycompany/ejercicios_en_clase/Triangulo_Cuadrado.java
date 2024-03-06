/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.ejercicios_en_clase;

import java.util.Scanner;

/**
 *
 * @author Unicomfacauca
 */
public class Triangulo_Cuadrado {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce el tamaño del cuadro/triángulo: ");
        int size = scanner.nextInt();

        // Imprimir cuadro relleno de "x"
        System.out.println("Cuadro relleno de 'x':");
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print("x ");
            }
            System.out.println();
        }

        // Imprimir triángulo relleno de "x"
        System.out.println("\nTriángulo relleno de 'x':");
        for (int i = 0; i < size; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("x ");
            }
            System.out.println();
        }
    }
    
}
