public class Empleado extends Persona {
    
    private String departamento;

    public Empleado(){

    }

    public Empleado(String nombre, int edad, String departamento) {
        super(nombre, edad);
        this.departamento = departamento;
    }

    public String getDepartamento(){
        return departamento;
    }
    
    public void setDepartamento(String departamento){
        if(departamento != null && !departamento.trim().isEmpty()) {
            this.departamento = departamento;
        } else {
            System.out.println("El departamento no puede quedar vacio");
        }
    }

    @Override
    public void mostrarDetalles(){
        super.mostrarDetalles();
        System.out.println("Departamento: " + departamento);

    }

}