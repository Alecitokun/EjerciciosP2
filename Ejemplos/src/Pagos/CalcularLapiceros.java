package Pagos;

public class CalcularLapiceros
{
        public static double calcularCosto(int cantidad) {
            double costo;
            if (cantidad >= 1000) {
                costo = 0.85 * cantidad;
            } else {
                costo = 0.90 * cantidad;
            }
            return costo;
        }
    }

