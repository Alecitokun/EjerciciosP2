package Compañia;

public class Cviaje
{
        public static void calcularCostoViaje(String tipoAutobus, int numeroPersonas) {
            double costoPorPersona;
            double costoTotal;

            if (tipoAutobus.equals("A")) {
                costoPorPersona = 2.0;
            } else if (tipoAutobus.equals("B")) {
                costoPorPersona = 2.5;
            } else {
                costoPorPersona = 3.0;
            }
            if (numeroPersonas >= 20) {
                costoTotal = numeroPersonas * costoPorPersona;
            } else {
                costoTotal = 20 * costoPorPersona;
            }
            System.out.println("El costo total del viaje es: $" + costoTotal);
            System.out.println("El costo por persona del viaje es: $" + costoPorPersona);
        }
    }

