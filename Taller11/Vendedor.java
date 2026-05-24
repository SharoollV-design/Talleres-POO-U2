public class Vendedor extends Empleado{

    private int numeroVentas;

    public Vendedor(String nombre, int numeroVentas){
        super(nombre);
        this.numeroVentas = numeroVentas;
    }

    public int getNumeroVentas(){
        return numeroVentas;
    }

    public void setNumeroVentas(int numeroVentas) {
        if(numeroVentas > 0) {
            this.numeroVentas = numeroVentas;
        } else {
            System.out.println("Numero de ventas invalido");
        }
    }

    @Override
    public double calcularSalario(){ 
        double comisionVenta = 50;

        return numeroVentas * comisionVenta;
    }
}
