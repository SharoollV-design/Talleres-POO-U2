public class Vehiculo {
    
    private String marca;
    private int velocidadMaxima;

    public Vehiculo(){

    }

    public Vehiculo(String marca, int velocidadMaxima){
        this.marca = marca;
        this.velocidadMaxima = velocidadMaxima;
    }

    public String getMarca(){
        return marca;
    }

    public void setMarca(String marca){
        this.marca = marca;
    }

    public int getVelocidadMaxima(){
        return velocidadMaxima;
    }

    public void setVelocidadMarca(int velocidadMaxima){
        if(velocidadMaxima > 0){
            this.velocidadMaxima = velocidadMaxima;
        } else {
            System.out.println("Dato errado: la velocidad debe ser mayor a 0");
        }
    }

    void mostrarInfo(){
        System.out.println(" ~ Bienvenido al concesionario ~ ");
        System.out.println("Marca: " + marca);
        System.out.println("Velocidad maxima: " + velocidadMaxima + "Km/h");
    }
}
