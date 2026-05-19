public class PruebaUtilidades {
    
    public static void main(String[] args) {

        Utilidades op = new Utilidades();

        System.out.println( " ~~~ Operaciones ~~~");

        System.out.println("\nSuma ");
        System.out.println("La suma es 15 + 35 = " + op.suma(15,35));

        System.out.println("\nResta ");
        System.out.println("La resta es 20 - 8 = " + op.resta(20, 8));

        System.out.println("\nMultiplicacion: ");
        System.out.println("La multiplicacion es 7 * 6 = " + op.multiplicacion(7, 6));

        System.out.println("Division ");
        System.out.println("La division es 15/3 =  " + op.division(15, 3));

        System.out.println("\nDivision invalida ");
        System.out.println("La division es 9/0 = " + op.division(9, 0));
    }
}
