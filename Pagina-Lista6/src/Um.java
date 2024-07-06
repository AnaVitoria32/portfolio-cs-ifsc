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
public class Um {
    public static void main(String[] args) {
        float Preco, Conta, ContaAtraso, ContaAumento;
        int Quilowatts;
        
        Scanner entrada=new Scanner(System.in);
        System.out.println("Digite o preco do Quilowatt: ");
        Preco=entrada.nextFloat();
        
        System.out.println("Digite a quenatidade de Quilowatt: ");
        Quilowatts=entrada.nextInt();
        
        Conta=Preco*Quilowatts;
        ContaAumento=(Conta*10)/100;
        ContaAtraso=Conta+ContaAumento;
        
        System.out.println("O valor da sua conta paga em dia eh: "+Conta);
        System.out.println("O valor da sua conta paga com atraso eh: "+ContaAtraso);
        
        if(Quilowatts>70){
            System.out.println("Consumo elevado de energia");
        }else{
            System.out.println("Voce eh um consumidor consciente");
        }
    }
    
}
