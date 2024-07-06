/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lista4;

import java.util.Scanner;

/**
 *
 * @author menes
 */
public class Nove {
    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        double CPF, RendaMensal, AliquotaB,AliquotaC,AliquotaD,AliquotaE, ValorDescontado;
        char Classe;
        
        AliquotaB=5;
        AliquotaC=10;
        AliquotaD=15;
        AliquotaE=20;
        do{
            System.out.println("Digite o seu CPF, sem nenhum traço: ");
            CPF=entrada.nextDouble();
            
            System.out.println("Digite a sua renda mensal: ");
            RendaMensal=entrada.nextDouble();
            
            System.out.println("Digite a sua classe,sendo A, B, C, D e E: ");
            Classe=entrada.next().charAt(0);
            
            if(Classe=='A'){
                System.out.println("Você está isento(a) da alíquota, sem valor descontado.");
            }else{
                if(Classe=='B'){
                    ValorDescontado=(RendaMensal*5)/100;
                    System.out.println("Você terá uma alíquota de "+AliquotaB+"% e o desconto será de "+ValorDescontado);
                }else{
                    if(Classe=='C'){
                        ValorDescontado=(RendaMensal*10)/100;
                        System.out.println("Você terá uma alíquota de "+AliquotaC+"% e o desconto será de "+ValorDescontado);
                    }else{
                        if(Classe=='D'){
                            ValorDescontado=(RendaMensal*15)/100;
                            System.out.println("Você terá uma alíquota de "+AliquotaD+"% e o desconto será de "+ValorDescontado);
                        }else{
                            ValorDescontado=(RendaMensal*20)/100;
                            System.out.println("Você terá uma alíquota de "+AliquotaE+"% e o desconto será de "+ValorDescontado);
                        }
                    }
                }
            }
        }while(CPF!=00);
    }
}
