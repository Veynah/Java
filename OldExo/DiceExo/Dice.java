package DiceExo;

import java.util.Random;

public class Dice{
  private static Random rand = new Random();

  public static int diceRoller(int nbrFace, int nbrJet){
    int sum = 0;
    for (int i = 0; i < nbrJet; i++){
      sum += rand.nextInt(nbrFace) + 1;
    }
    return sum;
  }
}
