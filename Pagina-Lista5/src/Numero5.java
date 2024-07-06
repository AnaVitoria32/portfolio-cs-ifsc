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
public class Numero5 {
    public static void main(String[] args) {
        int Prova1, Prova2, Trabalho, Frequencia;
        boolean Aprovado;
        
        Scanner entrada=new Scanner(System.in);
        System.out.println("Digite a nota da primeira prova: ");
        Prova1=entrada.nextInt();
        
        System.out.println("Digite a nota da segunda prova: ");
        Prova2=entrada.nextInt();
        
        System.out.println("Digite a nota do trabalho: ");
        Trabalho=entrada.nextInt();
        
        System.out.println("Digite a sua frequencia: ");
        Frequencia=entrada.nextInt();
        
        Aprovado= (Trabalho>=7) && (Prova1>=6 || Prova2>=6) && (Frequencia>=70 || (Trabalho<=7 && Frequencia>=90));
        System.out.println(Aprovado);
    }
}
