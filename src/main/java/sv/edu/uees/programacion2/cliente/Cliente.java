package sv.edu.uees.programacion2.cliente;

import java.util.Objects;
import java.util.regex.Pattern;

/**
 * Representa a un cliente registrado en el sistema.
 */
public class Cliente {

    private static final Pattern CORREO_VALIDO = Pattern.compile(
            "^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$"
    );

    private int id;
    private String nombre;
    private String correo;
    private String telefono;

    public Cliente(int id, String nombre, String correo, String telefono) {
        setId(id);
        setNombre(nombre);
        setCorreo(correo);
        setTelefono(telefono);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        if (id <= 0) {
            throw new IllegalArgumentException("El id debe ser mayor que cero.");
        }
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = validarTextoObligatorio(nombre, "nombre");
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        String correoLimpio = validarTextoObligatorio(correo, "correo");
        if (!CORREO_VALIDO.matcher(correoLimpio).matches()) {
            throw new IllegalArgumentException("El correo no tiene un formato valido.");
        }
        this.correo = correoLimpio;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = validarTextoObligatorio(telefono, "telefono");
    }

    private static String validarTextoObligatorio(String valor, String campo) {
        if (valor == null || valor.isBlank()) {
            throw new IllegalArgumentException("El " + campo + " es obligatorio.");
        }
        return valor.trim();
    }

    @Override
    public boolean equals(Object objeto) {
        if (this == objeto) {
            return true;
        }
        if (!(objeto instanceof Cliente cliente)) {
            return false;
        }
        return id == cliente.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", correo='" + correo + '\'' +
                ", telefono='" + telefono + '\'' +
                '}';
    }
}
