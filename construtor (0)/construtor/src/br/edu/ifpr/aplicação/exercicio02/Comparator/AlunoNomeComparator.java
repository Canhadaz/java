package br.edu.ifpr.aplicação.exercicio02.Comparator;
 
import java.util.Comparator;
 
import br.edu.ifpr.aplicação.exercicio02.Aluno;
 
public class AlunoNomeComparator implements Comparator<Aluno>{
 
    public int compare (Aluno o1, Aluno o2) {
 
       if(o1.getNome().equals(o2.getNome()))
          return 0;
 
return o1.getNome().compareTo(o2.getNome());
 }
 
 }