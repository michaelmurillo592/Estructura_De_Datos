package Colecciones;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Persona> lista = new ArrayList<>();

        lista.add(new Persona("Juan", 20));
        lista.add(new Persona("Maria", 25));
        lista.add(new Persona("Andrea", 22));
        lista.add(new Persona("Raul", 19));

        // Ordena usando compareTo (por nombre)
        Collections.sort(lista);

        // Mostrar resultados
        for (Persona p : lista) {
            System.out.println(p.getNombre() + " - " + p.getEdad());
        }
    }
}