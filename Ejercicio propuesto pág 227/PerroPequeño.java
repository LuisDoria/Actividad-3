package tiendamascotas;

public class PerroPequeño extends Perro
{
    public enum RazaPerroPequeño
    {
        Caniche, Yorkshire_Terrier, Schnauzer, Chihuahua
    }
    private RazaPerroPequeño raza;
    
    public PerroPequeño(String nombre, int edad, String color, double peso, boolean muerde, RazaPerroPequeño raza)
    {
        super(nombre, edad, color, peso, muerde);
        this.raza = raza;
    }
    
    public RazaPerroPequeño getRaza()
    {
        return raza;
    }
    
    public String toString()
    {
        return super.toString() + (", Categoría: Pequeño, Raza: " + raza);
    }
}
