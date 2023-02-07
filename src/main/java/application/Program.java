package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.People;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		List<People> list = new ArrayList<People>();
		
		System.out.print("Quantas pessoas? ");
		int n = sc.nextInt();
		for(int i=1; i<=n; i++) {
			System.out.print("People #" + 1 + ":");
			System.out.println();
			System.out.print("ID: ");
			int id = sc.nextInt();
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Email: ");
			String email = sc.nextLine();
			list.add(new People(id, name, email));
		}
		
		System.out.println();
		System.out.print("Lista de pessoas: ");
		System.out.println();
		for(People people : list) {
			System.out.println(people);
		}
		
		sc.close();

	}

}
