package propuesto2;

public class Estudiante extends Persona
{
    String carrera;
    int semestre;
    
    public Estudiante(String nombre, String direccion, String carrera, int semestre)
    {
        super(nombre, direccion);
        this.carrera = carrera;
        this.semestre = semestre;
    }
    
    public String getCarrera()
    {
        return carrera;
    }
    
    public int getSemestre()
    {
        return semestre;
    }
    
    public void setCarrera(String carrera)
    {
        this.carrera = carrera;
    }
    
    public void setSemestre(int semestre)
    {
        this.semestre = semestre;
    }
    
    public String toString()
    {
        return super.toString() + (", Carrera: " + carrera + ", Semestre: " + semestre);
    }
    
}
