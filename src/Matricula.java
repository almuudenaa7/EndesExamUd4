public class Matricula {

    private Alumno alumno;
    private Asignatura asignatura;
    private Profesor profesor;
    private double nota;

    public Matricula(Alumno alumno, Asignatura asignatura, Profesor profesor, double nota) {
        this.setAlumno(alumno);
        this.setAsignatura(asignatura);
        this.setProfesor(profesor);
        this.setNota(nota);
    }


    public void mostrarDatos() {
        System.out.println(getAlumno().nombre + " - " +
                getAsignatura().nombre + " - " +
                getProfesor().nombre + " - Nota: " + getNota());
    }

    public Alumno getAlumno() {
        return alumno;
    }

    public void setAlumno(Alumno alumno) {
        this.alumno = alumno;
    }

    public Asignatura getAsignatura() {
        return asignatura;
    }

    public void setAsignatura(Asignatura asignatura) {
        this.asignatura = asignatura;
    }

    public Profesor getProfesor() {
        return profesor;
    }

    public void setProfesor(Profesor profesor) {
        this.profesor = profesor;
    }

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }
}
