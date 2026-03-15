package RECURSIVIDAD.TAREA;

public class Matriz {

    // Método recursivo para imprimir la matriz
    static void imprimir(int[][] m, int fila, int col) {

        // Caso base: si ya no hay más filas
        if (fila == m.length) {
            return;
        }

        // Si se termina una fila, pasa a la siguiente
        if (col == m[fila].length) {
            System.out.println();
            imprimir(m, fila + 1, 0);
            return;
        }

        // Imprime el elemento actual
        System.out.print(m[fila][col] + " ");

        // Llamada recursiva para la siguiente columna
        imprimir(m, fila, col + 1);
    }

    // Método recursivo para sumar la diagonal principal
    static int sumarDiagonal(int[][] m, int i) {

        // Caso base: cuando se termina la diagonal
        if (i == m.length) {
            return 0;
        }

        // Suma el elemento diagonal y avanza
        return m[i][i] + sumarDiagonal(m, i + 1);
    }

    // Método principal
    public static void main(String[] args) {

        int[][] matriz = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        // Imprimir matriz
        System.out.println("Matriz:");
        imprimir(matriz, 0, 0);

        // Sumar diagonal
        int suma = sumarDiagonal(matriz, 0);
        System.out.println("\nLa suma de la diagonal es: " + suma);
    }
}
