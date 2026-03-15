import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class RegistroVentas {
    
    public static void main(String[] args){

        HashMap<String, Producto> ventas = new HashMap<>();

        LinkedHashMap<String, Producto> registroVentas = new LinkedHashMap<>();

        Producto producto1 = new Producto("P001", "Laptop", 5, 1500.00);
        Producto producto2 = new Producto("P002", "Smartphone", 10, 800.00);
        Producto producto3 = new Producto("P003", "Tablet", 7, 600.00);

        ventas.put(producto1.getCodigo(), producto1);
        ventas.put(producto2.getCodigo(), producto2);
        ventas.put(producto3.getCodigo(), producto3);

        for (Producto producto : ventas.values()) {
            System.out.println(producto);
        }
    } 

    public static void registrarVenta(HashMap<String, Producto> ventas, String codigo, String nombreProducto, int cantidadVendida, double valorVenta) {
        Producto nuevaVenta = new Producto(codigo, nombreProducto, cantidadVendida, valorVenta);
        ventas.put(codigo, nuevaVenta);
    }
}
