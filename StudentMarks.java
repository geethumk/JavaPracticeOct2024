import java.util.Scanner;

public class StudentMarks{

	public static void main(String[] arg){

		Scanner myObj = new Scanner(System.in);
		int marks = myObj.nextInt();

		if(marks >90 && marks<=100){
			System.out.println("Excellent");
		} else if (marks >80 && marks <=90) {
			System.out.println("good");
		} else if(marks >70 && marks<=80){
			System.out.println("fair+");
		} else if(marks >60 && marks<=70){
			System.out.println("meets expections");
		} else if(marks <=60){
			System.out.println("below par");
		} else {
			System.out.println("Invalid");
		}
	}
	
}