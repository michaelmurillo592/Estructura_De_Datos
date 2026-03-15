package TallerCollectionsyGenerics.GestionTareas.septima;

public class Main {

    public static void main(String[] args) {

        Comparador<Integer> comparadorNumeros = new ComparadorNumeros();
        Comparador<String> comparadorCadenas = new ComparadorCadenas();

        int resultadoNumeros = comparadorNumeros.comparar(20, 10);
        int resultadoCadenas = comparadorCadenas.comparar("gato", "perro");

        System.out.println("Comparación de números: " + resultadoNumeros);
        System.out.println("Comparación de cadenas: " + resultadoCadenas);

        // Interpretación de resultados
        if (resultadoNumeros > 0) {
            System.out.println("20 es mayor que 10");
        } else if (resultadoNumeros < 0) {
            System.out.println("20 es menor que 10");
        } else {
            System.out.println("Son iguales");
        }

        if (resultadoCadenas > 0) {
            System.out.println("gato es mayor que perro");
        } else if (resultadoCadenas < 0) {
            System.out.println("gato es menor que perro");
        } else {
            System.out.println("Las cadenas son iguales");
        }

    }
}