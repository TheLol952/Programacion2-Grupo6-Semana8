package sv.edu.uees.programacion2;

import sv.edu.uees.programacion2.cliente.Cliente;

/**
 * Punto de entrada del proyecto colaborativo del Grupo 6.
 */
public final class Main {

    private Main() {
        // Evita crear instancias de la clase principal.
    }

    public static void main(String[] args) {
        System.out.println("Programacion II - Grupo 6 - Semana 8");

        Cliente cliente = new Cliente(
                1,
                "Cliente de ejemplo",
                "cliente@ejemplo.com",
                "7000-0000"
        );

        System.out.println("Proyecto base configurado correctamente.");
        System.out.println(cliente);
        System.out.println("Inicializando el módulo de Producto...");
    }
}
