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
public class Numero16 {
    public static void main(String[] args) {
        int QuantidadeParcelas, ParcelasPagas;
        double ValorParcelas, TotalJaPago, ValorFechado, ValorDevedor;
        
        Scanner entrada=new Scanner(System.in);
        System.out.println("Digite a quantidade de parcelas do seu consorcio: ");
        QuantidadeParcelas=entrada.nextInt();
        
        System.out.println("Digite a quantidade de parcelas pagas: ");
        ParcelasPagas=entrada.nextInt();
        
        System.out.println("Digite o preco das parcelas: ");
        ValorParcelas=entrada.nextDouble();
        
        TotalJaPago=ParcelasPagas*ValorParcelas;
        ValorFechado=ValorParcelas*QuantidadeParcelas;
        ValorDevedor=ValorFechado-TotalJaPago;
        
        System.out.println("O valor que falat a pagar eh: "+ValorDevedor);
    }
}
