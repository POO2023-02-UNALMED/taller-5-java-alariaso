package zooAnimales;

import gestion.Zona;

public class Animal {
  private static int totalAnimales;
  private String nombre;
  private int edad;
  private String habitat;
  private String genero;
  private Zona zona;

  public Animal() {
    totalAnimales++;
  }

  public Animal(String nombre, int edad, String habitat, String genero) {
      this.nombre = nombre;
      this.edad = edad;
      this.habitat = habitat;
      this.genero = genero;
      totalAnimales++;
  }

  public void movimiento() {}

  public static String totalPorTipo() {
    int numMamiferos = 0;
    int numAves = 0;
    int numReptiles = 0;
    int numPeces = 0;
    int numAnfibios = 0;
    return String.format(
      "Mamiferos: %d\nAves: %d\nReptiles: %d\nPeces: %d\nAnfibios: %d",
      numMamiferos, numAves, numReptiles, numPeces, numAnfibios
    );
  }

  public String toString() {
      return String.format(
        "Mi nombre es %s, tengo una edad de %d, habito en %s y mi genero es\n" + //
          "%s, la zona en la que me ubico es %s, en el %s",
          nombre, edad, habitat, genero, zona, zoo);
  }
}