import java.util.Scanner;
class comp
{
	int r,i;
	comp(int r1,int i1)
	{
		r=r1;
		i=i1;
	}
	
		
		



public class complexclass
{
	
	static void add(int r1,int i1,int r2,int i2)
	{
		r1 = r1+r2;
		i1 = i1+i2;
		System.out.println("After Addition : "+r1+"+"+i1+"i");
	}
	public static void main(String args[])
	{
		
		Scanner sc = new Scanner(System.in);
		int i1,i2,r1,r2;
		System.out.print("Enter your first real number  :");
		r1 = sc.nextInt();
		System.out.print("Enter your first complex number  :");
		i1 = sc.nextInt();
		System.out.print("Enter your second real number  :");
		r2 = sc.nextInt();
		System.out.print("Enter your real complex number  :");
		i2 = sc.nextInt();
		comp ob1 = new comp(r1,i1);
		comp ob2 = new comp(r2,i2);
		System.out.println("Complex number are: ");
		first.display();
		second.display();
		add(first.r,first.i,second.r,second.i);
	}
}
