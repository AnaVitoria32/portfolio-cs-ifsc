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
public class ex15 {
    public static void main(String [] args){
        float peso;
        float SeEngordar;
        float SeEmagrecer;
        float QuinzeEmPorcentagem;
        float VinteEmPorcentagem;
        float PesoEmagrecer,PesoEngordar;
        
        QuinzeEmPorcentagem=0.15f;
        VinteEmPorcentagem=0.2f;
        
        Scanner entrada=new Scanner(System.in);
        System.out.println("Digite o seu peso: ");
        peso=entrada.nextFloat();
        
        SeEngordar=peso*QuinzeEmPorcentagem;
        SeEmagrecer=peso*VinteEmPorcentagem;
        
        PesoEngordar=peso+SeEngordar;
        PesoEmagrecer=peso-SeEmagrecer;
        
        System.out.println("O seu peso vai ser: "+PesoEngordar+" se voce engordar 15% do seu peso atual.");
        System.out.println("O seu peso vai ser: "+PesoEmagrecer+" se voce emagrecer 20% do seu peso atual.");
    }
}
