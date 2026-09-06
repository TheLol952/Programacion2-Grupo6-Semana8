public class Empleado {

    // Atributos privados (encapsulamiento)
    private String nombre;
    private String cargo;
    private double salario;
    private boolean activo;

    // Constructor
    public Empleado(String nombre, String cargo, double salario) {
        this.nombre = nombre;
        this.cargo = cargo;
        this.salario = salario;
        this.activo = true;
    }

    // Getters y Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        if (salario > 0) {
            this.salario = salario;
        } else {
            System.out.println("El salario debe ser positivo.");
        }
    }

    public boolean isActivo() {
        return activo;
    }

    // Funciones asociadas (comportamiento)
    public void aumentarSalario(double porcentaje) {
        this.salario += this.salario * (porcentaje / 100);
    }

    public void desactivar() {
        this.activo = false;
    }

    @Override
    public String toString() {
        return "Empleado{" +
                "nombre='" + nombre + '\'' +
                ", cargo='" + cargo + '\'' +
                ", salario=" + salario +
                ", activo=" + activo +
                '}';
    }
}