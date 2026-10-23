package br.edu.ifpr.aplicação.exercicio02;

import java.util.Objects;

public class Aluno extends Pessoa{
      private int matricula;
      //private int ano;
      
      public Aluno() {}

      public Aluno(String nome, int matricula,int idade, Endereço endereço) {
        super(nome, endereço, idade);
         this.matricula = matricula;
         //this.ano = ano; 
         }
      
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
       return "[Aluno]\nnome = [" + super.getNome() + "]" +
           "\nidade = [" + super.getIdade() + "]" +
           "\nmatricula = [" + matricula + "]" + 
              "\n" + getEndereço();
      }
          
   }
