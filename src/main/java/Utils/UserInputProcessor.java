package Utils;

import Fabric.playerClass;

import java.util.Scanner;

public class UserInputProcessor {
    public String UserInputHandler(String header, int mod) {

        Scanner sc = new Scanner(System.in);
        String input;

        System.out.println(header);

        if (mod != 0) {
            while (!isValidString(input = sc.nextLine()) || !isValidPlayerClass(input)) {
                System.out.println(header);
            }
            return input;
        } else while (!isValidString(input = sc.nextLine())) {
            System.out.println(header);
        }
        return input;
    }

    private boolean isValidString(String input) {
        if (input.isEmpty()) {
            System.out.println("Please type something next time...");
            return false;
        }
        if (input.trim().split(" ").length > 1) {
            System.out.println("You input incorrect data, please try harder and do not use spaces");
            return false;
        }
        return true;
    }

    private boolean isValidPlayerClass(String input) {

        for (playerClass value : playerClass.values()) {
            if (input.equalsIgnoreCase(value.toString())) return true;
        }
        System.out.println
                ("You're fate is so misty. Please tell me more specific information (pick from one of existing class)");
        return false;
    }

}
