public class Empleado {
    
    private String nombre;
    private double salario;

    public Empleado(){

    }

    public Empleado(String nombre, double salario){
        this.nombre = nombre;
        this.salario = salario;
    }

    public String getNombre(){
        return nombre;
    }

    public void setNombre(String nombre){
        if (nombre != null && !nombre.trim().isEmpty()) {
            this.nombre = nombre;
        } else {
            System.out.println("El nombre no puede estar vacio");
        }
    }

    public double getSalario(){
        return salario;
    }

    public void setSalario(double salario){
        if(salario > 0) {
            this.salario = salario;
        } else { 
            System.out.println("Salario errado: no puede ser negativo");
        }
    }

    public void mostrarInfo(){
        System.out.println(" Empleados UDC ");
        System.out.println("Nombre: " + nombre);
        System.out.println("Sueldo: " + salario);
    }
}
