public class PruebaEmpleado {
    
    public static void main(String[] args) {

        Empleado gerente = new Gerente("Sharoll", 1200);
        Empleado vendedor = new Vendedor("Viviana", 2);

        gerente.mostrarSalario();
        gerente.mostrarRol();

        System.out.println(" ");

        vendedor.mostrarSalario();
        vendedor.mostrarRol();

        // Empleado empleado = new Empleado("Sofia")
        // No se puede crear un objeto de una clase abstracta
    }
}
