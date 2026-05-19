public class Coche  extends  Vehiculo{
    
    private int numeroDePuertas;

    public Coche(){

    }

    public Coche(String marca, int velocidadMaxima, int numeroDePuertas) {
        super(marca, velocidadMaxima);
        this.numeroDePuertas = numeroDePuertas;
    }

    public int getNumeroDePuertas(){
        return numeroDePuertas;
    }

    public void setNumeroDePuertas(int numeroDePuertas){
        if (numeroDePuertas > 0){
            this.numeroDePuertas = numeroDePuertas;
        } else {
            System.out.println("El numero de puertas debe ser mayor a 0");
        }
    }

    @Override
    void mostrarInfo(){

        super.mostrarInfo();
        System.out.println("Numero de puertas: " + numeroDePuertas);
    }
}
