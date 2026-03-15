package TallerCollectionsyGenerics.GestionTareas.primero;

import java.util.Date;

public class Main {

    public static void main(String[] args) {

        ListaDeTareas<String> lista = new ListaDeTareas<>();

        lista.agregarTarea(new Tarea<>("Estudiar Java", 1, new Date(125,3,10)));
        lista.agregarTarea(new Tarea<>("Hacer taller", 2, new Date(125,3,8)));
        lista.agregarTarea(new Tarea<>("Leer documentación", 1, new Date(125,3,12)));

        System.out.println("Todas las tareas:");
        lista.mostrarTareas();

        System.out.println("\nTareas con prioridad 1:");
        for(Tarea<String> t : lista.obtenerPorPrioridad(1)){
            System.out.println(t);
        }

        System.out.println("\nTareas ordenadas por fecha:");
        lista.mostrarOrdenadasPorFecha();
    }
}