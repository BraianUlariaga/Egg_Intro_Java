package Guia05_Arreglos;



import java.util.Iterator;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author BRAIAN
 */
public class Guia05_EjerciciosExtras {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
//        Ejercicio 1: Realizar un algoritmo que calcule la suma de todos los elementos de un vector de tamaño N, con los valores
//        ingresados por el usuario.
        /*
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese el tamaño del vector");
        
        int [] vector = new int [leer.nextInt()];
        int suma = 0;
        
        for ( int i = 0; i < vector.length; i++) {
            
            System.out.println("Ingrese un valor para la coordenada" + vector[i] + " del vector");
            vector[i] = leer.nextInt();
            
            suma += vector[i];
            
        }
        
        System.out.println("La suma de los numeros ingresados es: " + suma );
        */
        
        
//        Ejercicio 2: Escriba un programa que averigüe si dos vectores de N enteros son iguales (la comparación deberá 
//        detenerse en cuanto se detecte alguna diferencia entre los elementos).
        
        /*
        Scanner leer = new Scanner(System.in);
        Random rnd = new Random();
        System.out.println("Ingrese el tamaño del vector 1");
        int a = leer.nextInt();
        int [] vector1 = new int [a];
        int [] vector2 = new int [a];
        int aux=0;
        for (int i = 0; i < vector2.length; i++) {
            vector1[i] = rnd.nextInt(2);
            vector2[i] = rnd.nextInt(2);
            System.out.print("Los valores del vector 1 son:" +vector1[i]+ "\n");
            System.out.print("Los valores del vector 2 son:" +vector2[i]+ "\n");
            
            
        }
        System.out.println("");
        for (int i = 0; i < vector1.length; i++) 
        {
            //System.out.print(vector2[i] +"\n");
            
            if (vector1[i] != vector2[i]) 
            {
                System.out.println("Los vectores NO son iguales.");
                aux += 1;
                break;
            }
          
        }
        
        if (aux < 1) 
        {
          System.out.println("Los vectores son iguales.");
        }
        */
        
        
//        Ejercicio 3: Crear una función rellene un vector con números aleatorios, pasándole un arreglo por parámetro. 
//        Después haremos otra función o procedimiento que imprima el vector.

/*
          Scanner leer = new Scanner (System.in);
         
          Random rnd = new Random();
          
          System.out.println("Ingrese el tamaño del vector.");
          
          int a = leer.nextInt();
          
          int[] vector1 = new int [a];
          
          rellenar(vector1);
          
          mostrar(vector1);
  */
        
//        Ejercicio 4: Los profesores del curso de programación de Egg necesitan llevar un registro de las notas adquiridas por 
//        sus 10 alumnos para luego obtener una cantidad de aprobados y desaprobados. Durante el período de cursado cada alumno
//        obtiene 4 notas, 2 por trabajos prácticos evaluativos y 2 por parciales. Las ponderaciones de cada nota son:
//        Primer trabajo práctico evaluativo 10%
//        Segundo trabajo práctico evaluativo 15%
//        Primer Integrador 25%
//        Segundo integrador 50%
//        Una vez cargadas las notas, se calcula el promedio y se guarda en el arreglo. Al final del programa los profesores 
//        necesitan obtener por pantalla la cantidad de aprobados y desaprobados, teniendo en cuenta que solo aprueban los 
//        alumnos con promedio mayor o igual al 7 de sus notas del curso.


          Scanner leer = new Scanner (System.in);
          Random rnd = new Random();
          int nota, nota1, integrador, integrador1, promedio, aux, aprobados, desaprobados;
          
          aux =0;
          aprobados = 0; //inicializo
          desaprobados = 0; //inicializo
          
          
          do    {
                    System.out.println("Ingrese la nota del primer trabajo");
                    nota = rnd.nextInt(11);
                    System.out.println(nota);
                    System.out.println("Ingrese la nota del segundo trabajo");
                    nota1 = rnd.nextInt(11);
                    System.out.println(nota1);
                    System.out.println("Ingrese la nota del primer integrador");
                    integrador = rnd.nextInt(11);
                    System.out.println(integrador);
                    System.out.println("Ingrese la nota del segundo integrador");
                    integrador1 = rnd.nextInt(11);
                    System.out.println(integrador1);
                    
                    promedio = (int) ((nota * 0.1) + (nota1 *0.15) + (integrador * 0.25) + (integrador1 *0.5)) ;
                    
                    System.out.println("Promedio: " +promedio);
                    
                    if (promedio > 7)   
                    {
                        
                        
                        aprobados += 1;
                    }
                    else
                    {
                       
                        desaprobados += 1;
                       
                    }
                    
                    aux += 1;
                    
          }while( aux < 10);
          
          System.out.println("Los alumnos aprobvados son: " + aprobados + ".\nLos alumnos desaprobados son: " + desaprobados );
          


    } //////// separa el main de la class
    
    
    //Funciones EjExtra3
    /*
     public static void rellenar (int[] vector)
        {
            //Scanner leer = new Scanner(System.in);
            
           for (int i=0; i < vector.length; i++)
           {
              // System.out.println("Ingrese los valores del vector.");
               vector[i] = (int)(Math.random()*10);
           }
                
        }
     
     public static void mostrar (int [] vector ) 
     {
     
           for (int i=0; i < vector.length; i++)
           {
               System.out.print("[" + vector[i] + "] ");
               
           }
     
     }
     */
}
