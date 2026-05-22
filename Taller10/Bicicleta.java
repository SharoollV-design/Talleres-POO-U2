public class Bicicleta extends Vehiculo {
    
    @Override
    // public void moverse(String pedalear) {
    // Es un error porque no está sobrescribiendo, esta llamando un metodo nuevo
    public void moverse(){
        System.out.println("La bicicleta está en movimiento");
    }
}