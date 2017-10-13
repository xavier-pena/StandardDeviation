import java.util.Scanner;

public class Stdv {
	
	public static void main(String[]args) {
		
		//sqrt((x-u)^2*px))
		
		int sample =2;
		double x;
		double u;
		double px;
		
		
		double answer=0;
		
		Scanner in = new Scanner(System.in);
		
		boolean working = true;
		
		while(working){
			answer = 0;//reset answer
			
			System.out.println("Enter u");
			u = in.nextDouble();//ask for once because u doesn't change
		
			for(int i = 0; i <sample; i++) {//for summation 
				
				System.out.println("Enter x");
				x = in.nextDouble();
				
				
				
				System.out.println(answer += ((x-u)*(x-u)));//squared values being summed
				
			}
			//px can be multiplied at the end
			
			System.out.println("Enter px");
			px = in.nextDouble();
			
			answer = Math.sqrt(answer*px);//sqrt answer
			System.out.println(answer);
			
	
			System.out.println("again?(Y/N)");
			String again2 = in.next();
			if(again2.equalsIgnoreCase("Y")) {
				
				working = true;
				
			}
			else {working = false;}
			
		}//closes working
		
		
		
	}//main

}//class
