/
package com.mycompany.ejerciciospoo;

import java.util.Scanner;


public class Ejercicio_7_Do_While {

     public static void main(String[] args) {
        
        System.out.println("Ingrese un numero:");
        Scanner teclado = new Scanner(System.in);
        int tabla = teclado.nextInt();
        int cont = 0;
         do {             
            int resultado = tabla * cont;
            System.out.println(tabla+"X"+cont+"="+resultado);
            cont++;
         } while (cont <=10);
        
    }
    
}
