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
public class Ex8 {
    public static void main(String [] args){
          int n1,n2,n3,n4;
        int cal1, cal2, cal3, cal4;
        int calculo;
        
        Scanner entrada=new Scanner(System.in);
        
        System.out.println("Escreva um numero para o n1: ");
        n1=entrada.nextInt();
        
        System.out.println("Escreva um numero para o n2: ");
        n2=entrada.nextInt();
        
        System.out.println("Escreva um numero para o n3: ");
        n3=entrada.nextInt();
        
        System.out.println("Escreva um numero para o n4: ");
        n4=entrada.nextInt();
        
        cal1=n1*n1;
        cal2=n2*n2;
        cal3=n3*n3;
        cal4=n4*n4;
        
        calculo= cal1+cal2+cal3+cal4;
        
        System.out.println("O resultado será: "+calculo);
    
    }
}
