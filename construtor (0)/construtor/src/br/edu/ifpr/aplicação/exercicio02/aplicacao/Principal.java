package br.edu.ifpr.aplicação.exercicio02.aplicacao;

import java.util.ArrayList;
import java.util.Scanner;

import br.edu.ifpr.aplicação.exercicio02.Aluno;
import br.edu.ifpr.aplicação.exercicio02.Professor;

public class Principal {
   Scanner scan = new Scanner(System.in);
   
   ArrayList<Aluno> alunos = new ArrayList<>();
   ArrayList<Professor> professores = new ArrayList<>();

   private void showMenuAlunos(ArrayList<Aluno> alunos) {
      System.out.println("\n --- ALUNOS ---\n"); 
      System.out.println("[1]Incluir:\n[2]Alterar:\n[3]Consultar:\n[4]Excluir:\n[5]Voltar:\n");
      
      int opcao = scan.nextInt(); 
      switch(opcao) {
       case 1: System.out.println("\n INCLUIR");
       break;
       case 2: System.out.println("\n ALTERAR");
       break;
       case 3: System.out.println("\n CONSULTAR");
       alunos.forEach(System.out::println);
       break;
       case 4: System.out.println("\n EXCLUIR");
       break;
       case 5: System.out.println();
       mainMenu();
       break;
    }
   }
   private void showMenuProfessores(ArrayList<Professor> professores) {
      System.out.println("\n --- PROFESSORES ---\n");
      System.out.println("[1]Incluir:\n[2]Alterar:\n[3]Consultar:\n[4]Excluir:\n[5]Voltar:\n");
      
     int opcao = scan.nextInt(); 
     switch(opcao) {
      case 1: System.out.println("\n INCLUIR");
      break;
      case 2: System.out.println("\n ALTERAR");
      break;
      case 3: System.out.println("\n CONSULTAR");
      professores.forEach(System.out::println);
      break;
      case 4: System.out.println("\n EXCLUIR");
      break;
      case 5: System.out.println();
      mainMenu();
      break;
   }
   }
      private void mainMenu() {
      
      System.out.println("[1] Alunos");
      System.out.println("[2] Professores");
      System.out.println("[3] Sair\n");
      
      int opcao = scan.nextInt();
      switch(opcao){
         case 1: showMenuAlunos(alunos);
         break;
         
         case 2: showMenuProfessores(professores);
         break;
         
         case 3: return;
      }
      
   }

   public static void main(String[] args) {
      new Principal();
   }
   public Principal() { mainMenu();}  
}
