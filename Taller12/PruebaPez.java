public class PruebaPez {
    
    public static void main(String[] args) {
        
        Nadador pez1 = new Pez("Payaso", "Nemo");

        Respirador pez2 = new Pez("Cirujano azul", "Doryyyy");

        pez1.nadar();

        System.out.println(" ");

        pez2.respirar();
    }
}
