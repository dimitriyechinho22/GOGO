package lotr;

import java.util.Random;

import kick.NobleKick;

public abstract class Noble extends Character {
    private static final Random rd = new Random();

    public Noble(int bound) {
        super(rd.nextInt(10) + bound, rd.nextInt(10) + bound, new NobleKick());
    }
}