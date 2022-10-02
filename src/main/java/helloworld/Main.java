package helloworld;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        String input;
        Scanner my_scanner = new Scanner(System.in);

        input = my_scanner.nextLine();
        String[] arrayOfString = input.split(" ",2);

        if(arrayOfString.length == 1){
            System.out.println("Szia "+ arrayOfString[0] + "!");
        }
        else {
            switch (arrayOfString[1]) {
                case "hun":
                    System.out.println("Szia " + arrayOfString[0] + "!");
                    break;
                case "eng":
                    System.out.println("Hi " + arrayOfString[0] + "!");
                    break;
                case "ita":
                    System.out.println("Ciao " + arrayOfString[0] + "!");
                    break;
                default:
                    System.out.println("Error, unrecognized language!");
            }
        }
    }
}
