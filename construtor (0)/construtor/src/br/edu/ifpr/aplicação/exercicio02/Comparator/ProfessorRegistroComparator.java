package br.edu.ifpr.aplicação.exercicio02.Comparator;

import java.util.Comparator;
 
import br.edu.ifpr.aplicação.exercicio02.Professor;
 
public class ProfessorRegistroComparator implements Comparator <Professor>{
 
   public int compare(Professor o1, Professor o2) {
 
      return o1.getRegistro() - (o2.getRegistro());
   }
 
 }