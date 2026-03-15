public class Producto {
    private String codigo;
    private String nombreProducto;
    private int cantidadVendida; 
    private double ValorVenta;

    public Producto(String codigo, String nombreProducto, int cantidadVendida, double ValorVenta) {
        this.codigo = codigo;
        this.nombreProducto = nombreProducto;
        this.cantidadVendida = cantidadVendida;
        this.ValorVenta = ValorVenta;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getNombreProducto() {
        return nombreProducto;
    }

    public int getCantidadVendida() {
        return cantidadVendida;
    }

    public double getValorVenta() {
        return ValorVenta;
    }

    @Override
    public String toString() {
        return "Producto: " + nombreProducto + ", Cantidad Vendida: " + cantidadVendida + ", Valor de Venta: " + ValorVenta;
    }
}
