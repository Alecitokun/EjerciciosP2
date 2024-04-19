package Chimefon;

public class Llamada
{
        public static double calcularCostoTiempo(int duracionLlamada) {
            double costoTiempo;

            if (duracionLlamada <= 5) {
                costoTiempo = duracionLlamada * 1.00;
            } else if (duracionLlamada <= 8) {
                costoTiempo = 5 * 1.00 + (duracionLlamada - 5) * 0.80;
            } else if (duracionLlamada <= 10) {
                costoTiempo = 5 * 1.00 + 3 * 0.80 + (duracionLlamada - 8) * 0.70;
            } else {
                costoTiempo = 5 * 1.00 + 3 * 0.80 + 2 * 0.70 + (duracionLlamada - 10) * 0.50;
            }
            return costoTiempo;
        }
        public static double calcularImpuesto(double costoTiempo, int dia, int turno) {
            double impuesto;
            if (dia == 1) {
                impuesto = costoTiempo * 0.03;
            } else if (dia == 2 && turno == 1) {
                impuesto = costoTiempo * 0.15;
            } else {
                impuesto = costoTiempo * 0.10;
            }
            return impuesto;
        }
        public static double calcularCostoTotal(int duracionLlamada, int dia, int turno) {
            double costoTiempo = calcularCostoTiempo(duracionLlamada);
            double impuesto = calcularImpuesto(costoTiempo, dia, turno);

            return costoTiempo + impuesto;
        }
    }

