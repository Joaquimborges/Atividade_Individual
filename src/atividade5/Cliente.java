package atividade5;

import java.net.http.HttpResponse;
import java.util.InputMismatchException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Cliente {

    private static int id = 1;
    private String nome, cpf, endereco;
    private String email, telefone;

    public int getId() {
        return id++;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public Cliente() {
    }

    public Cliente(String nome, String cpf, String endereco, String email, String telefone) {
        this.nome = nome;
        this.cpf = cpf;
        this.endereco = endereco;
        this.email = email;
        this.telefone = telefone;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "id: " + id + '\n' +
                ", nome: '" + nome + '\n' +
                ", cpf: '" + cpf + '\n' +
                ", endereco: '" + endereco + '\n' +
                ", email: '" + email + '\n' +
                ", telefone: '" + telefone + '\n' +
                '}';
    }


    public boolean nomeValido(String nome) {
        this.nome = nome;
        return nome.matches("(?i)(^[a-z]+)[a-z .,-]((?! .,-)$){3,50}$");
    }


    public boolean cpfValido(String cpf) {
        this.cpf = cpf;
        Pattern pattern = Pattern.compile("(^\\d{3}\\x2E\\d{3}\\x2E\\d{3}\\x2D\\d{2}$)");
        Matcher matcher = pattern.matcher(cpf);
        return matcher.matches();
    }

    public boolean emailValido(String email) {
        this.email = email;
        Pattern pattern = Pattern.compile("^[a-zA-Z0-9.!#$%&'*+/=?^_`{|}~-]+@((\\[[0-9]{1,3}\\.[0-9]{1,3}\\" +
                ".[0-9]{1,3}\\.[0-9]{1,3}\\])|(([a-zA-Z\\-0-9]+\\.)+[a-zA-Z]{2,}))$");
        Matcher matcher = pattern.matcher(email);
        return matcher.matches();
    }

    public boolean telefoneValido(String telefone) {
        this.telefone = telefone;
        Pattern pattern = Pattern.compile("^\\(?(?:[14689][1-9]|2[12478]|3[1234578]|5[1345]|7[134579])\\)?" +
                " ?(?:[2-8]|9[1-9])[0-9]{3}\\-?[0-9]{4}$");
        Matcher matcher = pattern.matcher(telefone);

        return matcher.matches();
    }

    public void cadastrarCliente(String nome, String cpf, String endereco, String email, String telefone) {
        if (nomeValido(nome) && cpfValido(cpf) &&
            emailValido(email) && telefoneValido(telefone)) {
            Cliente cliente = new Cliente(nome, cpf, endereco, email, telefone);
            System.out.println(cliente);
        }else {
            System.out.println("O cliente não pode ser cadastrado, dados inválidos!");
        }
    }



}
