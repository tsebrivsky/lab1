package com.trainjpa;

import java.util.Random;

public class Battle {
    //  public static final String ANSI_RESET = "\u001B[0m";
    //  public static final String ANSI_BLACK = "\u001B[30m";
    public static final String ANSI_RED = "\u001B[31m";
    // public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    //  public static final String ANSI_BLUE = "\u001B[34m";
    //  public static final String ANSI_PURPLE = "\u001B[35m";
    public static final String ANSI_CYAN = "\u001B[36m";
    //   public static final String ANSI_WHITE = "\u001B[37m";

    public Weapon[] weapons;

    Battle() {
        this.weapons = new Weapon[4];
        Lists weaponslist = new Lists();
        this.weapons = weaponslist.listOfWeapons();
    }

    public void BattleStart(String Droid1, String Droid2, int droidweapons[], int hp[]) {

        int winner = 0;
        Droid droid1 = new Droid(Droid1, hp[0], Lists.returnWeaponWithId(droidweapons[0]));

        Droid droid2 = new Droid(Droid1, hp[1], Lists.returnWeaponWithId(droidweapons[1]));
        System.out.println(droid1.hitPercentage);
        System.out.println(droid2.hitPercentage);
        int i = 0;
        while (hp[0] != 0 || hp[1] != 0) {

            int hitted1 = 0, hitted2 = 0;
            i++;
            System.out.println(ANSI_RED + "--------------ROUND " + i + " ----------------------");
            if (Math.random() < droid1.hitPercentage) {
                hitted1 = droid1.damage;
                droid2.DroidHP = droid2.DroidHP - hitted1;
            }
            System.out.println(ANSI_YELLOW + "\n\nDroid -> " + "'" + Droid1 + "'" + " HIT Droid -> " + Droid2 + " for " + hitted1 + " HP");

            if (Math.random() < droid2.hitPercentage) {
                hitted2 = droid2.damage;
                droid1.DroidHP = droid1.DroidHP - hitted2;
            }
            System.out.println(ANSI_YELLOW + "\nDroid-> " + "'" + Droid2 + "'" + " HIT Droid -> " + Droid1 + " for " + hitted2 + " HP");

            System.out.println(ANSI_CYAN + "\n\nDroid HP -> " + Droid1 + " " + droid1.DroidHP + " HP");
            System.out.println("Droid HP -> " + Droid2 + " " + droid2.DroidHP + " HP");
            if (droid1.DroidHP < 0 || droid2.DroidHP < 0) {
                if (droid1.DroidHP < 0)
                    winner = 2;
                else
                    winner = 1;

                break;
            }


        }
        if (winner == 1) {
            System.out.println(ANSI_RED + "Winner is Droid with name : --->>>  " + Droid1 + " CONGRATULATIONS");


        } else {
            System.out.println(ANSI_RED + "Winner is Droid with name : --->>>  " + Droid2 + " CONGRATULATIONS");
        }
    }
}
