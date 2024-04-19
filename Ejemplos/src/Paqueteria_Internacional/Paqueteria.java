package Paqueteria_Internacional;

public class Paqueteria
{
        public static double calcularCostoPaqueteria(double peso, String zona) {
            double costo = 0.0;
            if (zona.equalsIgnoreCase("America del Norte")) {
                if (peso <= 20) {
                    costo = 24.0;
                } else {
                    costo = 34.0;
                }
            } else if (zona.equalsIgnoreCase("America Central")) {
                if (peso <= 20) {
                    costo = 20.0;
                } else {
                    costo = 30.0;
                }
            } else if (zona.equalsIgnoreCase("America del Sur")) {
                if (peso <= 20) {
                    costo = 30.0;
                } else {
                    costo = 45.0;
                }
            } else if (zona.equalsIgnoreCase("Europa")) {
                if (peso <= 20) {
                    costo = 60.0;
                } else {
                    costo = 90.0;
                }
            } else if (zona.equalsIgnoreCase("Asia")) {
                if (peso <= 20) {
                    costo = 70.0;
                } else {
                    costo = 110.0;
                }
            } else {
                System.out.println("Zona no válida");
            }
            return costo;
        }
    }

