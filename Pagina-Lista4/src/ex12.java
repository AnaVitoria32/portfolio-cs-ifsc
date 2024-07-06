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
public class ex12 {
    public static void main(String [] args){
        float PesoComida;
        float Total, ValorFixo;
        float PesoPratoQuilos;
        
        ValorFixo=39.00f;
        PesoPratoQuilos=0.45f;
        
        
        Scanner entrada=new Scanner (System.in);
        System.out.println("Digite o peso do prato em quilos:");
        PesoComida=entrada.nextFloat();
        
        Total=PesoComida*ValorFixo+PesoPratoQuilos;
        
        System.out.println("O valor a pagar vai ser: "+Total);
    }
}
