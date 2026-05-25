interface Nadador {

    public void nadar();
}

interface Respirador {

    public void respirar();
}

public class Pez implements Nadador, Respirador {

    private String tipoPez;
    private String nombre; 

    public Pez(){

    }

    public Pez(String tipoPez,String nombre) {
        this.tipoPez = tipoPez;
        this.nombre = nombre;
    }

    public String getTipoPez(){
        return tipoPez;
    }

    public void setTipoPez(String tipoPez){
        if (tipoPez != null && !tipoPez.trim().isEmpty()){
            this.tipoPez = tipoPez;
        } else {
            System.out.println("No puede estar el espacio vacio");
        }
    }

    public String getNombre(){
        return nombre;
    }

    public void setNombre(String nombre){
        if(nombre != null && !nombre.trim().isEmpty()){
            this.nombre = nombre;
        } else {
            System.out.println("No puede estar el espacio vacio");
        }
    }

    @Override
    public void nadar(){
        System.out.println("El pez " + tipoPez + " se llama " + nombre + " y está nadando");
    }

    @Override
    public void respirar(){
        System.out.println("El pez " + tipoPez + " se llama " + nombre + " y está respirando");
    }
    
}
