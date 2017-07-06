/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej2;

/**
 *
 * 2. Aplicación que muestra el total de variables asignadas. Uso del integer,

num.intValue(), if
 * @author lucianoramello
 */
public class Ej2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Integer num1=new Integer("125"); //se puede pasar un string a entero

Integer num2=new Integer(20); // como un int a entero



int n1=num1.intValue();

int n2=num2.intValue();

System.out.println("Suma de "+n1 + " y " + n2 + " total " + (n1+n2));
if(n1+n2>130) {

n1++;

}else {

n1--;

}

System.out.println(n1);

}
    
    
}
