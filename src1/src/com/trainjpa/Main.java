package com.trainjpa;

import java.util.List;
import java.util.Scanner;

public class Main {
    //  public static final String ANSI_RESET = "\u001B[0m";
    //  public static final String ANSI_BLACK = "\u001B[30m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    //  public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_BLUE = "\u001B[34m";
    // public static final String ANSI_PURPLE = "\u001B[35m";
    //  public static final String ANSI_CYAN = "\u001B[36m";
    // public static final String ANSI_WHITE = "\u001B[37m";


    public static void PrintStartOfGame() {
        System.out.println(ANSI_GREEN + "\n------------Welcome to 'DROIDS ARENA' fight club-----------");
        System.out.println("\n\nMenu : ");
        System.out.println("1 - " + ANSI_BLUE + " Start new Droid battle" + ANSI_GREEN + "\n2 - " + ANSI_RED + " Exit Game ");
        System.out.println(ANSI_GREEN + "Enter your choise : ");
    }


    public static void main(String[] args) {

        int choose;
        int weapons[] = new int[2];
        int hp[] = new int[2];
        String droid1, droid2;
        Scanner scanner = new Scanner(System.in);
        PrintStartOfGame();

        choose = scanner.nextInt();

        if (choose == 1) {
            Battle battle = new Battle();
            System.out.println(ANSI_GREEN + "\nEnter Droid name for the first player : ");
            droid1 = scanner.next();
            System.out.println(ANSI_GREEN + "Enter Droid name for the second player : ");
            droid2 = scanner.next();
            System.out.println("Enter " + ANSI_RED + "Weapon id " + ANSI_GREEN + "for the first Droid --> " + droid1);
            weapons[0] = scanner.nextInt();
            System.out.println(ANSI_GREEN + "Enter HP for the first Droid --> " + droid1);
            hp[0] = scanner.nextInt();
            System.out.println("Enter " + ANSI_RED + "Weapon id " + ANSI_GREEN + "for the second Droid --> " + droid2);
            weapons[1] = scanner.nextInt();
            System.out.println("Enter HP for the second Droid --> " + droid2);
            hp[1] = scanner.nextInt();
            battle.BattleStart(droid1, droid2, weapons, hp);
        } else System.exit(1);


    }
}
