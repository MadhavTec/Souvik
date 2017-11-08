package TestCollection;

import java.util.Scanner;

public class BuyingShowtickets {


	private static long waitingTime(int[] tickets, int p){
		 long seconds=0;
		for(int j=0;;j++){
			for(int i=0;i<tickets.length;i++){
				if(tickets[i]>0){
					seconds++;
					tickets[i]--;
				}
				if(tickets[p]==0)
					return seconds;
			}
		}
	}
	
	public static void main(String[] args) {

		System.out.println("Enter test cases");
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();
		int tickets[]= new int[num];
		for(int i=0;i<num;i++){
			scanner = new Scanner(System.in);
			tickets[i]=scanner.nextInt();
		}
		num = scanner.nextInt();
		System.out.println(BuyingShowtickets.waitingTime(tickets,num));
	
	}

}
