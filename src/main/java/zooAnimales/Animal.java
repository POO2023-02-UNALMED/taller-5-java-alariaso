package zooAnimales;

import gestion.Zona;

public class Animal {
  private int totalAnimales;
  private String nombre;
  private int edad;
  private String habitat;
  private String genero;
  private Zona zona;

  public Animal() {}

  public Animal(String nombre, int edad, String habitat, String genero) {
      this.nombre = nombre;
      this.edad = edad;
      this.habitat = habitat;
      this.genero = genero;
  }

  public void movimiento() {}
  public void totalPorTipo() {}
  public String toString() {
      return "";
  }
}