package Paqueteria_Internacional;
import java.util.Scanner;
public class main
{
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Ingrese el peso del paquete (en kilogramos): ");
            double peso = scanner.nextDouble();

            scanner.nextLine(); // Limpiar el buffer del scanner

            System.out.print("Ingrese la zona de destino (America del Norte, America Central, America del Sur, Europa o Asia): ");
            String zona = scanner.nextLine();

            double costo = Paqueteria.calcularCostoPaqueteria(peso, zona);

            if (costo != 0.0) {
                System.out.println("El costo del servicio de paquetería es: $" + costo);
            }

        }
    }

