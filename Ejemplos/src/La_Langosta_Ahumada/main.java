package La_Langosta_Ahumada;

public class main
{
        public static void main(String[] args) {
            int numeroPersonas1 = 200;
            int numeroPersonas2 = 650;
            int numeroPersonas3 = 450;

            double presupuesto1 = CalcularPre.calcularPresupuesto(numeroPersonas1);
            double presupuesto2 = CalcularPre.calcularPresupuesto(numeroPersonas2);
            double presupuesto3 = CalcularPre.calcularPresupuesto(numeroPersonas3);

            System.out.println("Presupuesto para " + numeroPersonas1 + " personas: $" + presupuesto1);
            System.out.println("Presupuesto para " + numeroPersonas2 + " personas: $" + presupuesto2);
            System.out.println("Presupuesto para " + numeroPersonas3 + " personas: $" + presupuesto3);
        }
    }

