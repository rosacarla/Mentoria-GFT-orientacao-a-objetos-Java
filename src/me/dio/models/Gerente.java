package me.dio.models;

//classe Gerente estende de FuncionarioPJ e herda seus atributos
public class Gerente extends FuncionarioPJ implements CalculaBonificacao {
  //classe implementa a interface CalculaBonificacao
  private Double valorBonificacao;

  //gerado construtor vazio da classe porque herdou construtor de FuncionarioPJ
  public Gerente() {
  }

  //implementado metodo calculaBonificacao() da interface
  @Override
  public void calculaBonificacao(Double porcentagemBonificacao) { //regra de bonificacao = [(remuner*perc/100) + R$100]
    this.valorBonificacao = (super.getValorRemuneracao() * (porcentagemBonificacao/100)) + 100d;
    //super sinaliza que valorRemuneracao vem da super classe FuncionarioPJ
  }

  //sobrescreve metodo toString() pra não mostrar end de memoria, neste caso indica com get o que será impresso
  @Override
  public String toString() {
    return "FuncionarioPJ{" +
        "nome='" + super.getNome() + '\'' +  //usado super pra mostrar heranca da superclasse FuncionarioCLT
        ", documento='" + super.getDocumento() + '\'' +
        ", endereco=" + super.getEndereco().getRua() +
        ", horasTrabalhadas=" + super.getHorasTrabalhadas() +
        ", valorHora=" + super.getValorHora() +
        ", valorRemuneracao=" + super.getValorRemuneracao() +
        ", valorBonificacao=" + this.valorBonificacao + //this indica que valorBonif... vem de dentro da classe Gerente
        '}';
  }
}
