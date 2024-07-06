/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lista3;

import java.util.Scanner;

/**
 *
 * @author menes
 */
public class Onze {
    public static void main(String[] args) {
        int Hora, Minuto, Segundo, Calculo, SomaSegundo;
        
        Scanner entrada=new Scanner(System.in);
        System.out.println("Digite a hora, o valor inteiro de 0 a 23: ");
        Hora=entrada.nextInt();
        
        System.out.println("Digite o minutos, o valor inteiro de 0 a 59: ");
        Minuto=entrada.nextInt();
        
        System.out.println("Digite os segundos, o valor inteiro de 0 a 59: ");
        Segundo=entrada.nextInt();
        
        SomaSegundo=Segundo+1;
        
       
    }
}
