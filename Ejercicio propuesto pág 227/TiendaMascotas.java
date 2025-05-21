package tiendamascotas;

public class TiendaMascotas 
{

    public static void main(String[] args) 
    {
        PerroPequeño caniche = new PerroPequeño("Buddy", 2, "Blanco", 5.0, false, PerroPequeño.RazaPerroPequeño.Caniche);
        System.out.println(caniche);
        Perro.sonido();

        System.out.println("---");
        
        GatoPeloLargo angora = new GatoPeloLargo("Whiskers", 3, "Crema", 1.5, 2.0, GatoPeloLargo.RazaGatoPeloLargo.Angora);
        System.out.println(angora);
        Gato.sonido();

        System.out.println("---");

        PerroGrande doberman = new PerroGrande("Max", 4, "Negro", 40.0, true, PerroGrande.RazaPerroGrande.DOBERMAN);
        System.out.println(doberman);

        System.out.println("---");

        GatoSinPelo esfinge = new GatoSinPelo("Cleo", 1, "Gris", 1.2, 1.8, GatoSinPelo.RazaGatoSinPelo.Esfinge);
        System.out.println(esfinge);
    } 
}