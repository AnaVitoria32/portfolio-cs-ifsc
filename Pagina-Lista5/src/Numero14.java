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
public class Numero14 {
    public static void main(String[] args) {
        double SalarioBruto,Auxilio,PrimeiroDesconto,SegundoDesconto, CalculoSalarioLiquido;
        int Dependentes;
        
        Auxilio=150;
        
        Scanner entrada=new Scanner(System.in);
        System.out.println("Digite o seu salario bruto: ");
        SalarioBruto=entrada.nextDouble();
        
        System.out.println("Digite a quantidade de pessoa que depende de voce: ");
        Dependentes=entrada.nextInt();
        
        PrimeiroDesconto=(SalarioBruto*11)/100;
        SegundoDesconto=(SalarioBruto*15)/100;
        
        CalculoSalarioLiquido=(SalarioBruto-PrimeiroDesconto-SegundoDesconto)+(Auxilio*Dependentes);
        System.out.println("O seu salario apos descontos e receber auxilios sera de: "+CalculoSalarioLiquido);
    }
}
