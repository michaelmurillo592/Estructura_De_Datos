package TallerCollectionsyGenerics.GestionTareas.primero;

import java.util.Date;

public class Tarea<T> {

    private T descripcion;
    private int prioridad;
    private Date fechaVencimiento;

    public Tarea(T descripcion, int prioridad, Date fechaVencimiento) {
        this.descripcion = descripcion;
        this.prioridad = prioridad;
        this.fechaVencimiento = fechaVencimiento;
    }

    public T getDescripcion() {
        return descripcion;
    }

    public int getPrioridad() {
        return prioridad;
    }

    public Date getFechaVencimiento() {
        return fechaVencimiento;
    }

    @Override
    public String toString() {
        return "Descripcion: " + descripcion +
               " | Prioridad: " + prioridad +
               " | Fecha: " + fechaVencimiento;
    }
}