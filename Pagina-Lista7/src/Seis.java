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
public class Seis {
    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        int Idade,RespostasOtimo, RespostaD,DiferencaIdade,MaiorIdade,CalculoMaior,CalculoMenor,MenorIdade;
        char Nota,RespostaA;
        double MediaIdade,MediaIdadeD;
        
        MediaIdade=0;
        RespostasOtimo=0;
        RespostaD=0;
        CalculoMaior=0;
        CalculoMenor=0;
       
        for(int Numero=0;Numero<=3;Numero++){
            System.out.println("Digite a sua idade: ");
            Idade=entrada.nextInt();
            
            System.out.println("Digite a sua classificação, sendo A ótimo, B bom, C regular e D ruim: ");
            Nota=entrada.next().charAt(0);
            
            
            if(Nota=='A'){
               RespostasOtimo=RespostasOtimo+1;
                System.out.println("A quantidade de respostas ótimas foram: "+RespostasOtimo);
            }else{
               System.out.println("Sem respostas ótimas");
            }
            
            if(Nota=='D'){
                RespostaD=RespostaD+1;
                MediaIdade=MediaIdade+Idade;
                MediaIdadeD=MediaIdade/RespostaD;
                
                System.out.println("A média de idade das pessoas que falou ruim é: "+MediaIdadeD);    
            }else{
                System.out.println("Ninguém resposndeu a classificação como ruim.");
            }
            
            if(CalculoMaior<Idade){
                MaiorIdade=Idade;
                System.out.println("A maior idade será: "+MaiorIdade);   
            }
        }
       
    }
}
