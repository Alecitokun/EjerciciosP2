package La_Langosta_Ahumada;

public class CalcularPre
{
        public static double calcularPresupuesto(int numeroPersonas) {
            double costoPlatillo;
            if (numeroPersonas > 300) {
                costoPlatillo = 75.00;
            } else if (numeroPersonas > 200) {
                costoPlatillo = 85.00;
            } else {
                costoPlatillo = 95.00;
            }
            return numeroPersonas * costoPlatillo;
        }
    }

