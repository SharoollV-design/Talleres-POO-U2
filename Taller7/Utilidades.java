public class Utilidades {
    
    public double suma(double n1, double n2) {
        return n1 + n2;
    }

    public double resta(double n1, double n2) {
        return n1 - n2;
    }

    public double multiplicacion(double n1, double n2) {
        return n1 * n2;
    }

    public double division(double n1, double n2) {

        if(n2 == 0){

            System.out.println("Dato errado: No es posible dividir entre cero");
            return 0;
        }

        return n1/n2;
    }
}
