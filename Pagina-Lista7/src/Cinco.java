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
public class Cinco {
    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        double Altura, MaiorAltura,MediaFeminina,MediaTurma;
        int Sexo, Feminino,Numero;
        MaiorAltura=0;
        MediaFeminina=0;
        
        for(Numero=0;Numero<=3;Numero++){
            System.out.println("Digite a sua altura: ");
            Altura=entrada.nextDouble();
            
            System.out.println("Digite o seu sexo, sendo 1 para masculino e 2 para feminino: ");
            Sexo=entrada.nextInt();
            
            if(MaiorAltura>Altura){
                MaiorAltura=MaiorAltura+Altura;
                System.out.println("A maior altura é: "+MaiorAltura);
            }
            
            if(Sexo=='2'){
                MediaFeminina=MediaFeminina+Altura;
            }
        }
        
    }
}
