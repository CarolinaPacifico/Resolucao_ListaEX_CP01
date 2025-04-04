package Exercicio6;

public class Main {
    public static void main(String[] args) {
        Hora h1 = new Hora(21, 35, 50);
        Hora h2 = new Hora(12, 10, 40);
        Hora h3 = new Hora(5, 4, 65);

        System.out.println(h1.formatar());
        System.out.println(h2.formatar());
        System.out.println(h3.formatar());
    }
}
