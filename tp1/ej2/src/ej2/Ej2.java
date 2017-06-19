/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej2;
        import java.util.Scanner;
/**
 *
 * Diseñar el algoritmo (diagrama de flujo y pseudocódigo) correspondiente a un programa

que pida por teclado dos números enteros y muestre su suma, resta y multiplicación.
 * @author lucianoramello
 */
public class Ej2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int num1, num2;
        System.out.println("Ingrese el primer numero: ");
        num1 = entrada.nextInt();
        System.out.println("Ingrese el segundo numero:");
        num2 = entrada.nextInt();
        System.out.println("La suma de los dos numeros es de: " + (num1 + num2) + " Su resta es de " + (num1 - num2) +", su division de " + (num1/num2) + " y su producto de: "+(num1 *num2) );
        
        // TODO code application logic here
    }
    
}
