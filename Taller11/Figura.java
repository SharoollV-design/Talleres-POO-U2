abstract  class Figura {
    
    abstract double calcularArea();

    void mostrarArear() {
        System.out.println("El area es: " + calcularArea());
    }
}
