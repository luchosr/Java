/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej1;
        import java.util.Scanner;
/*Diseñar el algoritmo (diagrama de flujo y pseudocódigo) correspondiente a un programa

que escribe el porcentaje descontado en una compra, introduciendo por teclado el

precio de la tarifa y el precio pagado.*/
/**
 *
 * @author lucianoramello
 */
public class Ej1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
       int descuento, precioArticulo;
       float totalPagar;
       System.out.println("Ingrese el precio del articulo");
       precioArticulo = entrada.nextInt();
       System.out.println("Ingrese el descuento del articulo");
       descuento = entrada.nextInt();
       totalPagar = (precioArticulo-(precioArticulo*descuento/100));    
       
       System.out.println("El precio total  a pagar es de: "+totalPagar);
       
    }
    
}
