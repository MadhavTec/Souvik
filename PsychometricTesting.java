package TestCollection;

import java.util.Arrays;
import java.util.Scanner;

public class PsychometricTesting {

	
	private static int[] jobOffers(int [] scores,int[] lowerLimit,int []upperLimit){
		int jobs[]=new int[lowerLimit.length];
		for(int i=0;i<lowerLimit.length;i++){
			int num=0;
			if(upperLimit[i]>=lowerLimit[i])
				for(int j=0;j<scores.length;j++){
					if((lowerLimit[i]<=scores[j])&&(scores[j]<=upperLimit[i]))
						num++;
				}
			jobs[i]=num;
		}
		
		
		return jobs;
	}
	
	
	public static void main(String[] args) {
		System.out.println("Enter test cases");
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();
		int scores[]=new int[num];
		for(int i=0;i<num;i++){
			scanner = new Scanner(System.in);
			scores[i]=scanner.nextInt();
		}
		scanner = new Scanner(System.in);
		num = scanner.nextInt();
		int lowerLimit[]=new int[num];
		for(int i=0;i<num;i++){
			scanner = new Scanner(System.in);
			lowerLimit[i]=scanner.nextInt();
		}
		scanner = new Scanner(System.in);
		num = scanner.nextInt();
		int upperLimit[]=new int[num];
		for(int i=0;i<num;i++){
			scanner = new Scanner(System.in);
			upperLimit[i]=scanner.nextInt();
		}

		System.out.println(Arrays.toString(PsychometricTesting.jobOffers(scores, lowerLimit, upperLimit)));
	}

}
