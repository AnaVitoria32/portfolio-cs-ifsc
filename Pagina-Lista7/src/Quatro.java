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
public class Quatro {
      public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        String Nome;
        int Codigo, Quantidade;
        double Calculo;
        
        System.out.println("O nosso menu é: ");
        System.out.println("Cachorro quente, código 100, preço 4,00;");
        System.out.println("X salada, código 101, preço 6,00;");
        System.out.println("Bauru com ovo, código 102, preço 6,50;");
        System.out.println("Refrigerante, código 103, preço 2,00;");
        
        for(int i=0; i<1; i++){
            System.out.println("Digite o numero do produto: ");
            Nome=entrada.nextLine();
            
            System.out.println("Digite o código do produto: ");
            Codigo=entrada.nextInt();
            
            System.out.println("Digite a quantidade do produto: ");
            Quantidade=entrada.nextInt();
            
            if(Codigo==100){
                Calculo=Quantidade*4.00;
                System.out.println("O "+Nome+" custará "+Calculo);
            }else{
                if(Codigo==101){
                    Calculo=Quantidade*6.00;
                    System.out.println("O "+Nome+" custará "+Calculo);
                }else{
                    if(Codigo==102){
                        Calculo=Quantidade*6.50;
                        System.out.println("O "+Nome+" custará "+Calculo);
                    }else{
                        Calculo=Quantidade*2.00;
                        System.out.println("O "+Nome+" custará "+Calculo);
                    }
                }
            }
        }
    }
}
