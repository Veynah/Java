class Amende {
    public static void main(String[] args){
        final int AMENDECLASSIQUE=53, AMENDEKMAGLO=11, AMENDEKMHAGLO=6;
        boolean tribunal = false;

        System.out.println("Veuillez indiquer l'excès de vitesse en Km/h: ");
        int exces = Integer.parseInt(System.console().readLine());

        System.out.println("L'exces de vitesse a ete realise en aglomeration ? y/n");
        String response = System.console().readLine();

        boolean enAgglomeration = "y".equalsIgnoreCase(response);

        if (enAgglomeration){
            if (exces <= 10){
                System.out.println("L'amende vaut :" + AMENDECLASSIQUE);
                return;
            }
            else{
                if (10 < exces && exces <= 30){
                    System.out.println("L'amende vaut: " + AMENDECLASSIQUE + AMENDEKMAGLO*(exces-10));
                    return;
                }
                else{
                    tribunal = true;
                }
            }
        }
        else{
            if (exces <= 10){
                System.out.println("L'amende vaut :" + AMENDECLASSIQUE);
                return;
            }
            else{
                if (10 < exces && exces <= 40){
                    System.out.println("L'amende vaut: " + AMENDECLASSIQUE + AMENDEKMHAGLO*(exces-10));
                    return;
                }
                else{
                    tribunal = true;
                }
            }

        }
        if (tribunal){
            System.out.println("Vous devez aller au tribunal pour cet exces de vitesse.");
        }
    }
    
}
