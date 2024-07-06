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
public class Atividade10 {
    public static void main(String[] args) {
        double Distancia, ConsumoMedio, PrecoLitro, ValorGasto;
        
        Scanner entrada=new Scanner(System.in);
        
        System.out.println("Digite a distancia percorrida: ");
        Distancia=entrada.nextDouble();
        
        System.out.println("Digite a quantidade de combustivel utilizado pelo carro para percorrer essa distancia: ");
        ConsumoMedio=entrada.nextDouble();
        
        System.out.println("Digite o preco do litro da gasolina: ");
        PrecoLitro=entrada.nextDouble();
        
        ValorGasto= Distancia+ConsumoMedio+PrecoLitro;
        System.out.println("O valor gasto sera de "+ValorGasto);
    }
}
