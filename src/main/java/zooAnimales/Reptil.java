package zooAnimales;

public class Reptil extends Animal {
    private Reptil[] listado;
    public int iguanas;
    public int serpientes;
    private String colorEscamas;
    private int largoCola;

    public Reptil() {}

    public Reptil(String nombre, int edad, String habitat, String genero, String colorEscamas, int largoCola) {
        super(nombre, edad, habitat, genero);
        this.colorEscamas = colorEscamas;
        this.largoCola = largoCola;
    }

    public void cantidadReptiles() {}

    public String movimiento() {
        return "reptar";
    }

    public void crearIguana() {}
    public void crearSerpiente() {}
}