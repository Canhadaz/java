package br.edu.ifpr.aplicação.exercicio02.Buscador;
 
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import br.edu.ifpr.aplicação.exercicio02.Pessoa;
 
 public class Buscador {
 
public static List<Pessoa> buscar (List<Pessoa> pesquisa, String nome){
 Pattern p = Pattern.compile(nome);
 
 List <Pessoa> resultado = new ArrayList<>();
 
 for (Pessoa pessoa : pesquisa) {
 Matcher matcher = p.matcher(pessoa.getNome());
 
 if(matcher.find())
 resultado.add(pessoa);
 }
 
 return resultado;
 
 }
}