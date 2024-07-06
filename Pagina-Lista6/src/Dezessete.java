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
public class Dezessete {
    public static void main(String[] args) {
        int Codigo;
        double Peso, Calculo;
        
        Scanner entrada=new Scanner(System.in);
        System.out.println("Digite o peso de algo, em kg,  e veja o seu peso em outo planeta: ");
        Peso=entrada.nextDouble();
        
        System.out.println("Digite o codigo do planeta, sendo de 1 a 7: ");
        Codigo=entrada.nextInt();
        
        switch(Codigo){
            case 1:
                Calculo=Peso*0.37;
                System.out.println("O peso no planeta mercurio será: "+Calculo);
                break;
            case 2:
                Calculo=Peso*0.88;
                System.out.println("O peso no planeta venus será: "+Calculo);
                break;
            case 3:
                Calculo=Peso*0.38;
                System.out.println("O peso no planeta marte será: "+Calculo);
                break;
            case 4:
                Calculo=Peso*2.64;
                System.out.println("O peso no planeta jupter será: "+Calculo);
                break;
            case 5:
                Calculo=Peso*1.15;
                System.out.println("O peso no planeta saturno será: "+Calculo);
                break;
            case 6:
                Calculo=Peso*1.17;
                System.out.println("O peso no planeta urano será: "+Calculo);
                break;
            case 7: 
                Calculo=Peso*1.18;
                System.out.println("O peso no planeta netuno será "+Calculo);
                break;
            default:
                System.out.println("O planeta nao esta em nosso sistema no momento");
        }
    }
            
}
