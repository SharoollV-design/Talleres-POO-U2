public class PruebaEstudiante {
    
    public static void main(String[] args) {
        
        Persona persona1 = new Persona();

        persona1.setNombre("Carolina");
        persona1.setEdad(20);
        System.out.println("  Datos de la persona ");
        persona1.mostrarInfo();

        System.out.println(" ");

        persona1.presentarse();

        System.out.println("       ");

        Estudiante est1 = new Estudiante();

        est1.setNombre("Lala");
        est1.setEdad(20);
        est1.setMatricula("S20261905");
        System.out.println("  Datos del estudiante ");
        est1.mostrarInfo();

        System.out.println(" ");
        
        est1.presentarse();

        System.out.println("      ");
    }
}
