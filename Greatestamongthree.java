import java.util.*;
  
class Greatestamongthree{
    
    // Function to find the biggest of three numbers
    static int biggestOfThree(int x, int y, int z)
    {
  
        return z > (x > y ? x : y) ? z : ((x > y) ? x : y);
    }
  
    // Main driver function
    public static void main(String[] args)
    {
  
        // Declaring variables for 3 numbers
        int a, b, c;
  
        // Variable holding the lagest number
        int largest;
 
	Scanner s = new Scanner(System.in);
	System.out.println("Enter Three numbers");
	a=s.nextInt();
	b=s.nextInt();
	c=s.nextInt();
        // Calling the above function in main
        largest = biggestOfThree(a, b, c);
  
        // Printing the largest number
        System.out.println(largest+ " is the largest number.");
    }
}