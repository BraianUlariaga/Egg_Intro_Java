/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Guia04_Subprogramas;

import java.util.Scanner;

/**
 *
 * @author BRAIAN
 */
public class Guia04_Ejercicios {
    /*
    public static void main (String[] args)
    {
        //Ejercicio 1: Crea una aplicación que le pida dos números al usuario y este pueda elegir entre 
        //sumar, restar, multiplicar y dividir. La aplicación debe tener una función para cada operación matemática 
        //y deben devolver sus resultados para imprimirlos en el main. 
        
        Scanner leer = new Scanner (System.in);
    
        int num, num1, opcion;
        
        
        System.out.println("***Bienvenido*** \n Ingrese el primer valor.");
        num = leer.nextInt();
        
        System.out.println("Ingrese el segundo valor.");
        num1 = leer.nextInt();
        
        System.out.println("Que operacion desea realizar ? \n"
                + "1 - Sumar \n"
                + "2 - Restar \n"
                + "3 - Multiplicar \n"
                + "4 - Dividir");
        
        opcion = leer.nextInt();
        
        
        switch(opcion)  
        {
            case 1 : System.out.println("La suma es: " + suma(num, num1) ); break;
            case 2 : System.out.println("La resta es: " + resta(num, num1)); break;
            case 3 : System.out.println("La multiplicacion es: " + multi(num, num1)); break;
            case 4 : System.out.println("La division es : " + div(num, num1)); break;
        }

    }
    
    
    public static int suma(int num, int num1)
    {
        int resultado;
        
        resultado = num + num1;
        
        return resultado;
        
    }
       public static int resta(int num, int num1)
    {
        int resultado;
        
        resultado = num - num1;
        
        return resultado;
        
    }
   public static int multi(int num, int num1)
    {
        int resultado;
        
        resultado = num * num1;
        
        return resultado;
        
    }
   public static int div(int num, int num1)
    {
        int resultado;
        
        resultado = num / num1;
        
        return resultado;
        
    }

*/
    /*
    public static void main (String[] args)
    {
        //Ejercicio 2: Diseñe una función que pida el nombre y la edad de N personas e imprima los datos de las personas
        //ingresadas por teclado e indique si son mayores o menores de edad. Después de cada persona, el programa 
        //debe preguntarle al usuario si quiere seguir mostrando personas y frenar cuando el usuario ingrese la palabra “No”.


        ingresar();
        

    }

       public static void ingresar() {
        Scanner leer = new Scanner(System.in);
        String fin;
        do {
            System.out.print("Ingrese un nombre: ");
            String NOM = nombre(leer);
            System.out.print("Ingrese una edad: ");
            int EDAD = edad(leer);
            mostrar(NOM, EDAD);
            System.out.println("Desea continuar? Si/No");
            fin = leer.next();
        } while (!(fin.equals("No")));
    }

    public static void mostrar(String nomb, int ed) {
        if (ed >= 18) {
            System.out.println(nomb + " tiene " + ed + " años y es mayor de edad");
        } else {
            System.out.println(nomb + " tiene " + ed + " años y NO es mayor de edad");
        }
    }

    public static String nombre(Scanner l) {
        String nomb = l.next();
        return nomb;
    }

    public static int edad(Scanner l) {
        int ed = l.nextInt();
        return ed;
    }
    
    */
    /*
    public static void main (String[] args)
    {
    
      //Ejercicio 3 :Crea una aplicación que a través de una función nos convierta una cantidad de euros introducida por 
      //teclado a otra moneda estas pueden ser a dólares, yenes o libras.La función tendrá como parámetros, la cantidad 
      //de euros y la moneda a convertir que será una cadena, este no devolverá ningún valor y mostrará un mensaje indicando el cambio (void).
    
       Scanner leer = new Scanner(System.in);
        String moneda;
        do {
            System.out.print("Ingrese un tipo de moneda: ");
            moneda = leer.next();
        } while (!(moneda.equals("libra") || moneda.equals("dolar") || moneda.equals("yen")));
        System.out.print("Ingrese una la cantidad de euros a combertir: ");
        double monto = leer.nextDouble();
        cambio(monto, moneda);

    
    }
    
     public static void cambio(double euros, String moneda) {
        double valor = 0;
        if (moneda.equals("libra")) {
            valor = euros * 0.86;
        }
        if (moneda.equals("dolar")) {
            valor = euros * 1.28611;
        }
        if (moneda.equals("yen")) {
            valor = euros * 129.852;
        }
        System.out.println("El cambio de " + euros + " euros a " + moneda + " es: " + valor);
    }
    */
    
     public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int numero;
        do {
            System.out.print("Ingrese un numero: ");
            numero = leer.nextInt();
        } while (!(numero > 0));

        if (primo(numero) == true) {
            System.out.println(numero + " es primo");
        } else {
            System.out.println(numero + " NO es primo");
        }
    }

    public static boolean primo(int num) {
        int cont = 0;
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                cont++;
            }
            if (cont > 2) {
                return false;
            }
        }
        return true;
    }
    
}