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
public class Oito {
    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        int Idade;
        char Resposta;
        
        do{
            System.out.println("Digite a sua idade: ");
            Idade=entrada.nextInt();
            
            if(Idade<=6){
                System.out.println("Isento de pagamento");
            }else{
                if(Idade==6 || Idade<=12){
                    System.out.println("Bilhete de criança");
                }else{
                    if(Idade==13 || Idade<=65){
                        System.out.println("Bilhete normal");
                    }else{
                        System.out.println("Bilhete de terceira idade");
                    }
                }
            }
            
            System.out.println("Responda S se quiser solicitar um novo bilhete: ");
            Resposta=entrada.next().charAt(0);
        }while(Resposta=='S');
    }
}
