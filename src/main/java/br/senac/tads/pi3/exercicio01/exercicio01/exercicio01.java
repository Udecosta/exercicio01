package br.senac.tads.pi3.exercicio01.exercicio01;

import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ude.ccoelho
 */
public class exercicio01 {
    
    public static void main (String args []){
        
        Scanner leitor = new Scanner(System.in);
        String nome, dataNasc, email, tel;
        System.out.println("Contato:");
        System.out.print("Nome: ");
        nome = leitor.nextLine();
        System.out.print("Data de Nascimento:");
        dataNasc = leitor.next();
        System.out.print("E-mail: ");
        email = leitor.next();
        System.out.println("Telefone:");
        tel = leitor.next();
    }
    
}
