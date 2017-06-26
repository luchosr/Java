/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej5;
        import java.util.Scanner;
/**
 *
 * Escribir un algoritmo que permita introducir 2 números, luego compare y divida el número mayor

sobre el menor.
 * @author lucianoramello
 */
public class Ej5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        int num1,num2;
        
        System.out.println("Ingrese el primer numero a comparar");
        num1 = entrada.nextInt();
        System.out.println("ingrese el segundo numero a comparar");
        num2 = entrada.nextInt();
        if(num1 > num2)
        {
            System.out.println("El resultado de la division de num1 sobre num2 es de " + num1/num2);
        }
        else if(num1 < num2)
        {
            System.out.println("El resultado de la division de num2 sobre num1 es de " + num2/num1);
        }
        else{
            System.out.println("Ambos numeros son iguales por lo que su division da 1");
        }
    }
    
}
