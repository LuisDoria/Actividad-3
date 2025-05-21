package propuesto2;

public class Propuesto2 {

    public static void main(String[] args) {
        
        Persona p1 = new Persona("Ana Garcia", "Calle 10 # 20-30");
        System.out.println("Persona 1: " + p1);
        
        System.out.println("\n");
        
        Estudiante e1 = new Estudiante("Luis Doria", "Calle 56 #65-84", "Ingeniería Industrial", 3);
        System.out.println("Estudiante 1: " + e1);
        System.out.println("Carrera de " + e1.getNombre() + ": " + e1.getCarrera());
        
        System.out.println("\n");
        
        Profesor prof1 = new Profesor("Walter Arboleda", "Carrera 5 # 15-25", "Ingeniería de Sistemas", "Titular");
        System.out.println("Profesor 1: " + prof1);
        System.out.println("Departamento del Profesor: " + prof1.getNombre() + ": " + prof1.getDepartamento());
        
        Persona p2 = new Estudiante("Laura Perez", "Cra. 8 # 12-34", "Ingeniería Administrativa", 5);
        Persona p3 = new Profesor("Jorge Ramirez", "Cll. 2 # 5-60", "Ciencias de la Computación", "Asociado");
        
        System.out.println("Persona 2 (Estudiante): " + p2);
        System.out.println("Persona 3 (Profesor): " + p3);
                
    }
}