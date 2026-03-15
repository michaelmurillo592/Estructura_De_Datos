package laboratorio.fase4;

import java.util.List;

public class Main {

    public static Producto generarProducto(int i) {

        String codigo = "P" + i;
        String nombre = "Producto" + i;
        double precio = Math.random() * 5000;

        return new Producto(codigo, nombre, precio);
    }


    public static void prueba(int cantidad) {

        CatalogoProductos catalogo = new CatalogoProductos();

        Runtime runtime = Runtime.getRuntime();
        runtime.gc();

        long memoriaAntes = runtime.totalMemory() - runtime.freeMemory();
        long inicio = System.nanoTime();

        // Insertar productos
        for (int i = 1; i <= cantidad; i++) {
            catalogo.agregarProducto(generarProducto(i));
        }

        // Buscar producto
        Producto buscado = catalogo.buscarProducto("P" + (cantidad / 2));

        // Obtener productos ordenados
        List<Producto> ordenados = catalogo.obtenerProductosOrdenados();

        long fin = System.nanoTime();
        long memoriaDespues = runtime.totalMemory() - runtime.freeMemory();

        System.out.println("================================");
        System.out.println("Productos registrados: " + cantidad);
        System.out.println("Tiempo ejecución: " + (fin - inicio) + " ns");
        System.out.println("Memoria usada: " + (memoriaDespues - memoriaAntes) + " bytes");
        System.out.println("Total productos: " + catalogo.totalProductos());

        if (buscado != null) {
            System.out.println("Producto encontrado: " + buscado.getCodigo());
        }

        System.out.println("Productos ordenados: " + ordenados.size());
    }


    public static void main(String[] args) {

        prueba(100);
        prueba(1000);
        prueba(10000);
        prueba(100000);

    }

}
