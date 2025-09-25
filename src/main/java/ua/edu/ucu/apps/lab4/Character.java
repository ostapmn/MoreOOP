package ua.edu.ucu.apps.lab4;


import lombok.AllArgsConstructor;
import lombok.Data;
import ua.edu.ucu.apps.lab4.strategy.KickStrategy;

@Data
@AllArgsConstructor
public abstract class Character {
    private int power;
    private int hp;
    private KickStrategy kickStrategy;


    public boolean isAlive(){
        return hp>0;
    }

    public void kick(Character enemy){
        kickStrategy.kick(this, enemy);
        // Checking git hub
        // efg
    }


    public static void main(String[] args) {
    }
}