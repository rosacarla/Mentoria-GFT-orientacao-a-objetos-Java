# 🏗️MENTORIA: ABASTRAINDO SITUAÇÕES DO MUNDO REAL COM ORIENTAÇÃO A OBJETOS

O repositório foi copiado da versão original elaborada pela profª Camila Cavalcanti a fim de manter registrados os conteúdos e as atividades realizadas durante a sessão de mentoria que integra o programa do bootcamp _GFT Start Woman Java_, disponibilizado na plataforma da Digital Innovation One Inc. Esta mentoria tem o objetivo de praticar algumas das principais ferramentas da Orientação a Objetos: ABSTRAÇÃO, ENCAPSULAMENTO, HERANÇA, COMPOSIÇÃO E POLIMORFISMO por meio de um projeto Java. Os slides podem ser acessados neste [link](https://docs.google.com/presentation/d/1fjYpumCvVVNZQgwf-FeCvUR2ADNLnnCD/edit?usp=sharing&ouid=107351545544725249935&rtpof=true&sd=true).  

---

## ☑️ Pré-Requisitos  
* Conhecer a sintaxe da linguagem Java  
* Instalar Java JDK 8+  
* IDE para desenvolvimento Java (IntelliJ em uso pela professora)  

---  
    
## 🎯 Desafio
Modelar entidades de uma aplicação de <strong>Gerenciamento de Colaboradores</strong> de uma loja. Dentre as funcionalidades a serem implementadas, o sistema terá a função de calcular bonificação de colaboradores da loja conforme estas regras:  
- **Vendedor** é um Funcionário CLT e tem o benefício de bonificação.  
- **Operador de Caixa** é um funcionário CLT, mas não tem o benefício da bonificação.  
- **Gerente** é um Funcionário PJ e tem o benefício da bonificação.  
- Dados dos Colaboradores:  
    * Vendedor = [nome, documento, salario, valor da bonificação e endereço]  
    * Operador de Caixa = [nome, documento, salario e endereço]  
    * Gerente = [nome, documento, horas trabalhadas, valorHora, endereço e valor da bonificação]  
        
----

## 📚 Paradigma de Programação Orientado a Objetos (POO)      
<p align="center">
<img src="https://materiais.imd.ufrn.br/materialV2/assets/imagens/programacao-orientada-a-objetos/prog_orient_a_obj_01_f04_l.jpg" width="500" height="300" alt="pilares-POO">
</p>

A visão de Orientação a Objetos (OO) é aquela de um mundo de objetos que interagem. Este paradigma é um modelo de análise, projeto e programação baseado na aproximação entre o mundo real e o mundo virtual, através da criação e interação entre classes, atributos, métodos, objetos, entre outros. A observação do mundo real compõe o princípio da ABSTRAÇÃO, sendo considerada a base da Orientação a Objetos. São 4 os pilares principais do POO: **ENCAPSULAMENTO, HERANÇA, COMPOSIÇÃO E POLIMORFISMO.**

ENCAPSULAMENTO: encapsular significa esconder a implementação dos objetos. O encapsulamento favorece principalmente dois aspectos de um sistema: a manutenção e a evolução. Exemplo de encapsulamento da classe Endereço em Main:
``` java
import me.dio.models.Endereco;
import me.dio.models.Gerente;
import me.dio.models.OperadorDeCaixa;
import me.dio.models.Vendedor;

public class Main {

    public static void main(String[] args) {
       //entrada pra todos os atributos da classe Endereco
        Endereco endereco =
            new Endereco("Rua funcionário",
                "Complemento endereço funcionário", "bairro funcionário");
        System.out.println(endereco); //imprime conteudo do objeto endereco
        System.out.println("-----");
```
[continuar lendo código...](https://github.com/rosacarla/Mentoria-GFT-orientacao-a-objetos-Java/blob/master/src/me/dio/Main.java)  

HERANÇA: permite que objetos sejam referenciados como pai e filhos, em que os objetos filhos herdam todas as características do objeto pai, mas o objeto pai nada herda do filho. Isso reduz a duplicação de código-fonte. Exemplo da classe FuncionarioPJ:

``` java
package me.dio.models;

import me.dio.models.Endereco;

public abstract class FuncionarioPJ { //classe abstrata só pra herança de classe Gerente
  private String nome;
  private String documento;
  private Endereco endereco;
  private Integer horasTrabalhadas;
  private Double valorHora;
  private Double valorRemuneracao; 
```
[continuar lendo código...](https://github.com/rosacarla/Mentoria-GFT-orientacao-a-objetos-Java/blob/master/src/me/dio/models/FuncionarioPJ.java)
    
COMPOSIÇÃO: busca representar as relações que os objetos devem ter, baseando-se nas relações que existem na vida real. Isso faz com que os objetos sejam reaproveitados, evitando duplicidade e mantendo a simplicidade. Exemplo da classe FuncionarioCLT:
``` java
public abstract class FuncionarioCLT {  //nao se faz new de abstract class; dá erro de compilação
  //criados atributos da classe incluindo Endereco
  protected String nome; //modificador protected permite acesso a classes filhas e proíbe a qualquer outro acesso ext.
  protected String documento;
  protected Double valorSalario;
  protected Endereco endereco; //classe Endereco é atributo dentro de FuncionarioCLT, caracteriza Composição

  //gera construtor vazio
  public FuncionarioCLT() {
  }
```
[continuar lendo o código...](https://github.com/rosacarla/Mentoria-GFT-orientacao-a-objetos-Java/blob/master/src/me/dio/models/FuncionarioCLT.java)  

POLIMORFISMO: podemos transformar objetos diferentes em objetos que conseguem trocar mensagem por meio da generalização de suas características. Exemplo da classe CalculaBonificação: 

``` java
package me.dio.models;

//interface = contrato para todas classes implementarem a interface nesse tipo de calculo
public interface CalculaBonificacao {  //interface sempre é abstrata, caracteriza polimorfismo

  //metodo pra calcular bonificacao
  void calculaBonificacao(Double porcentagemBonificacao); //metodo pede porcentagem pra calculo
}
```

---  

## 🔡 Conceitos Fundamentais POO

* DOMÍNIO: domínio da aplicação, também conhecida como camada de negócio ou de objetos de negócio, é aquela onde estão localizadas as classes que fazem parte do domínio do problema, ou seja, classes correspondentes a objetos que fazem parte da descrição do problema.

* CLASSE: elemento do código que tem a função de representar objetos do mundo real. Dentro dela é comum declararmos atributos e métodos, que representam, respectivamente, as características e comportamentos desse objeto.

* ATRIBUTO: são basicamente a estrutura de dados que vai representar a classe. Os atributos também são conhecidos como VARIÁVEL DE CLASSE, e podem ser divididos em dois tipos básicos: atributos de instância e de classe.

* VARIÁVEL: uma “região de memória (do computador) previamente identificada cuja finalidade é armazenar os dados ou informações de um programa por um determinado espaço de tempo”.

* MÉTODO: representam os estados e ações dos objetos e classes.

* OBJETO: é um "molde" de uma determinada classe, que passa a existir a partir de uma instância da classe. A classe define o comportamento do objeto, usando atributos (propriedades) e métodos (ações). Objeto em ciência da computação, é uma referência a um local da memória que possui um valor. Um objeto pode ser uma variável, função, ou estrutura de dados.

* INSTÂNCIA: a instância de uma classe é um novo objeto criado dessa classe, com o operador new. Instanciar uma classe é criar um novo objeto do mesmo tipo dessa classe. Uma classe somente poderá ser utilizada após ser instanciada.

---  

<h2 align="center">📝 <a href="https://github.com/rosacarla/Mentoria-GFT-orientacao-a-objetos-Java/tree/master/java-classes-poo/src/dio/com/java">Resolução de Exercícios</a></h2>

---
