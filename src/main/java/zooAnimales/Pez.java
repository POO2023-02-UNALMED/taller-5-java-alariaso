package zooAnimales;

public class Pez extends Animal {
    private Pez[] listado;
    public int salmones;
    public int bacalaos;
    private String colorEscamas;
    private int cantidadAletas;

    public Pez() {}

    public Pez(String nombre, int edad, String habitat, String genero, String colorEscamas, int cantidadAletas) {
        super(nombre, edad, habitat, genero);
        this.colorEscamas = colorEscamas;
        this.cantidadAletas = cantidadAletas;
    }

    public void cantidadPeces() {}

    public String movimiento() {
        return "nadar";
    }

    public void crearSalmon() {}
    public void crearBacalao() {}
}