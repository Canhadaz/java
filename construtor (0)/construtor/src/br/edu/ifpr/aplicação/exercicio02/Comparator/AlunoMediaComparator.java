package br.edu.ifpr.aplicação.exercicio02.Comparator;
 
import java.util.Comparator;
 
import br.edu.ifpr.aplicação.exercicio02.Aluno;

public class AlunoMediaComparator implements Comparator <Aluno>{
 //Comparator das médias das avaliações
 
   public int compare (Aluno o1, Aluno o2) {
 
 return AlunoAvaliação.getMedia(o1) <
 AlunoAvaliação.getMedia(o2) ? 0 : 1;
 }
 }
