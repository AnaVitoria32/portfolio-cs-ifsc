/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package atividade3;

import java.util.Scanner;

/**
 *
 * @author menes
 */
public class Atividade12 {
    public static void main(String[] args) {
        int Numero1, Numero2, Numero3, Soma;
        boolean Comparacao;
        
        Scanner entrada=new Scanner(System.in);
        System.out.println("Digite o primeiro numero: ");
        Numero1=entrada.nextInt();
        
        System.out.println("Digite o segundo numero: ");
        Numero2=entrada.nextInt();
        
        System.out.println("Digite o terceiro numero: ");
        Numero3=entrada.nextInt();
        
        Soma=Numero1+Numero2;
        
        Comparacao= Soma<=Numero3;
        System.out.println("A soma dois dois primeiros numeros eh menor ou igual ao terceiro numero? "+Comparacao);
    }
}
