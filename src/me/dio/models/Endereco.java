package me.dio.models;

//criada claase Endereco com 3 atributos
public class Endereco {
  //usado modificador de acesso "private" pra nao alterar atributos diretamente em cada um deles
  //modificacoes serão feitas com getters e setters
  private String rua; //modificador private proíbe qualquer acesso externo à própria classe, até de classes filhas
  private String complemento;
  private String bairro;

  //gera construtor da classe (digita Alt + Insert, escolhe Construtor e atributos da classe + OK)
  public Endereco(String rua, String complemento, String bairro) {
    this.rua = rua;
    this.complemento = complemento;
    this.bairro = bairro;
  }
  //gerado construtor vazio pra classe Endereco
  public Endereco() {
  }
//gera metodos getters e setters da classe Endereco (digita Alt + Insert, escolhe Getter e Setter, atributos + OK)
  public String getRua() {  //recebe nome de rua
    return rua;  //retorna a entrada de rua
  }

  public void setRua(String rua) {  //recebe uma rua pra alterar
    this.rua = rua; //altera atributo rua na private class
  }

  public String getComplemento() {
    return complemento;
  }

  public void setComplemento(String complemento) {
    this.complemento = complemento;
  }

  public String getBairro() {
    return bairro;
  }

  public void setBairro(String bairro) {
    this.bairro = bairro;
  }

  //sobrescreve metodo toString pra nao imprimir endereço de memoria, indica o que será impresso
  @Override
  public String toString() {
    return "Endereco{" +
        "rua='" + rua + '\'' +
        ", complemento='" + complemento + '\'' +
        ", bairro='" + bairro + '\'' +
        '}';
  }
}
