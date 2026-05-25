interface Volador {

   public void volar();
}

interface Cantante {

    public void cantar();
}

public class Ave implements Volador, Cantante {
    
    private String nombre;

    public Ave(String nombre){
        this.nombre = nombre;
    }

    public String getNombre(){
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public void volar(){
        System.out.println(nombre + " esta volando");
    }

    @Override 
    public void cantar(){
        System.out.println(nombre + " esta cantando");
    }
}
