package br.edu.ifpr.aplicação.exercicio02.aplicacao;

import java.time.LocalDate;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
//import java.util.Collections;
import java.util.List;

import br.edu.ifpr.aplicação.exercicio02.Comparator.AlunoIdadeComparator;
import br.edu.ifpr.aplicação.exercicio02.Comparator.AlunoNomeComparator;
import br.edu.ifpr.aplicação.exercicio02.Comparator.AlunoMediaComparator;
import br.edu.ifpr.aplicação.exercicio02.Comparator.PessoaNomeComparator;
import br.edu.ifpr.aplicação.exercicio02.Comparator.ProfessorRegistroComparator;
import br.edu.ifpr.aplicação.exercicio02.Comparator.AlunoAvaliação;
import br.edu.ifpr.aplicação.exercicio02.Buscador.Buscador;

import br.edu.ifpr.aplicação.exercicio02.Aluno;
import br.edu.ifpr.aplicação.exercicio02.Avaliação;
import br.edu.ifpr.aplicação.exercicio02.Pessoa;
import br.edu.ifpr.aplicação.exercicio02.Endereço;
import br.edu.ifpr.aplicação.exercicio02.Professor;

public class Main {
   public Main() {
      
      Endereço e1 = new Endereço("Londrina", "Bandeirantes", "Airton Sena", 916); 
      Aluno p1 = new Aluno("Jair", 371837, 21, e1);
      Aluno p2 = new Aluno("José", 547898, 19, e1);
      Aluno p3 = new Aluno("Josué", 897517, 20, e1);
      
      Pessoa p4 = new Professor("Joaquim",e1, 43, 1);
      Pessoa p5 = new Professor("jonuario", e1, 57, 2);
      Pessoa p6 = new Professor("Jabão", e1, 82, 3);
      
      Avaliação av1 = new Avaliação((LocalDate.of(2001, 9, 11)),9.8,"Programação");
      Avaliação av2 = new Avaliação((LocalDate.now()),9.2,"Banco de Dados");
      
      p1.setAvalia(List.of(av1));
      p2.setAvalia(List.of(av2));
      p3.setAvalia(List.of(av1,av2));
      
      List<Pessoa> pessoas = new ArrayList<>();
      pessoas.add(p1);
      pessoas.add(p2);
      pessoas.add(p3);
      pessoas.add(p4);
      pessoas.add(p5);
      pessoas.add(p6);
      
      /*remove every person from the list "Pessoa" with less than 18 years
      
      Iterator<Pessoa> p = pessoas.iterator();
      while(p.hasNext()) {
        Pessoa pessoa = p.next(); 
        if(pessoa.getIdade() < 18) {
           p.remove();
        }     
      }*/
      List<Aluno> alunos = new ArrayList<>();
      List<Professor> professores = new ArrayList<>();
      
      //list for alunos
      for (Pessoa a : pessoas)
        if(a instanceof Aluno)
         alunos.add((Aluno) a);
         alunos.forEach(System.out::println);
         
      //List for professores
      for (Pessoa a : pessoas)
        if(a instanceof Professor)
         professores.add((Professor) a);
         professores.forEach(System.out::println);

      /*
      ArrayList <String> lista = new ArrayList<String>();
      lista.add("Murilo");
      lista.add("Marcelo");
      lista.add("Marcos");
      lista.add("Mathias");
      lista.add("Matheus");
      */
        
      //Collections.reverse(pessoas);
      PessoaNomeComparator PessoaNomeComparator = new PessoaNomeComparator();

      //Collections.sort(pessoas, PessoaNomeComparator);
  
      pessoas.forEach(System.out::println);
      
   }
   
   public static void main(String[] args) {
     new Main(); 
     
   }
}