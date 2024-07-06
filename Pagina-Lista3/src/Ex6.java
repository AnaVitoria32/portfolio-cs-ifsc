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
public class Ex6 {
    public static void main(String [] args){
        int numero;
        int quadrado;
        
        Scanner entrada=new Scanner(System.in);
        System.out.println("Escreva um numero para saber o quadrado dele: ");
        numero=entrada.nextInt();
        
        quadrado=numero*numero;
        
        System.out.println("O quadrado do seu numero eh: "+quadrado);
    }
}
