class Variable{
	
	public static void main(String[] args){
		int x = 15;
		int y = 10;
		int sum = x + y;
		int prd = x * y;
		int div1 = x/y;
		int div2 = y/x;
		int modle = x%y;
		int cal1 = x * y / y + x;
		int cal2 = (x * y) / (y + x);

		System.out.println("the sum of" + x + "and" + y + "is =" + sum );
		System.out.println("the product of" + x + "and" + y + "is =" + prd );
		System.out.println("the division of" + x + "and" + y + "is =" + div1 );
		System.out.println("the division of" + y + "and" + x + "is =" + div2 );
		System.out.println("the module of" + x + "and" + y + "is =" + modle );
		System.out.println("the value of x * y / y + x is =" + cal1 );
		System.out.println("the value of (x * y) / (y + x) is =" + cal2 );


	}
}
