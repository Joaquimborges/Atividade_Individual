package atividade3;

public class Retangulo {


    public static void calculaArea(double ladoA, double ladoB) {
        double area = ladoA * ladoB;
        System.out.println(area);
    }


    public static void calculaPerimetro(double ladoA, double ladoB) {
        double perimetro = (ladoA * 2) + (ladoB * 2);
        System.out.println(perimetro);
    }

/*
    Considerando que sempre será utilizado cerca
    de 10% a mais da area por ser retangulo
 */
    public static void quantidadePiso(double areaLajota, double areaTotal) {
        double qtdLajotas = areaTotal / areaLajota;
        System.out.println(qtdLajotas + (10.0 / 100));
    }

    public static void quantidadeRodape(double comprimentoLajota, double perimetro){
        double qtdRodape = perimetro / comprimentoLajota;
        System.out.println(Math.ceil(qtdRodape + (15.0 / 100)));

    }










}
