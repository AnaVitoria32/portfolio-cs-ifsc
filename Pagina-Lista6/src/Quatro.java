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
public class Quatro {
    public static void main(String[] args) {
        int Numero;
        double Calculo;
        
        Scanner entrada=new Scanner(System.in);
        System.out.println("Digite um numero para saber se é par ou ímpar: ");
        Numero=entrada.nextInt();
        
        Calculo=Numero/2;
        
        if(Calculo<0.0){
            System.out.println("Ímpar");
        }else{
            System.out.println("Par");
        }
    }
}
