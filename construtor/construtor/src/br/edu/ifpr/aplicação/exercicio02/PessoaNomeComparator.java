package br.edu.ifpr.aplicação.exercicio02;

import java.util.Comparator;

public class PessoaNomeComparator implements Comparator<Pessoa> {

   @Override
   public int compare(Pessoa o1, Pessoa o2) {
      return o1.getNome().compareTo(o2.getNome());
   }
}
