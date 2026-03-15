package laboratorio.fase2;

import java.util.*;

public class SistemaVentas {

    private HashMap<String, Producto> productosPorCodigo = new HashMap<>();
    private LinkedList<Producto> listaProductos = new LinkedList<>();

    private TreeSet<Producto> productosOrdenadosPorPrecio =
            new TreeSet<>(Comparator.comparingDouble(Producto::getPrecio)
                    .thenComparing(Producto::getCodigo));

    private HashMap<String, List<Producto>> productosPorCategoria = new HashMap<>();


    public void agregarProducto(Producto producto) {

        if (productosPorCodigo.containsKey(producto.getCodigo())) {
            return;
        }

        productosPorCodigo.put(producto.getCodigo(), producto);
        listaProductos.addFirst(producto);
        productosOrdenadosPorPrecio.add(producto);

        productosPorCategoria.putIfAbsent(producto.getCategoria(), new ArrayList<>());
        productosPorCategoria.get(producto.getCategoria()).add(producto);
    }


    public Producto buscarProducto(String codigo) {
        return productosPorCodigo.get(codigo);
    }


    public List<Producto> filtrarCategoria(String categoria) {
        return productosPorCategoria.getOrDefault(categoria, new ArrayList<>());
    }


    public List<Producto> productosOrdenados() {
        return new ArrayList<>(productosOrdenadosPorPrecio);
    }


    public int totalProductos() {
        return productosPorCodigo.size();
    }

}