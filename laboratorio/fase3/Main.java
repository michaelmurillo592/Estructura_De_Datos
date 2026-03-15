package laboratorio.fase3;

public class Main {

    public static SolicitudTaxi generarSolicitud(int i) {

        String id = "S" + i;
        String usuario = "Usuario" + i;
        String origen = "Zona" + (i % 10);
        String destino = "Zona" + ((i + 1) % 10);

        return new SolicitudTaxi(id, usuario, origen, destino);
    }


    public static void prueba(int cantidad) {

        SistemaTaxis sistema = new SistemaTaxis();

        Runtime runtime = Runtime.getRuntime();
        runtime.gc();

        long memoriaAntes = runtime.totalMemory() - runtime.freeMemory();
        long inicio = System.nanoTime();


        // Registrar solicitudes
        for (int i = 1; i <= cantidad; i++) {

            sistema.registrarSolicitud(generarSolicitud(i));

        }

        // Atender una solicitud
        sistema.atenderSolicitud();

        // Cancelar una solicitud
        sistema.cancelarSolicitud("S" + (cantidad / 2));


        long fin = System.nanoTime();
        long memoriaDespues = runtime.totalMemory() - runtime.freeMemory();

        System.out.println("==================================");
        System.out.println("Solicitudes registradas: " + cantidad);
        System.out.println("Tiempo ejecución: " + (fin - inicio) + " ns");
        System.out.println("Memoria usada: " + (memoriaDespues - memoriaAntes) + " bytes");
        System.out.println("Solicitudes pendientes: " + sistema.totalSolicitudes());

    }


    public static void main(String[] args) {

        prueba(100);
        prueba(1000);
        prueba(10000);
        prueba(100000);

    }

}
