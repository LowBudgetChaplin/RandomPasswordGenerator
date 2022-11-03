//----------------- R A N D O M  P A S S W O R D  G E N E R A T O R -----------------

import java.util.Random;
import java.util.Scanner;
//package password_generator;

public class Main {

    static void Display(){
        System.out.println("\nHow long do you want to be the password?");
    }
    public static void main(String[] args) {

        Display();

        Scanner input = new Scanner(System.in);
        int digit = input.nextInt();

        String lowerCase = "qwertyuiopasdfghjklzxcvbnm";
        String upperCase = "QWERTYUIOPASDFGHJKLZXCVBNM";
        String symbols = "!@#$%^&*~_-?/><";

        String password = "";


        for(int i=0; i< digit ; i++){
            int random = (int)(4*Math.random());

            switch (random)
            {
                case 0:
                    password += String.valueOf((int)(9*Math.random()));
                    break;
                case 1:
                    random =(int) (lowerCase.length() * Math.random());
                    password += String.valueOf(lowerCase.charAt(random));
                    break;
                case 2:
                    random =(int) (upperCase.length() * Math.random());
                    password += String.valueOf(upperCase.charAt(random));
                    break;
                case 3:
                    random =(int) (symbols.length() * Math.random());
                    password += String.valueOf(symbols.charAt(random));
                    break;

            }

        }

        System.out.println(password);

    }
}