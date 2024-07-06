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
public class Dez {
    public static void main(String[] args) {
        int NumeroX, NumeroY, NumeroZ, CalculoXZ, CalculoYZ, CalculoXY;
        
        Scanner entrada=new Scanner(System.in);
        System.out.println("Digite um numero para saber o tipo de triangulo formado: ");
        NumeroX=entrada.nextInt();
        
        System.out.println("Digite mais um numero: ");
        NumeroY=entrada.nextInt();
        
        System.out.println("Digite o ultimo numero: ");
        NumeroZ=entrada.nextInt();
        
        CalculoXZ=NumeroX+NumeroZ;
        CalculoYZ=NumeroY+NumeroZ;
        CalculoXY=NumeroX+NumeroY;
        
        if((CalculoXZ>NumeroY)&&(NumeroX==NumeroY || NumeroX==NumeroZ || NumeroY==NumeroZ)){
            System.out.println("Eh um triangulo isoceles");
        }else{
            if(CalculoXZ<NumeroY){
                System.out.println("Nao eh triangulo");
            }else{
                if((CalculoXZ>NumeroY)&&(NumeroX !=NumeroY && NumeroX!=NumeroZ && NumeroY!=NumeroZ)){
                    System.out.println("Eh um triangulo escaleno");
                }else{
                    if(CalculoYZ<NumeroX){
                        System.out.println("Nao eh triangulo");
                    }else{
                        if(NumeroX==NumeroY && NumeroX==NumeroZ && NumeroY==NumeroZ){
                            System.out.println("Eh um triangulo equilatero");
                        }else{
                            System.out.println("Nao eh triangulo");
                        }
                    }
                }
            }
        }
    }
 
}
