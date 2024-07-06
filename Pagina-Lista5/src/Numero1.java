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
public class Numero1 {
     public static void main(String[] args) {
        double Preco,Quilowatts, Conta, ContaAtraso, SomaContaAtraso;
       
        Scanner entrada=new Scanner(System.in);
        
        System.out.println("Digite o preco do Quilowatt: ");
        Preco=entrada.nextDouble();
        
        System.out.println("Digite a quantidade de Quilowatts: ");
        Quilowatts=entrada.nextDouble();
        
        Conta=Quilowatts*Preco;
        
        SomaContaAtraso=(Conta*10)/100;
        ContaAtraso=Conta+SomaContaAtraso;
        
        System.out.println("O valor pago em dia sera: "+Conta+" e o valor pago em atraso sera: "+ContaAtraso);
    }
}
