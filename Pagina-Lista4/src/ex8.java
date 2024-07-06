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
public class ex8 {
    public static void main(String [] args){
        int SalMinimo, QuantVendas, ValorVendas;
        int CalculoSalMinimo;
        int CalculoQuantVendas;
        int CalculoPorcentagemVendas;
        int Salario;
        
        Scanner entrada=new Scanner(System.in);
        System.out.println("Digite o salario minimo: ");
        SalMinimo=entrada.nextInt();
        
        System.out.println("Digite a quantidade de vendas: ");
        QuantVendas=entrada.nextInt();
        
        System.out.println("Digite o valor da venda: ");
        ValorVendas=entrada.nextInt();
         
        CalculoSalMinimo=SalMinimo*2;
        CalculoQuantVendas=QuantVendas*150;
        CalculoPorcentagemVendas=(ValorVendas/100)*5;
        
        Salario=CalculoSalMinimo+CalculoQuantVendas+CalculoPorcentagemVendas;
        
        System.out.println("O seu salario vai ser: "+Salario);
    }
}
