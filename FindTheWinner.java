package TestCollection;

import java.util.Scanner;

public class FindTheWinner {

	private static String winner(int[] andrea,int[] maria,String s){
		int i=0,mScore=0,aScore=0;
		if("even".equalsIgnoreCase(s))
			i=0;
		else if("odd".equalsIgnoreCase(s))
			i=1;

		for(int j=i;j<andrea.length;j+=2){
			mScore=maria[j]-andrea[j];
			aScore=andrea[j]-maria[j];
		}

		if(mScore>aScore)
			return "Maria";
		else
			return "Andrea";
	}
	
	public static void main(String[] args) {
		System.out.println("Enter test cases");
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();
		int maria[]= new int[num];
		for(int i=0;i<num;i++){
			scanner = new Scanner(System.in);
			maria[i]=scanner.nextInt();
		}
		num = scanner.nextInt();
		int andrea[]=new int[num];
		for(int i=0;i<num;i++){
			scanner = new Scanner(System.in);
			andrea[i]=scanner.nextInt();
		}
		scanner = new Scanner(System.in);
		String option=scanner.nextLine();
		
		System.out.println(FindTheWinner.winner(andrea, maria, option));
	}

}
