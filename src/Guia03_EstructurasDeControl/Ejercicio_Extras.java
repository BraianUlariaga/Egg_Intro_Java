/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Guia03_EstructurasDeControl;

import java.util.Scanner;

/**
 *
 * @author BRAIAN
 */
public class Ejercicio_Extras {

    public static void main(String[] args) {
        // Ejercicio 1 : Dado un tiempo en minutos, calcular su equivalente en días y horas. Por ejemplo, si el usuario ingresa 1600 minutos, 
        //el sistema debe calcular su equivalente: 1 día, 2 horas.

        /*
    Scanner leer  = new Scanner (System.in);
   
    double mint, hora, dia;
    
    System.out.println("Ingrese los minutos deseados");
   
    mint = leer.nextInt();
    
    hora = mint/60;
    
    dia = mint/1440;
    
    
      
    
        if (mint > 1440 )
        {
        
            System.out.println("Los minutos ingresados " + mint + " equivalen a " + dia + " dias y " + hora + " horas." );
           
        }
        else 
        {
            
          
            System.out.println("Los minutos ingresados " + mint + " equivalen a " + hora + " horas.");
          
        }
    
    
    
     //System.out.println("Mint: " + mint + " hora: " + hora + " dia:" +dia );
    
         */
        //Ejercicio 2 : Declarar cuatro variables de tipo entero A, B, C y D y asignarle un valor diferente a cada una.
        //A continuación, realizar las instrucciones necesarias para que: B tome el valor de C, C tome el valor de A
        //A tome el valor de D y D tome el valor de B.Mostrar los valores iniciales y los valores finales de cada variable.
        //Utilizar sólo una variable auxiliar.
        //A=D, B=C, C=A, D=B

        /*
        Scanner leer = new Scanner (System.in);
        
        int A, B, C, D, AUX;
    
        System.out.println("Ingrese el valor de A");
        A = leer.nextInt();
        System.out.println("Ingrese el valor de B");
        B = leer.nextInt();
        System.out.println("Ingrese el valor de C");
        C = leer.nextInt();
        System.out.println("Ingrese el valor de D");
        D = leer.nextInt();
        
        AUX = A;
        A = C;
        C = AUX;
        AUX = B;
        B = A;
        A = D;
        D = AUX;
        
        System.out.println("A = D: " + A + 
                "\n B = C: " + B +
                "\n C = A: " + C +
                "\n D = B: " + D );
        
         */
        
        
        //  Ejercicio 3 : Elaborar un algoritmo en el cuál se ingrese una letra y se detecte si se trata de una vocal. 
        //  Caso contrario mostrar un mensaje.Nota: investigar la función equals () de la clase String
       
        /*
        
        Scanner leer = new Scanner (System.in);
        
        String letra;
        
        System.out.println("Ingrese una letra");
     
        letra = leer.nextLine();
        
        
        if (letra.equalsIgnoreCase("A") || letra.equalsIgnoreCase("E") || letra.equalsIgnoreCase("I") || letra.equalsIgnoreCase("O") || letra.equalsIgnoreCase("U"))
        {
            System.out.println("Su letra ingresada en una vocal.");
                    
        }
        else
        {
            System.out.println("Su letra ingresada, no es una vocal");
        }
        */
        
        // Ejercicio 4: Elaborar un algoritmo en el cuál se ingrese un número entre 1 y 10 y se muestre su equivalente en romano.
       
        /* 
        Scanner leer = new Scanner(System.in);
        
        int num;
        
        System.out.println("Ingrese un numero del 1 al 10");
        num = leer.nextInt();
        
        
        if(num>0 && num < 11)
        {
            switch (num)
            {
                case 1: System.out.println("Su equivalente en numeros romanos es: I "); 
                break;
                case 2: System.out.println("Su equivalente en numeros romanos es: II");
                break;
                case 3: System.out.println("Su equivalente en numeros romanos es: III ");
                break;
                case 4: System.out.println("Su equivalente en numeros romanos es: IV ");
                break;
                case 5: System.out.println("Su equivalente en numeros romanos es: V ");
                break;
                case 6: System.out.println("Su equivalente en numeros romanos es: VI ");
                break;
                case 7: System.out.println("Su equivalente en numeros romanos es: VII ");
                break;
                case 8: System.out.println("Su equivalente en numeros romanos es: VIII ");
                break;
                case 9: System.out.println("Su equivalente en numeros romanos es: IX ");
                break;
                case 10: System.out.println("Su equivalente en numeros romanos es: X ");
                break;
            
            
            }
        
        }
        
        else
            
        {
            System.out.println("El numero ingresado no esta dentro de los valores");
        
        }
        */
        
      //Ejercicio 5 : Una obra social tiene tres clases de socios:
      //Los socios tipo ‘A’ abonan una cuota mayor, pero tienen un 50% de descuento en todos los tipos de tratamientos.
      //Los socios tipo ‘B’ abonan una cuota moderada y tienen un 35% de descuento para los tratamientos.
      //Los socios tipo ‘C’, no reciben descuentos sobre dichos tratamientos.
      //Solicite una letra (carácter) que representa la clase de un socio, y luego un valor real que represente el costo 
      //del tratamiento (previo al descuento) y determine el importe en efectivo a pagar por dicho socio.
      
      /*
      Scanner leer = new Scanner (System.in);
      
      String tipo;
      double total;
      int tratamiento = 10000;
        
        System.out.println("***Bienvenido***" + "\n" + 
                "Ingrese la letra correspondiente a su tipo de socio.");
        tipo = leer.nextLine();
        
        if (tipo.equalsIgnoreCase("A") || tipo.equalsIgnoreCase("B") || tipo.equalsIgnoreCase("C") );
        
        {
               switch(tipo) 
               {
                   case "A": 
                       
                       total = tratamiento / 1.5; 
                       System.out.println("El importe total del tratamiento es: " + tratamiento + " El importe para abonar es : " + total); break;
                   case "B": 
                       
                       total = tratamiento / 1.35; 
                       System.out.println("El importe total del tratamiento es: " + tratamiento + " El importe para abonar es : " + total); break;
                   case "C": 
                       
                      
                       System.out.println("El importe total del tratamiento es: " + tratamiento ); break;
               }                        
        }
        
        */

        //Ejercicio 6 : Leer la altura de N personas y determinar el promedio de estaturas que se encuentran 
        //por debajo de 1.60 mts. y el promedio de estaturas en general.
        
        /*
        Scanner leer = new Scanner (System.in);
        
        int num, i, j;
        double altura, promedio, promedio2, altura2;
        j=0;
        i=1;
        altura = 0;
        altura2 = 0;
        
        System.out.println("Ingrese la cantidad de personas");
        num = leer.nextInt();
        
        
        while(i<=num)
        {
        
        System.out.println("Ingrese la altura de las personas");
        altura = leer.nextDouble();
        
        altura2 = altura + altura;
        
        if(altura<=1.6){
        
            j++;
        
        }
        
        
        i++;
        }
        
        promedio = altura2 / num ;
        
        promedio2 = (j *100) / num;
        
       
        System.out.println("El promedio de altura es: " + promedio);
        System.out.println("El promedio de gente menor a 1,6 mts de altura es: " + promedio2 + " %.");
        
        
        */
        
        
        
    }
}
