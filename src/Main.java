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
		System.out.println("give me a PET name?");
		// flush
		in. nextLine();
		String name2 = in.nextLine();
		System.out.println("what is your favourite snack?");
		String name3 = in.nextLine();
		System.out.println("What is your hobby?");
	    String name6 = in.nextLine();
	    System.out.println("How many hours do you sleep ?");
	    int num3 = in.nextInt();
	    System.out.println("How many cars do you have?" );
	    int num4 = in.nextInt();
	    System.out.println("give me a place");
	    in.nextLine();
	    String name4 = in.nextLine();
	    System.out.println("give me a colour");
	    String name5 = in.nextLine();
	    System.out.println("give me a year ");
	    int num5 = in.nextInt();

	   	System.out.println("One day, "+name+" was sitting with "+name5+" eating "+name4+"  "+name6+"years  in");
	
}