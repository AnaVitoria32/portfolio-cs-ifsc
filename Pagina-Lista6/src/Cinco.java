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
public class Cinco {
    public static void main(String[] args) {
        int Numero;
        
        Scanner entrada=new Scanner(System.in);
        System.out.println("Digite um numero inteiro: ");
        Numero=entrada.nextInt();
        
        if(Numero<=10){
            System.out.println("F1");
        }else{
            if(Numero>10 && Numero<=100){
                System.out.println("F2");
            }else{
                System.out.println("F3");
            }
        }
    }
}
