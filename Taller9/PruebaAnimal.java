public class PruebaAnimal {
    
    public static void main(String[] args) {
        
        Animal animal1 = new Animal("Perro");

        Pez pez1 = new Pez("Pez payaso", "Salada");

        animal1.mostrarEspecie();
        pez1.mostrarEspecie();
    }
}
