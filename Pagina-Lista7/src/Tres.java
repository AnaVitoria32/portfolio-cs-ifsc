/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lista4;

import java.util.Scanner;

/**
 *
 * @author menes
 */
public class Tres {
    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        String Nome, Sexo;
        int Idade;
        Idade=1;
        
        while(Idade>0){
            System.out.println("Digite o seu nome: ");
            Nome=entrada.nextLine();
            
            System.out.println("Digite o seu sexo: ");
            Sexo=entrada.nextLine();
            
            System.out.println("Digite a sua idade, podendo ser 0");
            Idade=entrada.nextInt();
        }
    }
}
