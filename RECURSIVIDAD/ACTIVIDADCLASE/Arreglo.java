package RECURSIVIDAD.ACTIVIDADCLASE;

public class Arreglo {

    public static void main(String[] arg) {

        int[] arreglo = {2, 4, 1, 6, 5, 7};

        int mayor = obtenerMayorIterativo(arreglo);
        System.out.println("El mayor (iterativo) es: " + mayor);

        int mayor2 = obtenerMayorRecursivo(arreglo);
        System.out.println("El mayor (recursivo) es: " + mayor2);
    }

    // Método recursivo público
    private static int obtenerMayorRecursivo(int[] arreglo) {
        return obtenerMayorRecursivo(arreglo, 0, arreglo[0]);
    }

    // Método recursivo privado auxiliar
    private static int obtenerMayorRecursivo(int[] arreglo, int i, int mayor) {
        if (i == arreglo.length) {
            return mayor;
        }

        if (arreglo[i] > mayor) {
            mayor = arreglo[i];
        }

        return obtenerMayorRecursivo(arreglo, i + 1, mayor);
    }

    // Método iterativo
    private static int obtenerMayorIterativo(int[] arreglo) {
        int mayor = arreglo[0];

        for (int i = 1; i < arreglo.length; i++) {
            if (arreglo[i] > mayor) {
                mayor = arreglo[i];
            }
        }

        return mayor;
    }
}
