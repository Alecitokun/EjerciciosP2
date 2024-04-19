package Compañia;
import java.util.Scanner;

public class main
{
    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Ingrese el tipo de autobús (A, B o C): ");
            String tipoAutobus = scanner.nextLine();
            System.out.print("Ingrese el número de personas: ");
            int numeroPersonas = scanner.nextInt();
            Cviaje.calcularCostoViaje(tipoAutobus, numeroPersonas);

        }
    }

