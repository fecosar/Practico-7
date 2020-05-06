
import java.util.HashSet;
import java.util.Set;


public class Colegio {

    public static void main(String[] args) {
        
        Materia m1 = new Materia("¡", "Ingles I", 1);
        Materia m2 = new Materia("¡¡", "Matematica", 1);
        Materia m3 = new Materia("¡¡¡", "Laboratorio I", 1);
        
        Alumno a1 = new Alumno (1001, "López", "Martin");
        Alumno a2 = new Alumno (1002, "Martinez", "Brenda");
        
        a1.agregarMateria(m1);
        a1.agregarMateria(m2);
        a1.agregarMateria(m3);
        
        a2.agregarMateria(m1);
        a2.agregarMateria(m2);
        a2.agregarMateria(m3);
        a2.agregarMateria(m3);
        
        Set <Alumno> alumnosColegio = new HashSet<Alumno>();
       
        alumnosColegio.add(a1);
        alumnosColegio.add(a2);
        
        for(Alumno alum : alumnosColegio)
        {
            System.out.println(alum.cantidadMaterias());
            System.out.println(alum.getNombre()+" "+alum.getApellido()+" "+alum.getLegajo());
        }
    }
    
}
