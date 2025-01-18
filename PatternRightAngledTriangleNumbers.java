import java.util.Scanner; //import scanner class

public class PatternRightAngledTriangleNumbers
{
	public static void main(String arg[]){
		// Scanner myObj = new Scanner(System.in); // create a scanner object
		// int n = myObj.nextInt(); 
		int n = 5;
		int x = 1;
		for(int i=0; i<n; i++){
			for(int j=0; j<n; j++){
				if((i==(n-1)) || j == 0 || i==j || j<i)
				{
					System.out.print( x + "  ");
					x++;
				} else {
					System.out.print("   ");
				}
			}
			System.out.println();
		}
	
	}
}


//    0  1  2  3  4  
// 0  1
// 1  2  3
// 2  4  5  6
// 3  7  8  9  10
// 4  11 12 13 14 15

