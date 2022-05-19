package me.dio.models;

//classe OperadorDeCaixa estende de FuncionarioCLT e herda seus atributos
public class OperadorDeCaixa extends FuncionarioCLT {

  //gera construtor da classe
  public OperadorDeCaixa(String nome, String documento, Double valorSalario, Endereco endereco) {
    super(nome, documento, valorSalario, endereco); //super indica que construtor vem da superclasse FuncionarioCLT
  }

  //gera construtor vazio da classe
  public OperadorDeCaixa() {
  }

  //sobrecreve metodo toString() pra nao imprimir end de memoria
  @Override
  public String toString() {
    return "OperadorDeCaixa{" +
        "nome='" + nome + '\'' +
        ", documento='" + documento + '\'' +
        ", valorSalario=" + valorSalario +
        ", endereco=" + endereco.getRua() +  //mostra apenas o objeto rua para endedereço do operador de caixa
        '}';
  }
}
