import java.util.Scanner; //import scanner class

public class PatternDimand
{
	public static void main(String arg[]){
		Scanner myObj = new Scanner(System.in); // create a scanner object
		int n = myObj.nextInt();
		// int n = 5;

		for(int i=0; i<n; i++){
			for(int j=0; j<n; j++){
				if(i + j == (n-1)/2 || (j - i == (n-1)/2) || i - j == (n-1)/2  || (i + j == n -1 + (n-1)/2)){
					System.out.print("* ");
				} else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	
	}
}
// i j 0 1 2 3 4 5 6
// 0         *        // P1 --- i + j == (n-1)/2
// 1       *   *      // P2 --- j - i == (n-1)/2
// 2     *       *    // p3 --- i - j == (n-1)/2 
// 3   *           *  // P4 --- i + j == n -1 + (n-1)/2
// 4     *       *            
// 5       *   *
// 6         *    