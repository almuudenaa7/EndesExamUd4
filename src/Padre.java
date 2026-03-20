public abstract class Padre {
    /*El atributo que comparten todas las clases hijas*/

    public String nombre;

    /*El constructor para hacer saber al programa cual es el valor
    * del atributo*/
    public Padre(String nombre) {
        this.nombre = nombre;
    }
    /*El metodo que van a compartir todas las clases hijas*/
    public abstract void mostrarDatos();
}
