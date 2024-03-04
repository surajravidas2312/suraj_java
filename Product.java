class product
{
	int pcode,price;
	String pname;
	product(int p_code,String p_name,int p_price)
	{
		pcode = p_code;
		price = p_price;
		pname = p_name;
	}
	void display()
	{	
		System.out.println("Product Code :"+pcode);
		System.out.println("Product Name :"+pname);
		System.out.println("Product Price :"+price);
	}
}
public class Product
{
	public static void main(String args[])
	{
		product obj1 = new product(123,"ABC",25);
		product obj2 = new product(124,"BCD",30);
		product obj3 = new product(125,"XYZ",4);
		System.out.println("Lowest Price :");
		if(obj1.price<obj2.price)
			if(obj2.price<obj3.price)
				obj1.display();
			else
				obj3.display();
		else if(obj2.price<obj1.price)
			if(obj2.price<obj3.price)
				obj2.display();
			else 
				obj3.display();	
	}
}
