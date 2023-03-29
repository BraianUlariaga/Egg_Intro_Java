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
public class Ejercicios {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        //Ejercicio 11: Escribir un programa que procese una secuencia de caracteres ingresada por teclado y terminada en punto,
        //y luego codifique la palabra o frase ingresada de la siguiente manera: cada vocal se reemplaza por el carácter que 
        //se indica en la tabla y el resto de los caracteres (incluyendo a las vocales acentuadas) se mantienen sin cambios.
        // a = @ , e = # , i = $ , o = % , u = *
        
        /*
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese una frase: (debe terminar en .)");
        String cadena =  leer.nextLine();
        String cambio = letraxSigno(cadena);
 
        System.out.println("tu frase dirá: " + cambio);
        */
        
        
        
        //Ejercicio 12 :Crea un procedimiento EsMultiplo que reciba los dos números pasados por el usuario, validando 
        //que el primer número múltiplo del segundo e imprima si el primer número es múltiplo del segundo, sino informe 
        //que no lo son.
        
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese dos numeros");
        int num1 = entrada.nextInt();
        int num2 = entrada.nextInt();
        
        EsMultiplo(num1, num2);
    }
    
    /// Funcion, ejercicio 11
    /*
        public static String  letraxSigno(String cadena) {
       
        int longitud = cadena.length();
        String caracter;
        String nuevaCadena= "";
        
        for (int i = 0; i <=( longitud-1);  i++) {
           caracter = cadena.substring(i, i+1);
        
           
         switch (caracter){
            case "a" : 
            case "A":
                nuevaCadena = nuevaCadena.concat("@");
            break;
            case "e": 
            case "E": 
                nuevaCadena = nuevaCadena.concat("#");
            break;
            case "i": 
            case "I": 
                nuevaCadena = nuevaCadena.concat("$");
            break;
            case "o": 
            case "O": 
                nuevaCadena = nuevaCadena.concat("%");
            break;
            case "u":
            case "U": 
                nuevaCadena = nuevaCadena.concat("*");
            break;
            default:
                nuevaCadena=nuevaCadena.concat(caracter);
         }
    
        }
        return nuevaCadena;
    }
    
    */
        // Procedimiento Ejercicio 12
    
        public static void EsMultiplo(int num1, int num2)
        {
            if ((num1 % num2) == 0) 
            {
                System.out.println("El primer numero es multiplo del segundo");
            } 
            else 
            {
                System.out.println("El primer numero no es multiplo del segundo");
            }
        
        }

}
