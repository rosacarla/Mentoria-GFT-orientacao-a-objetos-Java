package me.dio.models;

//classe FuncionarioCLT é abstrata pra heranca de classes vendedor e operador de caixa
public abstract class FuncionarioCLT {  //nao se faz new de abstract class; dá erro de compilação
  //criados atributos da classe incluindo Endereco
  protected String nome; //modificador protected permite acesso a classes filhas e proíbe a qualquer outro acesso ext.
  protected String documento;
  protected Double valorSalario;
  protected Endereco endereco; //classe Endereco é atributo dentro de FuncionarioCLT, caracteriza Composição

  //gera construtor vazio
  public FuncionarioCLT() {
  }

  //gera construtor da classe
  public FuncionarioCLT(String nome, String documento, Double valorSalario, Endereco endereco) {
    this.nome = nome;
    this.documento = documento;
    this.valorSalario = valorSalario;
    this.endereco = endereco;
  }

  //gera metodos getters e setters
  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public String getDocumento() {
    return documento;
  }

  public void setDocumento(String documento) {
    this.documento = documento;
  }

  public Double getValorSalario() {
    return valorSalario;
  }

  public void setValorSalario(Double valorSalario) {
    this.valorSalario = valorSalario;
  }

  public Endereco getEndereco() {
    return endereco;
  }

  public void setEndereco(Endereco endereco) {
    this.endereco = endereco;
  }
}
