package Pueblo_Desconocido;

public class LimiteCredito
{
        public static double calcularNuevoLimiteCredito(int tipoTarjeta, double limiteActual) {
            double aumento;
            if (tipoTarjeta == 1) {
                aumento = 0.25 * limiteActual;
            } else if (tipoTarjeta == 2) {
                aumento = 0.35 * limiteActual;
            } else if (tipoTarjeta == 3) {
                aumento = 0.40 * limiteActual;
            } else {
                aumento = 0.50 * limiteActual;
            }
            return limiteActual + aumento;
        }
    }
