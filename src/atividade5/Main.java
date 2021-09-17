package atividade5;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String nome, cpf, endereco, email, telefone;
        Cliente c = new Cliente();

        Scanner scan = new Scanner(System.in);

        System.out.println("Entre com o seu nome: ");
        nome = scan.nextLine();


        System.out.println("Entre com o seu cpf: ");
        cpf = scan.nextLine();


        System.out.println("Entre com o seu endereço: ");
        endereco = scan.nextLine();


        System.out.println("Agora entre com o seu email: ");
        email = scan.nextLine();


        System.out.println("Finalmente, entre com o seu telefone: ");
        telefone = scan.nextLine();

        c.cadastrarCliente(nome, cpf, endereco, email, telefone);



    }
}
