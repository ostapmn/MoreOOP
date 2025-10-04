package ua.edu.ucu.apps.lab4;

import ua.edu.ucu.apps.lab4.strategy.NobleKickStrategy;

import java.util.Random;

public class Noble extends Character{

    private static Random RANDOM = new Random();

    public Noble(int minPower, int maxPower, int minHp, int maxHp){
        super(RANDOM.nextInt(maxPower-minPower)+minPower,
                RANDOM.nextInt(maxHp-minHp)+minHp, new NobleKickStrategy());
    }

}
