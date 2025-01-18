import java.util.Scanner; //import scanner class

public class PatternRATNFibonacci
{
	public static void main(String arg[]){
		// Scanner myObj = new Scanner(System.in); // create a scanner object
		// int n = myObj.nextInt(); 
		int n = 5;
		int n3;
		int n1 = 1;
		int n2 = 1;
		for(int i=0; i<n; i++){
			for(int j=0; j<n; j++){
				if((i==(n-1)) || j == 0 || i==j || j<i)
				{
					if(i==0){
						System.out.print( "0  ");
					} else if (i==1) {
						System.out.print( n2 + "  ");
					} else {
						n3 = n1+n2;
						System.out.print( n3 + "  ");
						n1=n2;
						n2=n3;
					}
				} else {
					System.out.print("   ");
				}
			}
			System.out.println();
		}
	
	}
}


//    0  1  2  3  4  
// 0  0
// 1  1  1
// 2  2  3  5
// 3  8  13  21  34
// 4  55  89  144  233  377