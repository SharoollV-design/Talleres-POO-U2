public class Persona {
    
    private String nombre;
    private int edad;

    public Persona(){

    }

    public Persona(String nombre, int edad){
        this.nombre = nombre;
        this.edad = edad;
    }

    public String getNombre(){
        return nombre;
    }

    public void setNombre(String nombre){
        if(nombre != null && !nombre.trim().isEmpty()) {
            this.nombre = nombre;
        } else {
            System.out.println("El nombre no puede estar vacio");
        }
    }

    public int getEdad(){
        return edad;
    }

    public void setEdad(int edad){
        if(edad > 0) {
            this.edad = edad;
        } else {
            System.out.println("Su edad no puede ser negativa");
        }
    }

    public void mostrarDetalles(){
        System.out.println(" Bienvenidos ");
        System.out.println("Nombre de la persona: " + nombre);
        System.out.println("Edad de la persona: " + edad);
    }
}
