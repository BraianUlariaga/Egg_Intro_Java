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
public class Ejercicios {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Scanner leer = new Scanner(System.in);
        
        //Ejercicio 6
        //Implementar un programa que le pida dos números enteros al usuario y 
        //determine si ambos o alguno de ellos es mayor a 25.
        
        /*
        int num, num1;
        
        System.out.println("***Bienvenido al programa***" + "\n" +
                "Ingrese un numero entero");
        
        num = leer.nextInt();
        
        System.out.println("Ingrese el segundo numero");
        
        num1 = leer.nextInt();
        
        if (num > 25 && num1 > 25)
        {
           System.out.println("Los numero ingresado " + num + num1 + " son mayor a 25.");
        }
          else if (num > 25)
        {
            System.out.println("El primer numero ingresado " + num1 + " es mayor a 25.");
        }
        
        else if (num1 > 25)
        {
            System.out.println("El segundo numero ingresado " + num1 + " es mayor a 25.");
        }
                    
        else 
        {
            System.out.println("Los numeros ingresados " + num + " y " + num1 + " son menores a 25.");
        }
        */
        
        //Ejercicio 7
        //Considera que estás desarrollando una web para una empresa que fabrica motores 
        //(suponemos que se trata del tipo de motor de una bomba para mover fluidos). 
        //Definir una variable tipoMotor y permitir que el usuario ingrese un valor entre 1 y 4. 
        //El programa debe mostrar lo siguiente:
       /* Si el tipo de motor es 1, mostrar un mensaje indicando “La bomba es una bomba de agua”.
	Si el tipo de motor es 2, mostrar un mensaje indicando “La bomba es una bomba de gasolina”.
        Si el tipo de motor es 3, mostrar un mensaje indicando “La bomba es una bomba de hormigón”.
	Si el tipo de motor es 4, mostrar un mensaje indicando “La bomba es una bomba de pasta alimenticia”.
	Si no se cumple ninguno de los valores anteriores mostrar el mensaje “No existe un valor válido para tipo de bomba” */
       /*
        Scanner leer = new Scanner(System.in);
        
        int tipoMotor;
        
        System.out.println("***Bienvenido al programa****" + "\n" +
                "Ingrese el tipo de motor que desea.");
        
        tipoMotor = leer.nextInt();
        
        switch (tipoMotor)
        {
            case 1: System.out.println("La bomba es una bomba de agua");
            break;
            
            case 2: System.out.println("La bomba es una bomba de gasolina");
            break;
            
            case 3: System.out.println("La bomba es una bomba de hormigon");
            break;
            
            case 4: System.out.println("La bomba es una bomba de pasta alimenticia");
            break;
            
            default:
                System.out.println("No existe un valor válido para tipo de bomba");
        
        }
        */
        
       // Ejercicio 8
       //Escriba un programa que valide si una nota está entre 0 y 10, sino está entre 0 y 10 /
       //la nota se pedirá de nuevo hasta que la nota sea correcta.
       
       /*
       Scanner leer = new Scanner(System.in);
       
       int nota;
       
       System.out.println("***Bienvenido al programa***" + "\n"+
               "Ingrese una nota");
       
       nota = leer.nextInt();
       
       while (nota >= 0 && nota <=10)
       {
           System.out.println("Su nota es correcta");
       
       }
        
       System.out.println("Ingrese su nota");
       nota = leer.nextInt();
       
       */
       
       //GUIA DE EJERCICOS CLASE 4 
       
       
       //ejercicio1: Crear un programa que dado un número determine si es par o impar.
       
       /*
       Scanner leer = new Scanner(System.in);
       System.out.println("Ingrese un numero");
       int num1=leer.nextInt();
       if (num1%2==0){
           System.out.println("El numero es Par");
 
       }
       else 
            System.out.println("El numero es impar");
       
       */
       
       
       //EJERCICIO 2 
       //Crear un programa que pida una frase y si esa frase es igual a “eureka” 
       //el programa pondrá un mensaje de Correcto, sino mostrará un mensaje de 
       //Incorrecto. Nota: investigar la función equals() en Java.
       
       /*
       Scanner leer = new Scanner(System.in);
       
       String frase;
       
       System.out.println("Ingrese una frase");
       
       frase = leer.nextLine();
       
       if (frase.equalsIgnoreCase("Eureka") )    //equalsIgnoreCase Ignora las mayusculas ingresadas
       {
           System.out.println("Frase correcta.");
           
       }
       
       else
           
       {
           System.out.println("Frase incorrecta.");
       
       }
              
       */
       
       //Ejercicio 3: Realizar un programa que solo permita introducir solo frases o palabras de 8 de largo.
       //Si el usuario ingresa una frase o palabra de 8 de largo se deberá de imprimir un mensaje por pantalla
       //que diga “CORRECTO”, en caso contrario, se deberá imprimir “INCORRECTO”. Nota: investigar la función Lenght() en Java.
       
       /*
       Scanner leer = new Scanner(System.in);
       
       String frase;
       
       System.out.println("Ingrese una frase.");
       frase = leer.nextLine();
       
       
       if(frase.length()==8)    
       {   
           System.out.println("CORRECTO");
       }
       else
       {
           System.out.println("INCORRECTO");
       }
       
       */
       
       //Ejercicio 4: Escriba un programa que pida una frase o palabra y valide si la primera 
       //letra de esa frase es una ‘A’. Si la primera letra es una ‘A’, se deberá de imprimir un mensaje
       //por pantalla que diga “CORRECTO”, en caso contrario, se deberá imprimir “INCORRECTO”. Nota: investigar
       //la función Substring y equals() de Java.
       
       
       /*
       Scanner leer = new Scanner(System.in);
       
       String letra, frase;
       
        System.out.println("Ingrese una frase");
        
        frase = leer.nextLine();
        
        
        if(frase.substring(0, 1).equals("A")){
        
            System.out.println("CORRECTO");
            
        }
        else    {
        
            System.out.println("INCORRECTO");
        }
        */
        
        //Ejercicio 5: Escriba un programa en el cual se ingrese un valor límite positivo, 
        //y a continuación solicite números al usuario hasta que la suma de los números introducidos supere el límite inicial.
        
        /*
        Scanner leer = new Scanner(System.in);
        
        int num, num1;
        num1 = 0;
        
        System.out.println("Ingrese un valor");
        num = leer.nextInt();
        
        
        while (num1 < num )
        {
            System.out.println("Ingrese un valor");
            num1 = leer.nextInt();
            
            num1 = num1 + num1;
        
        
        }
        */
        
        //EJERCICIO 6: Realizar un programa que pida dos números enteros positivos por teclado 
        //y muestre por pantalla el siguiente menú:El usuario deberá elegir una opción y el programa 
        //deberá mostrar el resultado por pantalla y luego volver al menú. El programa deberá ejecutarse 
        //hasta que se elija la opción 5. Tener en cuenta que, si el usuario selecciona la opción 5, en vez de salir 
        //del programa directamente, se debe mostrar el siguiente mensaje de confirmación: 
        //¿Está seguro que desea salir del programa (S/N)? Si el usuario selecciona el carácter ‘S’ se sale del programa, 
        //caso contrario se vuelve a mostrar el menú.
        
        
        Scanner leer = new Scanner(System.in);
        
        int num, num1, opcion, resultado;
        String letra;
        
        resultado = 0;
        letra = "";
        System.out.println("Ingrese el primer numero");
        num = leer.nextInt();
        
        
        System.out.println("Ingrese el primer numero");
        num1 = leer.nextInt();
        
        do{
        System.out.println("Ingrese una opcion \n" +
                " 1:Sumar \n" +
                " 2:Restar \n" +
                " 3:Multiplicar \n" +
                " 4:Dividir \n" +
                " 5:Salir \n" );
        
        opcion = leer.nextInt();
        
        
        
        

        switch (opcion) 
        {
        
            case 1:
                System.out.println("El resultado de la suma es: " + (resultado = num + num1)) ;
                break;
            case 2: System.out.println("El resultado de la resta es: " + (resultado = num - num1)) ;
            break;
            case 3: System.out.println("El resultado de la multiplicacion es: " + (resultado = num * num1));
            break;
            case 4: System.out.println("El resultado de la division es: " + (resultado = num / num1));
            break;
            case 5: 
//                    System.out.println("¿Está seguro que desea salir del programa (S/N)");
//                    letra = leer.nextLine();
//                  
//    
//                    if(letra.equalsIgnoreCase("s"))
//                    {
                        System.out.println("gracias, vuelva pronto");
                        break;
//                    }
           // break;
            default :
                while (opcion >=1 || opcion <= 5)   
                {
                System.out.println("Ingrese una opcion correcta");
                
                opcion = leer.nextInt();
                }
                
        }
            
        } while (letra.equalsIgnoreCase("s"));
    }
    
}
