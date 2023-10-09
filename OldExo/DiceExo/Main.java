package DiceExo;

public class Main{
  public static void main(String[] args){
    int sum1 = Dice.diceRoller(6,3);
    int sum2 = Dice.diceRoller(20, 1);

    System.out.println("La somme des 3 jets du dé à 6 face vaut: " + sum1);
    System.out.println("Le jet du dé de 20 vaut: " + sum2);
  }
}
