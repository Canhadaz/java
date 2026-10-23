package br.edu.ifpr.aplicação.exercicio02;

public class Professor extends Pessoa {
   private int registro;
   
   public Professor() {}
   public Professor(String nome, Endereço endereço, int idade, int registro) {
     super(nome, endereço, idade);
      this.registro = registro;
   }
   
   public int getRegistro() {
      return registro;}
   
   public void setRegistro(int registro) {
      this.registro = registro;
   }
   public String toString() {
      return "\n[Professor]\nregistro = [" + registro + "]" + 
           "\nnome = [" + super.getNome() + "]" + 
           "\nidade = [" + super.getIdade() + "]" +
           "\n" + super.getEndereço();
   }
}

