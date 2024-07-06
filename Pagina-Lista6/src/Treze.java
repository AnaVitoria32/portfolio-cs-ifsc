/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lista3;

import java.util.Scanner;

/**
 *
 * @author menes
 */
public class Treze {
    public static void main(String[] args) {
        String Nome1, Nome2, Nome3;
        int Quantidade1, Quantidade2, Quantidade3;
        
        Scanner entrada=new Scanner(System.in);
        System.out.println("Digite o nome do primeiro produto: ");
        Nome1=entrada.nextLine();
        System.out.println("Digite a quantidade do produto no estoque: ");
        Quantidade1=entrada.nextInt();
        
        System.out.println("Digite o nome do segundo produto: ");
        Nome2=entrada.nextLine();
        System.out.println("Digite a quantidade do produto no estoque: ");
        Quantidade2=entrada.nextInt();
        
        System.out.println("Digite o nome do terceiro produto: ");
        Nome3=entrada.nextLine();
        System.out.println("Digite a quantidade do produto no estoque: ");
        Quantidade3=entrada.nextInt();
        
        if(Quantidade1<30){
            System.out.println(Nome1+" abaixo do estoque minimo!");
        }else{
            if(Quantidade2<30){
                System.out.println(Nome2+" abaixo do estoque minimo");
            }else{
                if(Quantidade3<30){
                    System.out.println(Nome3+" abaixo do estoque minimo");
                }else{
                    System.out.println("Todos os produtos estao om estoque suficiente");
                }
            }
        }
    }
}
