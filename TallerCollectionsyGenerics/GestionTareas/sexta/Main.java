package TallerCollectionsyGenerics.GestionTareas.sexta;

import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        // Lista de enteros
        List<Integer> numeros = Arrays.asList(10, 45, 7, 89, 32);

        Integer maxNumero = Utilidades.maximo(numeros);
        System.out.println("El número máximo es: " + maxNumero);


        // Lista de strings
        List<String> palabras = Arrays.asList("perro", "gato", "zorro", "abeja");

        String maxPalabra = Utilidades.maximo(palabras);
        System.out.println("La palabra máxima es: " + maxPalabra);
    }
}