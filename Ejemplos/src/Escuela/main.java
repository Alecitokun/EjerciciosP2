package Escuela;

public class main
{
        public static void main(String[] args) {
            int numeroAlumnos = 60;
            double pagoAlumno = Viaje.calcularPagoAlumno(numeroAlumnos);
            double costoViaje = Viaje.calcularCostoViaje(numeroAlumnos);
            System.out.println("El pago por alumno es: $" + pagoAlumno);
            System.out.println("El costo total del viaje es: $" + costoViaje);
        }
    }

