package TestCollection;

import java.util.Arrays;
import java.util.Scanner;

public class LargestSubsetSum {

	
	static long[] maxSubsetSum(int []k){
		long arr[]=new long[k.length];
		for(int i=0;i<k.length;i++){
			int sum=0;
			for(int j=1;j<=k[i];j++){
				if(k[i]%j==0){
					sum=sum+j;
				}
			}
			arr[i]=sum;
		}		
		
		return arr;
	}
	
	public static void main(String[] args) {
		System.out.println("Enter test cases");
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();
		int k[]= new int[num];
		for(int i=0;i<num;i++){
			scanner = new Scanner(System.in);
			k[i]=scanner.nextInt();
		}
		System.out.println(Arrays.toString(LargestSubsetSum.maxSubsetSum(k)));

	}

}
