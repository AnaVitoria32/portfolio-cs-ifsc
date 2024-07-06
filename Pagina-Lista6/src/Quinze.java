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
public class Quinze {
    public static void main(String[] args) {
        int Idade;
        
        Scanner entrada=new Scanner(System.in);
        System.out.println("Digite a sua idade, sendo de 5 anos para cima, para saber em qual categoria de natacao voce se classifica:  ");
        Idade=entrada.nextInt();
        
        if(Idade>=5 && Idade<=10){
            System.out.println("Infantil");
        }else{
            if(Idade>=11 && Idade<=17){
                System.out.println("Juvenil");
            }else{
                if(Idade>=18 && Idade<=60){
                    System.out.println("Adulto");
                }else{
                    System.out.println("Senior");
                }
            }
        }
    }
}
