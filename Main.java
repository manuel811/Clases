import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {


        Persona estudiante = new Estudiante("Ana", 10, 1);
        Persona estudiante2 = new Estudiante("Gabriela", 11, 2);
        Persona docente = new Docente("Diego", 12, 30);
        Persona docente2 = new Docente("Lucia", 13, 32);

        List<Persona> list = new ArrayList<>();
        list.add(estudiante);
        list.add(estudiante2);
        list.add(docente);
        list.add(docente2);

        ((Docente)docente).setCantHorasClase(40);

        for (Persona p:list) {

            if(p instanceof Docente){

                System.out.println("a = " + p.toString());
            }

        }


    }
}