package Generics.CarritoCompras;

public class Main {

    public static void main(String[] args) {

        Carrito<Producto> carrito = new Carrito<>();

        carrito.agregarProducto(new Producto("Laptop", 2500));
        carrito.agregarProducto(new Producto("Mouse", 80));
        carrito.agregarProducto(new Producto("Teclado", 150));

        System.out.println("Productos:");
        carrito.mostrarProductos();

        System.out.println("\nProducto más caro:");
        System.out.println(carrito.obtenerMasCaro());

        System.out.println("\nTotal:");
        System.out.println("$" + carrito.calcularTotal());
    }
}