import java.text.BreakIterator;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.util.*;

public class Table {

	public static void main(String[] args) {
		int nb = (int) (Math.random() * 51);
		ArrayList<Integer> Tab1 = new ArrayList<Integer>(nb);
		for (int i = 0; i < nb; i++) {
			int n1 = (int) (Math.random() * 9);
			Tab1.add(n1);
			// System.out.println(Tab1.get(i));
		}
		boolean x = false;
		do {
			try {
				Scanner sc = new Scanner(System.in);
				System.out.println("Veuillez saisir un entier :");
				int nbr = sc.nextInt();
				System.out.println(nbr);
			} catch (Exception e) {
				System.out.println("!!!!");
				x = true;
			}

		}
		while (x);
		
		
	}
}
