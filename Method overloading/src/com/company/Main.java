package com.company;

public class Main {

    public static void main(String[] args) {
        int newScore=calculateSCore("Vali", 500);
        System.out.println("New score is " + newScore);
        calculateSCore(75);
        calculateSCore();

    }

    public static int calculateSCore(String playerName, int score) {
        System.out.println("PLayer " +  playerName + " scored " + score + " points");
        return score * 1000;
    }

    public static int calculateSCore(int score) {
        System.out.println("Unnamed player scored "  + score + " points");
        return score * 1000;
    }
    public static int calculateSCore() {
        System.out.println("Unnamed player name, no player score.");
        return 0;
    }
}

