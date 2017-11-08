package TestCollection;

import java.util.Scanner;

public class ConsecutiveSum {

	static int consecutive(long num){
		int count=0;
		for(int i=1;i<=num/2;i++){
			int sum=0;
			for(int j=i;j<=(num/2)+1;j++){
				sum=sum+j;
				if(sum>num)
					break;
				else if(sum==num){
					count++;
					break;
				}
			}
		}
		return count;
	}
	
	
	public static void main(String[] args) {
		
		System.out.println("Enter test cases");
		Scanner scanner = new Scanner(System.in);
		long num = scanner.nextLong();
		System.out.println(ConsecutiveSum.consecutive(num));

	}

}
