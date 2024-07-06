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
public class Ex2 {
    public static void main(String [] args){
        int numero;
        int sucessor;
        int antecessor;
        
        Scanner entrada=new Scanner(System.in);
        System.out.println("Escreva um numero: ");
        numero=entrada.nextInt();
        
        sucessor= numero++;
        antecessor= numero--;
        
        System.out.println("Seu numero eh: "+numero+" , o antecessor é "+antecessor+" e o sucessor eh "+sucessor);
    }
}
