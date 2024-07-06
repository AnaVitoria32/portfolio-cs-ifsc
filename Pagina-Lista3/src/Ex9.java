/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package atividade;

import java.util.Scanner;

/**
 *
 * @author menes
 */
public class Ex9 {
    public static void main(String [] args){
        int numero;
        double resultado;
        
        Scanner entrada=new Scanner(System.in);
        System.out.println("Escolha um numero para achar sua raiz quadrada");
        numero=entrada.nextInt();
        
        resultado=Math.sqrt(numero);
        System.out.println(resultado);
       
    }
}
