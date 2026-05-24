public class Gerente extends Empleado {
    
    private double salarioFijo;

    public Gerente(String nombre, double salarioFijo){
        super(nombre);
        this.salarioFijo = salarioFijo;
    }

    public double getSalarioFijo(){
        return salarioFijo;
    }

    public void setSalarioFijo(double salarioFijo){
        if (salarioFijo > 10000) {
            this.salarioFijo = salarioFijo;
        } else {
            System.out.println("Salario invalido");
        }
    }

    @Override
    public double calcularSalario(){
        return salarioFijo;
    }
}
