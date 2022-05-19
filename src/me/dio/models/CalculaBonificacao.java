package me.dio.models;

//interface = contrato para todas classes implementarem a interface nesse tipo de calculo
public interface CalculaBonificacao {  //interface sempre é abstrata, caracteriza polimorfismo

  //metodo pra calcular bonificacao
  void calculaBonificacao(Double porcentagemBonificacao); //metodo pede porcentagem pra calculo
}
