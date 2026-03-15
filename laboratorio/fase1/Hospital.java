package laboratorio.fase1;

import java.util.*;

public class Hospital {

    private Queue<Paciente> colaNormal = new LinkedList<>();
    private PriorityQueue<Paciente> colaPrioridad =
            new PriorityQueue<>(Comparator.comparingInt(Paciente::getPrioridad));

    private HashMap<String, Paciente> mapaPacientes = new HashMap<>();
    private HashSet<String> documentos = new HashSet<>();


    public void registrarPaciente(String nombre, String documento, int prioridad) {

        if (documentos.contains(documento)) {
            System.out.println("Paciente ya registrado");
            return;
        }

        Paciente p = new Paciente(nombre, documento, prioridad);

        documentos.add(documento);
        mapaPacientes.put(documento, p);

        if (prioridad == 1) {
            colaPrioridad.add(p);
        } else {
            colaNormal.add(p);
        }

        System.out.println("Paciente registrado");
    }


    public Paciente atenderPaciente() {

        Paciente p;

        if (!colaPrioridad.isEmpty()) {
            p = colaPrioridad.poll();
        } else {
            p = colaNormal.poll();
        }

        if (p != null) {
            documentos.remove(p.getDocumento());
            mapaPacientes.remove(p.getDocumento());
        }

        return p;
    }


    public Paciente buscarPaciente(String documento) {
        return mapaPacientes.get(documento);
    }
}