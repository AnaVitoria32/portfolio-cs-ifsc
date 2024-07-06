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
public class Ex3 {
    public static void main(String []args){
        String nome;
        String endereço;
        int telefone;
        
        Scanner entrada=new Scanner(System.in);
        System.out.println("Escreva o seu nome: ");
        nome=entrada.nextLine();
        
        System.out.println("Escreva o seu endereço: ");
        endereço=entrada.nextLine();
        
        System.out.println("Digite o seu numero: ");
        telefone=entrada.nextInt();
        
        System.out.println("Seu nome é: "+nome+" ,seu endereço eh: "+endereço+" e seu telefone eh: "+telefone);
    }
}
