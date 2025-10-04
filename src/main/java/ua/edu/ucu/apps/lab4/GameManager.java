package ua.edu.ucu.apps.lab4;


public class GameManager {
    static Character fighter1 = (Character) CharacterFactory.createCharacter();
    static Character fighter2 = (Character) CharacterFactory.createCharacter();
    static String fighter1Type = fighter1.getClass().getSimpleName();
    static String fighter2Type = fighter2.getClass().getSimpleName();

    public static void fight(){
        if (fighter1Type.equals("Hobbit") && fighter2Type.equals("Hobbit")){
            System.out.println("Nobody wins");
        }
        else{
        while (fighter1.getHp()>0 && fighter2.getHp()>0){
            System.out.println("Fighter 1 is " + fighter1Type + " " + fighter1.getHp() + " " +fighter1.getPower());
            System.out.println("Fighter 2 is " + fighter2Type + " " + fighter2.getHp() + " " +fighter2.getPower());
            fighter1.kick(fighter2);
            fighter2.kick(fighter1);
        }
        if (fighter1.getHp()>fighter2.getHp()){
            System.out.println("Fighter 1 wins!!!");
        }
        else{
            System.out.println("Fighter 2 wins!!!");

        }
    }
    }
    
    public static void main(String[] args) {
        fight();
    }
}
