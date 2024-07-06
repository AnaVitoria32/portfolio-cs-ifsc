/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lista4;

import java.util.Scanner;

/**
 *
 * @author menes
 */
public class Dois {
    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        int Numero1, Numero2, Calculo;
        
        Numero1=0;
        Numero2=1;
        
        while(Numero1<Numero2){
            System.out.println("Digite o primeiro número: ");
            Numero1=entrada.nextInt();
            
            System.out.println("Digite o segundo número: ");
            Numero2=entrada.nextInt();
            
            Calculo=Numero1+Numero2;
            System.out.println("A soma do primeiro número com o segundo é: "+Calculo);
        }
    }
}
