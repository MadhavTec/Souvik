package TestCollection;

import java.util.Scanner;

public class TwoCircles {

	/**
	 * @param args
	 */
	
	public static String circles(String s){
		
		String result=null;
		try{
		int arr[]=new int[6];
		String arrs[]=s.split(" ");		
		for(int i=0;i<arrs.length;i++)
			arr[i]=Integer.parseInt(arrs[i]);
		if(arr[0]==0&&arr[3]==0)
			result=checkPoints(arr[1], arr[4], arr[2], arr[5]);
		else if(arr[1]==0&& arr[4]==0)
			result=checkPoints(arr[0], arr[3], arr[2], arr[5]);
		else
			throw new NumberFormatException();
		}
		catch(NumberFormatException e){
			System.out.println("Input not in correct format");
		}
		catch(Exception e){
			e.printStackTrace();
		}
		
		return result;
	}
	
	
	private static String checkPoints(int p0,int p1,int r0,int r1){
		if(p0==p1)
			return "CONCENTRIC";
		else{
			int distCentre=Math.abs(p1-p0);
			int distRadius=Math.abs(r1-r0);
			if(distCentre==distRadius)
				return "TOUCHING";
			else if (distCentre>(r0+r1))
				return "DISJOINT-OUTSIDE";
			else if (distCentre<(r0+r1))
				return "INTERSECTING";
			else if (distCentre<(r0+p0)||distCentre<(r1+p1)) 
				return "DISJOINT-INSIDE";
		}
		
		return null;
	}
		
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Enter test cases");
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();
		String arr[]= new String[num];
		for(int i=0;i<num;i++){
			scanner = new Scanner(System.in);
			arr[i]=scanner.nextLine();
		}
		System.out.println("result");
		for(int i=0;i<arr.length;i++){
			System.out.println(TwoCircles.circles(arr[i]));
		}
	}

}
