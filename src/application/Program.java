package application;

import java.util.Locale;
import java.util.Scanner;

import entites.PrintService;

public class Program {
	public static void main(String args[]) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		PrintService<Integer> ps = new PrintService<>();
		System.out.println("How many values?");
		int number = sc.nextInt();
		
		for (int i = 0; i < number; i++) {
			int value = sc.nextInt();
			ps.addValue(value);
		}
		
		ps.print();
		
		System.out.println(" First value: " + ps.first());
	}
}
