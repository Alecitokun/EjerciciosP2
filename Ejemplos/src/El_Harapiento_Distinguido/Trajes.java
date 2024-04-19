package El_Harapiento_Distinguido;

public class Trajes
{
        public static double[] calcularPrecioFinal(double precio) {
            double[] resultado = new double[2];
            double descuento;
            if (precio > 2500.00) {
                descuento = precio * 0.15;
            } else {
                descuento = precio * 0.08;
            }
            resultado[0] = descuento;
            resultado[1] = precio - descuento;
            return resultado;
        }
    }

