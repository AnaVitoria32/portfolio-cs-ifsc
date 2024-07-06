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
public class ex16 {
    public static void main(String [] args){
        float salario;
        float C1, C2;
        float SomaMultaC1, SomaMultaC2;
        float C1ComMulta, C2ComMulta;
        float SobraDoSalario;
        
        C1=200f;
        C2=120f;
        
        SomaMultaC1= (C1*2)/100;
        SomaMultaC2= (C2*2)/100;
        
        C1ComMulta=C1+SomaMultaC1;
        C2ComMulta=C2+SomaMultaC2;
        
        Scanner entrada=new Scanner(System.in);
        System.out.println("Digite o seu salario:");
        salario=entrada.nextFloat();
        
        SobraDoSalario=(salario-C1ComMulta)-C2ComMulta;
        
        System.out.println("Vai sobrar "+SobraDoSalario+" do seu salario apos pagar as dividas");
        
        
    }
}
