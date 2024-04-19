package Vinicultores;

public class Cuva
{
        public static double calcularPrecioFinal(char tipoUva, int tamañoUva) {
            double precioInicial;
            double precioFinal;
            if (tipoUva == 'A') {
                precioInicial = 100.00;
                if (tamañoUva == 1) {
                    precioFinal = precioInicial + 20.00;
                } else {
                    precioFinal = precioInicial + 30.00;
                }
            } else {
                precioInicial = 80.00;
                if (tamañoUva == 1) {
                    precioFinal = precioInicial - 30.00;
                } else {
                    precioFinal = precioInicial - 50.00;
                }
            }
            return precioFinal;
        }
    }

