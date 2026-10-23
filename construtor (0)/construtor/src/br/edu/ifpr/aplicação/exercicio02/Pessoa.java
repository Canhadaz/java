package br.edu.ifpr.aplicação.exercicio02;

import java.util.Objects;

public class Pessoa{
   private String nome;
   private Endereço endereço;
   private int idade;
   
   public Pessoa() {}
   public Pessoa(String nome, Endereço endereço, int idade) {
      this.nome = nome;
      this.endereço = endereço;
      this.idade = idade;}
   
   public String getNome() {
      return nome;}
   
   public void setNome(String nome) {
      this.nome = nome;}

   public Endereço getEndereço() {
   return endereço;}
 
   public void setEndereço(Endereço endereço) {
   this.endereço = endereço;}

   public int getIdade() {
   return idade;}
   
   public void setIdade(int idade) {
   this.idade = idade;}
   
   
@Override
public int hashCode() {
	return Objects.hash(endereço, idade, nome);
}
@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	Pessoa other = (Pessoa) obj;
	return Objects.equals(endereço, other.endereço) && idade == other.idade && Objects.equals(nome, other.nome);
}
public String toString() {
      return "Pessoa nome =" + nome + " | Endereço =" + endereço;
   }

   
}
