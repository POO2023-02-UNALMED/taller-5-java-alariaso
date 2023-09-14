package zooAnimales;

import java.util.ArrayList;

public class Mamifero extends Animal {
    private static ArrayList<Mamifero> listado;
    public int caballos;
    public int leones;
    private boolean pelaje;
    private int patas;

    public Mamifero() {
        super();
        listado.add(this);
    }
  
    public Mamifero(String nombre, int edad, String habitat, String genero, boolean pelaje, int patas) {
        super(nombre, edad, habitat, genero);
        this.pelaje = pelaje;
        this.patas = patas;
        listado.add(this);
    }

    public void cantidadMamiferos() {}
    public void crearCaballo() {}
    public void crearLeon() {}
}