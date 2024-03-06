
package com.mycompany.ejercicios_en_clase;

import java.util.Scanner;

public class Ejercicio_8_Menu_Operaciones {

    public static void main(String[] args) {
       //crea menu
       Scanner teclado = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("Menú de opciones:");
            System.out.println("1. Suma");
            System.out.println("2. Resta");
            System.out.println("3. Multiplicación");
            System.out.println("4. División");
            System.out.println("0. Salir");
            System.out.print("Selecciona una opción: ");
            opcion = teclado.nextInt();
            if (opcion == 1) {
                System.out.print("Introduce el primer número: ");
                int num1 = teclado.nextInt();
                System.out.print("Introduce el segundo número: ");
                int num2 = teclado.nextInt();
                int suma = num1 + num2;
                System.out.println(num1+" + "+num2+" = " + suma);
            } 
            if (opcion == 2) {
                System.out.print("Introduce el primer número: ");
                int num1 = teclado.nextInt();
                System.out.print("Introduce el segundo número: ");
                int num2 = teclado.nextInt();
                int resta = num1 - num2;
                System.out.println(num1+" - "+num2+" = " + resta);
            }
            if (opcion == 3) {
                System.out.print("Introduce el primer número: ");
                int num1 = teclado.nextInt();
                System.out.print("Introduce el segundo número: ");
                int num2 = teclado.nextInt();
                int mult = num1 * num2;
                System.out.println(num1+" x "+num2+" = " + mult);
            }
            if (opcion == 4) {
                System.out.print("Introduce el primer número: ");
                int num1 = teclado.nextInt();
                System.out.print("Introduce el segundo número: ");
                int num2 = teclado.nextInt();
                int div = num1 / num2;
                System.out.println(num1+" / "+num2+" = " + div);
            } else {
                System.out.println("Opción no válida. Inténtalo de nuevo.");
            }
        } while (opcion != 0);
        System.out.println("¡Hasta luego!");
    }
    
}
