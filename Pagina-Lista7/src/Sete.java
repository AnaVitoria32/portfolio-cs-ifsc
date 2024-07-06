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
public class Sete {
    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        String Nome;
        int Diarias;
        char Apartamento,Resposta;
        double Calculo;
        
       
        
        do{
            System.out.println("Digite o seu nome: ");
            Nome=entrada.nextLine();
            
            System.out.println("Digite o seu apartamento, sendo A, B ou C: ");
            Apartamento=entrada.next().charAt(0);
            
            System.out.println("Digite o número de diárias: ");
            Diarias=entrada.nextInt();
            
            if(Apartamento=='A'){
                Calculo=Diarias*150;
                System.out.println("O valor total será: "+Calculo);
            }else{
                if(Apartamento=='B'){
                    Calculo=Diarias*100;
                    System.out.println("O valor total será: "+Calculo);
                }else{
                    Calculo=Diarias*75;
                    System.out.println("O valor total será: "+Calculo);
                }
            }
            
            System.out.println("Digite S para cadastrar um novo hospede ou N para não cadastrar: ");
            Resposta=entrada.next().charAt(0);
            
        }while(Resposta=='S'); 
    }          
}
