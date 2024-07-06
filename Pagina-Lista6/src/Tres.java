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
public class Tres {
    public static void main(String[] args) {
        int Peso;
        double Altura, Imc;
        
        Scanner entrada=new Scanner(System.in);
        System.out.println("Digite o seu peso, sem os numeros apos a virgula: ");
        Peso=entrada.nextInt();
        
        System.out.println("Digite a sua altura: ");
        Altura=entrada.nextDouble();
        
        Imc=Peso/(Altura*Altura);
        
        System.out.println("O seu IMC eh: "+Imc);
        
        if(Imc<20){
            System.out.println("Magro");
        }else{
            if(Imc>20 && Imc<24.99){
                System.out.println("Normal");
            }else{
                if(Imc>25 &&Imc<30){
                    System.out.println("Sobrepeso");
                }else{
                    System.out.println("Obeso");
                }
            }
        }
    }
}
