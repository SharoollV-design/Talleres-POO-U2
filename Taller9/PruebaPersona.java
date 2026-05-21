public class PruebaPersona {
    
    public static void main(String[] args) {
        
        Persona persona1 = new Persona("Ana sofi", 20);

        Empleado empleado1 = new Empleado("Sharooll", 25, "Marketing");

        System.out.println(" ~~ Datos persona ~~");
        persona1.mostrarDetalles();

        System.out.println(" ");

        System.out.println(" ~~ Datos empleado ~~");
        empleado1.mostrarDetalles();

    }
}
