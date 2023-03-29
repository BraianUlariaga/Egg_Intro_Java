/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Guia02_Introduccion;

import java.util.Scanner;

/**
 *
 * @author BRAIAN
 */
public class Ejercicios {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //Ejercicio 1
        //Escribir un programa que pida dos números enteros por teclado y calcule 
        //la suma de los dos. El programa deberá después mostrar el resultado de la suma
        
       /* Scanner leer = new Scanner(System.in);
        int suma, num1, num2;
        System.out.println("Ingrese el primer número a sumar");
        num1 = leer.nextInt();
        System.out.println("Ingrese el segundo número a sumar");
        num2 = leer.nextInt();
        suma = num1 + num2;
        System.out.println("El resultado de la suma es: " + suma);*/
        
        
        //Ejercicio 2
         
        //Escribir un programa que pida tu nombre, lo guarde en una variable 
        //y lo muestre por pantalla.
        
        
       /*      Scanner leer = new Scanner(System.in); 
        System.out.println("Ingrese su nombre");
        String nombre = leer.next();
        System.out.println("Tu nombre es: " + nombre);*/
       
       
        //Ejercicio 3
        //Escribir un programa que pida una frase y la muestre toda en mayúsculas
        //y después toda en minúsculas
        
        /* 
        Scanner leer = new Scanner(System.in);
        System.out.println("Escribite algo");
        String frase = leer.nextLine();
        String fraseMayus = frase.toUpperCase();
        String fraseMinus = frase.toLowerCase();
        System.out.println("La frase en mayuscula: " + fraseMayus);
        System.out.println("La frase en minuscula: " + fraseMinus);
        
        //opcion 2 para evitar crear otra variable
        System.out.println(frase.toUpperCase());
        System.out.println(frase.toLowerCase());
        */
        
        //Ejercicio 4
        //Dada una cantidad de grados centígrados se debe mostrar su equivalente en grados Fahrenheit.
        //La fórmula correspondiente es: F = 32 + (9 * C / 5).
        
        /*
        Scanner leer = new Scanner(System.in);
        double c, f;
                
        System.out.println("Programa para conversion de grados centigrado a Fahrenheit");
        
        System.out.println("Ingrese la cantidad de grados centigrados");
        c = leer.nextInt();
        
        f = 32 + (9 *c /5);
        
         System.out.println((c)+ " grados centigrados, equivalen a " + (f) + " grados Fahrenheit");
        */
        
        //Ejercicio 5
        
        //Escribir un programa que lea un número entero por teclado y muestre por pantalla el doble,
        //el triple y la raíz cuadrada de ese número. Nota: investigar la función Math.sqrt().
        
        
        Scanner leer = new Scanner(System.in);
        
        int num, doble, triple ;
        double raizcuadrada ;
        
        
        System.out.println("Ingrese un numero entero");
        num= leer.nextInt();
        
        
        doble = num *2;
        
        triple = num *3;
               
        raizcuadrada = Math.sqrt(num);
        
        System.out.println("El doble del numero ingresado es: " + doble + "\n" +
                "El doble del numero ingresado es: " + doble + "\n" +
                "La raiz cuadrada del numero ingresado es: " + raizcuadrada);
        
        
        //opcion para convertir un entre a double
        /*
        int num, doble, triple ;
        double num2, raizcuadrada ;
        
        System.out.println("Ingrese un numero entero");
        num= leer.nextInt();
        
        
        doble = num *2;
        
        triple = num *3;
        
        num2 = num
        
        raizcuadrada = Math.sqrt(num2);
        
        System.out.println("El doble del numero ingresado es: " + doble + "\n" +
        "El doble del numero ingresado es: " + doble + "\n" +
        "La raiz cuadrada del numero ingresado es: " + raizcuadrada);
        
        */
        
        
    }
    
}
