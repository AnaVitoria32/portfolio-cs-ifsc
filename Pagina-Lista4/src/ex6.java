/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package atividade1;

import java.util.Scanner;

/**
 *
 * @author menes
 */
public class ex6 {
    public static void main(String [] args){
        double celsius;
        double fahrenheit;
        
        Scanner entrada=new Scanner(System.in);
        System.out.println("Digite a temperatura em Celsius: ");
        celsius=entrada.nextDouble();
        
        fahrenheit= (9*celsius)/5+32;
        
        System.out.println("A temperatura em Fahrenheith eh: "+fahrenheit);
    }
}
