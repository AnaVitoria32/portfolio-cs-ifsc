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
public class Quatorze {
    public static void main(String[] args) {
        double Altura, CalculoPeso;
        char Sexo;
        
        Scanner entrada=new Scanner(System.in);
        System.out.println("Digite a sua altura para sabermos o seu peso ideal: ");
        Altura=entrada.nextDouble();
        
        System.out.println("Digite o seu sexo, utilizando M ou F: ");
        Sexo=entrada.next().charAt(0);
        
        if(Sexo=='M'){
            CalculoPeso=(72.7*Altura)-58;
            System.out.println("O seu peso ideal seria: "+CalculoPeso);
        }else{
            if(Sexo=='F'){
                CalculoPeso=(62.1*Altura)-44.7;
                System.out.println("O seu peso ideal seria: "+CalculoPeso);
            }else{
                System.out.println("Erro!! Alguma das suas informações nao esta correta!");
            }
        }
    }
}
