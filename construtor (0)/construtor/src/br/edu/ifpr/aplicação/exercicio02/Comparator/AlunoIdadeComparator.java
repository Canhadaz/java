package br.edu.ifpr.aplicação.exercicio02.Comparator;
 
import java.util.Comparator;
 
import br.edu.ifpr.aplicação.exercicio02.Aluno;
 
public class AlunoIdadeComparator implements Comparator <Aluno> {
 
     public int compare(Aluno o1,Aluno o2) {
 
     return o1.getIdade() - o2.getIdade();
     }
 } 