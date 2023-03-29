/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Guia05_Arreglos;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author BRAIAN
 */
public class Guia05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
//        Ejercicio 1: Realizar un algoritmo que llene un vector con los 100 primeros números enteros y 
//        los muestre por pantalla en orden descendente.
        
        /*
        int [] vector = new int [100];
        
        
        for (int i = 99; i >= 0; i--) {
            vector[i] = i;
            System.out.println(vector[i]);
        }
        
        */
        
        
//        Ejercicio 2: Realizar un algoritmo que llene un vector de tamaño N con valores aleatorios y le pida al usuario un número
//        a buscar en el vector. El programa mostrará dónde se encuentra el numero y si se encuentra repetido
        
        /*
        Scanner leer = new Scanner(System.in);
        Random rnd = new Random();
        
         System.out.println("Ingrese el tamaño del vector");
       // int num = leer.nextInt();
       
       //se declara el vector y se inicializa evitando crear una nueva variable
        int[] vector = new int[leer.nextInt()]; 
       //Se llena el vecctor con la funcion random
        for (int i = 0; i < vector.length; i++) {
            vector[i] = rnd.nextInt(10);
            
        } 
        
        System.out.println("Que numero quiere buscar");
        //Se declara la variable buscar y contador, dentro de buscar el usuario ingresa el numero que desea buscar
        int buscar = leer.nextInt();
        int cont = 0;
        for (int i = 0; i < vector.length; i++) {
            if (vector[i] == buscar) {
                cont++;
                System.out.println("Se encontro el numero en la posicion " + i);
            } 
            
        }
        System.out.println("Se encontro el numero  " + cont + " veces.");
        */
        
        
//        Ejercicio 3 : Recorrer un vector de N enteros contabilizando cuántos números son de 1 dígito, cuántos de 2 dígitos,
//        etcétera (hasta 5 dígitos).

        /*
        Scanner leer = new Scanner(System.in);
        Random rnd = new Random();
        System.out.println("Ingrese un numero");
        int[] vector = new int[leer.nextInt()];
        
       
        int cont1 = 0;
        int cont2 = 0;
        int cont3 = 0;
        int cont4 = 0;
        int cont5 = 0;
      
        for (int i = 0; i < vector.length; i++) {
            vector[i] = rnd.nextInt(99999);
            
        }
        
        for (int num : vector) {
            int num_digitos = Integer.toString(num).length();
            switch (num_digitos) {
                case 1:
                    cont1++;
                    break;
                case 2:
                    cont2++;
                    break;
                case 3:
                    cont3++;
                    break;
                case 4:
                    cont4++;
                    break;
                case 5:
                    cont5++;
                    break;
                default:
                    break;
            }
        }
        System.out.println("1 digito " + cont1);
        System.out.println("2 digitos " + cont2);
        System.out.println("3 digitos " + cont3);
        System.out.println("4 digitos " + cont4);
        System.out.println("5 digitos " + cont5);

        */
        
        
        
//      Ejercicio 4 : Realizar un programa que rellene un matriz de 4 x 4 de valores aleatorios y muestre la traspuesta de la 
//      matriz. La matriz traspuesta de una matriz A se denota por B y se obtiene cambiando sus filas por columnas (o viceversa).
    
        /*

        Scanner leer = new Scanner(System.in);
        
        Random rnd = new Random();
        
        
        int [] [] A = new int [4] [4];
        int [] [] B = new int [4] [4];
        
        for (int i = 0; i < A.length; i++)  
        {
            for(int j = 0; j < A.length ; j ++) 
            {
                
                A[i][j] = rnd.nextInt(10);
               System.out.print(A[i][j]+" ");
            }
        
            System.out.println("");
        }
        
         System.out.println("Transpuesta");
        for (int j = 0; j < 4; j++) {
            for (int i = 0; i < 4; i++) {
                B[i][j] = B[i][j];
                System.out.print(B[i][j]+" ");
            }
            System.out.println("");
        }
        */
        
//        Ejercico 5: Realice un programa que compruebe si una matriz dada es antisimétrica. Se dice que una matriz A 
//        es antisimétrica cuando ésta es igual a su propia traspuesta, pero cambiada de signo. Es decir, A es antisimétrica 
//        si A = -AT. La matriz traspuesta de una matriz A se denota por AT y se obtiene cambiando sus filas por columnas 
//        (o viceversa).
        
        /*
            Scanner leer = new Scanner(System.in);
       int [] [] matriz = new int[3][3];
    
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.println("Ingrese el valor para su ubicacion: " + i +", "+ j);
                matriz [i][j]= leer.nextInt() ;
                               
            }         
        }
        System.out.println("Su matriz original es: ");
       for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                
                    System.out.print("[" + matriz [i][j]+ "]") ;        
            } System.out.println(" ");         
        }
       
       int [][] matrizTranspuesta = new int[3][3];
       
       for (int i = 0; i <3 ; i++) {
            for (int j = 0; j < 3; j++) {
               matrizTranspuesta [j][i] = matriz [i][j];
                               
            }         
        }
        System.out.println("Su matriz transpuesta es : ");
       
       for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                
                    System.out.print("[" + matrizTranspuesta [i][j]+ "]") ;        
            } System.out.println(" ");         
        }
         int contador = 0;
         
      for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                
                if (matriz[i][j]!= -matrizTranspuesta [i][j]) {
                    System.out.println("NO es antiasimetrico");
                    i=6;
                break;
                }
            contador++;
                            
            }          
        } 
      if (contador == 9) {
          System.out.println("Su matriz es antisimetrica");
            
        }
       */
        
        
//   Ejercici 6: Un cuadrado mágico 3 x 3 es una matriz 3 x 3 formada por números del 1 al 9 donde la suma de sus filas,
//   sus columnas y sus diagonales son idénticas. Crear un programa que permita introducir un cuadrado por teclado y determine
//   si este cuadrado es mágico o no. El programa deberá comprobar que los números introducidos, están entre el 1 y el 9.
       /*


        Scanner sc = new Scanner(System.in);

        int[][] cuadrado = new int[3][3];
        int[] sumaFilas = new int[3];
        int[] sumaColumnas = new int[3];
        int sumaDiagonalPrincipal = 0;
        int sumaDiagonalSecundaria = 0;

        System.out.println("Introduce los números del cuadrado mágico:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("Fila " + (i+1) + ", Columna " + (j+1) + ": ");
                cuadrado[i][j] = sc.nextInt();

                if (cuadrado[i][j] < 1 || cuadrado[i][j] > 9) {
                    System.out.println("Error: los números deben estar entre 1 y 9.");
                    return;
                }
            }
        }

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                sumaFilas[i] += cuadrado[i][j];
                sumaColumnas[j] += cuadrado[i][j];

                if (i == j) {
                    sumaDiagonalPrincipal += cuadrado[i][j];
                }

                if (i + j == 2) {
                    sumaDiagonalSecundaria += cuadrado[i][j];
                }
            }
        }

        int sumaMagica = sumaFilas[0];
        for (int i = 1; i < 3; i++) {
            if (sumaFilas[i] != sumaMagica || sumaColumnas[i] != sumaMagica) {
                System.out.println("No es un cuadrado mágico.");
                return;
            }
        }
        if (sumaDiagonalPrincipal != sumaMagica || sumaDiagonalSecundaria != sumaMagica) {
            System.out.println("No es un cuadrado mágico.");
            return;
        }

        System.out.println("Es un cuadrado mágico!");

        */
       
       
    }
    
}
