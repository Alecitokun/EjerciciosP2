package Cantidades;

public class main
{
        public static void main(String[] args) {
            double cantidad1 = 20.5;
            double cantidad2 = 50.3;
            double cantidad3 = 85.7;
            double mayor = DeterminadorM.encontrarMayor(cantidad1, cantidad2, cantidad3);
            System.out.println("La mayor cantidad es: " + mayor);
        }
    }

