package atividade4;

import java.io.*;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;

public class ManipulaArquivo {

    public void escreverArquivo(String arquivo) {
        try {
            FileWriter fw = new FileWriter(arquivo);
            fw.append("Pedro ");
            fw.append("Thiago ");
            fw.append("Maria ");
            fw.append("Alexandre ");
            fw.append("João");
            fw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    public void lerArquivo(String arquivo) throws IOException{

            FileReader fr = new FileReader(arquivo);
            BufferedReader bf = new BufferedReader(fr);
            List<String> nameList = new ArrayList<>();
            while (true) {
                nameList.add(bf.readLine());
                System.out.println(nameList);
                break;

            }
            bf.close();
    }
}
