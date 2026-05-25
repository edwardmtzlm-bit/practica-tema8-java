import java.util.ArrayList;

public class PracticaTema8 {

    // Atributos
    private String nombreProducto;
    private double precio;
    private int cantidad;
    private double descuento;

    // Constructor
    public PracticaTema8(String nombreProducto, double precio, int cantidad, double descuento) {
        this.nombreProducto = nombreProducto;
        this.precio = precio;
        this.cantidad = cantidad;
        this.descuento = descuento;
    }

    // Método 1
    public double calcularSubtotal() {
        return precio * cantidad;
    }

    // Método 2
    public double calcularDescuento() {
        return calcularSubtotal() * descuento;
    }

    // Método 3
    public double calcularTotal() {
        return calcularSubtotal() - calcularDescuento();
    }

    // Método para mostrar resultados
    public void mostrarResultado() {
        System.out.println("===== PRACTICA TEMA 8 =====");
        System.out.println(String.format("Producto: %s", nombreProducto));
        System.out.println(String.format("Precio unitario: $%.2f", precio));
        System.out.println(String.format("Cantidad: %d", cantidad));
        System.out.println(String.format("Subtotal: $%.2f", calcularSubtotal()));
        System.out.println(String.format("Descuento aplicado: $%.2f", calcularDescuento()));
        System.out.println(String.format("Total a pagar: $%.2f", calcularTotal()));
    }

    // Main
    public static void main(String[] args) {

        // Objetos
        PracticaTema8 producto1 = new PracticaTema8("Teclado mecánico", 850.50, 2, 0.10);
        PracticaTema8 producto2 = new PracticaTema8("Mouse inalámbrico", 320.99, 3, 0.05);

        // ArrayList
        ArrayList<PracticaTema8> productos = new ArrayList<>();

        productos.add(producto1);
        productos.add(producto2);

        // Recorrido
        for (PracticaTema8 producto : productos) {
            producto.mostrarResultado();
            System.out.println("----------------------------");
        }

        // Uso de Math
        double numero = 25;

        System.out.println("Raíz cuadrada usando Math.sqrt(): " + Math.sqrt(numero));
        System.out.println("Número mayor usando Math.max(): " + Math.max(100, 250));
    }
}