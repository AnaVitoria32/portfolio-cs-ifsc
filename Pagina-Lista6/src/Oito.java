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
public class Oito {
    public static void main(String[] args) {
        String Nome;
        char Categoria;
        float Salario, SomaAumento, NovoSalario;
        
        Scanner entrada=new Scanner(System.in);
        System.out.println("Digite o seu nome: ");
        Nome=entrada.nextLine();
        
        System.out.println("Digite a sua categoria, escolha entre A,B,C,D,E,F,H  ou outra letra se estiver fora dessas categorias citadas: ");
        Categoria=entrada.next().charAt(0);
        
        System.out.println("Digite o seu salario: ");
        Salario=entrada.nextFloat();
        
        if((Categoria=='A')||(Categoria=='H')){
            SomaAumento=(Salario*10)/100;
            NovoSalario=Salario+SomaAumento;
            System.out.println("Ola, "+Nome+" ,sua categoria eh: "+Categoria+" e seu salario reajustado eh "+NovoSalario);
        }else{
            if((Categoria=='B')||(Categoria=='D')||(Categoria=='E')){
                SomaAumento=(Salario*15)/100;
                NovoSalario=Salario+SomaAumento;
                System.out.println("Ola, "+Nome+", sua categoria eh: "+Categoria+" e seu salario reajustado eh "+NovoSalario);
            }else{
                if((Categoria=='C')||(Categoria=='F')){
                    SomaAumento=(Salario*25)/100;
                    NovoSalario=Salario+SomaAumento;
                    System.out.println("Ola, "+Nome+", sua categoria eh: "+Categoria+" e seu salario reajustado eh "+NovoSalario);
                }else{
                    SomaAumento=(Salario*30)/100;
                    NovoSalario=Salario+SomaAumento;
                    System.out.println("Ola, "+Nome+", voce esta fora das categorias principais, mas o seu salario reajustado eh "+NovoSalario);
                }
            }
        }
    }
}
