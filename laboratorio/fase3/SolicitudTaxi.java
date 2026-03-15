package laboratorio.fase3;

public class SolicitudTaxi {

    private String idSolicitud;
    private String usuario;
    private String origen;
    private String destino;

    public SolicitudTaxi(String idSolicitud, String usuario, String origen, String destino) {
        this.idSolicitud = idSolicitud;
        this.usuario = usuario;
        this.origen = origen;
        this.destino = destino;
    }

    public String getIdSolicitud() {
        return idSolicitud;
    }

    public String getUsuario() {
        return usuario;
    }

    public String getOrigen() {
        return origen;
    }

    public String getDestino() {
        return destino;
    }
}
