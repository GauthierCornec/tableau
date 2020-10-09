package com.company;
import java.util.Scanner;

import java.util.Scanner;

public class Main {

    Scanner clavier = new Scanner(System.in);

    public static void main(String[] args) {
        // write your code here

        char[][] terrain = new char[10][11]; // initialisation tableau de 10 x 11
        int x = 0;
        int y = 0;

        for (y = 0; y < 11; y++) {
            for (x = 0; x < 10; x++) {
                terrain[x][y] = '0';

            }
            x = 0;
        }
            for (y = 0; y < 11; y++) {
                for (x = 0; x < 10; x++) {
                    System.out.print("\t" + terrain[x][y] + " "); // tabulation permet de revenir a la ligne si dépasse 9

                }
                System.out.println("");// saut le ligne entre chaque retour
                x = 0;


            }
        }
    }







