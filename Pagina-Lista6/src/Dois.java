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
public class Dois {
    public static void main(String[] args) {
           int Prova1, Prova2, Trabalho;
        
        Scanner entrada=new Scanner(System.in);
        System.out.println("Digite a nota da sua primeira prova: ");
        Prova1=entrada.nextInt();
        
        System.out.println("Digite a nota da sua segunda prova: ");
        Prova2=entrada.nextInt();
        
        System.out.println("Digite a nota do seu trabalho: ");
        Trabalho=entrada.nextInt();
        
        if(Trabalho>=7 && Prova1>=6){
            System.out.println("Parabens, voce foi aprovado!");
        }else{
            if(Trabalho>=7 && Prova2>=6){
                System.out.println("Parabens, voce foi aprovado!");
            }else{
                System.out.println("Infelizmente, voce nao foi aprovado");
            }
        }
    }
}
