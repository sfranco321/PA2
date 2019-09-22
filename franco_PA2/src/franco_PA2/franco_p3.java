package franco_PA2;
import java.util.Scanner;

public class franco_p3 {

	public static void main(String[] args) {
	
       Scanner scnr = new Scanner(System.in);
	   // char userChar;
	   int userNum;
	   int i = 0;
	   int j = 0;
	   int k = 0;
	   int m = 0;
	   int n = 0;
	   int maxPoints = 0;
	   int isMax = 1;
	   int minPoints = 9999;
	   int isMin = 1;
	   
	   System.out.println("Enter number of people answering the survey today:");
	   userNum = scnr.nextInt();
	   
	   String[] topics = { "Science", "Technology", "Spanish", "Calligraphy", "Public Speaking"};
	   int[] userScores = new int[5];
	   int[][] allScores = new int[5][10];
	   double temp = 0.0;
	   double[][] avgScores = new double[5][userNum];
	   
	   double[] avg = new double[5];
	        
		while (i < userNum) {
			System.out.println("Rate the following, from 1(least important) to 10(most important):");
				
			j = 0;
			while ( j < 5) {
				System.out.print(topics[j] + ": ");
				userScores[j] = scnr.nextInt();
				avgScores[j][i] = userScores[j];
				
				for (k = 0; k < 10; ++k) {      // Checking scores (1-10) 
				 if (userScores[j] == (k + 1)) {
					 allScores[j][k] = allScores[j][k] + 1;
						 
				 }	 
				 
				 }
								
				j += 1;
			}
			 i += 1;
		}
					
		
		 int o = 1;
		 for (o = 1; o < 11; ++o) {
			 if (o == 1) {
				 System.out.print("Score   ");
			 }
			 System.out.print("\t" + o + " ");
			 if (o == 10) {
				 System.out.println("\tAvg");
			 }
		 }
		
		    o = 0;
			m = 0;
			n = 0;
			for (m = 0; m < 5; ++m) {
				for (n = 0; n < 10; ++n) {
					if (n == 0 && (m == 0 || m == 2)) { // To get spacing right
						System.out.print(topics[m] + "\t" + "\t");
					}
					else if (n == 0) {
						System.out.print(topics[m] + "\t");
					}
					System.out.print(allScores[m][n] + "\t"); 
					 if (n == 9) {
						 
						// Calculate average at end of each row
						i = 0;
						j = 0;
							
						for(i = 0; i < 5; ++i) {
						   for (j = 0; j < userNum; ++j) {
							
							temp = temp + avgScores[i][j];
						   }
						 
						 avg[i] = (temp / userNum); 
						 if (temp > maxPoints) {
							 maxPoints = (int)temp;
							 isMax = i;
						 }
						 else if (temp < minPoints) {
							 minPoints = (int)temp;
							 isMin = i;
						 }
						 temp = 0;
						} 
				}
				}
						System.out.printf("%.1f\n", avg[m]); // Print average for each topic
						
					 
			}				
			
				
			System.out.println("Max score is " + maxPoints + " for " + topics[isMax]);
			System.out.println("Min score is " + minPoints + " for " + topics[isMin]);
	
			scnr.close();
				 		      
	}
}
