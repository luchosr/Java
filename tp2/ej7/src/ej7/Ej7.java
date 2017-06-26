/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej7;
import java.util.Scanner;
/**
 *
 * Escribir un algoritmo que permita introducir nota de un alumno y determine si aprobó o debe

rendir la materia. Para estar aprobado debe tener nota mayor e igual a seis. Rinde en febrero con

nota menor e igual a tres, sino rinde en diciembre.
 * @author lucianoramello
 */
public class Ej7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner (System.in);
        
        int nota, salida;
        salida = 1;
        while(salida != 0){
        System.out.println("Ingrese la nota del alumno");
        nota = entrada.nextInt();
        if(nota >= 6){
            System.out.println("El alummno aprueba la materia :D");
        }
       /* else if(nota < 6 && nota >3)
        {
            System.out.println("El alumno desaprueba la materia y debe rendir en diciembre :/");
        }*/
        else{
            System.out.println("El alumno desaprueba la materia y debe rendir en febrero :(");
        }
        System.out.println("Quiere seguir evaluando mas alumnos?? SI --> 1, NO -->0");
        salida = entrada.nextInt();
        }
    }
    

