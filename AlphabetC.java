import java.util.Scanner; //import scanner class

public class AlphabetC
{
	public static void main(String arg[]){
		Scanner myObj = new Scanner(System.in); // create a scanner object
		int n = myObj.nextInt();
		// int n = 5;

		for(int i=0; i<n; i++){
			for(int j=0; j<n; j++){
				if((i== 0 && j != 0) 
					// 
					|| (j == 0 && i!=0 && i!=n-1)
					 || (i == n-1 && j!=0)
				){
					System.out.print("* ");
				} else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	
	}
}


// i j 0 1 2 3 4 5 
// 0     * * * * *  // when i == 0 && j != 0
// 1   *            // when j == 0 && i!=0 && i!=n-1
// 2   *             
// 3   *  
// 4   *            
// 5     * * * * *  // when i == n-1 && j!=0