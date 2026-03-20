import java.util.ArrayList;

public class GestorMatriculas {
    /*En este clase vamos a gestionar las matriculas de los
    alumnos que crearemos en el main con ayuda de la clase
    alumno (como su nombre bien indica)


    Primero creamos los atributos que en este caso es solo una
    lista de array del objeto Matricula, creada en otra clase.
    Private para que solo se pueda usar en esta clase*/
    private ArrayList<Matricula> matriculas;

    /*Constructor para definir el valor del atributo*/
    public GestorMatriculas() {
        setMatriculas(new ArrayList<>());
    }

    /*Creamos la matricula
    * Si la nota es cero, se queda en cero
    * Se crea un objeto matricula con los parametros pasados
    * y se añade en el arraylist
    * despues se usa el metodo matricular con el alumno
    * que le hemos pasado como parametro*/
    public void crearMatricula(Alumno a, Asignatura as, Profesor p, double nota) {

        if (nota < 0) {
            nota = 0;
        }

        Matricula m = new Matricula(a, as, p, nota);

        getMatriculas().add(m);

        a.matricular(m);
    }

    /*Aqui con el bucle for mostramos los datos de todas las matriculas*/
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

    /*En este metodo utilizamos un if para ver si la nota es un 5 o mayor
    * y entondes si cumple esa conidicion la enseñamos por pantalla
    * diciendo que esta aprobado y con su nombre*/
    public void mostrarAprobados() {
        for (Matricula m : getMatriculas()) {
            if (m.getNota() >= 5) {
                System.out.println("APROBADO: " + m.getAlumno().nombre);
            }
        }
    }

    /*En este metodo utilizamos un for para recorrer todas las matriculas
    * y sacar la nota de los alumnos,si sus notas no son 10 ya
    * se le suma la variable puntos pasada por parametro*/
    public void subirNotaTodos(double puntos) {
        for (Matricula m : getMatriculas()) {
            m.setNota(m.getNota() + puntos);

            if (m.getNota() > 10) {
                m.setNota(10);
            }
        }
    }

    /*Se saca la media de todas las notas de la matricula,
    * se usa el if para ver si la nota es 0
    * entonces devuelve 0 directmante*/
    public double mediaGlobal() {
        double suma = 0;

        for (Matricula m : getMatriculas()) {
            suma += m.getNota();
        }

        if (getMatriculas().size() == 0) return 0;

        return suma / getMatriculas().size();
    }

    /*Getter*/
    public ArrayList<Matricula> getMatriculas() {
        return matriculas;
    }

    /*Setter, pasandole por parametro la lista matriculas creada en otra clase*/
    public void setMatriculas(ArrayList<Matricula> matriculas) {
        this.matriculas = matriculas;
    }
}
