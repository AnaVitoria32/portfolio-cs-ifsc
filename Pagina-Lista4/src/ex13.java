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
public class ex13 {
    public static void main(String [] args){
        int hora, minuto, segundo;
        int CalculoHora, CalculoMinuto;
        int SegundosTotais;
        int SegundosPassados;
        
        Scanner entrada=new Scanner(System.in);
        System.out.println("Digite a hora:");
        hora=entrada.nextInt();
        System.out.println("Digite os minutos: ");
        minuto=entrada.nextInt();
        System.out.println("Digite os segundos: ");
        segundo=entrada.nextInt();
        
        CalculoHora=hora*3600;
        CalculoMinuto=minuto*60;
        
        SegundosTotais=CalculoHora+CalculoMinuto+segundo;
        SegundosPassados=SegundosTotais-0;
        
        System.out.println("Os segundos que se passaram desde que o dia comecou foram: "+SegundosPassados);
    }
}
