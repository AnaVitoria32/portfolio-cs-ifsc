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
public class Numero6 {
    public static void main(String[] args) {
        int Altura, Comprimento, Largura, AreaPiso, Volume, AreaParedes, AreaParedeRetangulo, AreaParedeQuadrado;
        boolean ArPequeno, ArMedio, ArGrande;
        
        Scanner entrada=new Scanner(System.in);
        
        System.out.println("Escreva a altura: ");
        Altura=entrada.nextInt();
        
        System.out.println("Digite o comprimento: ");
        Comprimento=entrada.nextInt();
        
        System.out.println("Digite a largura: ");
        Largura=entrada.nextInt();
        
        AreaPiso=Comprimento*Largura;
        
        AreaParedeRetangulo=(Largura*Altura)+(Largura*Altura);
        AreaParedeQuadrado=(Altura*Comprimento)+(Altura*Comprimento);
        AreaParedes=AreaParedeRetangulo+AreaParedeQuadrado;
        
        Volume=Altura*Largura*Comprimento;
        
        ArPequeno=Volume<100;
        ArMedio=(Volume>100)||(Volume<=500);
        ArGrande=Volume>500;
        
        System.out.println("A area do piso eh: "+AreaPiso+" a area total das parede eh: "+AreaParedes+" e o volume eh: "+Volume);
        System.out.println("Ar pequeno: "+ArPequeno);
        System.out.println("Ar medio: "+ArMedio);
        System.out.println("Ar grande: "+ArGrande);
    }
}
