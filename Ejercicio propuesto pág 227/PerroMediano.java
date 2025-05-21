package tiendamascotas;

public class PerroMediano extends Perro
{
    public enum RazaPerroMediano
    {
        Collie, Dálmata, Bullgad, Galgo, Sabueso
    }
    private RazaPerroMediano raza;
    
    public PerroMediano(String nombre, int edad, String color, double peso, boolean muerde, RazaPerroMediano raza)
    {
        super(nombre, edad, color, peso, muerde);
        this.raza = raza;
    }
    
    public RazaPerroMediano getRaza()
    {
        return raza;
    }
    
    public String toString()
    {
        return super.toString() + (", Categoría: Mediano, Raza: " + raza);
    }
}