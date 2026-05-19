public class Persona {
    
    private String nombre;
    private int edad;

    public Persona(){

    }

    public Persona(String nombre, int edad){
        this.nombre = nombre;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre){
       if(nombre != null && !nombre.trim().isEmpty()) {
        this.nombre = nombre;
       } else {
        System.out.println("El nombre no puede estar vacio");
       }
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad){
        if(edad > 0){
            this.edad = edad;
        } else {
            System.out.println("La edad debe ser mayo a cero");
        }
    }

    public void mostrarInfo(){
        System.out.println( " ~~~ Personas ~~~");
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
    }

    public void presentarse(){
        System.out.println("Hola soy una persona");
    }
  
}
