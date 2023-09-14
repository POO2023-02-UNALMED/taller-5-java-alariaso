package zooAnimales;

public class Ave extends Animal {
    private Ave[] listado;
    public int halcones;
    public int aguilas;
    private String colorPlumas;

    public Ave() {}
  
    public Ave(String nombre, int edad, String habitat, String genero, String colorPlumas) {
        super(nombre, edad, habitat, genero);
        this.colorPlumas = colorPlumas;
    }

    public void cantidadAves() {}

    public String movimiento() {
        return "volar";
    }
    
    public void crearHalcon() {}
    public void crearAguila() {}
}