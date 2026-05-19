public class Empleado {
    public String nombre; 
    private double salario;

    public Empleado(String nombre, double salario) {
        this.nombre = nombre;
        setSalario(salario);
    }

    public double getSalario(){
        return salario;
    }

    public void setSalario(double salario){
        if (salario <= 0) {
            System.out.println("El salario debe ser mayor a 0");
            return;
        }

        if (salario >= 1000000) {
            System.out.println("Salario errado, fuera de rango");
        }

        this.salario = salario;
        System.out.println("Nuevo salario");
    }

    public void mostrarInfo(){
        System.out.println( " ~~~~~~ Empleados Colombina ~~~~~~");
        System.out.println("       Datos empleado         ");
        System.out.println("Nombre: " + nombre);
        System.out.println("Salario: $"  + salario);
    }

}
