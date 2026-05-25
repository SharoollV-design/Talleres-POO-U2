interface Hablador {

    public void hablar();
}

interface Trabajador{

    public void trabajar();
}

public class Persona implements Hablador, Trabajador {

    private String nombre;

    public Persona(String nombre){
        this.nombre = nombre;
    }

    public String getNombre(){
        return nombre;
    }

    public void setNombre(String nombre){
        if (nombre != null && !nombre.trim().isEmpty()){
            this.nombre = nombre;   
        } else {
            System.out.println("El nombre está vacío");
        }
    }

    @Override
    public void hablar(){
        System.out.println( nombre + " esta hablando");
    }

    @Override
    public void trabajar() {
        System.out.println(nombre + " esta trabajando");
    }

    
}
