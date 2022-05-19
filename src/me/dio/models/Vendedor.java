package me.dio.models;

//classe Vendedor estende de FuncionarioCLT e herda seus atributos
public class Vendedor extends FuncionarioCLT implements CalculaBonificacao {
  //classe impementa a interface CalculaBonificacao
  private Double valorDaBonificacao;

  //implementa metodo da interface
  @Override
  public void calculaBonificacao(Double porcentagemBonificacao) {
    this.valorDaBonificacao = this.valorSalario * (porcentagemBonificacao/100d);
  }

  //sobrescreve metodo toString() pra nao imprimir end de memoria
  @Override
  public String toString() {
    return "Vendedor{" +
        "nome='" + nome + '\'' +
        ", documento='" + documento + '\'' +
        ", valorSalario=" + valorSalario +
        ", endereco=" + endereco.getBairro() +  //mostra apenas o objeto bairro para endereço do vendedor
        ", valorDaBonificacao=" + valorDaBonificacao +
        '}';
  }
}
