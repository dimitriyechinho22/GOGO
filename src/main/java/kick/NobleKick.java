package kick;

import lotr.Character;

public class NobleKick implements BasicKick {
    @Override
    public void kick(Character whoKick, Character whoIsKicked) {
        whoIsKicked.setHp(whoIsKicked.getHp() - whoKick.getPower());
    }
}