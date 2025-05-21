package tiendamascotas;

public class GatoPeloLargo extends Gato
{
    public enum RazaGatoPeloLargo
    {
        Angora, Himalayo, Balines, Somalí
    }
    private RazaGatoPeloLargo raza;
    
    public GatoPeloLargo(String nombre, int edad, String color, double alturaSalto, double longitudSalto, RazaGatoPeloLargo raza)
    {
        super(nombre, edad, color, alturaSalto, longitudSalto);
        this.raza = raza;
    }
    
    public RazaGatoPeloLargo getRaza()
    {
        return raza;
    }
    
    public String toString()
    {
        return super.toString() + (", Categoría: Pelo Largo, Raza: " + raza);
    }
}
