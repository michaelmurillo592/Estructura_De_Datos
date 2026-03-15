package laboratorio.fase3;

import java.util.*;

public class SistemaTaxis {

    // Mantiene orden de llegada
    private Queue<SolicitudTaxi> colaSolicitudes = new LinkedList<>();

    // Permite buscar rápidamente una solicitud
    private HashMap<String, SolicitudTaxi> solicitudesPorId = new HashMap<>();


    // Registrar solicitud
    public void registrarSolicitud(SolicitudTaxi solicitud) {

        colaSolicitudes.add(solicitud);
        solicitudesPorId.put(solicitud.getIdSolicitud(), solicitud);

    }


    // Atender solicitud más antigua
    public SolicitudTaxi atenderSolicitud() {

        SolicitudTaxi solicitud = colaSolicitudes.poll();

        if (solicitud != null) {
            solicitudesPorId.remove(solicitud.getIdSolicitud());
        }

        return solicitud;
    }


    // Cancelar solicitud específica
    public boolean cancelarSolicitud(String id) {

        SolicitudTaxi solicitud = solicitudesPorId.get(id);

        if (solicitud == null) {
            return false;
        }

        colaSolicitudes.remove(solicitud);
        solicitudesPorId.remove(id);

        return true;
    }


    // Mostrar solicitudes pendientes
    public void mostrarPendientes() {

        for (SolicitudTaxi s : colaSolicitudes) {

            System.out.println(
                    s.getIdSolicitud() + " - " +
                    s.getUsuario() + " - " +
                    s.getOrigen() + " -> " +
                    s.getDestino()
            );

        }
    }

    public int totalSolicitudes() {
        return colaSolicitudes.size();
    }

}
