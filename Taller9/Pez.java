public class Pez extends Animal {
    
    private String tipoDeAgua;

    public Pez() {

    }

    public Pez(String especie, String tipoDeAgua) {
        super(especie);
        this.tipoDeAgua = tipoDeAgua;
    }

    public String getTipoDeAgua(){
        return tipoDeAgua;
    }

    public void setTipoDeAgua(String tipoDeAgua){
        if(tipoDeAgua != null && !tipoDeAgua.trim().isEmpty()){
            this.tipoDeAgua = tipoDeAgua;
        } else {
            System.out.println("El tipo de agua no debe estar vacío");
        }
    }

    public void mostrarInfo(){
        super.mostrarEspecie();

        System.out.println("Tipo de agua: " + tipoDeAgua);
    }
}
