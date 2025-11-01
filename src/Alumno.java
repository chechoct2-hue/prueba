
/* ----------------------------------------
 Primera revision Ejercicios, se dejan par de tips.
 NOTA:Siempre tener buenas practicas de Codigo

 1/11/2025 @Andres Gonzalez
------------------------------------------- */

public class Alumno {
    int id;
    String nombre;
    String apellido;

public Alumno(int id, String nombre, String apellido) {
    this.id = id;
    this.nombre = nombre;
    this.apellido = apellido;
    }

public void mostrarNombre() {
    System.out.println("Hola, mi nombre es " + nombre + " " + apellido + ".");
  }

}
