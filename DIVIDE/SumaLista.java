package DIVIDE;

public class SumaLista {

    static int[] Arreglo = {1, 2, 3, 4, 5};

    public static int SumaNumeros (int[] Arreglo, int inicio, int fin) {
        // caso base
        if ( inicio == fin) {
            return Arreglo[inicio];

        }
        // caso recursivo dividir en dos  
        int medio = ( inicio + fin) / 2; 

        // llamar recursivamnete a cada mitad
        int sumaIzquierdo = SumaNumeros(Arreglo, inicio, medio); 
        int sumaDerecha = SumaNumeros(Arreglo, medio + 1, fin);

        // combinar resultados
        return sumaIzquierdo + sumaDerecha;

    }

    public static void main (String[] args) {
        int resultado = SumaNumeros (Arreglo, 0, Arreglo.length - 1);
        System.out.println("la suma de los nuemros es: " +resultado);
    }
}
