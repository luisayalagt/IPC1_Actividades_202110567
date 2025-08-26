
package actividad4;

import java.util.Scanner;
import java.lang.Math;

/**
 *
 * @author luisayala
 */
public class Actividad4 {

    public static void main(String[] args) {
        Scanner Entradas = new Scanner(System.in);
        boolean salir = false;
        double num1, num2;
        
        while(!salir) { // mientras salir sea falso
            
            //mostrando el menu
            System.out.println("\n Seleccione una de las siguientes opciones: ");
            System.out.println("**        CALCULADORA      **");
            System.out.println("*****************************");
            System.out.println("* 1. Suma                   *");
            System.out.println("* 2. Resta                  *");
            System.out.println("* 3. Multiplicacion         *");
            System.out.println("* 4. Division               *");
            System.out.println("* 5. Potencia               *");
            System.out.println("* 6. Raiz                   *");
            System.out.println("* 9. Salir                  *");
            System.out.println("*****************************");
            
            String opcion = Entradas.nextLine().trim().toLowerCase();
            
            switch (opcion) {
                case "uno": 
                    System.out.println("** SUMA **");
                    System.out.println("Ingrese el primer numero");
                    num1 = Entradas.nextDouble();
                    System.out.println("Ingrese el segundo numero");
                    num2 = Entradas.nextDouble();
                    Entradas.nextLine();
                    
                    double total = num1 + num2;
                    
                    System.out.println("La suma de " + num1 + " y " + num2 + " es de: " + total);  
                    break;
                    
                case "dos": 
                    System.out.println("** RESTA **");
                    System.out.println("Ingrese el primer numero");
                    num1 = Entradas.nextDouble();
                    System.out.println("Ingrese el segundo numero");
                    num2 = Entradas.nextDouble();
                    Entradas.nextLine();
                    
                    total = num1 - num2;
                    
                    System.out.println("La resta de " + num1 + " y " + num2 + " es de: " + total); 
                    break;
                    
                case "tres":
                    System.out.println("** MULTIPLICACION **");
                    System.out.println("Ingrese el primer numero");
                    num1 = Entradas.nextDouble();
                    System.out.println("Ingrese el segundo numero");
                    num2 = Entradas.nextDouble();
                    Entradas.nextLine();
                    
                    total = num1 * num2;
                    
                    System.out.println("La multiplicacion de " + num1 + " y " + num2 + " es de: " + total);                     
                    break;
                    
                case "cuatro":
                    System.out.println("** DIVISION **");
                    System.out.println("Ingrese el primer numero");
                    num1 = Entradas.nextDouble();
                    System.out.println("Ingrese el segundo numero");
                    num2 = Entradas.nextDouble();
                    Entradas.nextLine();
                    
                    if (num2 != 0) {
                       total = num1 / num2; 
                       System.out.println("La division de " + num1 + " y " + num2 + " es de: " + total);
                    } else {
                        System.out.println("No se puede dividir entre 0");
                    }                     
                    break;
                    
                case "cinco":
                    System.out.println("** POTENCIA **");
                    System.out.println("Ingrese la base del numero");
                    num1 = Entradas.nextDouble();
                    System.out.println("Ingrese el exponente");
                    num2 = Entradas.nextDouble();
                    Entradas.nextLine();
                    
                    total = Math.pow(num1, num2)
;                    
                    System.out.println("La Potencia de " + num1 + " elevado a la " + num2 + " es de: " + total);     
                    break;
                    
                case "seis":
                    System.out.println("** RAIZ **");
                    System.out.println("Ingrese el numero al que desea sacarle la raiz");
                    num1 = Entradas.nextDouble();
                    System.out.println("Ingrese el indice de la raiz (Cuadrada, Cubica)");
                    num2 = Entradas.nextDouble();
                    Entradas.nextLine();
                    
                    total = Math.pow(num1, 1.0/num2)
;                    
                    System.out.println("La raiz " + num2 + " de " + num1 + " es de: " + total);              
                    break;
                    
                case "siete":
                    System.out.println("\nGracias por jugar! :D");
                    salir = true;
                    break;                    
                default:
                    System.out.println("Error: La opcion ingresada no es valida. Ingrese su opcion en letras. ");
                    break;
            }
        }
        Entradas.close(); // cierra el scanner de entrada 
        
    }
    
}
