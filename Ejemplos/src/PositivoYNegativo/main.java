package PositivoYNegativo;

public class main {
        public static void main(String[] args) {
            String s = "Números positivos:";
            System.out.println(s);
            System.out.println("9 es positivo? " + esPositivo(5));
            System.out.println("0 es positivo? " + esPositivo(0));
            System.out.println("-6 es positivo? " + esPositivo(-3));

            System.out.println("Números negativos:");
            System.out.println("9 es negativo? " + esNegativo(5));
            System.out.println("0 es negativo? " + esNegativo(0));
            System.out.println("-7 es negativo? " + esNegativo(-3));
    }
    public static boolean esPositivo(int numero) {

        return numero > 0;
    }
    public static boolean esNegativo(int numero) {
            return numero < 0;
 }
}