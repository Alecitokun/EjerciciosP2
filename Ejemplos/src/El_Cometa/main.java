package El_Cometa;
import java.util.Scanner;

public class main
{
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Ingrese la clave del artículo (1, 2, 3, 4, 5 o 6): ");
            int clave = scanner.nextInt();

            System.out.print("Ingrese el costo de la materia prima: ");
            double costoMateriaPrima = scanner.nextDouble();

            double precioVenta = Articulos.calcularPrecioVenta(clave, costoMateriaPrima);

            System.out.println("El precio de venta del artículo es: $" + precioVenta);

        }
    }

