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
public class Numero3 {
    public static void main(String[] args) {
        double Peso, Altura, IMC;
        boolean AcimaDoPeso;
        
        Scanner entrada=new Scanner(System.in);
        System.out.println("Digite o seu peso: ");
        Peso=entrada.nextDouble();
        
        System.out.println("Digite a sua altura: ");
        Altura=entrada.nextDouble();
        
        IMC= Peso/(Altura*Altura);
        AcimaDoPeso= IMC>25;
        
        System.out.println("O seu IMC eh: "+IMC);
        System.out.println(AcimaDoPeso);
    }
}
