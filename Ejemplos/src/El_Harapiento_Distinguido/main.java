package El_Harapiento_Distinguido;

public class main
{
        public static void main(String[] args) {
            double precio1 = 3000.00;
            double precio2 = 2000.00;

            double[] resultado1 = Trajes.calcularPrecioFinal(precio1);
            double[] resultado2 = Trajes.calcularPrecioFinal(precio2);

            System.out.println("Descuento para el traje de $" + precio1 + ": $" + resultado1[0]);
            System.out.println("Precio final para el traje de $" + precio1 + ": $" + resultado1[1]);

            System.out.println("Descuento para el traje de $" + precio2 + ": $" + resultado2[0]);
            System.out.println("Precio final para el traje de $" + precio2 + ": $" + resultado2[1]);
        }
    }

