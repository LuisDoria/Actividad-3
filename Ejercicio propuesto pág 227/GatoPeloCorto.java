package tiendamascotas;

public class GatoPeloCorto extends Gato
{
    public enum RazaGatoPeloCorto
    {
        Azul_Ruso, Británico, Manx, Devon_Rex
    }
    private RazaGatoPeloCorto raza;
    
    public GatoPeloCorto(String nombre, int edad, String color, double alturaSalto, double longitudSalto, RazaGatoPeloCorto raza)
    {
        super(nombre, edad, color, alturaSalto, longitudSalto);
        this.raza = raza;
    }
    
    public RazaGatoPeloCorto getRaza()
    {
        return raza;
    }
    
    public String toString()
    {
        return super.toString() + (", Categoría: Pelo Corto, Raza: " + raza);
    }
}
