interface Volador {

    public void volar();
}

interface Nadador {

    public void nadar();
}

public class Animal implements Volador, Nadador {

    private String nombre;

    public Animal(String nombre){
        this.nombre = nombre;
    }

    public String getNombre(){
        return nombre;
    }

    public void setNombre(String nombre) {
        if(nombre != null && !nombre.trim().isEmpty()){
            this.nombre = nombre;
        } else {
            System.out.println("El nombre del animal está vacio");
        }
    }

    @Override
    public void volar() {
        System.out.println( nombre + " esta volando");
    }

    @Override
    public void nadar(){
        System.out.println( nombre + " esta nadando");
    }
}
