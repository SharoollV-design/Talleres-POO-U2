public class PruebaEmpleado {
    
    public static void main(String[] args) {

        Empleado gerente = new Gerente("Sharoll", 1200);
        Empleado vendedor = new Vendedor("Viviana", 2);

        gerente.mostrarSalario();

        System.out.println(" ");

        vendedor.mostrarSalario();
    }
}
