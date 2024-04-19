package Consultorio;

public class ConsultorioMedico
{
        public static void calcularCostoCitaYTratamiento(int numeroCita) {
            double costoCita;
            double montoTratamiento;
            if (numeroCita <= 3) {
                costoCita = 200.00;
                montoTratamiento = numeroCita * 200.00;
            } else if (numeroCita <= 5) {
                costoCita = 150.00;
                montoTratamiento = 3 * 200.00 + (numeroCita - 3) * 150.00;
            } else if (numeroCita <= 8) {
                costoCita = 100.00;
                montoTratamiento = 3 * 200.00 + 2 * 150.00 + (numeroCita - 5) * 100.00;
            } else {
                costoCita = 50.00;
                montoTratamiento = 3 * 200.00 + 2 * 150.00 + 3 * 100.00 + (numeroCita - 8) * 50.00;
            }
            System.out.println("El costo de la cita es: $" + costoCita);
            System.out.println("El monto total pagado por el tratamiento es: $" + montoTratamiento);
        }
}

