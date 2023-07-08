package de.neuefische;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String myName = "Alex";


        System.out.println(name(myName));
        System.out.print("\n");
        System.out.println(nameLoop(myName));
        scanner();
        System.out.print("\n");
        stringArray();
        returnNumbersAsWords();

    }

    //Anfang Methoden:
    public static String name(String s) {
        return s;
    }


    public static String nameLoop(String someString) {
        String zs = "";
        for (int i = 0; i < 5; i++) {
            zs += someString + "\n";
        }

        return zs;
    }


    public static boolean checkNumber(int number) {
        if (number > 0) {
            return true;
        } else {
            return false;
        }

    }


    public static int square(int number) {
        return number * number;
    }


    public static void scanner() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Geben Sie Ihren Namen ein und drücken Sie ENTER:");
        String input = scanner.nextLine();

        System.out.println("\n" + "Herzlich Willkommen! " + input + "!");

    }

    public static void stringArray() {
        String[] zahlenArray = new String[10];

        zahlenArray[0] = "Eins";
        zahlenArray[1] = "Zwei";
        zahlenArray[2] = "Drei";
        zahlenArray[3] = "Vier";
        zahlenArray[4] = "Fünf";
        zahlenArray[5] = "Sechs";
        zahlenArray[6] = "Sieben";
        zahlenArray[7] = "Acht";
        zahlenArray[8] = "Neun";
        zahlenArray[9] = "Zehn";

        /*System.out.println(zahlenArray[0]);
        System.out.println(zahlenArray[1]);
        System.out.println(zahlenArray[2]);
        System.out.println(zahlenArray[3]);
        System.out.println(zahlenArray[4]);
        System.out.println(zahlenArray[5]);
        System.out.println(zahlenArray[6]);
        System.out.println(zahlenArray[7]);
        System.out.println(zahlenArray[8]);
        System.out.println(zahlenArray[9]);*/
    }

    public static void returnNumbersAsWords() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bitte geben Sie eine einstellige Zahl ein: ");
        int input = scanner.nextInt();

        String[] zahlenArray = new String[10];

        zahlenArray[0] = "null";
        zahlenArray[1] = "Eins";
        zahlenArray[2] = "Zwei";
        zahlenArray[3] = "Drei";
        zahlenArray[4] = "Vier";
        zahlenArray[5] = "Fünf";
        zahlenArray[6] = "Sechs";
        zahlenArray[7] = "Sieben";
        zahlenArray[8] = "Acht";
        zahlenArray[9] = "Neun";

        switch (input) {
            case 0:
                System.out.println(zahlenArray[0]);
                break;
            case 1:
                System.out.println(zahlenArray[1]);
                break;
            case 2:
                System.out.println(zahlenArray[2]);
                break;
            case 3:
                System.out.println(zahlenArray[3]);
                break;
            case 4:
                System.out.println(zahlenArray[4]);
                break;
            case 5:
                System.out.println(zahlenArray[5]);
                break;
            case 6:
                System.out.println(zahlenArray[6]);
                break;
            case 7:
                System.out.println(zahlenArray[7]);
                break;
            case 8:
                System.out.println(zahlenArray[8]);
                break;
            case 9:
                System.out.println(zahlenArray[9]);
                break;
            default:
                System.out.println("nichts");
                break;
        }

    }
}

