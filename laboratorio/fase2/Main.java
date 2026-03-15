package laboratorio.fase2;

public class Main {

    public static Producto generarProducto(int i) {

        String codigo = "P" + i;
        String nombre = "Producto" + i;
        double precio = Math.random() * 1000;

        String[] categorias = {"Tecnologia","Ropa","Hogar","Deportes"};
        String categoria = categorias[i % categorias.length];

        return new Producto(codigo, nombre, precio, categoria);
    }


    public static void prueba(int cantidad){

        SistemaVentas sistema = new SistemaVentas();

        Runtime runtime = Runtime.getRuntime();

        runtime.gc();

        long memoriaAntes = runtime.totalMemory() - runtime.freeMemory();
        long inicio = System.nanoTime();

        for(int i=1;i<=cantidad;i++){
            sistema.agregarProducto(generarProducto(i));
        }

        sistema.buscarProducto("P" + (cantidad/2));
        sistema.filtrarCategoria("Tecnologia");
        sistema.productosOrdenados();

        long fin = System.nanoTime();
        long memoriaDespues = runtime.totalMemory() - runtime.freeMemory();

        System.out.println("================================");
        System.out.println("Productos registrados: " + cantidad);
        System.out.println("Tiempo ejecución: " + (fin-inicio) + " ns");
        System.out.println("Memoria usada: " + (memoriaDespues-memoriaAntes) + " bytes");
        System.out.println("Total en sistema: " + sistema.totalProductos());

    }


    public static void main(String[] args) {

        prueba(100);
        prueba(1000);
        prueba(10000);
        prueba(100000);

    }
}