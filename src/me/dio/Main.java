package me.dio;

import me.dio.models.Endereco;
import me.dio.models.Gerente;
import me.dio.models.OperadorDeCaixa;
import me.dio.models.Vendedor;

public class Main {

    public static void main(String[] args) {
        /*
        //exemplificação de passagem de rua pra endereço
        Endereco endereco = new Endereco();
        endereco.setRua("Endereço para essa rua"); //atribui rua a endereço
        System.out.println(endereco.getRua()); //imprime o retorno de get */

        //entrada pra todos os atributos da classe Endereco
        Endereco endereco =
            new Endereco("Rua funcionário",
                "Complemento endereço funcionário", "bairro funcionário");
        System.out.println(endereco); //imprime conteudo do objeto endereco
        System.out.println("-----");

        //entrada pra todos os atributos da classe Vendedor
        Vendedor vendedor = new Vendedor();
        vendedor.setNome("Camila Vendedora");
        vendedor.setDocumento("123.456.789-00");
        vendedor.setValorSalario(1000d);
        vendedor.setEndereco(endereco);
        vendedor.calculaBonificacao(2d);
        System.out.println(vendedor);
        System.out.println("-----");

        //entrada pra todos os atributos da classe OperadorDeCaixa
        OperadorDeCaixa operadorCaixa =
            new OperadorDeCaixa("Camila Op Caixa", "789.456.123-00", 2000d, endereco);
        //nesta entrada usa-se mesmo objeto criado no início do código, pois será igual pra todos os funcionarios
        System.out.println(operadorCaixa);
        System.out.println("-----");

        ////entrada pra todos os atributos da classe Gerente
        Gerente gerente = new Gerente(); //usa new vazio por ter construtor vazio
        gerente.setNome("Camila Gerente");
        gerente.setDocumento("456.123.789-00");
        gerente.setEndereco(endereco);
        gerente.setHorasTrabalhadas(20);
        gerente.setValorHora(100d);

        gerente.calculaRemuneracao(); //chama metodo pra calculo da remuneração
        gerente.calculaBonificacao(3.0); //chama metodo pra calculo da bonificação

        System.out.println(gerente);

    }
}
