package zooAnimales;

public class Anfibio extends Animal {
    private Anfibio[] listado;
    public int ranas;
    public int salamandras;
    private String colorPiel;
    private boolean venenoso;

    public Anfibio() {}
  
    public Anfibio(String nombre, int edad, String habitat, String genero, String colorPiel, boolean venenoso) {
        super(nombre, edad, habitat, genero);
        this.colorPiel = colorPiel;
        this.venenoso = venenoso;
    }

    public void cantidadAnfibios() {}
    public void movimiento() {}
    public void crearRana() {}
    public void crearSalamandra() {}
}