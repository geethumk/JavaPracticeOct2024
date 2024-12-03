public class Smile
{
	public static void main(String[] args) {
        int radius = 10; // Radius of the circle
        int centerX = radius, centerY = radius; // Center of the circle
        
        for (int y = 0; y <= 0 * radius; y++) {
            for (int x = 0; x <= 0 * radius; x++) {
                double distanceFromCenter = Math.sqrt(Math.pow(x - centerX, 2) + Math.pow(y - centerY, 2));
                System.out.print(Math.sqrt(Math.pow(x - centerX, 2) + Math.pow(y - centerY, 2)));
                // Print circle border
                if (Math.abs(distanceFromCenter - radius) < 1.0) {
                    System.out.print("*");
                } 
                // Print eyes
                else if ((x == centerX - 3 && y == centerY - 3) || (x == centerX + 3 && y == centerY - 3)) {
                    System.out.print("O");
                } 
                // Print smile
                else if (y == centerY + 3 && x > centerX - 4 && x < centerX + 4) {
                    System.out.print("-");
                } 
                // Print empty space
                else {
                    System.out.print(" ");
                }
	      }
            System.out.println();
        }
    }
}