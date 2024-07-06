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
public class Atividade11 {
    public static void main(String[] args) {
        int Numero1, Numero2;
        boolean Comparacao;
        
        Scanner entrada=new Scanner(System.in);
        System.out.println("Digite o primeiro numero ");
        Numero1=entrada.nextInt();
        
        System.out.println("Digite o segundo numero ");
        Numero2=entrada.nextInt();
        
        Comparacao= Numero1==Numero2;
        System.out.println("Os numeros sao iguais? "+Comparacao);
        
    }
}
