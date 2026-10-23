package br.edu.ifpr.aplicação.exercicio02;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
   public Main() {
      
      Endereço e1 = new Endereço("Londrina", "Bandeirantes", "Airton Sena", 916); 
      Pessoa p1 = new Aluno("Jair", 371837, 21, e1);
      Pessoa p2 = new Aluno("José", 547898, 19, e1);
      Pessoa p3 = new Aluno("Josué", 897517, 20, e1);
      
      Pessoa p4 = new Professor("Joaquim",e1, 43, 1);
      Pessoa p5 = new Professor("jonuario", e1, 57, 2);
      Pessoa p6 = new Professor("Jabão", e1, 82, 3);
        
      List<Pessoa> pessoas = new ArrayList<>();
      pessoas.add(p1);
      pessoas.add(p2);
      pessoas.add(p3);
      pessoas.add(p4);
      pessoas.add(p5);
      pessoas.add(p6);
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
      Collections.sort(pessoas, PessoaNomeComparator);
      
      pessoas.forEach(System.out::println);
      
   }
   
   public static void main(String[] args) {
     new Main(); 
     
   }
}