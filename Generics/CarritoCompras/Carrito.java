package Generics.CarritoCompras;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Carrito<T extends Vendible> implements Iterable<T>{

    private List<T> productos;

    public Carrito() {
        productos = new ArrayList<>();
    }

    public void agregarProducto(T producto) {
        productos.add(producto);
    }

    public void mostrarProductos() {

        Iterator<T> it = productos.iterator();

        while (it.hasNext()) {
            T producto = it.next();
            System.out.println(producto);
        }
    }

    public double calcularTotal() {

        double total = 0;

        Iterator<T> it = productos.iterator();

        while (it.hasNext()) {
            T producto = it.next();
            total += producto.getPrecio();
        }

        return total;
    }

    public T obtenerMasCaro() {

        if (productos.isEmpty()) {
            return null;
        }

        Iterator<T> it = productos.iterator();
        T masCaro = it.next();

        while (it.hasNext()) {
            T producto = it.next();

            if (producto.getPrecio() > masCaro.getPrecio()) {
                masCaro = producto;
            }
        }

        return masCaro;
    }

    @Override
    public Iterator<T> iterator() {
        return productos.iterator();
    }
}