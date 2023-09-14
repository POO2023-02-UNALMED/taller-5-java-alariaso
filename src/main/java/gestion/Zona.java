package gestion;

import zooAnimales.Animal;

public class Zona {
  private String nombre;
  private Zoologico zoo;
  private Animal[] animales;

  public Zona() {}

  public Zona(String nombre, Zoologico zoo) {
    this.nombre = nombre;
    this.zoo = zoo;
  }

  public void agregarAnimales() {}
  public void cantidadAnimales() {}
}