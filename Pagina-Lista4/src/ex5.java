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
public class ex5 {
    public static void main(String [] args){
        int base, altura;
        int area;
        int perimetro;
        
        Scanner entrada=new Scanner(System.in);
        System.out.println("Digite o numero da base do retangulo: ");
        base=entrada.nextInt();
        
        System.out.println("Digite o numero da altura do retangulo: ");
        altura=entrada.nextInt();
        
        area=base*altura;
        perimetro=2*base+2*altura;
        
        System.out.println("A area do seu retangulo sera: "+area+" e o seu perimetro sera: "+perimetro);
    }
}
