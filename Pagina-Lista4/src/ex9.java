/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package atividade1;

import java.util.Scanner;

/**
 *
 * @author menes
 */
public class ex9 {
    
    //Está dando erro no código, mas não sei o que  está errado.
    public static void main(String [] args){
        String NomeP1, NomeP2,NomeP3;
        int QuantidadeP1, QuantidadeP2, QuantidadeP3;
        float ValorUnitarioP1, ValorUnitarioP2, ValorUnitarioP3;
        float GProduto1, GProduto2, GProduto3;
        float GTotal;
        
        Scanner entrada=new Scanner(System.in);
        System.out.println("Digite o nome do primeiro produto: ");
        NomeP1=entrada.nextLine();
        System.out.println("Digite a quantidade de "+NomeP1+" que voce comprou: ");
        QuantidadeP1=entrada.nextInt();
        System.out.println("Digite o valor unitario do produto: ");
        ValorUnitarioP1=entrada.nextFloat();
        GProduto1=QuantidadeP1*ValorUnitarioP1;
        System.out.println("O valor gasto com "+NomeP1+" foi de "+GProduto1);
        
        System.out.println("Digite o nome do segundo produto");
        NomeP2=entrada.nextLine();
        System.out.println("Digite a quantidade de "+NomeP2+" que voce comprou");
        QuantidadeP2=entrada.nextInt();
        System.out.println("Digite o valor unitario do produto");
        ValorUnitarioP2=entrada.nextFloat();
        GProduto2=QuantidadeP2*ValorUnitarioP2;
        System.out.println("O valor gasto com "+NomeP2+" foi de "+GProduto2);
        
        System.out.println("Digite o nome do segundo produto");
        NomeP3=entrada.nextLine();
        System.out.println("Digite a quantidade de "+NomeP3+" que voce comprou");
        QuantidadeP3=entrada.nextInt();
        System.out.println("Digite o valor unitario do produto");
        ValorUnitarioP3=entrada.nextFloat();
        GProduto3=QuantidadeP3*ValorUnitarioP3;
        System.out.println("O valor gasto com "+NomeP3+" foi de "+GProduto3);
        
        GTotal=GProduto1+GProduto2+GProduto3;
        System.out.println("O valor total gasto na sua compra foi de "+GTotal+" reais");
    }
}
