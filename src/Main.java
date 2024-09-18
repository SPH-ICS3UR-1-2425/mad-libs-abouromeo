import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		/*
		 * MadLibs Program
		 * Author: abou romeo
		 * Class: ICS3U
		 * Date: Sept. 16, 2024
		 * Make a program that asks for 10 inputs
		 * reads them into variables, and then prints out a story
		 * Make sure to include Strings, ints, and doubles!
		 */
		
		Scanner in = new Scanner(System.in);
		System.out.println("Welcome to Mad Libs!");
		System.out.println("What's your name?");
		String name = in.nextLine();
		System.out.println("How old are you?");
	    int num1 = in.nextInt();
		System.out.println("What is your father's name?");
		// flush
		in. nextLine();
		String name2 = in.nextLine();
		System.out.println("what is the name of your mother?");
		String name3 = in.nextLine();
		System.out.println("How old was your father when you were born?");
	    int num2 = in.nextInt();
	    System.out.println("How old was your mother when you were born?");
	    int num3 = in.nextInt();
	    System.out.println("How many siblings do you have?" );
	    int num4 = in.nextInt();
	    System.out.println("give me a place");
	    in.nextLine();
	    String name4 = in.nextLine();
	    System.out.println("give me your sibling's name");
	    String name5 = in.nextLine();
	    System.out.println("give me a year ");
	    int num5 = in.nextInt()
;
	   
	    
		System.out.println("One day, "+name+" wrote "+num1+" a Mad Lib "+num2+" in");
	}

}