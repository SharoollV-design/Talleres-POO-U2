public class PruebaAnimal {
    
    public static void main(String[] args) {
        
        Volador animal1 = new Animal("Colibri");

        Nadador animal2 = new Animal("Nutria");

        Animal animal3 = new Animal("Pato");

        animal1.volar();

        System.out.println(" ");

        animal2.nadar();

        System.out.println(" ");

        animal3.volar();

        System.out.println(" ");

        animal3.nadar();
    }
}
