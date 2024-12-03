public class AlphabetA
{
	public static void main(String arg[]){
		int n = 6;
		for(int i=0; i<n; i++){
			for(int j=0; j<n; j++){
				if(( i == 0 && j>0 && j<5) ||(((j == 0 || j==5) && i!=0)|| i ==3)){
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
// 0     * * * *    // when i == 0 && j>0 && j<5
// 1   *         *  // when j == 0 || j==5 
// 2   *         *  // when j == 0 || j==5  
// 3   * * * * * *  // when j == 0 || j==5 || i ==3  
// 4   *         *  // when j == 0 || j==5  
// 5   *         *  // when j == 0 || j==5
