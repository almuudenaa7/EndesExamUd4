import java.util.ArrayList;

public class Alumno extends Padre{

    /*Esta clase es la clase alumno que nos permitirá crear un alumno
    nuevo en le main con sus respectivos atributos y


    Los atributos que van a definir esta clase, en protected para que solo
    * se pueda usar en la misma clase, en las de paquete y en las del padre*/

    /*int porque edad es un numero entero*/
    protected int edad;
    /*Arraylist porque estamos almacenando todos los objetos de tipo matricula*/
    protected ArrayList<Matricula> matriculas;

    /*El constructor de la clase para darle valor a los atributos de la misma
    *
    * Para el atributo nombre usamos el de la clase padre
    * Para la edad la que nosotros intrpduzcamos
    * Y para la matricula usamos un metodo de la misma clase*/
    public Alumno(String nombre, int edad) {
        super(nombre);
        this.edad = edad;
        this.setMatriculas(new ArrayList<>());
    }

    /*Este metodo, utiliza el metodo de los arraylist [nombredearray].add
    * para incluir la matricula de este nuevo alumno */
    public void matricular(Matricula m) {
        getMatriculas().add(m);
    }

    /*Este es el metodo que viene de la clase padre
    * Sirve para mostrar todos los datos de este alumno:
    * primero su nombre
    * dentro del bucle for: la asignatura
    * el profesor
    * y su nota*/
    @Override
    public void mostrarDatos() {
        System.out.println("Alumno: " + nombre);

        for (Matricula m : getMatriculas()) {
            System.out.println("Asignatura: " + m.getAsignatura().nombre +
                    " Profesor: " + m.getProfesor().nombre +
                    " Nota: " + m.getNota());
        }
    }

    /*Este metodo para calcular la media, dentro del for
    * pasamos por su matricula y cogemos sus notas.
    * En la variable auxiliar dentro del metodo le damos
    * el valor de su nota.
    * En el if se declara que si la nota es 0, no se haga la media
    * porque directmaente es cero
    * en el return devolvemos el calculo de la media*/
    public double calcularMedia() {
        double suma = 0;

        for (Matricula m : getMatriculas()) {
            suma += m.getNota();
        }

        if (getMatriculas().size() == 0) return 0;

        return suma / getMatriculas().size();
    }

     /*getters y setters de array matricula*/
    public ArrayList<Matricula> getMatriculas() {
        return matriculas;
    }

    public void setMatriculas(ArrayList<Matricula> matriculas) {
        this.matriculas = matriculas;
    }
}
