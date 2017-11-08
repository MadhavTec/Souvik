package TestCollection;

import java.util.Arrays;
import java.util.Scanner;

public class BalancedOrNot {


	static int[] balancedOrNot(String[] expression,int [] maxReplacements ){
		int j=0;int [] result=new int[maxReplacements.length];
		for(String s:expression){
			int count=0,replace=0;
			for(int i=0;i<s.length();i++){
				if(s.charAt(i)=='<'){
					count++;
				}else if(s.charAt(i)=='>'){
					if(count>0)
						count--;
					else
						replace++;
				}
			}
			if(count==0&&replace<=maxReplacements[j])
				result[j]=1;
			else
				result[j]=0;
			j++;
		}
		return result;
	}

	public static void main(String[] args) {
		System.out.println("Enter test cases");
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();
		String  expression[]= new String[num];
		for(int i=0;i<num;i++){
			scanner = new Scanner(System.in);
			expression[i]=scanner.nextLine();
		}
		scanner = new Scanner(System.in);
		num = scanner.nextInt();
		int  maxReplacements[]= new int[num];
		for(int i=0;i<num;i++){
			scanner = new Scanner(System.in);
			maxReplacements[i]=scanner.nextInt();
		}

		System.out.println(Arrays.toString(BalancedOrNot.balancedOrNot(expression,maxReplacements)));

	}

}
