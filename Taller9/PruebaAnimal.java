public class PruebaAnimal {
    
    public static void main(String[] args) {
        
        Animal animal1 = new Animal("Perro");

        Pez pez1 = new Pez("Pez payaso", "Salada");

        animal1.mostrarEspecie();
        pez1.mostrarEspecie();

        // Si intento llamar utilizar super en una clase padre me arroja un error de compilación
        // pasa lo mismo si lo intento hacer con un atributo private
        // System.out.println(super.especie);
    }
}
