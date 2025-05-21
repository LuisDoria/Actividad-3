package tiendamascotas;

public class PerroGrande extends Perro
{
    public enum RazaPerroGrande
    {
        PASTOR_ALEMAN, DOBERMAN, ROTWEILLER
    }
    private RazaPerroGrande raza;

    public PerroGrande(String nombre, int edad, String color, double peso, boolean muerde, RazaPerroGrande raza) 
    {
        super(nombre, edad, color, peso, muerde);
        this.raza = raza;
    }

    public RazaPerroGrande getRaza() 
    {
        return raza;
    }

    public String toString() 
    {
        return super.toString() + ", Categoría: Grande, Raza: " + raza;
    }
}