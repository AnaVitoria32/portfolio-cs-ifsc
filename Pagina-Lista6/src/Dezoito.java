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
public class Dezoito {
    public static void main(String[] args) {
        double Saldo;
        
        Scanner entrada=new Scanner(System.in);
        System.out.println("Digite o seu saldo para saber o credito que pode ser concedido");
        Saldo=entrada.nextDouble();
        
        if(Saldo>=0 && Saldo<=500){
            System.out.println("Nenhum credito");
        }else{
            if(Saldo>=500.01 && Saldo<=1000){
                System.out.println("30% do valor do saldo medio");
            }else{
                if(Saldo>=1000.01 && Saldo<=3000){
                    System.out.println("40% do valor do saldo medio");
                }else{
                    System.out.println("50% do valor do saldo medio");
                }
            }
        }
    }
}
