package sv.edu.uees.programacion2.cliente;

/**
 * Pruebas basicas ejecutables sin bibliotecas externas.
 */
public final class ClienteTest {

    private ClienteTest() {
    }

    public static void main(String[] args) {
        creaClienteConDatosValidos();
        rechazaCorreoConFormatoInvalido();
        rechazaIdNoPositivo();
        System.out.println("Pruebas de Cliente completadas correctamente.");
    }

    private static void creaClienteConDatosValidos() {
        Cliente cliente = new Cliente(1, "Ana Lopez", "ana@ejemplo.com", "7000-0000");

        verificar(cliente.getId() == 1, "El id no coincide.");
        verificar(cliente.getNombre().equals("Ana Lopez"), "El nombre no coincide.");
        verificar(cliente.getCorreo().equals("ana@ejemplo.com"), "El correo no coincide.");
        verificar(cliente.getTelefono().equals("7000-0000"), "El telefono no coincide.");
    }

    private static void rechazaCorreoConFormatoInvalido() {
        verificarQueFalla(
                () -> new Cliente(1, "Ana Lopez", "correo-invalido", "7000-0000"),
                "Se esperaba rechazar el correo invalido."
        );
    }

    private static void rechazaIdNoPositivo() {
        verificarQueFalla(
                () -> new Cliente(0, "Ana Lopez", "ana@ejemplo.com", "7000-0000"),
                "Se esperaba rechazar el id no positivo."
        );
    }

    private static void verificar(boolean condicion, String mensaje) {
        if (!condicion) {
            throw new AssertionError(mensaje);
        }
    }

    private static void verificarQueFalla(Runnable accion, String mensaje) {
        try {
            accion.run();
            throw new AssertionError(mensaje);
        } catch (IllegalArgumentException esperado) {
            // Resultado esperado.
        }
    }
}
