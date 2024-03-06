
package com.mycompany.ejercicios_en_clase;

import java.util.Scanner;


public class Ejercicio_7_Do_While {
// de los ciclos While

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // solicita la tabla de multiplicar
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingresar numero de la tabla");
        int tabla = teclado.nextInt();
        //inicializa contador
        int cont = 1;
        do {            
            //imprime el resultado con la operacion dentro de imprimir
            System.out.println(tabla+" x "+cont+" = "+tabla*cont);
            cont++; 
        } while (cont <= 10);
    }
}