/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package atividade;

import java.util.Scanner;

/**
 *
 * @author menes
 */
public class Exe5 {
    public static void main(String [] args){
        int consumo;
        int distância;
        int volume;
        
        Scanner entrada=new Scanner(System.in);
        System.out.println("Digite o volume de combustivel colocado em seu carro: ");
        volume=entrada.nextInt();
        
        System.out.println("Digite a distancia percorrida pelo seu carro: ");
        distância=entrada.nextInt();
        
        consumo=distância/volume;
        
        System.out.println("O consumo de combustivel do seu carro foi de: "+consumo+"km/l");
    }
}
