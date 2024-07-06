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
public class ex3 {
    public static void main(String [] args){
        int n1,n2;
        int quadrado1,quadrado2;
        int soma;
        
        Scanner entrada=new Scanner(System.in);
        System.out.println("Digite um numero: ");
        n1=entrada.nextInt();
        
        System.out.println("Digite outro numero: ");
        n2=entrada.nextInt();
        
        quadrado1=n1*n1;
        quadrado2=n2*n2;
        
        soma=quadrado1+quadrado2;
        
        System.out.println("A soma dos quadrados dos dois numeros eh: "+soma);
    }
}
