public class Profesor extends Padre {

    protected String especialidad;

    public Profesor(String nombre, String especialidad) {
        super(nombre);
        this.nombre = nombre;
        this.setEspecialidad(especialidad);
    }

    @Override
    public void mostrarDatos() {
        System.out.println("Profesor: " + nombre + " - " + getEspecialidad());

    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }
}
