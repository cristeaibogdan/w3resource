package various.Game;
import java.util.Scanner;

public class Game {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Input NPC hitpoints: ");
        int hp = input.nextInt();
        System.out.println("A wild NPC appears with " + hp + " hit points!");

        System.out.println("Do you want to attack it? [0-Yes/1-No]");
        int decision = input.nextInt();
        System.out.println("Your choice is: " + decision);

        switch (decision) {
            case 0:
                System.out.println("You engage the NPC!");
                System.out.println("Attack with a force of ");

                int dmg = input.nextInt();
                int npc = hp - dmg;

                if (npc == 0 || npc < 0) {
                    System.out.println("The NPC is hit with " + dmg + ", status " + npc + " / " + hp + "!");
                    System.out.println("NPC is dead");
                } else {
                    System.out.println("The NPC is hit with " + dmg + ", status " + npc + " / " + hp + "!");
                }
                while (npc > 0) {
                    System.out.println("Attack again with a force of ");
                    dmg = input.nextInt();
                    npc = npc - dmg;
                    System.out.println("The NPC is hit with " + dmg + ", status " + npc + " / " + hp + "!");
                    if (npc == 0 || npc < 0) {
                        System.out.println("NPC is dead");
                    }
                }
                break;

            case 1:
                System.out.println("Tactical withdrawal!");
                break;

            default:
                System.out.println("Try 0 for Yes, or 1 for No");
                break;
        }
    }
}


