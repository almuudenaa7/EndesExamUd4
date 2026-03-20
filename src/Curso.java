import java.util.ArrayList;

public class Curso extends Padre{

    protected ArrayList<Alumno> alumnos;
    protected ArrayList<Asignatura> asignaturas;
    protected ArrayList<Profesor> profesores;

    public Curso(String nombre) {
        super(nombre);
        setAlumnos(new ArrayList<>());
        setAsignaturas(new ArrayList<>());
        setProfesores(new ArrayList<>());
    }

    public void agregarAlumno(Alumno a) {
        getAlumnos().add(a);
    }

    public void agregarAsignatura(Asignatura a) {
        getAsignaturas().add(a);
    }

    public void agregarProfesor(Profesor p) {
        getProfesores().add(p);
    }

    @Override
    public void mostrarDatos() {
        System.out.println("CURSO: " + nombre);

        for (Alumno a : getAlumnos()) {
            System.out.println("Alumno: " + a.nombre);
        }

        for (Asignatura as : getAsignaturas()) {
            System.out.println("Asignatura: " + as.nombre);
        }

        for (Profesor p : getProfesores()) {
            System.out.println("Profesor: " + p.nombre);
        }
    }

    public ArrayList<Alumno> getAlumnos() {
        return alumnos;
    }

    public void setAlumnos(ArrayList<Alumno> alumnos) {
        this.alumnos = alumnos;
    }

    public ArrayList<Asignatura> getAsignaturas() {
        return asignaturas;
    }

    public void setAsignaturas(ArrayList<Asignatura> asignaturas) {
        this.asignaturas = asignaturas;
    }

    public ArrayList<Profesor> getProfesores() {
        return profesores;
    }

    public void setProfesores(ArrayList<Profesor> profesores) {
        this.profesores = profesores;
    }
}
