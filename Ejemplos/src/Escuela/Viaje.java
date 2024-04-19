package Escuela;

public class Viaje
{
        public static double calcularPagoAlumno(int numeroAlumnos) {
            double pagoAlumno;
            if (numeroAlumnos >= 100) {
                pagoAlumno = 65.00;
            } else if (numeroAlumnos >= 50) {
                pagoAlumno = 70.00;
            } else if (numeroAlumnos >= 30) {
                pagoAlumno = 95.00;
            } else {
                pagoAlumno = 0.00;
            }
            return pagoAlumno;
        }
        public static double calcularCostoViaje(int numeroAlumnos) {
            double pagoAlumno = calcularPagoAlumno(numeroAlumnos);
            double costoViaje;

            if (pagoAlumno != 0.00) {
                costoViaje = numeroAlumnos * pagoAlumno;
            } else {
                costoViaje = 4000.00;
            }
            return costoViaje;
        }
    }

