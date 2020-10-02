import java.util.Scanner;
public class finding_percentage_for_n_subjects {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a;
		float marks,sum = 0;
		System.out.println("Enter the number of subjects : ");
		a=sc.nextInt();
		for(int i=0;i<a;i++)
		{
			System.out.println("Enter marks in subject " + (i+1) + " ");
			marks = sc.nextInt();
			sum = sum + marks;
		}
		System.out.println("Total marks are : ");
		System.out.println(sum);
		
		System.out.println("Total percentage is : ");
		float p=sum/(a*100);
		float p1=p*100;
		System.out.println(p1);	
	}
}
