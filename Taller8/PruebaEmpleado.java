public class PruebaEmpleado {
    
    public static void main(String[] args) {
        
        Empleado empleado1 = new Empleado();

        empleado1.setNombre("Sharooll<3");
        empleado1.setSalario(500000);

        empleado1.mostrarInfo();

        System.out.println(" ");

        Gerente gerente1 = new Gerente();

        gerente1.setNombre("Carlos");
        gerente1.setSalario(300000);
        gerente1.setDepartamento("Marketing");

        gerente1.mostrarInfo();

        System.out.println(" ");

    }
}
