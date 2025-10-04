package ua.edu.ucu.apps.lab4;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Random;

import ua.edu.ucu.apps.lab4.Character;

public class CharacterFactory{
    private static Random RANDOM = new Random();
    
    static String[] fullClassNames = {
        "ua.edu.ucu.apps.lab4.Hobbit",
        "ua.edu.ucu.apps.lab4.King",
        "ua.edu.ucu.apps.lab4.Elf",
        "ua.edu.ucu.apps.lab4.Knight"
    };

    static Character createCharacter(){
        int index = RANDOM.nextInt(3);
        try {
            Class<?> cls = Class.forName(fullClassNames[index]);
            Constructor<?> inst = cls.getDeclaredConstructor();
            return (Character) inst.newInstance();
        } catch (ClassNotFoundException | NoSuchMethodException | InstantiationException | IllegalAccessException | IllegalArgumentException | InvocationTargetException e) {
            e.printStackTrace();
            return null;
        }
    }
}
