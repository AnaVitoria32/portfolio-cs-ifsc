/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package atividade3;

import java.util.Scanner;

/**
 *
 * @author menes
 */
public class Atividade13 {
    public static void main(String[] args) {
        String Nome;
        double NotaP, NotaM, NotaCG, Media;
        boolean Aprovado;
        
        Scanner entrada=new Scanner(System.in);
        System.out.println("Digite o seu nome");
        Nome=entrada.nextLine();
        
        System.out.println("Digite a sua nota de portugues");
        NotaP=entrada.nextDouble();
        
        System.out.println("Digite a sua nota de matematica ");
        NotaM=entrada.nextDouble();
        
        System.out.println("Digite a sua nota de conhecimentos gerais");
        NotaCG=entrada.nextDouble();
        
        Media=(NotaP+NotaM+NotaCG)/3;
        
        Aprovado= (Media>70) && (NotaP>50)&&(NotaM>50)&&(NotaCG>50);
        System.out.println("Olá, "+Nome+" a sua nota de portugues eh: "+NotaP+" , a sua nota de matematica eh: "+NotaM+" e sua nota de conhecimentos gerais eh: "+NotaCG);
        System.out.println("A sua media eh: "+Media);
        System.out.println("Voce sera aprovado(a)? "+Aprovado);
    }
}
