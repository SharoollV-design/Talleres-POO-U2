public class CuentaBancaria {
    
    private String numeroCuenta;
    private double saldo;
    public String tipoCuenta;

    public CuentaBancaria(String numeroCuenta, double saldo, String tipoCuenta) {
        this.numeroCuenta = numeroCuenta;
        this.tipoCuenta = tipoCuenta;
        setSaldo(saldo);
    }

    public double getSaldo(){
        return saldo;
    }

    public void setSaldo(double saldo){
        if (saldo < 0) {
            System.out.println("El saldo no puede ser negativo");
            return;
        }

        this.saldo = saldo;
        System.out.println("Saldo actualizado");
    }

    public String getNumeroCuenta(){
        return numeroCuenta;
    }

    public void setNumeroCuenta(String numeroCuenta) {
        if (numeroCuenta == null || numeroCuenta.isEmpty()){

            System.out.println("El numero de cuenta no puede estar vacio");
            return;
        }

        this.numeroCuenta = numeroCuenta;
        System.out.println("Numero de cuenta actualizado");
    }

    public void mostrarinfo(){
        
        System.out.println("== Cuentas bancarias Bancolombia ==");
        System.out.println("Numero de cuenta: " + numeroCuenta);
        System.out.println("Tipo de cuenta: " + tipoCuenta);
        System.out.println("Saldo disponible: " + saldo);
        System.out.println(" ==== ====");
    }

}
