package com.trainjpa;

import static java.lang.System.out;

public class Weapon {

    //  public static final String ANSI_RESET = "\u001B[0m";
    //   public static final String ANSI_BLACK = "\u001B[30m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    //   public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_BLUE = "\u001B[34m";
    //  public static final String ANSI_PURPLE = "\u001B[35m";
    public static final String ANSI_CYAN = "\u001B[36m";
    public static final String ANSI_WHITE = "\u001B[37m";

    String WeaponName;
    int id;
    int damage;
    double hitPercentage;

    public void PrintWeaponSettings() {
        System.out.println(ANSI_GREEN + "Weapon name : " + ANSI_BLUE + this.WeaponName + ANSI_RED + " with ID = " + this.id);
        System.out.println(ANSI_GREEN + "Weapon damage : " + ANSI_CYAN + this.damage + " HP");
        System.out.println(ANSI_GREEN + "Weapon hit percentage: " + ANSI_WHITE + this.hitPercentage * 100 + " %");
    }
}
