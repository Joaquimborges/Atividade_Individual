package atividade2;


public class ManipulaString {

    public static String inverteString(String nome) {
        return new StringBuffer(nome.toUpperCase()).reverse().toString();
    }


    public static void palindromo(String nome) {
       String auxiliar = "";
       for (int i = (nome.length() -1); i >=0; i--) {
           auxiliar += nome.charAt(i);
       }

       if (auxiliar.toLowerCase()
               .replaceAll(" ", "")
               .equals(nome.toLowerCase().replaceAll(" ", "")))  {

           System.out.println("É palíndromo");
       } else {
           System.out.println("Não é palíndromo");
       }

    }








}
