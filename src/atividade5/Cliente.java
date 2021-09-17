package atividade5;

public class Cliente {

    private static int id = 0;
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
                "id: " + id +
                ", nome: '" + nome + '\'' +
                ", cpf: '" + cpf + '\'' +
                ", endereco: '" + endereco + '\'' +
                ", email: '" + email + '\'' +
                ", telefone: '" + telefone + '\'' +
                '}';
    }


    public boolean nomeValido(String nome) {
        this.nome = nome;
        return nome.matches("(?i)(^[a-z]+)[a-z .,-]((?! .,-)$){3,50}$");
    }



}
