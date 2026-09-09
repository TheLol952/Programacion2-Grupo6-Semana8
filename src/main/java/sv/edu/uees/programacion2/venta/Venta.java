package sv.edu.uees.programacion2.venta;

import sv.edu.uees.programacion2.cliente.Cliente;
import sv.edu.uees.programacion2.producto.Producto;

public class Venta {

    private int id;
    private Cliente cliente;
    private Producto producto;
    private int cantidad;
    private double total;

    public Venta(int id, Cliente cliente, Producto producto, int cantidad) {
        this.id = id;
        this.cliente = cliente;
        this.producto = producto;
        this.cantidad = cantidad;
        this.total = producto.getPrecio() * cantidad;
    }

    public int getId() {
        return id;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public Producto getProducto() {
        return producto;
    }

    public int getCantidad() {
        return cantidad;
    }

    public double getTotal() {
        return total;
    }

    @Override
    public String toString() {
        return "Venta{" +
                "id=" + id +
                ", cliente=" + cliente.getNombre() +
                ", producto=" + producto.getNombre() +
                ", cantidad=" + cantidad +
                ", total=" + total +
                '}';
    }
}
