/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej4;

/**
 *
 * @author lucianoramello
 */
public class Ej4 {

    /**
     * @param args the command line arguments
     * 4. Programa de conversión decimal a hexa, bi, octal
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String UNO=javax.swing.JOptionPane.showInputDialog(null,"Ingresa tu numero","Numero",1);

int n1;

n1=Integer.parseInt(UNO);

javax.swing.JOptionPane.showMessageDialog(null,"El numero Hexadecimal es:"
        +Integer.toHexString(n1),"Hexadecimal",2);

javax.swing.JOptionPane.showMessageDialog(null,"El numero Binario es:"
        +Integer.toBinaryString(n1),"Binario",2);

javax.swing.JOptionPane.showMessageDialog(null,"El numero Octa es:"
        +Integer.toOctalString(n1),"Octal",2);

System.exit(0);
        
    }
    
}
