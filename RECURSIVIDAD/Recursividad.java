package RECURSIVIDAD;

public class Recursividad {

    /**public static void main(String[] args) {
        int n = 5;
        imprimirMatruskaIterativa(n);
    }
    private static void imprimirMatruskaIterativa(int n) {
        for (int i = n; i >= 1 ; i--) {
            System.out.println("abriendo matruska "+ i);
        }
        for (int i = 1; i <=n ; i++) {
            System.out.println("cerrando matruska "+i);
        }
    }
*/
    /**public static void main(String[] args) {
        int n = 5;
        imprimirMatruskaRecursiva(n);
    }

    private static void imprimirMatruskaRecursiva(int n) {
        if (n == 1) {
            System.out.println("abriendo matruska " + n);
            System.out.println("cerrando matruska " + n);
        } else {
            System.out.println("abriendo matruska " + n);
            imprimirMatruskaRecursiva(n - 1);
            System.out.println("cerrando matruska " + n);
        }
    }
*/
    public static void main (String[] args) {
        int[] arreglo = {1,2,3,4,5};
        imprimirArreglo(arreglo, 0);
    }
    public static void imprimirArreglo(int[] arreglo, int i) {
        if (i >= arreglo.length) {
            System.out.println("ojo me desbordo");
            return;
        } else {
            System.out.println("numero " + arreglo[i]);
            imprimirArreglo(arreglo, i + 1);
        }
    }
}

