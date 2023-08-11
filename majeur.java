class Majeur {
    public static void main(String[] args){
        System.out.println("Entrez votre age: ");
        int age;
        age = Integer.parseInt(System.console().readLine());

        boolean majeur = age >= 18 ? true : false;

        System.out.println("Majeur: " + majeur);
    } 
}

class MajeurClassique {
    public static void main(String[] args){
        System.out.println("Entrez votre age: ");
        int age;
        age = Integer.parseInt(System.console().readLine());

        boolean majeur; // Est ce qu'il faut définir ces variables au début de l'algorithme comme dans C ?
        if (age >= 18){
            majeur = true;
        }
        else {
            majeur = false;
        }

        System.out.println("Majeur: " + majeur);
    }
}