public class PruebaEmpleado {
    
    public static void main(String[] args) {

        Empleado empleado1 = new Empleado("Sharoll", 50000);
        empleado1.mostrarInfo();

        Empleado empleado2 = new Empleado("Viviana", 13000);
        empleado2.mostrarInfo();

        System.out.println( " ");

        System.out.println("== Datos actuales ==");

        empleado1.setSalario(7000);

        System.out.println("Nombre del empleado 1: " + empleado1.nombre);
        System.out.println("Salario actual: " + empleado1.getSalario());

        System.out.println(" ");

        System.out.println("Nombre del empleado 2: " + empleado2.nombre);
        System.out.println("Salario actual: " + empleado2.getSalario());
    }
}
