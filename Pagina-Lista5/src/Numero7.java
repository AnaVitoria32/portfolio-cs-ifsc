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
public class Numero7 {
    public static void main(String[] args) {
        int Velocidade;
        double Tempo, Distancia;
        boolean Perigo;
        
        Velocidade=340;
        
        Scanner entrada=new Scanner(System.in);
        System.out.println("Digite o tempo: ");
        Tempo=entrada.nextDouble();
        
        Distancia=Velocidade*Tempo;
        
        Perigo=Distancia<200;
        
        System.out.println("O raio representou algum perigo para a pessoa? "+Perigo);
    }
}
