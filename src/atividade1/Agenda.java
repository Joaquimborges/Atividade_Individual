package atividade1;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Agenda {

    private List<Pessoa> pessoaList = new ArrayList<>();


    public void armazenarPessoa(Pessoa pessoa) {
        pessoaList.add(pessoa);
        System.out.println("Pessoa armazenada com sucesso!");
    }

    public void removerPessoa(String nome){
        pessoaList.removeIf(pessoa -> pessoa.getNome().equals(nome));
        System.out.println("Pessoa removida da agenda!");
    }

    public int buscarPessoa(String nome){
        for (Pessoa pessoa : pessoaList) {
            if (pessoa.getNome().equals(nome)) {
                int posicao = pessoaList.indexOf(pessoa);
                System.out.println(posicao);
            }
        }
        return 0;
    }

    public void exibirTodaAgenda() {
        pessoaList
                .forEach(pessoa -> System.out.println(pessoa.toString()));
    }

    public void exibirPessoa(int index) {
        System.out.println(pessoaList.get(index));
        }


    public void listarPessoasEmOrdemAlfabeticaDeNome() {
        pessoaList.stream()
                .sorted(Comparator.comparing(Pessoa::getNome))
                .forEach(System.out::println);
    }


    public void listarPessoasEmOrdemAlfabeticaDeEndereco() {
        pessoaList.stream()
                .sorted(Comparator.comparing(Pessoa::getEndereco))
                .forEach(System.out::println);
    }

    public void listarPessoasPorIdade() {
        pessoaList.stream()
                .sorted((p1, p2) -> p2.getIdade().compareTo(p1.getIdade()))
                .forEach(System.out::println);
    }



}











