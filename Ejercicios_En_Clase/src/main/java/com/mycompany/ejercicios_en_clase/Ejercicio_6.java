
package com.mycompany.ejercicios_en_clase;
import java.util.Scanner;

public class Ejercicio_6 {
    // de los ciclos While
   public static void main (String[] args){
       // solicita la tabla de multiplicar
       Scanner teclado = new Scanner(System.in);
       System.out.println("Ingresar numero de la tabla");
       int tabla = teclado.nextInt();
       //inicializa contador
       int cont = 1;
       while (cont <= 10){
           //System.out.println("Hola mundo");
           /*int resultado = tabla * cont;
           System.out.println(tabla+" x "+cont+" = "+resultado);
           */
           //imprime el resultado con la operacion dentro de imprimir
           System.out.println(tabla+" x "+cont+" = "+tabla*cont);
           cont++;           
       }
   } 
}
