import java.util.Scanner;
public class Finding Percentage {
	public static void main(String[] args) {
		//plz like :")
		Scanner sc=new Scanner(System.in);
		boolean workAgain = true;
		while (workAgain) {
			System.out.print("Write the marks in Computer : ");
			int a=sc.nextInt();
			System.out.print("Write the marks in English : ");
			int b=sc.nextInt();
			System.out.print("Write the marks in Chemistry : ");
			int c=sc.nextInt();
			System.out.print("Write the marks in Physics : ");
			int d=sc.nextInt();
			System.out.print("Write the marks in Mathematics : ");
			int e=sc.nextInt();
		
			int sum=a+b+c+d+e;
			System.out.print("Total marks are : ");
			System.out.println(sum);
		
			System.out.print("Total percentage is : ");
			float p=sum/500f;
			float p1=p*100f;
			System.out.println(p1);

			System.out.println();
			System.out.print("Do you want to use this again?(y/n) ");
			System.out.println();
			
			String Y_or_N = sc.next();
			
			if (Y_or_N .equals("y")){
				System.out.println("Sure :)");
				System.out.println();
			}
			else if (Y_or_N .equals("n")){
				System.out.println("Thank you for using :)");
				System.out.println();
				workAgain = false;
			}
			else {
				System.out.println("Invalid Input");
				System.out.println();
				
			}
		}
	}	
}
