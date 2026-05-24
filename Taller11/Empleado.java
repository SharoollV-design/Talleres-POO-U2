abstract  class Empleado {

    private String nombre;
    
    public Empleado(String nombre){
        this.nombre = nombre;
    }
    
    public String getNombre(){
        return nombre;
    }

    public void setNombre(String nombre) {
        if(nombre != null && !nombre.trim().isEmpty()) {
            this.nombre = nombre;
        } else {
            System.out.println("El espacio no debe estar vacío");
        }
    }
    
    abstract double calcularSalario();

    void mostrarSalario(){
        System.out.println("Nombre del empleado: " + getNombre());
        System.out.println("El salario actual es: " + calcularSalario());
    }
}
