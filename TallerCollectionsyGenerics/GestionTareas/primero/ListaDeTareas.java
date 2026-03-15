package TallerCollectionsyGenerics.GestionTareas.primero;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ListaDeTareas<T> {

    private List<Tarea<T>> listaTareas;

    public ListaDeTareas() {
        listaTareas = new ArrayList<>();
    }

    public void agregarTarea(Tarea<T> tarea) {
        listaTareas.add(tarea);
    }

    public void mostrarTareas() {
        for (Tarea<T> t : listaTareas) {
            System.out.println(t);
        }
    }

    public List<Tarea<T>> obtenerPorPrioridad(int prioridad) {

        List<Tarea<T>> resultado = new ArrayList<>();

        for (Tarea<T> t : listaTareas) {
            if (t.getPrioridad() == prioridad) {
                resultado.add(t);
            }
        }

        return resultado;
    }

    public void mostrarOrdenadasPorFecha() {

        Collections.sort(listaTareas, new Comparator<Tarea<T>>() {

            @Override
            public int compare(Tarea<T> t1, Tarea<T> t2) {
                return t1.getFechaVencimiento().compareTo(t2.getFechaVencimiento());
            }
        });

        mostrarTareas();
    }
}