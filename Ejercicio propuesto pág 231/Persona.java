package propuesto2;

public class Persona 
{
    String nombre;
    String direccion;
    
    public Persona(String nombre, String direccion)
    {
        this.nombre = nombre;
        this.direccion = direccion;
    }
    
    public String getNombre()
    {
        return nombre;
    }
    
    public String getDireccion()
    {
        return direccion;
    }
    
    public void setNombre(String nombre)
    {
        this.nombre = nombre;
    }
    
    public void setDireccion(String direccion)
    {
        this.direccion = direccion;
    }
    
    public String toString()
    {
        return ("Nombre: " + nombre + ", Dirección: " + direccion);
    }
}
