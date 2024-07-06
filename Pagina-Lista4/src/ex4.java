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
public class ex4 {
    public static void main(String [] args){
        int n1,n2;
        int soma;
        int quadrado;
        
        Scanner entrada=new Scanner(System.in);
        System.out.println("Digite um numero: ");
        n1=entrada.nextInt();
        
        System.out.println("Digite outro numero: ");
        n2=entrada.nextInt();
        
        soma=n1+n2;
        quadrado=soma*soma;
        
        System.out.println("O quadrado da soma dos dois numeros sera: "+quadrado);
    }
}
