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
public class Doze {
    public static void main(String[] args) {
        int Angulo;
        
        Scanner entrada=new Scanner(System.in);
        System.out.println("Digite o angulo, sendo um numero inteiro: ");
        Angulo=entrada.nextInt();
        
        if(Angulo<90){
            System.out.println("Angulo agudo");
        }else{
            if(Angulo==90){
                System.out.println("Angulo reto");
            }else{
                System.out.println("Angulo obtuso");
            }
        }
    }
}
