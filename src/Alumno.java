

import java.util.ArrayList;


public class Alumno {
    
    private int legajo;
    private String apellido;
    private String nombre;
    private Materia materia;
    private ArrayList <Materia> lisMateria;

    public Alumno(int legajo, String apellido, String nombre) {
        this.legajo = legajo;
        this.apellido = apellido;
        this.nombre = nombre;
        lisMateria = new ArrayList <>();
    }

    public int getLegajo() {
        return legajo;
    }

    public void setLegajo(int legajo) {
        this.legajo = legajo;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) 
    {
        this.nombre = nombre;
    }
    
    public void agregarMateria (Materia m)
    {
        int f =0;
        for(Materia a : lisMateria)
        {
            if (a.equals(m))
                     f++;
        }
        if (f == 0)
            lisMateria.add(m);
        else
            System.out.println("ya se encuentra inscripto en esta materia");
    }

    public int cantidadMaterias ()
    {
        return lisMateria.size();
    }

}
