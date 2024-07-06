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
public class Nove {
    public static void main(String[] args) {
        int Numero, SaldoAtual, Operacao, Valor, NovoSaldo, Operacao1, Operacao2;
        
        Scanner entrada=new Scanner(System.in);
        System.out.println("Digite o numero da sua conta: ");
        Numero=entrada.nextInt();
        
        System.out.println("Digite o seu saldo atual: ");
        SaldoAtual=entrada.nextInt();
        
        System.out.println("Digite a operacao escolhida, 1 para deposito e 2 para saque: ");
        Operacao=entrada.nextInt();
        
        System.out.println("Digite o valor da operacao: ");
        Valor=entrada.nextInt();
        
        Operacao1=SaldoAtual+Valor;
        Operacao2=SaldoAtual-Valor;
        
        if(Operacao==1){
            System.out.println("O seu saldo apos o deposito sera: "+Operacao1);
        }else{
            if((Operacao==2)&&(Operacao>=0)){
                System.out.println("O seu saque apos o saque sera: "+Operacao2);
            }else{
                System.out.println("O seu saldo apos o saque sera: "+Operacao2);
                System.out.println("Conta estourada");
            }
        }
    }
}
