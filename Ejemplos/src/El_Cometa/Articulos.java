package El_Cometa;

public class Articulos
{
        public static double calcularPrecioVenta(int clave, double costoMateriaPrima) {
            double costoManoObra;
            double gastoFabricacion;

            if (clave == 3 || clave == 4) {
                costoManoObra = 0.75 * costoMateriaPrima;
            } else if (clave == 1 || clave == 5) {
                costoManoObra = 0.80 * costoMateriaPrima;
            } else {
                costoManoObra = 0.85 * costoMateriaPrima;
            }
            if (clave == 2 || clave == 5) {
                gastoFabricacion = 0.30 * costoMateriaPrima;
            } else if (clave == 3 || clave == 6) {
                gastoFabricacion = 0.35 * costoMateriaPrima;
            } else {
                gastoFabricacion = 0.28 * costoMateriaPrima;
            }
            double costoProduccion = costoMateriaPrima + costoManoObra + gastoFabricacion;
            return costoProduccion + 0.45 * costoProduccion;
        }
    }

