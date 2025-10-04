package ua.edu.ucu.apps.lab4;

import ua.edu.ucu.apps.lab4.strategy.ElfKickStrategy;

public class Elf extends Character {
    public Elf() {
        super(10, 10, new ElfKickStrategy());
    }

    @Override
    public String toString() {
        return "Elf{hp=" + getHp() + ", power=" + getPower() + "}";
    }
}
