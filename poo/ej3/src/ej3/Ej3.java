/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej3;

/**
 *
 * @author lucianoramello
 */
public class Ej3 {

    /**
     * @param args the command line arguments
     * 3 Uso de métodos estáticos de la clase Integer
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String numBinario="101111";

String numOctal="57";

String numHexadecimal="2F";

String numDecimal="47";

//Se accede a métodos estáticos de Integer.

//Debe anteponerse el nombre de la clase en la que se encuentran

System.out.println(Integer.parseInt(numBinario,2));

System.out.println(Integer.parseInt(numOctal,8));

System.out.println(Integer.parseInt(numHexadecimal,16));

System.out.println(Integer.parseInt(numDecimal,10));
    }
    
}
