package CarExo;

public class Car {
  private String brand;
  private String modele;
  private int nbrDoors;
  private String color;
  private int horsePower;
  private boolean driving;
  
  public String getBrand(){
    return brand;
  }  

  public String getModele(){
    return modele;
  }

  public int getNbrDoors(){
    return nbrDoors;
  }

  public String getColor(){
    return color;
  }

  public int getHorsePower(){
    return horsePower;
  }

  public boolean isDriving(){
    return driving;
  }

  public Car(String brand, String modele, int nbrDoors, String color, int horsePower, boolean driving){
    this.brand=brand;
    this.modele=modele;
    this.nbrDoors=nbrDoors;
    this.color=color;
    this.horsePower=horsePower;
    this.driving=driving;
  }
}
