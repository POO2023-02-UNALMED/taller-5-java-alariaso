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

  public String movimiento() {
    return "desplazarse";
  }

  public static String totalPorTipo() {
    int numMamiferos = Mamifero.cantidadMamiferos();
    int numAves = Ave.cantidadAves();
    int numReptiles = Reptil.cantidadReptiles();
    int numPeces = Pez.cantidadPeces();
    int numAnfibios = Anfibio.cantidadAnfibios();
    return String.format(
      "Mamiferos: %d\nAves: %d\nReptiles: %d\nPeces: %d\nAnfibios: %d",
      numMamiferos, numAves, numReptiles, numPeces, numAnfibios
    );
  }

  public String toString() {
    String zoo = zona.getZoo().getNombre();
      return String.format(
        "Mi nombre es %s, tengo una edad de %d, habito en %s y mi genero es\n" + //
          "%s, la zona en la que me ubico es %s, en el %s",
          nombre, edad, habitat, genero, zona, zoo);
  }
  
  public String getNombre() {
    return nombre;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public int getEdad() {
    return edad;
  }

  public void setEdad(int edad) {
    this.edad = edad;
  }

  public String getHabitat() {
    return habitat;
  }

  public void setHabitat(String habitat) {
    this.habitat = habitat;
  }

  public String getGenero() {
    return genero;
  }

  public void setGenero(String genero) {
    this.genero = genero;
  }

}