public class Animal {
    
    private String especie;

    public Animal(){

    }

    public Animal(String especie){
        this.especie = especie;
    }

    public String getEspecie(){
        return especie;
    }

    public void setEspecie(String especie){
        if(especie != null && !especie.trim().isEmpty()){
            this.especie = especie;
        } else {
            System.out.println("La especie no puede estar vacío");
        }
    }

    public void mostrarEspecie(){
        System.out.println(" Bienvenidos al ZOO ");
        System.out.println("Especie: " + especie);
    }
}
