
public class Materia {
    
    private String idMateria ;
    private String nombre;
    private int anio;

    public Materia(String idMateria, String nombre, int anio) {
        this.idMateria = idMateria;
        this.nombre = nombre;
        this.anio = anio;
    }

    public String getIdMateria() {
        return idMateria;
    }

    public void setIdMateria(String idMateria) {
        this.idMateria = idMateria;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }
    
    @Override
    public boolean equals(Object obj) 
    {
        if(this == obj)
            return true;
        if(obj == null)
            return false;
        if(getClass() != obj.getClass())
            return false;
        Materia ma = (Materia)obj;
        if(idMateria == null)
        {
            if(ma.idMateria != null)
                return false;
        }
        else
            if(!idMateria.equals(ma.idMateria))
                return false;
        return false;
    }

    @Override
    public int hashCode() 
    {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((idMateria== null) ? 0 : idMateria.hashCode());
        return result;
    }
    
}
