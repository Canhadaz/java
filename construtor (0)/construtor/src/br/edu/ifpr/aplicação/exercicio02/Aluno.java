package br.edu.ifpr.aplicação.exercicio02;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Aluno extends Pessoa{
      private int matricula;
      private List <Avaliação> avalia = new ArrayList<>();
      
      //private int ano;
      
      public Aluno() {}
      public Aluno(String nome, int matricula,int idade, Endereço endereço) {
        super(nome, endereço, idade);
         this.matricula = matricula;
         //this.ano = ano; 
         }
      
      public List<Avaliação> getAvalia() {
         return avalia;
      }
      public void setAvalia(List<Avaliação> avalia) {
         this.avalia = avalia;
      }
//      public void setAvalia01(Avaliação av1) {
//         avalia.add(av1);
//      }
      public int getMatricula() {
         return matricula;}
      
      public void setMatricula(int matricula) {
         this.matricula = matricula;}     
      
      @Override
   public int hashCode() {
      return Objects.hash(matricula);
   }
   @Override
   public boolean equals(Object obj) {
      if (this == obj)
         return true;
      if (obj == null)
         return false;
      if (getClass() != obj.getClass())
         return false;
      Aluno other = (Aluno) obj;
      return matricula == other.matricula;
   }

   public String toString() {
       return "\n[Aluno]\nNOME = [" + super.getNome() + "]" +
           "\nIDADE = [" + super.getIdade() + "]" +
           "\nMATRICULA = [" + matricula + "]" + 
               getEndereço() + "\n" + avalia;
      }       
   }
