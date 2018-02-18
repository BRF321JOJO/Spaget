package com.mygdx.game;

public class Yam {
    public static void main(String args[]) {

        SweetPotato yam = new SweetPotato(17.5, 100);

        //Referencing (non-static)
        System.out.println(yam.quantity);
        //Prints: 17.5

        //Referencing (static)
        System.out.println(yam.fatcontent);
        //Prints: 0

    }
}
