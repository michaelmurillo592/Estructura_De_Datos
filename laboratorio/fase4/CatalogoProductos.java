package laboratorio.fase4;

import java.util.*;

public class CatalogoProductos {

    // Búsqueda rápida por código
    private HashMap<String, Producto> productosPorCodigo = new HashMap<>();

    // Productos ordenados por precio
    private TreeSet<Producto> productosOrdenadosPorPrecio =
            new TreeSet<>(Comparator.comparingDouble(Producto::getPrecio)
                    .thenComparing(Producto::getCodigo));


    // Agregar producto
    public void agregarProducto(Producto producto) {

        if (productosPorCodigo.containsKey(producto.getCodigo())) {
            return; // evita duplicados
        }

        productosPorCodigo.put(producto.getCodigo(), producto);
        productosOrdenadosPorPrecio.add(producto);
    }


    // Buscar producto por código
    public Producto buscarProducto(String codigo) {
        return productosPorCodigo.get(codigo);
    }


    // Mostrar productos ordenados por precio
    public List<Producto> obtenerProductosOrdenados() {
        return new ArrayList<>(productosOrdenadosPorPrecio);
    }


    public int totalProductos() {
        return productosPorCodigo.size();
    }

}
