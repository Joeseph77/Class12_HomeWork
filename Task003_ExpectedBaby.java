package class12.HomeWork_Class12;

import java.util.Scanner;

/*
) Write a program that reads two people's first
names and if they expecting boy or girl?
Based on the input suggests a name for a baby:
Example Output:
Mom’s first name? Mary
Dad’s first name? Daniel
Boy or Girl? boy
Suggested baby name: DANRY

Example Output:
Mom’s first name? Mary
Dad’s first name? Daniel
Boy or Girl? girl
Suggested baby name: MAIEL
 */
public class Task003_ExpectedBaby {
    public static void main(String[] args) {
Scanner scan = new Scanner(System.in);
        System.out.println("Mom's first name");
        String mom=scan.next();
        System.out.println("Dad's first name");
        String dad=scan.next();
        System.out.println("Boy or Girl?");
        String baby=scan.next();
        String babyName="";
        if(baby.equalsIgnoreCase("boy")){
            babyName=dad.substring(0,3)+mom.substring(mom.length()-2);
        }else {
            babyName=mom.substring(0,2)+dad.substring(dad.length()-3);
        }
        System.out.println(babyName);

    }
}
