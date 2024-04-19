package El_Naufrago_Satisfecho;

public class Hamburguesas
{
        public static double calcularCostoTotal(int tipoHamburguesa, int cantidad) {
            double costoPorHamburguesa;

            if (tipoHamburguesa == 1) {
                costoPorHamburguesa = 20.00;
            } else if (tipoHamburguesa == 2) {
                costoPorHamburguesa = 25.00;
            } else {
                costoPorHamburguesa = 28.00;
            }
            double costoTotal = cantidad * costoPorHamburguesa;
            double cargoTarjeta = costoTotal * 0.05;

            return costoTotal + cargoTarjeta;
        }
    }

