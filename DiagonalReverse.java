import java.util.Scanner; //import scanner class

public class DiagonalReverse
{
	public static void main(String arg[]){
		// Scanner myObj = new Scanner(System.in); // create a scanner object
		// int n = myObj.nextInt(); 
		int n = 5;
		for(int i=0; i<n; i++){
			for(int j=0; j<n; j++){
				if(i+j==(n-1))
				{
					System.out.print("* ");
				} else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	
	}
}


//    0 1 2 3 4  
// 0          *
// 1        *
// 2      *
// 3    *
// 4  *

