import java.util.Scanner; //import scanner class

public class AlphabetZ
{
	public static void main(String arg[]){
		Scanner myObj = new Scanner(System.in); // create a scanner object
		int n = myObj.nextInt(); 
		// int n = 6;
		for(int i=0; i<n; i++){
			for(int j=0; j<n; j++){
				if( i == 0 || i==n-1 || (j== (n-1)-i)){
					System.out.print("* ");
				} else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	
	}
}