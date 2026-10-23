package br.edu.ifpr.aplicação.exercicio02.Comparator;
 
import java.util.Iterator;
import java.util.List;

import br.edu.ifpr.aplicação.exercicio02.Aluno;
import br.edu.ifpr.aplicação.exercicio02.Avaliação;

public class AlunoAvaliação {
 
   public static double getMedia(Aluno al) {
      double Média = 0;
 
      List<Avaliação> avaliacoes = al.getAvalia();
      Iterator<Avaliação> m = avaliacoes.iterator();
      while (m.hasNext()) {
      //iterator para CALCULAR a média
 
         Média = Média + m.next().getNota();
      }
 //retorna a média dividida pela quantidade de avaliações
      return Média /
 avaliacoes.size();
 }
 }
