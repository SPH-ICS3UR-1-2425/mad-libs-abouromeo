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
		System.out.println("Give me a number: ");
		int num1 = in.nextInt();
		System.out.println("GIve me a place: ");
		// flush
		in. nextLine();
		String place = in.nextLine();
		
		System.out.println("One day, "+name+" wrote a Mad Lib in class!");
	}

}
