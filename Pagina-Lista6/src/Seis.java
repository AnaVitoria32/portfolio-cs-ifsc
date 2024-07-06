/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package seis;

import java.util.Scanner;

/**
 *
 * @author menes
 */
public class Seis {
    public static void main(String[] args) {
       int Numero1, Numero2, Numero3;
        
        Scanner entrada=new Scanner(System.in);
        System.out.println("Digite um número:");
        Numero1=entrada.nextInt();
        
        System.out.println("Digite o segundo número: ");
        Numero2=entrada.nextInt();
        
        System.out.println("Digite o terceiro número: ");
        Numero3=entrada.nextInt();
        
        if(Numero1<Numero2 && Numero1<Numero3){
            System.out.println("O menor número entre os três é "+Numero1);
        }else{
            if(Numero2<Numero1 && Numero2<Numero3){
                System.out.println("O menor número entre os três é "+Numero2);
            }else{
                System.out.println("O menor número entre os três é "+Numero3);
            }
        }
    }
    
}
