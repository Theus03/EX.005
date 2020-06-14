/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercícios;

/**
 *
 * @author Matheus
 */
import java.util.Scanner;
public class Ex005 {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        System.out.print("Primeira nota:");
        double n1 = entrada.nextDouble();
        System.out.print("Segunda nota:");
        double n2 = entrada.nextDouble();
        double m = (n1 + n2) / 2;
        double ne = m / 2;
        if ( m > 7){
            System.out.println("APROVADO!");
        }
        else{
            if (m < 7){
                double nm = m + ne;
                if (nm >= 5 ){
                    System.out.println("APROVADO EM TESTE!");
                }
                else{
                    System.out.println("REPROVADO!");
                }
            }
        }
    } 
}