package br.edu.ifpr.aplicação.exercicio02;

import java.time.LocalDate;

public class Avaliação{
   private String materia;
   private double nota;
   private LocalDate data;
   
   public Avaliação() {}
   public Avaliação(LocalDate data, double nota, String materia) {
      this.data = data;
      this.nota = nota;
      this.materia = materia;
   }
   public double getNota() {
      return nota;}
   public void setNota(double nota) {
      this.nota = nota;}
   public LocalDate getData() {
      return data;}
   public void setData(LocalDate data) {
      this.data = data;}
   public String getMateria() {
	   return materia;}
   public void setMateria(String materia) {
	   this.materia = materia;}
   
   public String toString() {
	return "\n----------------------\n[AVALIAÇÃO]\nmatéria = " + materia +"\ndata = " + data + "\nnota = " + nota;
}
   
   
   
   
}
