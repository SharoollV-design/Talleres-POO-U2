public class PruebaPersona {
    
    public static void main(String[] args) {
        
        Hablador persona1 = new Persona("Pipe");

        Trabajador persona2 = new Persona("Valen");

        Persona persona3 = new Persona("Cata");

        persona1.hablar();

        System.out.println(" ");

        persona2.trabajar();

        System.out.println(" ");

        persona3.hablar();

        System.out.println(" ");

        persona3.trabajar();
    }
}
