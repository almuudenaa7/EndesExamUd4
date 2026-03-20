public class Profesor extends Padre {

    public String especialidad;

    public Profesor(String nombre, String especialidad) {
        super(nombre);
        this.nombre = nombre;
        this.especialidad = especialidad;
    }

    public void mostrar() {
        System.out.println("Profesor: " + nombre + " - " + especialidad);
    }
}
