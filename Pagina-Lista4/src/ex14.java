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
public class ex14 {
    public static void main(String []args){
        int Hora, Minuto, Segundo;
        int CalculoDaHora, CalculoDoMinuto;
        int SegundosTotais;
        float UmDiaEmSegundos;
        float TempoRestante;
        
        UmDiaEmSegundos=86400f;
        
        Scanner entrada=new Scanner(System.in);
        System.out.println("Digite a hora:");
        Hora=entrada.nextInt();
        System.out.println("Digite os minutos: ");
        Minuto=entrada.nextInt();
        System.out.println("Digite os segundos: ");
        Segundo=entrada.nextInt();
        
        CalculoDaHora=Hora*3600;
        CalculoDoMinuto=Minuto*60;
        
        SegundosTotais=CalculoDaHora+CalculoDoMinuto+Segundo;
        TempoRestante=UmDiaEmSegundos-SegundosTotais;
        
        System.out.println("Faltam "+TempoRestante+" segundos para terminar o dia");
    }
}
