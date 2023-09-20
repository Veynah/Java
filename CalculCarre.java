import java.util.Scanner;

public class CalculCarre {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Veuillez entrer un int: ");
        int nombre = scanner.nextInt();
        int resultat = carre(nombre);
        System.out.println("Le carré de " + nombre + " est: " + resultat);
        scanner.close();
    }

    public static int carre(int x) {
        return x * x;
    }
    
}
