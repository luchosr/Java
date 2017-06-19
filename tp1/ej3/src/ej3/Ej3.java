/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej3;
    import java.util.Scanner;
/**
 *
 * Diseñar el algoritmo (Diagrama de flujo y pseudocódigo) correspondiente a un

programa que calcule el área y el perímetro de un triángulo rectángulo dada la base y

la altura.
 * @author lucianoramello
 */
public class Ej3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        float base, altura;
        
        System.out.println("Ingrese por favor la longitud de la base del triangulo: ");
        base = entrada.nextInt();
        System.out.println("Ingrese la longitud de la altura del triangulo:");
        altura = entrada.nextInt();
        
        System.out.println("El area del triangulo es de: " + ((base * altura)/2)+ ", y su perimetro es de " + (base + altura+(Math.sqrt((base*base + altura*altura)))));
        
 
        
        // TODO code application logic here
    }
    
}
