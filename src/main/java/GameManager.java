import lotr.Character;
import lotr.CharacterFactory;
import lotr.Elf;
import lotr.Hobbit;

public class GameManager {
    private static final String new_line = "\n";
    public static void fight(Character c1, Character c2) {
        System.out.println(new_line);
        System.out.println(c1.getClass().getSimpleName() + " with health " + c1.getHp() +" fights " + c2.getClass().getSimpleName() + " with health " + c2.getHp());
        System.out.println(new_line);
        if (c1 instanceof Elf && c2 instanceof Elf)
        {
            System.out.println(new_line);
            System.out.println("Elf fights against Elf");
            System.out.println(new_line);
            return;
        }
        if (c1 instanceof Hobbit && c2 instanceof Hobbit)
        {
            System.out.println(new_line);
            System.out.println("Hobbit can't fight against Hobbit");
            System.out.println(new_line);
            return;
        }
        int round = 1;
        while (c1.isAlive() && c2.isAlive()) {
            System.out.println(new_line);
            System.out.println(round + " round ");
            System.out.println(c1.getClass().getSimpleName() + " hits " + c2.getClass().getSimpleName() + " with power " + c1.getPower());
            c1.kick(c2);
            if(!c2.isAlive()){
                break;
            }
            System.out.println(c2.getClass().getSimpleName() + " hits " + c1.getClass().getSimpleName() + " with power " + c2.getPower());
            c2.kick(c1);
            round++;
        }
        System.out.println(new_line);
        if (c1.isAlive()) {
            System.out.println(c1.getClass().getSimpleName() + " won the fight");

        }
        else {
            System.out.println(c2.getClass().getSimpleName() + " won the fight");
        }

    }

    public static void main(String[] args) {
        Character c1 = CharacterFactory.createCharacter();
        Character c2 = CharacterFactory.createCharacter();
        fight(c1, c2);

    }
}
