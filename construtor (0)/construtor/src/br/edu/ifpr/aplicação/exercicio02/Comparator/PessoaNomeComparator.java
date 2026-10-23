package br.edu.ifpr.aplicação.exercicio02.Comparator;
 
import java.util.Comparator;
 
 import br.edu.ifpr.aplicação.exercicio02.Pessoa;
 
 public class PessoaNomeComparator implements Comparator<Pessoa> {
 
 @Override
 public int compare(Pessoa o1, Pessoa o2) {
 if(o1.getNome().equals(o2.getNome()))
 return 0;
 
 return o1.getNome().compareTo(o2.getNome());
 }
 }