package com.mycompany.matriculagetset;

import java.util.Scanner;

public class MainMatricula {
public static void main(String[] args) {
   
 Scanner scanner = new Scanner(System.in);
        
        // Pedindo ao usuário para inserir os detalhes do aluno
        System.out.println("Digite o nome do aluno:");
        String nome = scanner.nextLine();
        
        System.out.println("Digite a matrícula do aluno:");
        int matricula = scanner.nextInt();
        
        System.out.println("Digite o ano de ingresso do aluno:");
        int anoIngresso = scanner.nextInt();
        scanner.nextLine(); 
        
        System.out.println("Digite o curso do aluno:");
        String curso = scanner.nextLine();
        
        // Criando um objeto Aluno com os detalhes fornecidos pelo usuário
        Matricula aluno1 = new Matricula (nome, matricula, anoIngresso, curso);
        
        // Exibindo os detalhes do aluno
        System.out.println("\nDetalhes do aluno:");
        System.out.println("Nome: " + aluno1.getNome());
        System.out.println("Matrícula: " + aluno1.getMatricula());
        System.out.println("Ano de Ingresso: " + aluno1.getAnoIngresso());
        System.out.println("Curso: " + aluno1.getCurso());
        
        // Fechando o scanner
        scanner.close();
    }
}        

