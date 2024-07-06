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
public class ex7 {
    public static void main(String [] args){
        int QTipo1,QTipo2,QTipo3;
        float VTipo1,VTipo2,VTipo3;
        float VTotal;
        
        float valor1,valor2,valor3;
        
        valor1=1.50f;
        valor2=2.00f;
        valor3=0.75f;
        
        Scanner entrada=new Scanner(System.in);
        System.out.println("Digite a quantidade de picoles do tipo 1 foram vendidos: ");
        QTipo1=entrada.nextInt();
        
        System.out.println("Digite a quantidade de picoles do tipo 2 foram vendidos: ");
        QTipo2=entrada.nextInt();
        
        System.out.println("Digite a quantidade de picoles do tipo 3 foram vendidos: ");
        QTipo3=entrada.nextInt();
        
        VTipo1=QTipo1*valor1;
        System.out.println("O valor arrecadado com a venda dos picoles do tipo 1 foi: "+VTipo1);
        
        VTipo2=QTipo2*valor2;
        System.out.println("O valor arrecadado com a venda dos picoles do tipo 2 foi: "+VTipo2);
        
        VTipo3=QTipo3*valor3;
        System.out.println("O valor arrecadado com a venda dos picoles do tipo 3 foi: "+VTipo3);
        
        VTotal=VTipo1+VTipo2+VTipo3;
        
        System.out.println("O valor total das vendas eh: "+VTotal);
    }
}
