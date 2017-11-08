package TestCollection;

import java.util.Scanner;

public class InTheFuture {

	private static int minNum(int a,int k,int p){
		if(k<a)
			System.out.println("invalid output");
		else if(k==a && p>0)
			System.out.println("invalid output");
		else{
			int sum=a+p;
			int x=k;
			for(int i=1;;i++){
				if(sum<x)
					return i;
				else if(sum==x)
					return i+1;
				else {
					sum=sum+a;
					x=x+k;
				}
			}
			
		}
		return 0;
	}
	
	
	
	
	public static void main(String[] args) {
		System.out.println("Enter test cases");
		Scanner scanner = new Scanner(System.in);
		int A = scanner.nextInt();
		scanner = new Scanner(System.in);
		int B = scanner.nextInt();
		scanner = new Scanner(System.in);
		int C = scanner.nextInt();
		System.out.println(InTheFuture.minNum(A, B, C));
		
		
	}

}
