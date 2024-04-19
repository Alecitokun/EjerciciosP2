package Consultorio;
import java.util.Scanner;
public class main
{
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Ingrese el número de cita: ");
            int numeroCita = scanner.nextInt();
            ConsultorioMedico.calcularCostoCitaYTratamiento(numeroCita);
        }
    }
