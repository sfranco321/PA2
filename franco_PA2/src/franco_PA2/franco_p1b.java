package franco_PA2;

import java.util.Scanner;

public class franco_p1b {
	
	public static void main(String[] args) {
			Scanner scnr = new Scanner(System.in);
			int userInt;
			int n1;
			int n2;
			int n3;
			int n4;
			
			System.out.println("Enter encrypted 4-digit integer:");
			userInt = scnr.nextInt();
			
			n1 = userInt / 1000;
			n2 = userInt / 100;
			n2 = n2 % 10;
			n3 = userInt / 10;
			n3 = n3 % 10;
			n4 = userInt % 10;
			
			// Decrypt			
			n1 = (n1 + 3) % 10;
			n2 = (n2 + 3) % 10;
			n3 = (n3 + 3) % 10;
			n4 = (n4 + 3) % 10;
			
			System.out.printf("%d%d%d%d", n3, n4, n1, n2);
			scnr.close();

		}

	}


