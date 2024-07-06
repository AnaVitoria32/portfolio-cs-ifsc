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
public class Ex4 {
    public static void main(String [] args){
        int numero;
        int calculo;
        
        Scanner entrada=new Scanner(System.in);
        System.out.println("Decida um numero para solucionar a equacao y(x)=3x+2: ");
        numero=entrada.nextInt();
        
        calculo= (3*numero)+2;
        
        System.out.println("O resultado da sua equacao sera: "+calculo);
    }
}
