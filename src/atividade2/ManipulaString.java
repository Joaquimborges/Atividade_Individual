package atividade2;


public class ManipulaString {

    public StringBuilder inverteString(String nome) {
        StringBuilder invert = new StringBuilder();
        for (int i = (nome.length() -1); i >=0; i--) {
            invert.append(nome.charAt(i));
        }
        return invert;
    }


    public void palindromo(String nome) {
       StringBuilder auxiliar = new StringBuilder();
       for (int i = (nome.length() -1); i >=0; i--) {
           auxiliar.append(nome.charAt(i));
       }

       if (auxiliar.toString().toLowerCase()
               .replaceAll(" ", "")
               .equals(nome.toLowerCase().replaceAll(" ", "")))  {

           System.out.println("É palíndromo");
       } else {
           System.out.println("Não é palíndromo");
       }

    }








}
