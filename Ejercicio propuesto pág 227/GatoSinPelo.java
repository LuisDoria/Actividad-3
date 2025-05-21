package tiendamascotas;

public class GatoSinPelo extends Gato
{
    public enum RazaGatoSinPelo
    {
        Esfinge, Elfo, Donskoy
    }
    private RazaGatoSinPelo raza;
    
    public GatoSinPelo(String nombre, int edad, String color, double alturaSalto, double longitudSalto, RazaGatoSinPelo raza)
    {
        super(nombre, edad, color, alturaSalto, longitudSalto);
        this.raza = raza;
    }
    
    public RazaGatoSinPelo getRaza()
    {
        return raza;
    }
    
    public String toString()
    {
        return super.toString() + (", Categoría: Sin Pelo, Raza: " + raza);
    }
}