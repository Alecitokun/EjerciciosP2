package Vinicultores;

public class main
{
        public static void main(String[] args) {
            char tipoUva = 'A';
            int tamañoUva = 3;
            double precioFinal = Cuva.calcularPrecioFinal(tipoUva, tamañoUva);
            System.out.println("El precio final por kilo de uva es: $" + precioFinal);
        }
    }
