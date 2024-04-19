package Pagos;

public class main
{
        public static void main(String[] args) {
            int cantidad1 = 500;
            int cantidad2 = 1500;

            double costo1 = CalcularLapiceros.calcularCosto(cantidad1);
            double costo2 = CalcularLapiceros.calcularCosto(cantidad2);

            System.out.println("Costo de " + cantidad1 + " lápices: $" + costo1);
            System.out.println("Costo de " + cantidad2 + " lápices: $" + costo2);
        }
    }

