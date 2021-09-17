package atividade4;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {

        ManipulaArquivo manip = new ManipulaArquivo();

        manip.escreverArquivo("nomes.txt");
        manip.lerArquivo("nomes.txt");
    }
}
