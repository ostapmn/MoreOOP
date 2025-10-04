package ua.edu.ucu.apps.lab4.strategy;

import ua.edu.ucu.apps.lab4.Character;

public class ElfKickStrategy extends KickStrategy{
    @Override
    public void kick(Character main, Character enemy) {
        if (enemy.getPower() < main.getPower()){
            enemy.setHp(0);
        }
        else{
            main.setHp(main.getHp()-1);
        }

    }
}
