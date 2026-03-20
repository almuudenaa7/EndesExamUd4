import java.util.ArrayList;

public class Alumno extends Padre{

    private int edad;
    private ArrayList<Matricula> matriculas;

    public Alumno(String nombre, int edad) {
        super(nombre);
        this.edad = edad;
        this.setMatriculas(new ArrayList<>());
    }

    public void matricular(Matricula m) {
        getMatriculas().add(m);
    }

    public void mostrarDatos() {
        System.out.println("Alumno: " + nombre);

        for (Matricula m : getMatriculas()) {
            System.out.println("Asignatura: " + m.getAsignatura().nombre +
                    " Profesor: " + m.getProfesor().nombre +
                    " Nota: " + m.getNota());
        }
    }

    public double calcularMedia() {
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
