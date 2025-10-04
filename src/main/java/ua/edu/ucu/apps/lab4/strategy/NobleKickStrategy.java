package ua.edu.ucu.apps.lab4.strategy;

import ua.edu.ucu.apps.lab4.Character;

import java.util.Random;

public class NobleKickStrategy extends KickStrategy{

    private static Random RANDOM = new Random();

    @Override
    public void kick(Character main, Character enemy) {
            enemy.setHp(enemy.getHp() - RANDOM.nextInt(main.getPower()));
    }
    

}
