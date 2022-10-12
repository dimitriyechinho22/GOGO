package lotr;
import kick.BasicKick;
public abstract class Character {
    private int hp;
    private int power;
    private BasicKick kick;


    public Character(int hp, int power, BasicKick kick) {
        this.hp = hp;
        this.kick = kick;
        this.power = power;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = Math.max(0,hp);
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }
    public void kick(Character whoIsKicked) {
        kick.kick(this, whoIsKicked);
    }
    public boolean isAlive(){
        return getHp() > 0;
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName() + "{hp=" + hp +
                ", power=" + power +
                '}';
    }
}