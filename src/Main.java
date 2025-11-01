import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Alumno> listaAlumnos = new ArrayList<>();

        System.out.println("¿Cuantos alumnos desea registar?");
        int cantidad = scanner.nextInt();
        scanner.nextLine();

        for (int i=0; i < cantidad; i++){

            System.out.println("Alumno #"+ (i+1));

            System.out.println("ID: ");
            int id = scanner.nextInt();
            scanner.nextLine();

            System.out.println("Nombre: ");
            String nombre = scanner.nextLine();

            System.out.println("Apellido: ");
            String apellido = scanner.nextLine();

            Alumno alumno = new Alumno(id, nombre, apellido);
            listaAlumnos.add(alumno);

        }

        System.out.println("\n lista de alumnos registrados");
        for (Alumno a : listaAlumnos){
            a.mostrarNombre();


        }
    }
    }
