public class Gerente extends Empleado{
    
    private String departamento;

    public Gerente(){

    }

    public Gerente(String nombre, double salario, String departamento){
        super(nombre, salario);
        this.departamento = departamento;
    }

    public String getDepartamento(){
        return departamento;
    }

    public void setDepartamento(String departamento){
        if(departamento != null && !departamento.trim().isEmpty()) {
            this.departamento = departamento.trim();
        } else {
            System.out.println("El departamento no puede estar vacio");
        }
    }

    @Override
    public void mostrarInfo() {
        System.out.println( " Gerente ");
        System.out.println("Nombre: " + getNombre());
        System.out.println("Salario: " + getSalario());
        System.out.println("Departamento: " + departamento);
    }
}
