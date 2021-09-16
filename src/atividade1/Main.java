package atividade1;

public class Main {
    public static void main(String[] args) {

        Pessoa carlos = new Pessoa(
                "Carlos", "amaral, 2", "11-98836241", 23, 1.70
        );

        Pessoa pedro = new Pessoa(
                "Pedro", "lobato, 23", "11-9000181", 16, 1.60
        );

        Pessoa vanusa = new Pessoa(
                "Vanusa", "comissao, 21", "11-3297673", 40, 1.70
        );
        Pessoa stela = new Pessoa(
                "Stela", "vandune, 10", "11-9873525", 20, 1.50
        );

        Pessoa luisa = new Pessoa(
                "Luisa", "marco, 300", "11-923564356", 48, 1.67
        );

        Pessoa laura = new Pessoa(
                "Laura", "marco, 300", "11-3297673", 60, 1.60
        );

        Pessoa flavio = new Pessoa(
                "Flavio", "comissao, 21", "11-3297673", 40, 1.70
        );

        Pessoa rose = new Pessoa(
                "Rose", "antonio madi, 200", "11-90835242", 28, 1.63
        );

        Pessoa paulo = new Pessoa(
                "Paulo", "oriental, 300", "11-90000000", 30, 1.70
        );

        Pessoa leo = new Pessoa(
                "Leonardo", "augusta, 21", "11-3297673", 31, 1.70
        );

        Agenda agenda = new Agenda();

        /*
            Armazenando pessoas na agenda
         */
        System.out.println("************** Adicionando na agenda ****************");

        agenda.armazenarPessoa(carlos);
        agenda.armazenarPessoa(pedro);
        agenda.armazenarPessoa(vanusa);
        agenda.armazenarPessoa(stela);
        agenda.armazenarPessoa(luisa);
        agenda.armazenarPessoa(laura);
        agenda.armazenarPessoa(flavio);
        agenda.armazenarPessoa(rose);
        agenda.armazenarPessoa(paulo);
        agenda.armazenarPessoa(leo);


        System.out.println("**************** Removendo da agenda **************");
        agenda.removerPessoa("Leonardo");

        System.out.println("************   Buscando a pessoa na agenda **************");
        agenda.buscarPessoa("Rose");

        System.out.println("************ exibindo todas as pessoas da agenda **************");
        agenda.exibirTodaAgenda();

        System.out.println("***************** Apresentando uma pessoa da agenda **************");
        agenda.exibirPessoa(2);

        System.out.println("******* exibindo a agenda ordenada por nome em ordem alfabética ********");
        agenda.listarPessoasEmOrdemAlfabeticaDeNome();

        System.out.println("******* exibindo a agenda ordenada por endereço em ordem alfabética ********");
        agenda.listarPessoasEmOrdemAlfabeticaDeEndereco();

        System.out.println("*************  Exibindo pessoas por idade em ordem decrescente *************");
        agenda.listarPessoasPorIdade();
    }
}
