import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		//plz like :")
		Scanner sc=new Scanner(System.in);
		System.out.println("Write the marks in Computer : ");
		int a=sc.nextInt();
		System.out.println("Write the marks in English : ");
		int b=sc.nextInt();
		System.out.println("Write the marks in Chemistry : ");
		int c=sc.nextInt();
		System.out.println("Write the marks in Physics : ");
		int d=sc.nextInt();
		System.out.println("Write the marks in Mathematics : ");
		int e=sc.nextInt();
		
		int sum=a+b+c+d+e;
		System.out.println("Total marks are : ");
		System.out.println(sum);
		
		System.out.println("Total percentage is : ");
		float p=sum/500f;
		float p1=p*100f;
		System.out.println(p1);
		
		
	}
}