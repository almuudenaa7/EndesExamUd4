import java.util.ArrayList;

public class GestorMatriculas {

    private ArrayList<Matricula> matriculas;

    public GestorMatriculas() {
        setMatriculas(new ArrayList<>());
    }

    public void crearMatricula(Alumno a, Asignatura as, Profesor p, double nota) {

        if (nota < 0) {
            nota = 0;
        }

        Matricula m = new Matricula(a, as, p, nota);

        getMatriculas().add(m);

        a.matricular(m);
    }

    public void mostrarTodas() {
        for (Matricula m : getMatriculas()) {
            System.out.println(
                m.getAlumno().nombre + " - " +
                m.getAsignatura().nombre + " - " +
                m.getProfesor().nombre + " - " +
                        m.getNota()
            );
        }
    }

    public void mostrarAprobados() {
        for (Matricula m : getMatriculas()) {
            if (m.getNota() >= 5) {
                System.out.println("APROBADO: " + m.getAlumno().nombre);
            }
        }
    }

    public void subirNotaTodos(double puntos) {
        for (Matricula m : getMatriculas()) {
            m.setNota(m.getNota() + puntos);

            if (m.getNota() > 10) {
                m.setNota(10);
            }
        }
    }

    public double mediaGlobal() {
        double suma = 0;

        for (Matricula m : getMatriculas()) {
            suma += m.getNota();
        }

        if (getMatriculas().size() == 0) return 0;

        return suma / getMatriculas().size();
    }

    public ArrayList<Matricula> getMatriculas() {
        return matriculas;
    }

    public void setMatriculas(ArrayList<Matricula> matriculas) {
        this.matriculas = matriculas;
    }
}
