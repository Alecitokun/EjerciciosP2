package Pueblo_Desconocido;
import java.util.Scanner;

public class main
{
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Ingrese el tipo de tarjeta de crédito (1, 2, 3 o cualquier otro número): ");
            int tipoTarjeta = scanner.nextInt();

            System.out.print("Ingrese el límite de crédito actual: ");
            double limiteActual = scanner.nextDouble();

            double nuevoLimite = LimiteCredito.calcularNuevoLimiteCredito(tipoTarjeta, limiteActual);

            System.out.println("El nuevo límite de crédito es: " + nuevoLimite);

        }
    }

