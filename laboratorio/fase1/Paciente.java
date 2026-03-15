package laboratorio.fase1;

public class Paciente {
    
    private String nombre;
    private String documento;
    private int prioridad; // 1 = alta, 2 = normal

    public Paciente(String nombre, String documento, int prioridad){
        this.nombre = nombre;
        this.documento = documento;
        this.prioridad = prioridad;
    }

    public String getNombre (){
        return nombre;
    }

    public String getDocumento (){
        return documento;
    }

    public int getPrioridad (){
        return prioridad;
    }

    @Override
    public String toString() {
        return nombre + ", Doc:" + documento + " Prioridad: " + prioridad;
    }
}
