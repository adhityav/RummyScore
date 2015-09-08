//RummyScore v1.0
//written and developed by Adhitya Vadivel
//05 July 2015

//This version only keeps track of score for each player
//Next update (1.1) will include Round # Game #, indicator showing who is open card, display the current round, have hotkeys for wins and fulls
//Future updates will have a visually pleasing GUI and will display cut joker

import java.util.Scanner;
public class RummyScore {
    
    //Create attributes int num, String name, and array score
    static int numPlayer, gameCount;
    static int[] score;
    static String[] name;
   
    public RummyScore() {
        //Create Scanner object
            Scanner key = new Scanner(System.in);
            
        //Prompt user for number of players
            System.out.print("How many players are playing Rummy?  >>>  ");
            numPlayer = key.nextInt();
            if (numPlayer == 1) {
                System.out.println("\nStop playing by yourself and go get some friends!");
            }
            name = new String[numPlayer];

        //Make number array
            score = new int[numPlayer];

        //Prompt user for name of each player and set all values in number array to 0
            System.out.println();
            for (int i = 0; i < numPlayer; i++) {
                System.out.print("What is the name of Player " + (int)(i+1) + "?  >>>  ");
                name[i] = key.next();
                score[i] = 0;
            }
            
        //call print()
            print();
    }
    
    public void print() {
        //Print name__num[] for each value in num[] in a new line
            System.out.println("\n\nRound: " + gameCount/numPlayer + "\tGame: " + gameCount);
            System.out.println("---------------------------------------------");
            for (int i = 0; i < numPlayer; i++) {
                System.out.printf("%-15s", name[i]);
                System.out.printf("%15d", score[i]);
                System.out.println();
            }
            System.out.println("---------------------------------------------\n\n\n");
            
        //Call continueGame()
            continueGame();
    }
    
    public void continueGame() {
        //Create Scanner object
            Scanner key = new Scanner(System.in);
            
        //Prompt user for yes/no gameCount
                System.out.print("Do you want to keep playing? (y/n)  >>>  ");
                if (key.next().charAt(0) == 'y') {
                    add();
                } else if (key.next().charAt(0) == 'n') {
                    System.out.println("Thanks for playing!");
                    System.exit(0);
                }
    }
    
    public void add() {
        //Create Scanner object
            Scanner key = new Scanner(System.in);
            
        //Increment gameCount
            if (gameCount%numPlayer == 0 && gameCount != 0) {
                System.out.print("*** ROUND " + gameCount/numPlayer + " OVER! ***\n\n\n\n");
            }
            gameCount++;   
            
        //When add() is called, prompt user for points and increment their score (fix the printf in this)
            for (int i = 0; i < numPlayer; i++) {
                System.out.print("What is " + name[i] + "'s score?");
                System.out.printf("%s", "  >>>  ");
                if (key.hasNextInt()) {
                    score[i] += key.nextInt();
                } else {
                    if (key.next().charAt(0) == 'q') {
                        continueGame();
                    } else {
                        System.out.println("That is not a number!");
                    }
                }
            }
            
        //Call print() 
            print();
    }
    
    public void openCard() {
        if (gameCount%numPlayer == 0) {
        } else if (gameCount%numPlayer == 0) {
                    } else if (gameCount%numPlayer == 0) {
                                } else if (gameCount%numPlayer == 0) {
        }    
    }
    
}