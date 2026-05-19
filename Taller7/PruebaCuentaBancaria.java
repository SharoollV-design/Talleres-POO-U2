public class PruebaCuentaBancaria {
    
    public static void main(String[] args) {
        
        CuentaBancaria cuenta1 = new CuentaBancaria("S1234567", 76000, "Ahorros");
        cuenta1.mostrarinfo();

        System.out.println("\nTipo de cuenta: " + cuenta1.tipoCuenta);

        System.out.println("Saldo actual: $" + cuenta1.getSaldo());

        cuenta1.setSaldo(80000);

        cuenta1.mostrarinfo();

        cuenta1.setSaldo(-500);

        // System.out.println(cuenta1.numeroCuenta); 
        // Al tratar de acceder a los datos de numero de cuenta provoca un error de compilación
        // ya que es private numeroCuenta es un dato privateS
    }
}
