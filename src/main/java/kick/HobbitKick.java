package kick;
import lotr.Character;

import java.util.Random;

public class HobbitKick implements BasicKick {
    @Override
    public void kick(Character whoKick, Character whoIsKicked) {
        System.out.println("GGWP");
    }
}