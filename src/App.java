import java.util.Random;
import java.util.Scanner;

public class App {

    public static void meny () {
        System.out.println("Meny SLagsmål 0.1");
        System.out.println("1. Spela spelet");
        System.out.println("2. Sluta spela");

    }


    
    public static void main(String[] args) throws Exception {
        System.out.println("SLAGSMÅL ver 0.1");
        Scanner tb = new Scanner(System.in);
        Random tärning = new Random();

        int val = 0; 

        while (val !=2) {
            meny();
            System.out.println("Välj ditt val 1 eller 2");
            val = tb.nextInt();
            tb.nextLine();
            if (val==1) 
            {
                //spellogik   
                System.out.println("startar spelet");
                int health = 100;
                int health2 = 100;

                

                while (health>0 && health2>0) {
                    int spelar_tal = tärning.nextInt(6);
                    Thread.sleep(100);
                    int dator_tal = tärning.nextInt(6);
                        if (dator_tal>spelar_tal) 
                            {
                                 int damage = tärning.nextInt(7)+7;
                                 health-=damage;
                                System.out.println("You have been hit! Health remaining: "+(health));
                                System.out.println("Enemy combatant has "+health2+" health remaining.");
                                System.out.println("Press enter to keep fighting.");
                                tb.nextLine();
                            }
                        if (spelar_tal>dator_tal) 
                            {
                                int damage2 = tärning.nextInt(7)+7;
                                health2-=damage2;
                                System.out.println("Successfull hit! Enemy health remaining: "+(health2));
                                System.out.println("You have "+health+" health remaining.");
                                System.out.println("Press enter to keep fighting.");
                                tb.nextLine();
                            }

                            if (health<1) {
                                System.out.println("You lost.");
                                
                            }
                            if (health2<1) {
                                System.out.println("You won!");
                                
                            }
                            
                }


            } 
            else if (val==2) {
                    System.out.println("Stänger ner spelet");

            } 
            else {
                    System.out.println("Fel val, snälla skriv in rätt val. ");
                }
    
        }

    }
}
