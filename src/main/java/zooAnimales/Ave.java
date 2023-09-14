package zooAnimales;

import java.util.ArrayList;

public class Ave extends Animal {
    private static ArrayList<Ave> listado;
    public int halcones;
    public int aguilas;
    private String colorPlumas;

    public Ave() {
        super();
        listado.add(this);
    }
  
    public Ave(String nombre, int edad, String habitat, String genero, String colorPlumas) {
        super(nombre, edad, habitat, genero);
        this.colorPlumas = colorPlumas;
        listado.add(this);
    }

    public void cantidadAves() {}

    public String movimiento() {
        return "volar";
    }
    
    public void crearHalcon() {}
    public void crearAguila() {}
}