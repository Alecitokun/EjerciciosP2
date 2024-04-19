package Cantidades;

public class DeterminadorM
{
        public static double encontrarMayor(double cantidad1, double cantidad2, double cantidad3) {
            double mayor;
            if (cantidad1 > cantidad2 && cantidad1 > cantidad3) {
                mayor = cantidad1;
            } else if (cantidad2 > cantidad1 && cantidad2 > cantidad3) {
                mayor = cantidad2;
            } else {
                mayor = cantidad3;
            }
            return mayor;
        }
    }

