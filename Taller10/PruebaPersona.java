public class PruebaPersona {
    
    public static void main(String[] args) {
    
        Persona p1 = new Persona("Sharoll");
        Persona p2 = new Estudiante("Sofi", "Mecatronica");
        Persona p3 = new Profesor("Juan Camilo", "Diseño grafico");

        p1.presentarse();
        p2.presentarse();
        p3.presentarse();

    }
}
