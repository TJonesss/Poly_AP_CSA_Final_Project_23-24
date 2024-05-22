package com.poly.polyapcsafinalproject23_24;

import java.util.Scanner;

public class GameFootballAdventure extends GameActivity {

public class Adventure{

    //instance variables
    //   variables you plan to use throughout the adventure
    private Scanner scan;
    private int numLives;
    //private Player player; (optional)


    public void run()
    {
        //initialize number of lives
        numLives = 5;
        //create a scanner object for user input
        scan = new Scanner(System.in);

        //create a player object (optional)
        //player = new Player(...)

        //display project title and description
        Util.clearConsole();
        System.out.println("You are now on the field");
        System.out.println("make the right plays to win");

        Util.pauseConsole();
        start();
    }

    private void start()
    {
        Util.clearConsole();
        System.out.println("Throw The ball!");
    }


    private void defeat()
    {
        Util.clearConsole();
        System.out.println("Throw The ball!");
    }
        //run method when defeated

    /*
    //lose a life
    //numLives--;

    //clear console, display text, etc
    //System.out.println(...)

    //determine if player gets to play again
    if (numLives > 0)
    {
      //if you still have lives, return to start()
      start();
    }
    else
    {
      //print game over message
    }
    */
    }
}