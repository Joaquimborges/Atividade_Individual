package atividade5;

import java.util.InputMismatchException;

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

    public boolean cpfValido(String cpf) {
        this.cpf = cpf;
        if (cpf.equals("00000000000") || cpf.equals("11111111111") ||
                cpf.equals("22222222222") || cpf.equals("33333333333") ||
                cpf.equals("44444444444") || cpf.equals("55555555555") ||
                cpf.equals("66666666666") || cpf.equals("77777777777") ||
                cpf.equals("88888888888") || cpf.equals("99999999999") ||
                (cpf.length() != 11))
            return(false);

        char dig10, dig11;
        int sm, i, r, num, peso;


        try {
            sm = 0;
            peso = 10;
            for (i=0; i<9; i++) {

                num = (int)(cpf.charAt(i) - 48);
                sm = sm + (num * peso);
                peso = peso - 1;
            }

            r = 11 - (sm % 11);
            if ((r == 10) || (r == 11))
                dig10 = '0';
            else dig10 = (char)(r + 48);


            sm = 0;
            peso = 11;
            for(i=0; i<10; i++) {
                num = (int)(cpf.charAt(i) - 48);
                sm = sm + (num * peso);
                peso = peso - 1;
            }

            r = 11 - (sm % 11);
            if ((r == 10) || (r == 11))
                dig11 = '0';
            else dig11 = (char)(r + 48);

            /*
                Verifica se os digits calculados conferem com os digits informados.
             */
            return (dig10 == cpf.charAt(9)) && (dig11 == cpf.charAt(10));
        } catch (InputMismatchException erro) {
            return(false);
        }
    }



}
