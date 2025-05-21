package tiendamascotas;

public class Gato extends Mascota
{
    protected double alturaSalto;
    protected double longitudSalto;
    
    public Gato(String nombre, int edad, String color, double alturaSalto, double longitudSalto)
    {
        super(nombre, edad, color);
        this.alturaSalto = alturaSalto;
        this.longitudSalto = longitudSalto;
    }
    
    public static void sonido()
    {
        System.out.println("Los gatos maúllan y ronronean");
    }
    
    public double getAlturaSalto()
    {
        return alturaSalto;
    }
    
    public double getLongitudSalto()
    {
        return longitudSalto;
    }
    
    public String toString()
    {
        return super.toString() + (", Altura de Salto: " + alturaSalto + " m, Longitud de Salto: " + longitudSalto + " m");
    }
}