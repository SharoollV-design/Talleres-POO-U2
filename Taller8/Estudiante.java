public class Estudiante extends Persona {
    
    private String matricula;

    public Estudiante(){

    }

    public Estudiante(String nombre, int edad, String matricula) {
        super(nombre, edad);
        this.matricula = matricula;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        if (matricula != null && !matricula.isEmpty()) {
            this.matricula = matricula;
        } else {
            System.out.println("La matricula no puede estar vacia");
        }
    }

    @Override
    public void mostrarInfo(){

        super.mostrarInfo();
        System.out.println("Matricula: " + matricula);
    }

    @Override
    public void presentarse(){
        System.out.println("Hola, soy estudiante");
    }
}
