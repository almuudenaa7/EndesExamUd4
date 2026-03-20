public class Profesor extends Padre {

    private String especialidad;

    public Profesor(String nombre, String especialidad) {
        super(nombre);
        this.nombre = nombre;
        this.setEspecialidad(especialidad);
    }

    public void mostrar() {
        System.out.println("Profesor: " + nombre + " - " + getEspecialidad());
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }
}
