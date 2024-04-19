package Chimefon;

public class main
{
        public static void main(String[] args) {
            int duracionLlamada = 12;
            int dia = 2;
            int turno = 2;
            double costoTiempo = Llamada.calcularCostoTiempo(duracionLlamada);
            double impuesto = Llamada.calcularImpuesto(costoTiempo, dia, turno);
            double costoTotal = Llamada.calcularCostoTotal(duracionLlamada, dia, turno);
            System.out.println("Costo por tiempo de llamada: $" + costoTiempo);
            System.out.println("Impuesto: $" + impuesto);
            System.out.println("Costo total de la llamada: $" + costoTotal);
        }
    }
