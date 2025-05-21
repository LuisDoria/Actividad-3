package tiendamascotas;

public abstract class Mascota
{
    protected String nombre;
    protected int edad;
    protected String color;

    public Mascota(String nombre, int edad, String color)
    {
        this.nombre = nombre;
        this.edad = edad;
        this.color = color;
    }

    public String getNombre()
    {
        return nombre;
    }

    public int getEdad() 
    {
        return edad;
    }

    public String getColor() 
    {
        return color;
    }
    
    public String toString()
    {
        return String.format("Nombre: %s, Edad: %d, Color: %s", nombre, edad, color);
    }
}