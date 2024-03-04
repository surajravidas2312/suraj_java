import java.util.Scanner;
class matrix
{
	int m,n,i,j;
	int [][] a = new int[5][5];
	int [][] b = new int[5][5];
	int [][] c = new int[5][5];
	Scanner sc = new Scanner(System.in);
	void get()
	{
		System.out.print("Enter no of rows: ");
		m = sc.nextInt();
		System.out.print("Enter no of column: ");
		n = sc.nextInt();
		System.out.println("Enter element of matrix a: ");
		for(i=0;i<n;i++)
			for(j=0;j<m;j++)
				a[i][j]=sc.nextInt();
		System.out.println("Enter element of matrix b: ");
		for(i=0;i<n;i++)
			for(j=0;j<m;j++)
				b[i][j]=sc.nextInt();
	}	
	void add()
	{
		for(i=0;i<n;i++)
			for(j=0;j<m;j++)
				c[i][j]=a[i][j]+b[i][j];
	}
	void display()
	{
		System.out.println("Matrix A");
		for(i=0;i<n;i++){
			for(j=0;j<m;j++)
				System.out.print(a[i][j]+" ");
			System.out.println();
		}
		System.out.println("Matrix B");
		for(i=0;i<n;i++){
			for(j=0;j<m;j++)
				System.out.print(b[i][j]+" ");
		System.out.println();
		}
		System.out.println("Matrix C");
		for(i=0;i<n;i++){
			for(j=0;j<m;j++)
				System.out.print(c[i][j]+" ");
			System.out.println();
		}
	}
	
}
public class Matrix
{
	public static void main(String args[])
	{
		matrix ob= new matrix();
		ob.get();
		ob.add();
		ob.display();
	}
}
	
