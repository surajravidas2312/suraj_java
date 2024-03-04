import java.util.Scanner;
public class readcomplex
{
	
	int r,i;
	readcomplex(int real,int img)
	{
		r = real;
		i = img;
	}
	void display()
	{
		System.out.println(r+"+"+i+"i");
	}
	void add()
	{
		r0 = ob1.r+ob2.r;
		i0 = ob1.i+ob2.i;
		System.out.println("After Addition : "+r0+"+"+i0+"i");
	}
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int i1,i2,r1,r2;
		System.out.print("Enter your first real number  :");
		r1 = sc.nextInt();
		System.out.print("Enter your first complex number  :");
		i1 = sc.nextInt();
		readcomplex ob1 = new readcomplex(r1,i1);
		System.out.print("Enter your second real number  :");
		r2 = sc.nextInt();
		System.out.print("Enter your real complex number  :");
		i2 = sc.nextInt();
		readcomplex ob2 = new readcomplex(r1,i1);
		complex first = new complex(r1,i1);
		complex second = new complex(r2,i2);
		System.out.println("Complex number are: ");
		first.display();
		second.display();
	}
}
