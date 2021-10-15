package com.company;
import java.util.Scanner;
import java.util.Random;
public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        int rnum1 = getrandomnumber();
        int rnum2 = getrandomnumber();
        int pchand = rnum1 + rnum2;

        int usernum1 = getrandomnumber();
        int usernum2 = getrandomnumber();
        int userhand = usernum1 + usernum2;
        System.out.println("Your 1st hand is " + userhand);

        if (userhand < 21);
        System.out.println("input (YES) for another card" +
                "input (NO) to stick with your cards");
       String stickortwist = input.next();

        if ((stickortwist == "YES") && (userhand <21));
            userhand = userhand + getrandomnumber();
        System.out.println(userhand + " this is your current hand");
        if (stickortwist == "NO");
        userhand = userhand;

        if (pchand < userhand);
        pchand = pchand + getrandomnumber();

        if ((userhand >21)&&(pchand <= 21));
        System.out.println("You have lost :(");
        if ((pchand > 21)&&(userhand <= 21));
        System.out.println("You have won, the computer went bust!!!");

        if (userhand > pchand);
        System.out.println("well played, you have won");
        else 


    }

    public static int getrandomnumber(){
    Random random = new Random();
    return random.nextInt(11)+1;

    }}
