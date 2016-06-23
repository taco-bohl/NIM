
import com.sun.media.jfxmedia.track.Track;
import java.util.Random;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author t.bohl
 */
public class mainText {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        //Players
        Player chris = new Player("Chris", 100, true);
        Player bob = new Player("Bob", 66, true);
        Player tom = new Player("Tom", 33, true);
        Player greg = new Player("Greg", 0, true);
        Game myGame;
        String restart = new String();

        
            System.out.println("Would you like to play a game of Nim?");
            System.out.print("Enter Y to begin:");
            String start = scan.nextLine();
            while ("Y".equals(start) || "y".equals(start)) {
                System.out.println("What type of game would you like to play?");
                System.out.println("1. Human vs. Human");
                System.out.println("2. Human vs. Computer");
                System.out.println("3. Computer vs. Computer");
                System.out.println("Please make a selection by entering a number 1-3.");
                while (!scan.hasNextInt() && scan.nextInt() != 1 && scan.nextInt() != 2 && scan.nextInt() != 3) {
                    scan.nextLine();
                    System.out.println("That's not a number 1-3");
                    System.out.print("Please enter a number 1-3: ");
                }
                int value = scan.nextInt();
                scan.nextLine();
                //player selection
                if (value == 1) {
                    System.out.println("Player 1, please enter your name:");
                    Player player1 = new Player(scan.nextLine());
                    System.out.println("Player 2, please enter your name:");
                    Player player2 = new Player(scan.nextLine());
                    //game selection
                    System.out.println(
                            "Choose the number of marbles that will be used:\n1. Standard (21 marbles)\n2. Random (17-57 marbles)\n3. Custom (1-100 marbles)");
                    System.out.println("Please make a selection by entering a number 1-3.");
                    while (!scan.hasNextInt() && scan.nextInt() != 1 && scan.nextInt() != 2 && scan.nextInt() != 3) {
                        scan.nextLine();
                        System.out.println("That's not a number 1-3");
                        System.out.print("Please enter a number 1-3: ");
                    }
                    int input = scan.nextInt();
                    Random rand = new Random();
                    scan.nextLine();

                    if (input == 1) {
                        myGame = new Game(player1, player2, 21);
                    } else if (input == 2) {
                        myGame = new Game(player1, player2, rand.nextInt(57 - 17 + 1) + 17);
                    } else {
                        System.out.print("Enter the amount of marbles: ");
                        while (!scan.hasNextInt() && scan.nextInt() > 100 && scan.nextInt() < 1) {
                            System.out.println("That's not a number 1-100.");
                            System.out.print("Please enter a number 1-100: ");
                        }
                        input = scan.nextInt();
                        myGame = new Game(player1, player2, input);
                        scan.nextLine();

                    }
                } //player selection
                else if (value == 2) {
                    System.out.println("Player 1, please enter your name:");
                    Player player1 = new Player(scan.nextLine());
                    Player player2 = null;

                    System.out.println("Please select a computer opponent:\n1) Chris: Extreme\n2) Bob: Hard\n3) Tom: Medium\n4) Greg: Easy");
                    while (!scan.hasNextInt() && scan.nextInt() != 1 && scan.nextInt() != 2 && scan.nextInt() != 3 && scan.nextInt() != 4) {
                        scan.nextLine();
                        System.out.println("That's not a number 1-3");
                        System.out.print("Please enter a number 1-3: ");
                    }
                    int input = scan.nextInt();
                    if (input == 1) {
                        player2 = chris;
                        chris.isComputerControlled();
                    } else if (input == 2) {
                        player2 = bob;
                        bob.isComputerControlled();
                    } else if (input == 3) {
                        player2 = tom;
                        tom.isComputerControlled();
                    } else if (input == 4) {
                        player2 = greg;
                        greg.isComputerControlled();
                    }

                    //game selection
                    System.out.println(
                            "Choose the number of marbles that will be used:\n1. Standard (21 marbles)\n2. Random (17-57 marbles)\n3. Custom (1-100 marbles)");
                    System.out.println("Please make a selection by entering a number 1-3.");
                    while (!scan.hasNextInt() && scan.nextInt() != 1 && scan.nextInt() != 2 && scan.nextInt() != 3) {
                        scan.nextLine();
                        System.out.println("That's not a number 1-3");
                        System.out.print("Please enter a number 1-3: ");
                    }
                    input = scan.nextInt();
                    Random rand = new Random();

                    if (input == 1) {
                        myGame = new Game(player1, player2, 21);
                    } else if (input == 2) {
                        myGame = new Game(player1, player2, rand.nextInt(57 - 17 + 1) + 17);
                    } else {
                        System.out.print("Enter the amount of marbles: ");
                        while (!scan.hasNextInt() && scan.nextInt() > 100 && scan.nextInt() < 1) {
                            System.out.println("That's not a number 1-100.");
                            System.out.print("Please enter a number 1-100: ");
                        }
                        input = scan.nextInt();
                        myGame = new Game(player1, player2, input);
                    }

                } //player selection
                else {
                    Player player1 = null;
                    Player player2 = null;
                    System.out.println("Please select a computer opponent:\n1) Chris: Extreme\n2) Bob: Hard\n3) Tom: Medium\n4) Greg: Easy");
                    while (!scan.hasNextInt() && scan.nextInt() != 1 && scan.nextInt() != 2 && scan.nextInt() != 3 && scan.nextInt() != 4) {
                        scan.nextLine();
                        System.out.println("That's not a number 1-3");
                        System.out.print("Please enter a number 1-3: ");
                    }
                    int input = scan.nextInt();
                    if (input == 1) {
                        player1 = chris;
                        chris.isComputerControlled();
                    } else if (input == 2) {
                        player1 = bob;
                        bob.isComputerControlled();
                    } else if (input == 3) {
                        player1 = tom;
                        tom.isComputerControlled();
                    } else if (input == 4) {
                        player1 = greg;
                        greg.isComputerControlled();

                    }
                    System.out.println("Please select a computer opponent:\n1) Chris: Extreme\n2) Bob: Hard\n3) Tom: Medium\n4) Greg: Easy");
                    while (!scan.hasNextInt() && scan.nextInt() != 1 && scan.nextInt() != 2 && scan.nextInt() != 3 && scan.nextInt() != 4) {
                        scan.nextLine();
                        System.out.println("That's not a number 1-3");
                        System.out.print("Please enter a number 1-3: ");
                    }
                    input = scan.nextInt();
                    if (input == 1) {
                        player2 = chris;
                        chris.isComputerControlled();
                    } else if (input == 2) {
                        player2 = bob;
                        bob.isComputerControlled();
                    } else if (input == 3) {
                        player2 = tom;
                        tom.isComputerControlled();
                    } else if (input == 4) {
                        player2 = greg;
                        greg.isComputerControlled();
                    }
                    //game selection
                    System.out.println(
                            "Choose the number of marbles that will be used:\n1. Standard (21 marbles)\n2. Random (17-57 marbles)\n3. Custom (1-100 marbles)");
                    System.out.println("Please make a selection by entering a number 1-3.");
                    while (!scan.hasNextInt() && scan.nextInt() != 1 && scan.nextInt() != 2 && scan.nextInt() != 3) {
                        scan.nextLine();
                        System.out.println("That's not a number 1-3");
                        System.out.print("Please enter a number 1-3: ");
                    }
                    input = scan.nextInt();
                    Random rand = new Random();

                    if (input == 1) {
                        myGame = new Game(player1, player2, 21);
                    } else if (input == 2) {
                        myGame = new Game(player1, player2, rand.nextInt(57 - 17 + 1) + 17);
                    } else {
                        System.out.print("Enter the amount of marbles: ");
                        while (!scan.hasNextInt() && scan.nextInt() > 100 && scan.nextInt() < 1) {
                            System.out.println("That's not a number 1-100.");
                            System.out.print("Please enter a number 1-100: ");
                        }
                        input = scan.nextInt();
                        myGame = new Game(player1, player2, input);
                    }

                }
                while (!myGame.isGameOver()) {
                    myGame.nextPlayer();
                    System.out.print("Its " + myGame.getCurrentPlayer().getName() + "'s turn.");
                    myGame.displayPile();
                    myGame.getMarblesRemaining();
                    if (myGame.getCurrentPlayer().isComputerControlled()) {
                        int input = myGame.getCurrentPlayer().takeTurn(myGame.getMarblesRemaining());
                        myGame.removeFromPile(input);
                    } else {

                        System.out.print("Enter amount of marbles to remove 1-3: ");
                        while (!scan.hasNextInt() && scan.nextInt() != 1 && scan.nextInt() != 2 && scan.nextInt() != 3) {
                            scan.nextLine();
                            System.out.println("That's not a number 1-3");
                            System.out.print("Please enter a number 1-3: ");
                        }
                        int input = scan.nextInt();
                        myGame.removeFromPile(input);
                    }

                }
                scan.nextLine();
                System.out.print(myGame.getCurrentPlayer().getName() + " You win!\nWould you like to play again? Enter Y: Yes\nN: No");
                start = scan.nextLine();
            }
            
        
    }
}
