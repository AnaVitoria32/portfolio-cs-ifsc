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
public class Ex10 {
    public static void main(String []args){
        int celsius;
        int conversão;
        
        Scanner entrada=new Scanner(System.in);
        System.out.println("Digite a temperatura em Celsius para obter a conversão em Fahrenheit");
        celsius=entrada.nextInt();
        
        conversão=((9*celsius)+160)/5;
        
        System.out.println("A temperatura convertida para Fahrenheit será: "+conversão);
    }
}
