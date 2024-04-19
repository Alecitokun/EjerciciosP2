package El_Naufrago_Satisfecho;
import java.util.Scanner;
public class main
{
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Ingrese el tipo de hamburguesa (1 para sencilla, 2 para doble, 3 para triple): ");
            int tipoHamburguesa = scanner.nextInt();
            System.out.print("Ingrese la cantidad de hamburguesas: ");
            int cantidad = scanner.nextInt();
            double costoTotalFinal = Hamburguesas.calcularCostoTotal(tipoHamburguesa, cantidad);
            System.out.println("El costo total a pagar es: $" + costoTotalFinal);

        }
    }

