import java.util.Scanner;

/** This program turns an integer into its English name.
 */

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Please enter a positive integer < 1 000 000: ");
        int input = in.nextInt();
        System.out.println(intName(input));
    }
    /**
     Turns a number into its English name.
     @param number a positive integer < 1 000 000
     @return the name of the number ("e.g. two hundred and twenty-four")
     */
    public static String intName(int number)
    {
        int part = number; //the part that still needs to be converted
        int part1 = part / 1000;
        int part2 = part % 1000;
        String name = "";

        if (part > 1000)
        {
            if ( part1 >= 100)
            {
                name = name + " " + digitName(part1 / 100) + " hundred";
                part1= part1 % 100;
            }

            if( part1 >= 20){
                name = name + " " + tensName(part1);
                part1 = part1 % 10;
            } else if ( part1 >= 10)
            {
                name = name + " " + teenName(part1);
                part1 = 0;
            }
            if (part1 > 0 )
            {
                name = name + " " + digitName(part1) + " thousand";
            }
        }

        if ( part2 >= 100)
        {
            name = name + " " + digitName(part2 / 100) + " hundred";
            part2 = part2 % 100;
        }

        if( part2 >= 20){
            name = name + " " + tensName(part2);
            part2 = part % 10;
        } else if ( part2 >= 10)
        {
            name = name + " " + teenName(part2);
            part2 = 0;
        }
        if (part2 > 0 )
        {
            name = name + " " + digitName(part2);
        }
        return name;
    }
    /**
     Turns a digit into its English name.
     @param digit - an integer between 1 and 9.
     @return the name of digit ("one" ..."nine")
     */

    public static String digitName(int digit){
        if (digit == 1){ return "one";}
        if (digit == 2){ return "two";}
        if (digit == 3){ return "three";}
        if (digit == 4){ return "four";}
        if (digit == 5){ return "five";}
        if (digit == 6){ return "six";}
        if (digit == 7){ return "seven";}
        if (digit == 8){ return "eight";}
        if (digit == 9){ return "nine";}
        return "";

    }

    /**
     Turns a number into its English name.
     @param number - a number between 10 and 19.
     @return the name of the number ("ten" ..."nineteen")
     */

    public static String teenName(int number){
        if (number == 10){ return "ten";}
        if (number == 11){ return "eleven";}
        if (number == 12){ return "twelve";}
        if (number == 13){ return "thirteen";}
        if (number == 14){ return "fourteen";}
        if (number == 15){ return "fifteen";}
        if (number == 16){ return "sixteen";}
        if (number == 17){ return "seventeen";}
        if (number == 18){ return "eighteen";}
        if (number == 19){ return "nineteen";}
        return "";

    }

    /**
     Turns a number into its English name.
     @param number - a number between 10 and 19.
     @return the name of the number ("ten" ..."nineteen")
     */

    public static String tensName(int number){
        if (number >= 90){ return "ninety";}
        if (number >= 80){ return "eighty";}
        if (number >= 70){ return "seventy";}
        if (number >= 60){ return "sixty";}
        if (number >= 50){ return "fifty";}
        if (number >= 40){ return "forty";}
        if (number >= 30){ return "thirty";}
        if (number >= 20){ return "twenty";}
        return "";

    }


}