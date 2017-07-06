/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejf;
import java.util.Scanner;

/**
 *
 * @author lucianoramello
 */
public class EjF {
    /**
     * ¿Cómo harías un programa que permita sumar números binarios, que cosas

tendrías en cuenta?. Realizarlo en Netbeans.
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
       Scanner ingreso = new Scanner(System.in);
     
       
       String UNO=javax.swing.JOptionPane.showInputDialog(null,"Ingresa el primer numero binario","Numero",1);
       Integer num1=new Integer(Integer.parseInt(UNO));
       System.out.println("El primer numero en decimal es " + num1);
       String DOS=javax.swing.JOptionPane.showInputDialog(null,"Ingresa el segundo numero binario","Numero",1);
       Integer num2 = new Integer(Integer.parseInt(DOS));
       Integer resD = new Integer(num1 + num2);
       String resB = Integer.toBinaryString(resD);
       System.out.println("El resultado de la suma de los numeros en decimal es: " + resD + "Y su valor en binario es de " + resB);
        // TODO code application logic here
    }
    
}
